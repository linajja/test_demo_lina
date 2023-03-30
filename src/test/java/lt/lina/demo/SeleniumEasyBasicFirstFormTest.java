package lt.lina.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumEasyBasicFirstFormTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("start-maximized");
        options.addArguments("--force-device-scale-factor=0.8");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
    }
    @Test
    public void testSingleInputField_InputLabasVakaras() {

        String messageSingleInputField = "Labas vakaras";
        String expectedResult = "Labas vakaras";
        String actualResult;

        WebElement inputSingleField = driver.findElement(By.xpath("//input[@id='user-message']"));
        inputSingleField.sendKeys(messageSingleInputField);


        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@class='btn btn-default' and @onclick='showInput();']"));
        buttonSubmit.click();

        WebElement paragraphShowMessage = driver.findElement(By.xpath("//span[@id='display']"));
        actualResult = paragraphShowMessage.getText();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );

    }
    @AfterMethod
    public void tearDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();

        }
        driver.quit();


    }
}
