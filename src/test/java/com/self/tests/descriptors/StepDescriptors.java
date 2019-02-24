package com.self.tests.descriptors;


import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import steps.FirstTestSteps;

public class StepDescriptors{

    @Steps
    FirstTestSteps firstTestSteps;

    @Given("user opens the google search engine")
    public void givenUserOpensTheGoogleSearchEngine() {
        firstTestSteps.givenUserOpensTheGoogleSearchEngine();
    }

    @When("user searches for colours")
    public void whenUserSearchesForColours() {
        firstTestSteps.whenUserSearchesForColours();
    }

    @Then("search results for colours is displayed")
    public void thenSearchResultsForColoursIsDisplayed() {
        firstTestSteps.thenSearchResultsForColoursIsDisplayed();
    }
}
