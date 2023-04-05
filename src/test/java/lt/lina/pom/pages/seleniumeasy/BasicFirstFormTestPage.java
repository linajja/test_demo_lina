package lt.lina.pom.pages.seleniumeasy;

import lt.lina.pom.pages.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasicFirstFormTestPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");

    }

    public static void closeDriver() {
        Common.sleep(3000);
        Common.closeDriver();
    }

    public static void enterSingleField(String text) {
        Common.sendKeysToElement(
        By.xpath("//input[@id='user-message']"),
                text
                );
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(By.xpath("//button[@class='btn btn-default' and @onclick='showInput();']"));
    }

    public static String readFullNameMessage() {
        return Common.getTextFromElement(By.xpath("//span[@id='display']"));
    }
    public static void enterFieldA(String text) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value1']"),
                text
        );
    }
    public static void enterFieldB(String text) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='value2']"),
                text
        );
    }
    public static void clickOnButton() {
        Common.clickOnElement(By.xpath("//button[@onclick='return total()']"));
    }
    public static String readSum() {
        return Common.getTextFromElement(By.xpath("//span[@id='displayvalue']"));
    }
}
