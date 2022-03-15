package ordering.positiveTests.authorizedUser;

import base.BaseTest;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constants.Constant.Urls.CERAMIC_HOME_PAGE;

public class OnePositionTest extends BaseTest {
    @Test(dataProvider = "getData")
    public void onePositionOrder(String userLogin,
                                      String userPassword) {
        basePage.open(CERAMIC_HOME_PAGE);
        ceramicHomePage.openAvatarPopup()
                .openLoginModal();
        ceramicHomePage.getInputLogin().sendKeys(userLogin);
        ceramicHomePage.getInputPassword().sendKeys(userPassword);
        ceramicHomePage.getLoginButton().click();
        ceramicHomePage.getFirstLevelCatalogList().get(0).click();

        for (WebElement catalogElement :
                ceramicCatalogBrick.getSecondLevelCatalogList()) {
            if (catalogElement.getText().equals("Облицовочный кирпич")) {
                catalogElement.click();
                break;
            }
        }

        while (ceramicHomePage.getCartIcon().getAttribute("data-count").equals("0")) {
            action.moveToElement(ceramicCatalogFacingBrick.getCatalogProductsAddList().get(0)).click().perform();
        }

        ceramicHomePage.getCartIcon().click();
        ceramicHomePage.getGoToCartButton().click();
        ceramicCartPage.getMakeOrderButton().click();
        orderFirstStep.getNextStepBtn().click();
        orderSecondStep.getNextStepBtn().click();
        orderThirdStep.getNextStepBtn().click();
        orderFourthStep.getMakeOrderBtn().click();

        Assert.assertTrue(successOrderPage.getSuccessMessage().isDisplayed());
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "qastas2011@outlook.com";
        data[0][1] = "123456";
        return data;
    }
}
