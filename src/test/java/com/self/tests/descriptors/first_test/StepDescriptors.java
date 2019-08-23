package com.self.tests.descriptors.first_test;


import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import steps.first_test.FirstTestSteps;
import variable_interfaces.Constant;

//Defines the various steps in the first_test story file
public class StepDescriptors {

    final static Logger LOG = LoggerFactory.getLogger(StepDescriptors.class);

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
