package pageObjects.ceramic_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class CeramicHomePage extends BasePage {
    public CeramicHomePage(WebDriver driver) {
        super(driver);
    }

    private By avatarPopup = By.xpath("//a[contains(@class, 'avatar openPop-up')]");
    private By loginModal = By.xpath("//button[contains(@class, 'btn medium open-modal-btn')]");
    private By inputLogin = By.xpath("//form[contains(@name, 'system_auth')]//input[@name='USER_LOGIN']");
    private By inputPassword = By.xpath("//input[@name='USER_PASSWORD']");
    private By loginButton = By.xpath("//button[@name='Login']");
    private By userAuthName = By.xpath("//div[@id='lk-popup']//div[@class='modal-head']/p");
    private By loginErrorMessage = By.xpath("//p[@class='form-main-error']");
    private By firstLevelCatalog = By.xpath("//div[@id='mCSB_1_container']//ul//a");
    private By cartIcon = By.xpath("//a[@id='basket_head_count']");
    private By goToCartButton = By.xpath("//a[@class='btn medium']");

    public CeramicHomePage openAvatarPopup() {
        driver.findElement(avatarPopup).click();
        CeramicHomePage avatarPopup = new CeramicHomePage(driver);
        return avatarPopup;
    }

    public CeramicHomePage openLoginModal() {
        driver.findElement(loginModal).click();
        CeramicHomePage loginModal = new CeramicHomePage(driver);
        return loginModal;
    }

    public WebElement getInputLogin() {
        return driver.findElement(inputLogin);
    }

    public WebElement getInputPassword() {
        return driver.findElement(inputPassword);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public WebElement getUserAuthName() {
        return driver.findElement(userAuthName);
    }

    public WebElement getLoginErrorMessage() {
        return driver.findElement(loginErrorMessage);
    }

    public List<WebElement> getFirstLevelCatalogList() {
        List<WebElement> firstLevelCatalogList = driver.findElements(firstLevelCatalog);
        return firstLevelCatalogList;
    }

    public WebElement getCartIcon() {
        return driver.findElement(cartIcon);
    }

    public WebElement getGoToCartButton() {
        waitElementIsVisible(driver.findElement(goToCartButton));
        return driver.findElement(goToCartButton);
    }
}
