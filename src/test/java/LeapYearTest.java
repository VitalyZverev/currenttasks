import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LeapYearTest {

    @DataProvider(name = "positive")
    public Object[][] dataProviderPositive() {
        return new Object[][] {
                {1990, 2021, "1992 1996 2000 2004 2008 2012 2016 2020"},
                {1993, 1995, ""},
                {0, 17, "0 4 8 12 16"}
        };
    }

    @DataProvider(name = "negative")
    public Object[][] dataProviderNegative() {
        return new Object[][] {
                {2021, 1992, "Введены не корректные данные"},
                {-1000, 0, "Введены не корректные данные"},
                {0, 0, "Введены не корректные данные"},
                {2021, 2021, "Введены не корректные данные"}
        };
    }

    @Test(dataProvider = "positive")
    void positiveTest(int firstYear, int secondYear, String extectedResult) {

        String actualResult = LeapYear.leapYearChecker(firstYear, secondYear);
        Assert.assertEquals(actualResult, extectedResult);
    }

    @Test(dataProvider = "negative")
    void negativeTest(int firstYear, int secondYear, String extectedResult) {

        String actualResult = LeapYear.leapYearChecker(firstYear, secondYear);
        Assert.assertEquals(actualResult, extectedResult);
    }
}
