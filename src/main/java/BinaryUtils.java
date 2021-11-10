public class BinaryUtils {

    public static String toBinary(int number) {
        if (number >= 0) {
            return Integer.toString(number, 2);
        } else return "Введите положительное число, либо ноль";
    }
}
