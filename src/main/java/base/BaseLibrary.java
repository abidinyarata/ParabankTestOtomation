package base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Random;

public class BaseLibrary extends Data {

    public static WebDriver driver;

    public String createUsername()
    {
        Random random = new Random();
        return "test" + random.nextInt(1000000);
    }

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot()
    {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}