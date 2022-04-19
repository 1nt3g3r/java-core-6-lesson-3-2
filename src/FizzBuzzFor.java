public class FizzBuzzFor {
    public static void main(String[] args) {
        //Есть числа от 1 до 100 включительно. Необходимо пройтись по всем числами, и:
        //1) Если число кратно 3, то вывести Fizz
        //2) Если число кратно 5, то вывести Buzz
        //3) Если число кратно и 3 и 5 одновременно - то вывести FizzBuzz
        //4) В противном случае вывести само число

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
