package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class RegisterPage extends BaseTest {

    @Step("First Name alani doldurulur")
    public RegisterPage fillFirstName(String firstName)
    {
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
        return this;
    }

    @Step("Last Name alani doldurulur")
    public RegisterPage fillLastName(String lastName)
    {
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(lastName);
        return this;
    }

    @Step("Adres alani doldurulur")
    public RegisterPage fillAddress(String address)
    {
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(address);
        return this;
    }

    @Step("City alani doldurulur")
    public RegisterPage fillCity(String city)
    {
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(city);
        return this;
    }

    @Step("State alani doldurulur")
    public RegisterPage fillState(String state)
    {
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(state);
        return this;
    }

    @Step("Zip Code alani doldurulur")
    public RegisterPage fillZipCode(String zipCode)
    {
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(zipCode);
        return this;
    }

    @Step("Phone Number alani doldurulur")
    public RegisterPage fillPhone(String phone)
    {
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(phone);
        return this;
    }

    @Step("SSN alani doldurulur")
    public RegisterPage fillSSN(String SSN)
    {
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(SSN);
        return this;
    }

    @Step("Username alani doldurulur")
    public RegisterPage fillUsername(String username)
    {
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(username);
        return this;
    }

    @Step("Password alani doldurulur")
    public RegisterPage fillPassword(String password)
    {
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(password);
        return this;
    }

    @Step("Password kontrol alani doldurulur")
    public RegisterPage confirmPassword(String password)
    {
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(password);
        screenshot();
        return this;
    }

    @Step("Register butonu tiklanir")
    public RegisterPage clickRegisterButton()
    {
        driver.findElement(By.xpath("//input[@value='Register']")).click();
        return this;
    }

}