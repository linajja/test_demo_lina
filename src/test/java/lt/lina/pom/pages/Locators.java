package lt.lina.pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Demoqa {
        public class TestBox {
            public static By inputUserName=By.xpath("//input[@id='userName']");
            public static By buttonSubmit=By.xpath("//button[@id='submit']");
            public static By paragrafName=By.xpath("//p[@id='name']");
            public static By inputUserEmail=By.xpath("//input[@id='userEmail']");
            public static By paragrafEmail=By.xpath("//p[@id='email']");
        }
    }

    public static class SeleniumEasy {
        public class BasicFirstForm {
            public static By inputUserMessage=By.xpath("//input[@id='user-message']");
            public static By buttonShowMessage=By.xpath("//button[@class='btn btn-default' and @onclick='showInput();']");
            public static By spanMessage=By.xpath("//span[@id='display']");
            public static By inputValueA=By.xpath("//input[@id='value1']");
            public static By inputValueB=By.xpath("//input[@id='value2']");
            public static By buttonGetTotal=By.xpath("//button[@onclick='return total()']");
            public static By spanDisplayValue=By.xpath("//span[@id='displayvalue']");
        }
    }
}
