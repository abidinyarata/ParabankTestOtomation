package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class MainPage extends BaseTest {

    @Step("Hata mesajı kontrol edilir")
    public MainPage errorControlMessage(String errorMessage)
    {
        String err = driver.findElement(By.cssSelector("[class='error']")).getText();
        Assert.assertEquals(err, errorMessage);
        return this;
    }
}
