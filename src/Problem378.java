import java.util.Scanner;

public class Problem378 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encrypted = scanner.nextLine();
        String decodeTable = scanner.nextLine();

        String decrypted = decrypt(encrypted, decodeTable);

        System.out.println(decrypted);
    }

    private static String decrypt(String encrypted, String decodeTable) {
        String decrypted = "";
        for (char c : encrypted.toCharArray()) {
            if (c == ' ') {
                decrypted += c;
            } else {
                int index = getEnAlphabetCharIndex(c);
                char decodedChar = decodeTable.charAt(index);
                decrypted += decodedChar;
            }
        }
        return decrypted;
    }

    private static int getEnAlphabetCharIndex(char c) {
        return c - 65;
    }
}
