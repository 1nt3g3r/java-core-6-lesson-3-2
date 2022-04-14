import java.util.Scanner;

public class IfElseVariants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

       int digitCount = getDigitCount(number);

       if (digitCount > 0) {
           System.out.println("Number " + number + " has digit count: " + digitCount);
       } else {
           System.out.println("Number " + number + " not supported");
       }

       scanner.close();

       someMethod();

       String[] names = {"Bill", "John"};
       diffArgsMethod(names[0], 15);
       diffArgsMethod(names[1], 15);
    }

    private static void diffArgsMethod(String name, int age) {
        System.out.println("Name is " + name + ", age: " + age);
    }

    private static void someMethod() {
        System.out.println("This is some method");
    }

    private static String convert(int value) {
        return value + "";
    }

    private static int getDigitCount(int number) {
        number = Math.abs(number);

//        return String.valueOf(number).length();

        if (number < 10) {
            return 1;
        } else if (number < 100) {
            return 2;
        } else if (number < 1000) {
            return 3;
        } else if (number < 10000) {
            return 4;
        } else {
            return -1;
        }
    }

    private static int getDigitCountWithGuardClause(int number) {
        if (number < 10) {
            return 1;
        }

        if (number < 100) {
            return 2;
        }

        if (number < 1000) {
            return 3;
        }

        if (number < 10000) {
            return 4;
        }

        return -1;
    }
}
