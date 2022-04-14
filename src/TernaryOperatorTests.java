public class TernaryOperatorTests {
    public static void main(String[] args) {
        int age = 15;

        //"adult" - if age >= 18, "not adult" - if age < 18

//        String result;
//        if (age >= 18) {
//            result = "adult";
//        } else {
//            result = "not adult";
//        }

        String result = age >= 18 ? "adult" : "not adult";

        System.out.println("result = " + result);

        System.out.println("getNumberStat(15) = " + getNumberStat(15));
    }

    private static String getNumberStat(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }
}
