package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {

    @Step("Kullanıcı adı alanı doldurulur")
    public LoginPage fillUsername(String username)
    {
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        return this;
    }

    @Step(" Password alanı doldurulur")
    public LoginPage fillPassword(String password)
    {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }

    @Step("Login butonu tıklanır")
    public LoginPage clickLogin()
    {
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
        screenshot();
        return this;
    }

    @Step("Register butonu tıklanır")
    public LoginPage clickRegister()
    {
        driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
        return this;
    }
}