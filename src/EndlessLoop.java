import java.util.Scanner;

public class EndlessLoop {
    public static void main(String[] args) {
//        int sum = 0;
//        int current = 0;
//
//        for(;;) {
//            current++;
//            sum += current;
//
//            if (current == 10) {
//                break;
//            }
//        }
//
//        System.out.println("sum = " + sum);

        Scanner scanner = new Scanner(System.in);

        endless:for(;;) {
            String command = scanner.nextLine();

            switch (command) {
                case "hello":
                    System.out.println("Hi");
                    break;
                case "exit":
                    System.out.println("Bye!");
                    break endless;
                default:
                    System.out.println("Unknown command: " + command);
            }

//            if (command.equals("hello")) {
//                System.out.println("Hi");
//            } else if (command.equals("exit")) {
//                System.out.println("Bye!");
//                break;
//            } else {
//                System.out.println("Unknown command: " + command);
//            }
        }

        scanner.close();


//        System.out.println("sum(5, 7) = " + sum(5, 7));
    }

    private static int sum(int start, int end) {
        int result = 0;

        int current = start - 1;

        for(;;) {
            current++;
            result += current;

            if (current == end) {
                return result;
            }
        }
    }
}
