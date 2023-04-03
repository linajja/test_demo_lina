package lt.lina.pom.tests.seleniumeasy;

import lt.lina.pom.pages.seleniumeasy.BasicFirstFormTestPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicFirstFormTest {

    @BeforeMethod
    public void setUp() {
        BasicFirstFormTestPage.open();
    }

    @Test
    public void seleniumDemo() {
    }

    @Test
    public void testSingleInputField_InputLabasVakaras() {

        String messageSingleInputField = "Labas vakaras";
        String expectedResult = "Labas vakaras";
        String actualResult;

        BasicFirstFormTestPage.enterSingleField(messageSingleInputField);
        BasicFirstFormTestPage.clickOnButtonSubmit();
        actualResult = BasicFirstFormTestPage.readFullNameMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );

    }

//    @Test
//    public void testTwoInputField_CorrectInput() {
//
//        String numberInputFieldA ="1";
//        String numberInputFieldB ="3";
//        String expectedResult = "4";
//        String actualResult;
//
//        WebElement inputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
//        inputFieldA.sendKeys(numberInputFieldA);
//
//        WebElement inputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
//        inputFieldB.sendKeys(numberInputFieldB);
//
//
//        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@onclick='return total()']"));
//        buttonSubmit.click();
//
//        WebElement paragraphShowMessage = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = paragraphShowMessage.getText();
//
//
//        Assert.assertTrue(
//                actualResult.equals(expectedResult),
//                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
//        );
//
//    }
//    @Test
//    public void testTwoInputField_InCorrectInput() {
//
//        String numberInputFieldA ="1";
//        String numberInputFieldB ="3";
//        String expectedResult = "NaN";
//        String actualResult;
//
//        WebElement inputFieldA = driver.findElement(By.xpath("//input[@id='sum1']"));
//        inputFieldA.sendKeys(numberInputFieldA);
//
//        WebElement inputFieldB = driver.findElement(By.xpath("//input[@id='sum2']"));
//        inputFieldB.sendKeys(numberInputFieldB);
//
//
//        WebElement buttonSubmit = driver.findElement(By.xpath("//button[@onclick='return total()']"));
//        buttonSubmit.click();
//
//        WebElement paragraphShowMessage = driver.findElement(By.xpath("//span[@id='displayvalue']"));
//        actualResult = paragraphShowMessage.getText();
//
//
//        Assert.assertTrue(
//                actualResult.equals(expectedResult),
//                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
//        );

//}

    @AfterMethod
    public void tearDown() {
        BasicFirstFormTestPage.closeDriver();


    }
}
