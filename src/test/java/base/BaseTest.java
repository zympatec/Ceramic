package base;

import common.CommonActions;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.base.BasePage;
import pageObjects.ceramic_cart.CeramicCartPage;
import pageObjects.ceramic_catalog_first_level.brick.CeramicCatalogBrick;
import pageObjects.ceramic_catalog_second_level.brick.CeramicCatalogFacingBrick;
import pageObjects.ceramic_home.CeramicHomePage;
import pageObjects.ceramic_order.*;

import static common.Config.*;

public class BaseTest extends CommonActions {
    protected WebDriver driver = CommonActions.initializeDriver();
    protected BasePage basePage = new BasePage(driver);
    protected CeramicHomePage ceramicHomePage = new CeramicHomePage(driver);
    protected CeramicCatalogBrick ceramicCatalogBrick = new CeramicCatalogBrick(driver);
    protected CeramicCatalogFacingBrick ceramicCatalogFacingBrick = new CeramicCatalogFacingBrick(driver);
    protected CeramicCartPage ceramicCartPage = new CeramicCartPage(driver);
    protected OrderFirstStep orderFirstStep = new OrderFirstStep(driver);
    protected OrderSecondStep orderSecondStep = new OrderSecondStep(driver);
    protected OrderThirdStep orderThirdStep = new OrderThirdStep(driver);
    protected OrderFourthStep orderFourthStep = new OrderFourthStep(driver);
    protected SuccessOrderPage successOrderPage = new SuccessOrderPage(driver);

    protected Actions action = new Actions(driver);


    @BeforeTest
    public void maximizeWindow() {
        if (MAXIMIZE_WINDOW) {
            driver.manage().window().maximize();
        }
    }

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if (CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");
        }
    }

    @AfterTest (alwaysRun = true)
    public void tearDown() {
        if (CLOSE_BROWSER) {
            driver.quit();
        }
    }
}
