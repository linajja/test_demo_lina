package lt.lina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void testIfNumberIsEven_InputValue10() {
        int input = 10;
        int expectedReminder = 0;
        int actualReminder;
        actualReminder = input % 2;

        Assert.assertEquals(actualReminder, expectedReminder);
    }

    @Test
    public void testWithAssertFalseIfNumberIsNotEven_InputValueIs9() {
        int input = 9;
        int expectedReminder = 1;
        int actualReminder;
        actualReminder = input % 2;

        Assert.assertFalse(
                actualReminder == expectedReminder,
                String.format("Actual: %s, Expected %s", actualReminder, expectedReminder)
        );
    }

    @Test
    public void testWithAssertTrueIfNumberIsNotEven_InputValueIs9() {
        int input = 9;
        int expectedReminder = 1;
        int actualReminder;
        actualReminder = input % 2;

        Assert.assertTrue(
                actualReminder == expectedReminder,
                String.format("Actual: %s, Expected %s", actualReminder, expectedReminder)
        );
    }

    @Test
    public void testIfSumIsCorect_ImputValuesis5And6() {
        int inputA = 5;
        int inputB = 6;
        int expectedResult = 12;
        int actualresult;

        actualresult = inputA + inputB;
        Assert.assertEquals(expectedResult,actualresult);
    }


}
