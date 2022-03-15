package pageObjects.ceramic_catalog_second_level.brick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.base.BasePage;

import java.util.List;

public class CeramicCatalogFacingBrick extends BasePage {
    public CeramicCatalogFacingBrick(WebDriver driver) {
        super(driver);
    }

    private By catalogProductsAdd = By.xpath("//div[contains(@class, 'catalog-page_product-list')]//button[contains(@class, 'btn-cart toggles')]");

    public List<WebElement> getCatalogProductsAddList() {
        List<WebElement> CatalogProductsAddList = driver.findElements(catalogProductsAdd);
        return CatalogProductsAddList;
    }
}
