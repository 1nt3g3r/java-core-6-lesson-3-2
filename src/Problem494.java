import java.util.Scanner;

public class Problem494 {
    public static void main(String[] args) {
        System.out.println(
                getVowelCount(
                        new Scanner(System.in).nextLine()
                )
        );
    }

    private static int getVowelCount(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isVowel(char c) {
        return "AEIOUY".indexOf(c) >= 0;
    }
}
