public class ForTests {
    public static void main(String[] args) {
//        for(int i = 1; i <= 3; i++) {
//            System.out.println("i = " + i);
//        }

        //Посчитать сумму четных чисел от 0 до 100 включительно
        int sum = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("sum = " + sum); //2550
    }
}
