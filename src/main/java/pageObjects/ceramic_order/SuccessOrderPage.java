package pageObjects.ceramic_order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

public class SuccessOrderPage extends BasePage {
    public SuccessOrderPage(WebDriver driver) {
        super(driver);
    }

    private By successMessage = By.xpath("//h4[contains(text(),'успешно создан!')]");

    public WebElement getSuccessMessage() {
        return driver.findElement(successMessage);
    }
}
