public class NestedLoops {
    public static void main(String[] args) {
        int[][] temp = {
                {1, 3, 5, 8, 9, 5, 6}, //week 1
                {6, 7, 5, 7, 5, 7, 8}, //week 2
                {5, 6, 5, 6, 2, 8, 6}  //week 3
        };

        for(int[] weekTemperature: temp) {
            int sum = 0;
            for (int value : weekTemperature) {
                sum += value;
            }

            float average = (float) sum / (float) weekTemperature.length;
            System.out.println("average = " + average);
        }

//        for(int i = 0; i < temp.length; i++) {
//            int[] weekTemperature = temp[i];
//
//            int sum = 0;
//            for(int j = 0; j < weekTemperature.length; j++) {
//                sum += weekTemperature[j];
//            }
//
//            float average = (float) sum / (float) weekTemperature.length;
//            System.out.println("average = " + average);
//        }


//        String[] names = {"John", "Bill"};
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("names[i] = " + names[i]);
//        }
//        for(String name: names) {
//            System.out.println("name = " + name);
//        }

    }
}
