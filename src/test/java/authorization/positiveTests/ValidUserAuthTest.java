package authorization.positiveTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constants.Constant.Urls.CERAMIC_HOME_PAGE;

public class ValidUserAuthTest extends BaseTest {

    @Test (dataProvider = "getData")
    public void loginWithExistingUser(String userLogin,
                                      String userPassword) {
        basePage.open(CERAMIC_HOME_PAGE);
        ceramicHomePage.openAvatarPopup()
                .openLoginModal();
        ceramicHomePage.getInputLogin().sendKeys(userLogin);
        ceramicHomePage.getInputPassword().sendKeys(userPassword);
        ceramicHomePage.getLoginButton().click();
        ceramicHomePage.openAvatarPopup();

        Assert.assertEquals(ceramicHomePage
                        .getUserAuthName()
                        .getText(),
                "Здравствуйте, Данияр!");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[1][2];
        data[0][0] = "qastas2011@outlook.com";
        data[0][1] = "123456";
        return data;
    }
}
