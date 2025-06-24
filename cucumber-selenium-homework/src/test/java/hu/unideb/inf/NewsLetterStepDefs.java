package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NewsLetterStepDefs {
    @Then("the {string} NewsLetterMessage is shown")
    public void theNewsLetterMessageNewsLetterMessageIsShown(String message) {
        assertEquals(message, homePage.getNewsLetterMessage());
    }
}
