package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Map;

public class HomePage {

    private static final String PAGE_URL="https://phptravels.net/";
    private static final int WAIT_TIME = 10;

    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy (id = "checkin")
    private WebElement errorMessage;

    @FindBy (css = "#fadein > div.vt-container > div:nth-child(2) > div.vt-col.bottom-center > div > div > h4")
    private WebElement popupErrorMessage;

    static final Map<String, By> navigationButtons = Map.of(
            "Hotel Tab", By.xpath("//*[@id=\"tab\"]/li[2]/button"),
            "Submit", By.xpath("//*[@id=\"hotels-search\"]/div/div[5]/button"),
            "Customer", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[4]/a"),
            "Login Tab", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[4]/ul/li[1]/a"),
            "Login", By.id("submitBTN"),
            "Choose Currency", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/a"),
            "EUR", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/ul/li[1]/a"),
            "PHP", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/ul/li[2]/a"),
            "SAR", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/ul/li[3]/a"),
            "GBP", By.xpath("//*[@id=\"navbarSupportedContent\"]/div[2]/ul/li[2]/ul/li[4]/a")
    );

    static final Map<String, By> navigationButtons2 = Map.of(
            "Book Now", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]" +
                    "/div/div[2]/form/div/div[2]/div[3]/button"),
            "Search", By.xpath("//*[@id=\"hotels-search\"]/div/div[5]")
    );

    static final Map<String, By> textFields = Map.of(
            "Hotels City", By.id("hotels_city"),
            "Username", By.id("email"),
            "Password", By.id("password"),
            "car_price", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[2]/div[3]/span"),
            "Place", By.xpath("//*[@id=\"hotels-search\"]/div/div[1]"),
            "CheckIn", By.xpath("//*[@id=\"hotels-search\"]/div/div[2]"),
            "CheckOut", By.xpath("//*[@id=\"hotels-search\"]/div/div[3]")
    );

    public void openPage(){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }

    public void closePage(){ driver.quit(); }

    public void clickButton(String button){
        driver.findElement(navigationButtons.get(button)).click();
    }

    public void clickButton2(String button){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.valueOf(navigationButtons2.get(button)))));
        driver.findElement(navigationButtons2.get(button)).click();
    }

    public String getErrorMessage() { return errorMessage.getText(); }

    public String getLoginMissingError() { return popupErrorMessage.getText(); }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }
}
