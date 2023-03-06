import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] cars = new int[]{1, 2, 3};
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        int[] things = new int[]{10, 20, 30};
        cars[0] = 1;
        cars[1] = 2;
        cars[2] = 3;
        numbers[0] = 1.57;
        numbers[1] = 7.654;
        numbers[2] = 9.986;
        things[0] = 10;
        things[1] = 20;
        things[2] = 30;
        for (int a = 0; a <= 2; a++) {
            System.out.println(cars[a]);
        }
        for (int b = 0; b <= 2; b++) {
            System.out.println(numbers[b]);
        }
        for (int c = 0; c <= 2; c++) {
            System.out.println(things[c]);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] cars = new int[]{1, 2, 3};
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        int[] things = new int[]{10, 20, 30};
        System.out.println(cars[2] + ", " + cars[1] + ", " + cars[0]);
        System.out.println(numbers[1] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(things[1] + ", " + things[1] + ", " + things[2]);
        for (int a = 0; a < cars.length; a++) {
            System.out.println(cars[a]);
            if (a != cars.length - 1){
                System.out.println(", ");
            }
        }
        System.out.println();

            for (int b = 0; b < numbers.length; b++) {
                System.out.println(numbers[b]);
                if (b != numbers.length - 1){
                    System.out.println(", ");
                }
            }
            System.out.println();

            for (int c = 0; c < things.length; c++) {
                System.out.println(things[c]);
                if (c != things.length - 1){
                    System.out.println(", ");
                }
            }
            System.out.println();
        }
    public static void task3() {
        System.out.println("Задача 3");
        int[] cars = new int[]{1, 2, 3};
        double[] numbers = new double[]{1.57, 7.654, 9.986};
        int[] things = new int[]{10, 20, 30};
        System.out.println(cars[2] + ", " + cars[1] + ", " + cars[0]);
        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(things[2] + ", " + things[1] + ", " + things[0]);
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
            if (i != 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
            if (i != 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
        for (int i = cars.length - 1; i >= 0; i--) {
            System.out.println(cars[i]);
            if (i != 0) {
                System.out.println(", ");
            }
        }
        System.out.println();
    }
        public static void task4 () {
            System.out.println("Задача 4");
            int[] cars = {1, 2, 3};
            for (int a = 0; a < cars.length; a++) {
                if (cars[a] % 2 != 0) {
                    cars[a] += 1;
                }
            }
            System.out.println(Arrays.toString(cars));
        }
    }