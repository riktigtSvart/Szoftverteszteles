package hu.unideb.inf;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelTabStepDefs extends AbstractStepDefs{
    @When("click on {string} button")
    public void clickOnHotelTabButton(String button) {
        homePage.clickButton(button);
    }

    @When("click on {string} button2")
    public void clickOnHotelTabButton2(String button) {
        homePage.clickButton2(button);
    }

    @Then("the checkIn field should read {string}")
    public void theMessageShouldReadSignup(String errorMessage) {
        assertEquals(errorMessage, homePage.getErrorMessage());
    }

    @Then("the NumberOfHotels field should read {string}")
    public void theNumberOfHotelsFieldShouldRead(String message) {
        assertEquals(message, homePage.getErrorMessage());
    }

    @Then("the NameOfHotel field should read {string}")
    public void theNameOfHotelFieldShouldReadMovenpickGrandAlBustan(String hotelName) {
        assertEquals(hotelName, homePage.getTheNameOfHotelFieldShouldReadMovenpickGrandAlBustan());
    }
}
