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

public class TestSeleniumDemo {

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
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    public void seleniumDemo() {

    }

    @Test
    public void testFullNameImput_NameValueLina() {

        String messageFullName = "Lina Benetiene";
        String expectedResult = "Lina Benetiene";
        String actualResult;

        WebElement inputUserName = driver.findElement(By.xpath("//input[@id='userName']"));
        inputUserName.sendKeys(messageFullName);


        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraphName = driver.findElement(By.xpath("//p[@id='name']"));
        actualResult = paragraphName.getText();


        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );

    }

    @Test
    public void testEmailInput_WithValidEmail() {
        String messageEmail = "lina.benetiene@gmail.com";
        String expectedResult = "lina.benetiene@gmail.com";
        String actualResult;

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='userEmail']"));
        inputEmail.sendKeys(messageEmail);

        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@id='submit']"));
        buttonSubmit.click();

        WebElement paragraphEmail = driver.findElement(By.xpath("//p[@id='email']"));
        actualResult = paragraphEmail.getText();


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


