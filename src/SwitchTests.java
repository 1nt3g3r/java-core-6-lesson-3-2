public class SwitchTests {
    public static void main(String[] args) {
        int number = 9;

        switch (number) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Unknown number: " + number);
        }
    }
}
