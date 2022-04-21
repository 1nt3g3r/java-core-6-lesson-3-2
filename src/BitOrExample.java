public class BitOrExample {
    public static void main(String[] args) {
        if (a() & b()) {

        }
    }

    private static boolean a() {
        System.out.println("a method called");
        return false;
    }

    private static boolean b() {
        System.out.println("b method called");
        return true;
    }
}
