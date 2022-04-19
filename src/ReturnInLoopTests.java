public class ReturnInLoopTests {
    public static void main(String[] args) {
        int[] values = {1, 3, 5};

        System.out.println("contains(values, 2) = " + contains(values, 2));
        System.out.println("contains(values, 3) = " + contains(values, 3));
    }

    private static boolean contains(int[] numbers, int searchValue) {
        for (int number : numbers) {
            if (number == searchValue) {
                return true;
            }
        }

        return false;
    }
}
