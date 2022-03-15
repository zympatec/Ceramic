package pageObjects.ceramic_catalog_first_level.brick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

import java.util.List;

public class CeramicCatalogBrick extends BasePage {
        public CeramicCatalogBrick(WebDriver driver) {
            super(driver);
        }

        private By secondLevelCatalog = By.xpath("//div[contains(@class, 'catalog-v1-slider')]//div[@class='row']//h3");

        public List<WebElement> getSecondLevelCatalogList() {
            List<WebElement> secondLevelCatalogList = driver.findElements(secondLevelCatalog);
            return secondLevelCatalogList;
        }
}

