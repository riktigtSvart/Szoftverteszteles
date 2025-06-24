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

    @FindBy (xpath = "//*[@id=\"fadein\"]/main/div/div/div[1]/div[1]/div[1]/div[1]/div[1]")
    private WebElement theNameOfHotelFieldShouldReadMovenpickGrandAlBustan;

    @FindBy (xpath="//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[2]/div[3]/span/strong")
    private WebElement currency;

    @FindBy (xpath="//*[@id=\"fadein\"]/main/section/section/div/h2/strong")
    private WebElement tabTitleText;

    static final Map<String, By> navigationButtons = Map.of(
            "HotelTab", By.xpath("//*[@id=\"tab\"]/li[2]/button"),
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

    static final Map<String, By> messages = Map.of(
            "Currency", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[2]/div[3]/span/strong")
    );

    static final Map<String, By> navigationButtons2 = Map.of(
            "BookNow", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]" +
                    "/div/div[2]/form/div/div[2]/div[3]/button"),
            "Search", By.xpath("//*[@id=\"hotels-search\"]/div/div[5]"),
            "FirstHotel", By.xpath("//*[@id=\"fadein\"]/main/section[2]/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/a")
    );

    static final Map<String, By> navigationButtons3 = Map.of(
            "Flights", By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(1) > a"),
            "Hotels", By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(2) > a"),
            "Tours", By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(3) > a"),
            "Cars", By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(4) > a"),
            "Visa", By.cssSelector("#navbarSupportedContent > div.nav-item--left.ms-lg-0 > ul > li:nth-child(5) > a")
    );

    static final Map<String, By> adButtons = Map.of(
            "Hotels", By.xpath("//*[@id=\"fadein\"]/main/section/div/div/div[2]/div[2]/div/div/a/div/span"),
            "Budget", By.xpath("//*[@id=\"fadein\"]/main/div[3]/div/div[2]/div[2]/div/div[2]/a"),
            "Cars", By.xpath("//*[@id=\"fadein\"]/main/div[3]/div/div[2]/div[2]/div/div[2]/a")
    );

    static final Map<String, By> textFields = Map.of(
            "Hotels City", By.id("hotels_city"),
            "Username", By.id("email"),
            "Password", By.id("password"),
            "car_price", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[1]/form/div/div[2]/div[3]/span/strong"),
            "Place", By.xpath("//*[@id=\"hotels-search\"]/div/div[1]"),
            "CheckIn", By.xpath("//*[@id=\"hotels-search\"]/div/div[2]"),
            "CheckOut", By.xpath("//*[@id=\"hotels-search\"]/div/div[3]")
    );

    static final Map<String, By> carType = Map.of(
            "Hyundai i10", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[1]/form/div/div[2]/p[1]/span/strong"),
            "Ford Focus", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[2]/p[1]/span/strong"),
            "Toyota Camry", By.xpath("//*[@id=\"fadein\"]/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[3]/form/div/div[2]/p[1]/span/strong")
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
        wait.until(ExpectedConditions.elementToBeClickable((WebElement) By.xpath(button)));
        driver.findElement(navigationButtons2.get(button)).click();
    }

    public void clickButton3(String button) { driver.findElement(navigationButtons3.get(button)).click(); }

    public void clickOnAdButton(String button) { driver.findElement(adButtons.get(button)).click(); }

    public String getErrorMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(errorMessage));
        return errorMessage.getText();
    }

    public String getLoginMissingError() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(popupErrorMessage));
        return popupErrorMessage.getText();
    }

    public String getCurrency() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(currency));
        return currency.getText();
    }

    public String getTabTitleText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(tabTitleText));
        return tabTitleText.getText();
    }

    public String getClickAd() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(tabTitleText));
        return tabTitleText.getText();
    }

    public String getTheNameOfHotelFieldShouldReadMovenpickGrandAlBustan() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_TIME));
        wait.until(ExpectedConditions.visibilityOf(theNameOfHotelFieldShouldReadMovenpickGrandAlBustan));
        return theNameOfHotelFieldShouldReadMovenpickGrandAlBustan.getText();
    }

    public void fillOutField(String field, String text) {
        driver.findElement(textFields.get(field)).sendKeys(text);
    }

    public String getCarType(String type) { return String.valueOf(driver.findElement(By.xpath(carType.get(type).toString())));
    }
}
