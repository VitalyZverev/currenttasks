import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class PositiveArrayTest {

    @DataProvider(name = "positive")
    public Object[][] dataProviderPositive() {
        return new Object[][]{
                {new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, new int[]{Integer.MAX_VALUE}},
                {new int[]{56, 2, -1, -4}, new int[]{2, 56}},
                {new int[]{0, 0}, new int[]{}},
                {new int[]{}, new int[]{}},
                {new int[]{-100, -201}, new int[]{}}
        };
    }

//TODO
//    @DataProvider(name = "negative")
//    public Object[][] dataProviderNegative() {
//        return new Object[][]{
//                {new int[]{2147483647+1, 2}, new int[]{2}},
//                {0, 0},
//                {2021, 2021},
//        };
//    }

    @Test(dataProvider = "positive")
    void positiveTest(int[] arr, int[] extectedResult) {

        int[] actualResult = PositiveArray.posiviveOrderedArr(arr);
        Assert.assertTrue(Arrays.equals(actualResult, extectedResult));
    }

//    @Test(dataProvider = "negative")
//    void negativeTest(int[] arr, int[] extectedResult) {
//
//        int[] actualResult = PositiveArray.posiviveOrderedArr(arr);
//        Assert.assertTrue(Arrays.equals(actualResult, extectedResult));
//    }
}

