public class LetterTests {
    public static void main(String[] args) {
        int aLetterCount = 1000;
        System.out.println("getLetterCount(aLetterCount, 'Б') = " + getLetterCount(aLetterCount, 'Б'));
        System.out.println("getLetterCount(aLetterCount, 'В') = " + getLetterCount(aLetterCount, 'В'));
    }

    private static int getLetterCount(int aLetterCount, char anotherLetter) {
        float aLetterFreq = 0.072f;

        switch (anotherLetter) {
            case 'Б':
                float bLetterFreq = 0.017f;
                return (int) (bLetterFreq / aLetterFreq * (float) aLetterCount);
            case 'В':
                float vLetterFreq = 0.052f;
                return (int) (vLetterFreq / aLetterFreq * (float) aLetterCount);
        }
        return -1;
    }
}
