import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BinaryTest {

    @DataProvider(name = "positive")
    public Object[][] dataProviderPositive() {
        return new Object[][] {
                {0, "0"},
                {1, "1"},
                {100, "1100100"},
                {Integer.MAX_VALUE, "1111111111111111111111111111111"}
        };
    }

    @DataProvider(name = "negative")
    public Object[][] dataProviderNegative() {
        return new Object[][] {
                {-100, "Введите положительное число, либо ноль"},
                {-1, "Введите положительное число, либо ноль"},
        };
    }

    @Test(dataProvider = "positive")
    void positiveTest(int number, String extectedResult) {

        String actualResult = BinaryUtils.toBinary(number);
        Assert.assertEquals(actualResult, extectedResult);
    }

    @Test(dataProvider = "negative")
    void negativeTest(int number, String extectedResult) {

        String actualResult = BinaryUtils.toBinary(number);
        Assert.assertEquals(actualResult, extectedResult);
    }
}
