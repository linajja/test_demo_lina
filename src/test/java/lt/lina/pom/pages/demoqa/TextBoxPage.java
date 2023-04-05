package lt.lina.pom.pages.demoqa;

import lt.lina.pom.pages.Common;
import lt.lina.pom.pages.Locators;
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
                Locators.Demoqa.TestBox.inputUserName,
                text
        );

    }

    public static void clickOnButtonSubmit() {

        Common.clickOnElement(Locators.Demoqa.TestBox.buttonSubmit);
    }

    public static String readFullnameMessage() {

        return Common.getTextFromElement(Locators.Demoqa.TestBox.paragrafName);
    }

    public static void enterEmailAddress(String email) {
   Common.sendKeysToElement(
           Locators.Demoqa.TestBox.inputUserEmail,
           email
   );

    }


    public static String readEmailMessage() {
        return Common.getTextFromElement(Locators.Demoqa.TestBox.paragrafEmail);
    }
}
