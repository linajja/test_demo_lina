package lt.lina.pom.pages.seleniumeasy;

import lt.lina.pom.pages.Common;
import lt.lina.pom.pages.Locators;
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
                Locators.SeleniumEasy.BasicFirstForm.inputUserMessage,
                text
                );
    }

    public static void clickOnButtonSubmit() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicFirstForm.buttonShowMessage);
    }

    public static String readFullNameMessage() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanMessage);
    }
    public static void enterFieldA(String text) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.BasicFirstForm.inputValueA,
                text
        );
    }
    public static void enterFieldB(String text) {
        Common.sendKeysToElement(
                Locators.SeleniumEasy.BasicFirstForm.inputValueB,
                text
        );
    }
    public static void clickOnButton() {
        Common.clickOnElement(Locators.SeleniumEasy.BasicFirstForm.buttonGetTotal);
    }
    public static String readSum() {
        return Common.getTextFromElement(Locators.SeleniumEasy.BasicFirstForm.spanDisplayValue);
    }
}
