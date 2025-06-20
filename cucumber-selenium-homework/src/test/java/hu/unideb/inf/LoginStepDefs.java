package hu.unideb.inf;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginStepDefs extends AbstractStepDefs{
    @Given("the {string} field is filled with {string}")
    public void theUsernameFieldIsFilledWithUsername(String field, String text) { homePage.fillOutField(field, text); }

    @Then("the {string} message is shown")
    public void theErrorMessageMessageIsShown(String errorMessage) {
        assertEquals(errorMessage, homePage.getLoginMissingError());
    }
}
