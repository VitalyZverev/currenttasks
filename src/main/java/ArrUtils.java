import java.util.Arrays;

public class ArrUtils {

    static int[] sortArr(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();
    }

    static int[] positiveArr(int[] arr) {
        return Arrays.stream(arr).filter(e -> e > 0).toArray();
    }

    static int[] concatArr(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[i + arr1.length] = arr2[i];
        }
        return res;
    }
}
