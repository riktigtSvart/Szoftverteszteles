package hu.unideb.inf;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the homepage is opened")
    public void theHomepageIsOpened() {
        homePage.openPage();
    }

    @Given("the {string} button is clicked")
    public void theStringButtonIsClicked(String button) {
        homePage.clickButton(button);
    }

    @AfterAll
    public static void cleanUp() {
        homePage.closePage();
    }

    @Then("the {string} message is shown")
    public void theTitleMessageIsShown(String text) {
        assertEquals(text, homePage.getTabTitleText());
    }
}