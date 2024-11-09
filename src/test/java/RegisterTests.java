import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterTests extends BaseTest {

    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "Kullanıcı oluşturma kontrolü")
    public void loginSuccessfulControl()
    {
        String username = createUsername();

        loginPage.clickRegister();

        registerPage.fillFirstName("TestFirstName")
                .fillLastName("TestLastName")
                .fillAddress("My address")
                .fillCity("My city")
                .fillState("My state")
                .fillZipCode("12345")
                .fillPhone("1234567890")
                .fillSSN("123456")
                .fillUsername(username)
                .fillPassword("test12345")
                .confirmPassword("test12345")
                .clickRegisterButton();

        homePage.registerControl("Welcome " + username);
    }
}