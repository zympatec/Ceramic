package authorization.negativeTests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static constants.Constant.Urls.CERAMIC_HOME_PAGE;

public class InvalidUserAuthTest extends BaseTest {
    @Test(dataProvider = "getData")
    public void loginWithExistingUser(String userLogin,
                                      String userPassword) {
        basePage.open(CERAMIC_HOME_PAGE);
        ceramicHomePage.openAvatarPopup()
                .openLoginModal();
        ceramicHomePage.getInputLogin().sendKeys(userLogin);
        ceramicHomePage.getInputPassword().sendKeys(userPassword);
        ceramicHomePage.getLoginButton().click();

        Assert.assertEquals(ceramicHomePage
                        .getLoginErrorMessage()
                        .getText(),
                "Неверный логин или пароль.");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];

        // Existing user with incorrect password
        data[0][0] = "qastas2011@outlook.com";
        data[0][1] = "1234567";

        // Non-existent user with existing password
        data[1][0] = "not_a_user@outlook.com";
        data[1][1] = "123456";

        // Non-existent user with non-existent password
        data[2][0] = "not_a_user11@outlook.com";
        data[2][1] = "not_a_password";

        return data;
    }
}
