package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Keys;
import pages.FirstTestPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import variableInterfaces.Constant;


public class FirstTestSteps extends ScenarioSteps{

    final static Logger LOG = LoggerFactory.getLogger(FirstTestSteps.class);
    FirstTestPage firstTestPage;
    Constant constant;

    @Step
    public void givenUserOpensTheSESearchEngine(String sE){
        getDriver().manage().window().maximize();
        constant.searchEngine = sE;
        String currentURL = "http://www." + sE + ".com";
        System.out.println(currentURL);
        getDriver().get(currentURL);
        waitABit(1000);
    }

    @Step
    public void whenUserSearchesForSearch(String search){
        firstTestPage.clickInputItem();
        firstTestPage.setInputItem(search + Keys.ENTER);
    }

    @Step
    public void thenTheCorrectSearchResultsAreDisplayed(){

    }
}
