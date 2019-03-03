package com.self.tests.descriptors;


import net.thucydides.core.annotations.*;
import org.jbehave.core.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import steps.FirstTestSteps;

public class FirstTestStepDescriptors {

    final static Logger LOG = LoggerFactory.getLogger(FirstTestStepDescriptors.class);

    @Steps
    FirstTestSteps firstTestSteps;

    @Given("user opens the <SE> search engine")
    public void givenUserOpensTheSESearchEngine(@Named("SE") String SE) {
        firstTestSteps.givenUserOpensTheSESearchEngine(SE);
    }

    @When("user searches for <search>")
    public void whenUserSearchesForSearch(@Named("search") String search) {
        firstTestSteps.whenUserSearchesForSearch(search);
    }

    @Then("search results for colours is displayed")
    public void thenSearchResultsForColoursIsDisplayed() {
        // PENDING
    }
}
