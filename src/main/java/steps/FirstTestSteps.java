package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class FirstTestSteps extends ScenarioSteps{

    @Step
    public void givenUserOpensTheGoogleSearchEngine(){
        getDriver().manage().window().maximize();
        getDriver().get("https://www.google.com");
        waitABit(1000);


}
    @Step
    public void whenUserSearchesForColours(){
        getDriver().findElement(By.xpath("(//input)[3]")).click();
        getDriver().findElement(By.xpath("(//input)[3]")).sendKeys("colours" + Keys.ENTER);
    }

    @Step
    public void thenSearchResultsForColoursIsDisplayed(){

    }
}
