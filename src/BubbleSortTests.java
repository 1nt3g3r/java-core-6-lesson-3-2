import java.util.Arrays;

public class BubbleSortTests {
    public static void main(String[] args) {
        int[] values = {1, 5, 4, 2, 2};

        sort(values);

        System.out.println(Arrays.toString(values));
    }

    private static void sort(int[] numbers) {
        boolean shouldSort = true;

        while (shouldSort) {
            shouldSort = false;

            for (int i = 0; i < numbers.length - 1; i++) {
                int current = numbers[i];
                int next = numbers[i + 1];

                if (next < current) {
                    numbers[i] = next;
                    numbers[i + 1] = current;

                    shouldSort = true;
                }
            }
        }
    }
}
