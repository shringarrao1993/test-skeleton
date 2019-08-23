package steps.first_test;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.first_test.FirstTestPage;
import utility.Wait;
import variable_interfaces.Constant;

//Defines various methods called in the FirstTestStepDescriptors class
public class FirstTestSteps extends ScenarioSteps{

    final static Logger LOG = LoggerFactory.getLogger(FirstTestSteps.class);
    private Wait wait;
    private FirstTestPage firstTestPage;

    @Step
    public void givenUserOpensTheSESearchEngine(String sE){
        getDriver().manage().window().maximize();
        Constant.searchEngine = sE;
        String currentURL = "http://www." + sE + ".com";
        System.out.println(currentURL);
        getDriver().get(currentURL);
        waitABit(1000);
    }

    @Step
    public void whenUserSearchesForSearch(String search){
        if (Constant.searchEngine.equalsIgnoreCase("google")){
            wait.waitUntilElementIsClickable(firstTestPage.googleInputItem).click();
            wait.waitUntilElementIsVisible(firstTestPage.googleInputItem).sendKeys(search + Keys.ENTER);
        } else if (Constant.searchEngine.equalsIgnoreCase("bing")){
            wait.waitUntilElementIsClickable(firstTestPage.bingInputItem).click();
            wait.waitUntilElementIsVisible(firstTestPage.bingInputItem).sendKeys(search + Keys.ENTER);
        } else if (Constant.searchEngine.equalsIgnoreCase("ecosia")){
            wait.waitUntilElementIsClickable(firstTestPage.ecosiaInputItem).click();
            wait.waitUntilElementIsVisible(firstTestPage.ecosiaInputItem).sendKeys(search + Keys.ENTER);
        }
    }

    @Step
    public void thenTheCorrectSearchResultsAreDisplayed(){

    }
}
