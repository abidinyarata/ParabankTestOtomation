package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseTest {

    @Step("Kullanıcı kontrolü")
    public HomePage accountControl(String value)
    {
        String text = driver.findElement(By.cssSelector("[class='smallText']")).getText();
        Assert.assertEquals(value, text);
        return this;
    }

    @Step("Kullanıcı oluşturma kontrolü")
    public HomePage registerControl(String value)
    {
        String text = driver.findElement(By.cssSelector("[class='title']")).getText();
        Assert.assertEquals(value, text);
        return this;
    }
}