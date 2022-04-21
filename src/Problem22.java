import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;

        for(int i = a; i <= b; i++) {
            if (isPrime(i) && isPrime(reverse(i))) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }

        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int reverse(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(number);
        stringBuilder.reverse();

        String reversed = stringBuilder.toString();

        return Integer.parseInt(reversed);
    }
}
