package lt.lina.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestPratimai {
    @Test
    public void testIfExpectedResultIsEqualToHoursNow() {
        int dabarValandu;
        int expectedResult = 19;
        dabarValandu = LocalTime.now().getHour();
        Assert.assertEquals(expectedResult, dabarValandu);
    }

    @Test
    public void testIfNumber4IsEvenNumber() {

        int number = 4;
        int expectedResult = 0;
        int actualResult = number % 2;

        Assert.assertTrue(actualResult == expectedResult,
                String.format("Actual: %s, Expected %s", actualResult, expectedResult));
    }

    ;

    @Test
    public void testIf995CanBeDedivedTo3WithoutResidue() {
        int number = 995;
        int expectedResult = 0;
        int actualResult;

        actualResult = number % 3;

        Assert.assertTrue(actualResult == expectedResult,
                String.format("Actual: %s, Expected %s", actualResult, expectedResult));
    }

    @Test
    public void testIfTodayIsWednesday() {

        String actualResult = String.valueOf(LocalDateTime.now().getDayOfWeek());
        String expectedResult = "WEDNESDAY";


        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testIfWhereIs4numbersWhichIsEven_InputFrom1To10() {

        int expectedResult = 4;
        int actualResult=0;


        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualResult++;
            }
        }

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void activateSleepFor5Seconds(){

        try {
            System.out.println("Starting...");
            Thread.sleep(5000);
            System.out.println("FINALE");
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }



}
