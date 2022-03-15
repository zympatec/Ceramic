package pageObjects.ceramic_order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

public class OrderFourthStep extends BasePage {
    public OrderFourthStep(WebDriver driver) {
        super(driver);
    }

    private By makeOrderBtn = By.xpath("//button[@id='ownd-order-create']");

    public WebElement getMakeOrderBtn() {
        waitElementIsVisible(driver.findElement(makeOrderBtn));
        return driver.findElement(makeOrderBtn);
    }
}
