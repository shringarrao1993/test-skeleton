package first_test;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utility.Wait;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//Defines various methods called in the FirstTestStepDescriptors class
public class FirstTestSteps extends ScenarioSteps{

    final static Logger LOG = LoggerFactory.getLogger(FirstTestSteps.class);
    private Wait wait;
    private LandingPage landingPage;
    private ResultPage resultPage;

    @Step
    public void givenUserOpensTheSESearchEngine(String searchEngine){

        getDriver().manage().window().maximize();
        System.setProperty("searchEngine", searchEngine);

        String currentURL = "http://www." + searchEngine + ".com";
        getDriver().get(currentURL);

        waitABit(1000);
    }

    @Step
    public void whenUserSearchesForSearch(String searchTerm){

        System.setProperty("searchTerm", searchTerm);
        String searchEngine = System.getProperty("searchEngine");

        if (searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsClickable(landingPage.googleInputItem).click();
            wait.waitUntilElementIsVisible(landingPage.googleInputItem).sendKeys(searchTerm + Keys.ENTER);
        }else if (searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsClickable(landingPage.bingInputItem).click();
            wait.waitUntilElementIsVisible(landingPage.bingInputItem).sendKeys(searchTerm);
            waitABit(2000);
            wait.waitUntilElementIsVisible(landingPage.bingInputItem).sendKeys(Keys.ENTER);
        }else if (searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsClickable(landingPage.ecosiaInputItem).click();
            wait.waitUntilElementIsVisible(landingPage.ecosiaInputItem).sendKeys(searchTerm + Keys.ENTER);
        }
    }

    @Step
    public void thenTheCorrectSearchResultsAreDisplayed(){
        String searchEngine = System.getProperty("searchEngine");

        if (searchEngine.equalsIgnoreCase("google")){
            verifyPresenceOfTitleAndBoldWords(resultPage.googleResultSearchBar
                    , resultPage.googleResultTitles
                    , resultPage.googleResultBoldWords);
        } else if (searchEngine.equalsIgnoreCase("bing")){
            verifyPresenceOfTitleAndBoldWords(resultPage.bingAndEcosiaResultSearchBar
                    , resultPage.bingResultTitles
                    , resultPage.bingResultBoldWords);
        } else if (searchEngine.equalsIgnoreCase("ecosia")){
            verifyPresenceOfTitleAndBoldWords(resultPage.bingAndEcosiaResultSearchBar
                    , resultPage.ecosiaResultTitle
                    , resultPage.ecosiaResultBold);
        }
    }

    public void verifyPresenceOfTitleAndBoldWords(WebElement searchBar, List<WebElement> resultTitles, List<WebElement> resultBoldWords){

        String searchTermProperty = System.getProperty("searchTerm");

        String searchTerm = wait.waitUntilElementIsVisible(searchBar).getAttribute("value");
        assertThat(searchTerm.equalsIgnoreCase(searchTermProperty), is(true));

        int resultTitleSize = wait.waitUntilElementsAreVisible(resultTitles).size();
        int resultBoldSize = wait.waitUntilElementsAreVisible(resultBoldWords).size();

        boolean presenceOfSearchResultTitle = false;
        boolean presenceOfSearchResultBoldWords = false;

        for (int i = 0; i < resultTitleSize; i++){
            assertThat(wait.waitUntilElementIsVisible(resultTitles.get(i))
                            .getText()
                            .toLowerCase()
                    , either(containsString(StringUtils.chop(searchTerm)))
                            .or(containsString(StringUtils.chop(searchTerm)
                                    .replace("u",""))));
            presenceOfSearchResultTitle = true;
        }
        for (int i = 0; i < resultBoldSize; i++) {
            assertThat(wait.waitUntilElementIsVisible(resultBoldWords.get(i))
                            .getText()
                            .toLowerCase()
                    , either(containsString(StringUtils.chop(searchTerm)))
                            .or(containsString(StringUtils.chop(searchTerm)
                                    .replace("u", ""))));
            presenceOfSearchResultBoldWords = true;
        }
        assertThat(presenceOfSearchResultTitle || presenceOfSearchResultBoldWords, is(true));
    }
}
