package lt.lina.pom.tests.demoqa;

import lt.lina.pom.pages.demoqa.TextBoxPage;
import lt.lina.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        TextBoxPage.open();
    }

    @Test
    public void testFullNameImput_NameValueLina() {

        String messageFullName = "Lina Benetiene";
        String expectedResult = "Lina Benetiene";
        String actualResult;

        TextBoxPage.enterFullname(messageFullName);
        TextBoxPage.clickOnButtonSubmit();
        actualResult = TextBoxPage.readFullnameMessage();

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

        TextBoxPage.enterEmailAddress(messageEmail);
        TextBoxPage.clickOnButtonSubmit();
        actualResult = TextBoxPage.readEmailMessage();

        Assert.assertTrue(
                actualResult.contains(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );
    }

}

