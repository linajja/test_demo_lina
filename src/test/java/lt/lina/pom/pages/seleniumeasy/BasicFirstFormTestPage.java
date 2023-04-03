package lt.lina.pom.pages.seleniumeasy;

import lt.lina.pom.pages.Common;
import org.openqa.selenium.By;

public class BasicFirstFormTestPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("http://demo.seleniumeasy.com/basic-first-form-demo.html");

    }

    public static void closeDriver() {
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
}
