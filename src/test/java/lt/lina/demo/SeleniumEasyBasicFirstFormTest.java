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

    @Test
    public void testTwoInputField_CorrectInput() {

        String numberInputFieldA ="1";
        String numberInputFieldB ="3";
        String expectedResult = "4";
        String actualResult;

        WebElement inputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputFieldA.sendKeys(numberInputFieldA);

        WebElement inputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputFieldB.sendKeys(numberInputFieldB);


        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        buttonSubmit.click();

        WebElement paragraphShowMessage = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = paragraphShowMessage.getText();


        Assert.assertTrue(
                actualResult.equals(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );

    }
    @Test
    public void testTwoInputField_InCorrectInput() {

        String numberInputFieldA ="1";
        String numberInputFieldB ="3";
        String expectedResult = "NaN";
        String actualResult;

        WebElement inputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
        inputFieldA.sendKeys(numberInputFieldA);

        WebElement inputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
        inputFieldB.sendKeys(numberInputFieldB);


        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@onclick='return total()']"));
        buttonSubmit.click();

        WebElement paragraphShowMessage = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        actualResult = paragraphShowMessage.getText();


        Assert.assertTrue(
                actualResult.equals(expectedResult),
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
