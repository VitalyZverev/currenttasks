public class LeapYear {

    public static String leapYearChecker(int firstYear, int secondYear) {
        String result = "";
        if (firstYear >= 0 && secondYear > 0 && firstYear < secondYear) {
            for (int i = firstYear; i <= secondYear; i++) {
                if (i % 4 == 0) {
                    result = result.concat(i + " ");
                }
            }
            if (!result.equals("")) {
                result = result.substring(0, result.length() - 1);
            }
        } else {
            result = "Введены не корректные данные";
        }
        return result;
    }
}
