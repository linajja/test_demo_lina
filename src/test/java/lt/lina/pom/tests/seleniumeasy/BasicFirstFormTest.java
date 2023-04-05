package lt.lina.pom.tests.seleniumeasy;
import lt.lina.pom.pages.seleniumeasy.BasicFirstFormTestPage;
import lt.lina.pom.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BasicFirstFormTest extends TestBase {

    @BeforeMethod
    @Override
    public void setUp() {
        BasicFirstFormTestPage.open();
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

    @Test
    public void testTwoInputField_CorrectInput() {

        String numberInputFieldA ="1";
        String numberInputFieldB ="3";
        String expectedResult = "4";
        String actualResult;


        BasicFirstFormTestPage.enterFieldA(numberInputFieldA);
        BasicFirstFormTestPage.enterFieldB(numberInputFieldB);
        BasicFirstFormTestPage.clickOnButton();
        actualResult = BasicFirstFormTestPage.readSum();


        Assert.assertTrue(
                actualResult.equals(expectedResult),
                String.format("Actual: %s; Expected: %s", actualResult, expectedResult)
        );

    }
    @Test
    public void testTwoInputField_InCorrectInput() {

        String numberInputFieldA ="a";
        String numberInputFieldB ="3";
        String expectedResult = "NaN";
        String actualResult;

        BasicFirstFormTestPage.enterFieldA(numberInputFieldA);
        BasicFirstFormTestPage.enterFieldB(numberInputFieldB);
        BasicFirstFormTestPage.clickOnButton();
        actualResult = BasicFirstFormTestPage.readSum();

        Assert.assertEquals(actualResult, expectedResult);

}


}
