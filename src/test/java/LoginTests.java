import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Test(description = "Başarılı kullanıcı girişi")
    public void loginSuccessfulControl()
    {
        loginPage.fillUsername(userName)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Accounts Overview");
    }

    @Test(description = "Başarısız kullanıcı girişi")
    public void loginUnsuccessfulControl()
    {
        loginPage.fillUsername(userName)
                .fillPassword("123456")
                .clickLogin();

        mainPage.errorControlMessage("The username and password could not be verified.");
    }

    @Test(description = "Zorunlu giriş kontrolü")
    public void loginRequiredControl() {
        loginPage.fillUsername("")
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(userName)
                .fillPassword("")
                .clickLogin();

        mainPage.errorControlMessage("Please enter a username and password.");

        loginPage.fillUsername(userName)
                .fillPassword(password)
                .clickLogin();

        homePage.accountControl("Welcome " + userName);
    }
}
