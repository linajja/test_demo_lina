package lt.lina.pom.pages.demoqa;

import lt.lina.pom.pages.Common;
import org.openqa.selenium.By;

public class TextBoxPage {

    public static void open() {
        Common.setUpDriver();
        Common.openUrl("https://demoqa.com/text-box");

    }

    public static void closeDriver() {
        Common.closeDriver();
    }

    public static void enterFullname(String text) {
        Common.sendKeysToElement(
                By.xpath("//input[@id='userName']"),
                text
        );

    }

    public static void clickOnButtonSubmit() {

        Common.clickOnElement(By.xpath("//button[@id='submit']"));
    }

    public static String readFullnameMessage() {

        return Common.getTextFromElement(By.xpath("//p[@id='name']"));
    }

    public static void enterEmailAddress(String email) {
   Common.sendKeysToElement(
           By.xpath("//input[@id='userEmail']"),
           email
   );

    }


    public static String readEmailMessage() {
        return Common.getTextFromElement(By.xpath("//p[@id='email']"));
    }
}
