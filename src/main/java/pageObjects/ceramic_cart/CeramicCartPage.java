package pageObjects.ceramic_cart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

public class CeramicCartPage extends BasePage {
    public CeramicCartPage(WebDriver driver) {
        super(driver);
    }

    private By makeOrderButton = By.xpath("//a[@class='js__get-link btn']");

    public WebElement getMakeOrderButton() {
        return driver.findElement(makeOrderButton);
    }

}
