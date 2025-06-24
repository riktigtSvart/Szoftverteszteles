package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickAdStepdefs {
    @Then("the {string} message is shown in title")
    public void adMessageIsShownInTitle(String message) {
        assertEquals(message, homePage.getClickAd());
    }

    @When("click on {string} adButton")
    public void clickOnAdButtonAdButton(String button) {

    }
}
