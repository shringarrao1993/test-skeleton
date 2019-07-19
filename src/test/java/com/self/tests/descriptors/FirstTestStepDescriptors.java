package com.self.tests.descriptors;


import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import steps.FirstTestSteps;
import variableInterfaces.Constant;

//Defines the various steps in the first_test story file
public class FirstTestStepDescriptors {

    final static Logger LOG = LoggerFactory.getLogger(FirstTestStepDescriptors.class);

    @Steps
    private FirstTestSteps firstTestSteps;

    @Given("user opens the <SE> search engine")
    public void givenUserOpensTheSESearchEngine(@Named("SE") String SE) {
        firstTestSteps.givenUserOpensTheSESearchEngine(SE);
    }

    @When("user searches for <search>")
    public void whenUserSearchesForSearch(@Named("search") String search) {
        Constant.searchTerm = search;
        firstTestSteps.whenUserSearchesForSearch(search);
    }

    @Then("the correct search results are displayed")
    public void thenTheCorrectSearchResultsAreDisplayed() {
        firstTestSteps.thenTheCorrectSearchResultsAreDisplayed();
    }
}
