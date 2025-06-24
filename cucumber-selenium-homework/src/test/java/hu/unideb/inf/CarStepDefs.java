package hu.unideb.inf;

import io.cucumber.java.en.Then;

import static hu.unideb.inf.AbstractStepDefs.homePage;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarStepDefs {
    @Then("the {string} is {string} type is shown")
    public void theCar_typeTypeIsShown(String type, String car) {
        assertEquals(car, String.valueOf(homePage.getCarType(type)));
    }

    @Then("the {string} message is shown in field")
    public void theCar_priceMessageIsShown(String message) {
        assertEquals(message, homePage.getCurrency());
    }
}
