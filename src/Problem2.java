import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int digitCount = 0;
        while (number > 0) {
            digitCount++;
            number /= 10;
        }

        if (digitCount == 0) {
            digitCount = 1;
        }

        System.out.println(digitCount);
    }
}
