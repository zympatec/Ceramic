package pageObjects.ceramic_order;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

public class OrderFirstStep extends BasePage {
    public OrderFirstStep(WebDriver driver) {
        super(driver);
    }

    private By nextStepBtn = By.xpath("//div[@id='content-page']//button[@class='btn medium ownd-next-step'][contains(text(),'Далее')]");

    public WebElement getNextStepBtn() {
        waitElementIsClickable(driver.findElement(nextStepBtn));
        return driver.findElement(nextStepBtn);
    }
}
