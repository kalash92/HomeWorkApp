package lesson3;

import java.util.Arrays;
import java.util.Random;

public class lesson3 {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        firstTask();
        secondTask();
        thirdTask();
        fourthTask();
        System.out.println(Arrays.toString(fifthTask(3, 7)));
        sixthTask();
    }

    public static void firstTask() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//        System.out.println(Arrays.toString(array)); для проверки
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("First: " + Arrays.toString(array));
    }

    public static void secondTask() {
        final int ARRAY_SIZE = 100;
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println("Second: " + Arrays.toString(array));
    }

    public static void thirdTask() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        System.out.println(Arrays.toString(array)); для проверки
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println("Third: " + Arrays.toString(array));
    }

    public static void fourthTask() {
        final int ARRAY_SIZE = rnd.nextInt(5) + 3;
        int[][] deepArray = new int[ARRAY_SIZE][ARRAY_SIZE];
        int k = deepArray.length - 1;
        for (int i = 0; i < deepArray.length; i++) {
            deepArray[i][i] = 1;
            deepArray[i][k--] = 1;
        }
        System.out.println("Fourth: ");
        for (int[] deepArum : deepArray) {
            for (int num : deepArum) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

    }

    public static int[] fifthTask(int len, int initialValue) {
        int[] array = new int[len];
        System.out.print("Fifth: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void sixthTask() {
        int[] array = new int[rnd.nextInt(10) + 3];

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10) - 5;
        }
        Arrays.sort(array);
        System.out.println("Sixth: ");
//        System.out.println(Arrays.toString(array)); Для проверки
        System.out.println("Max: " + array[array.length - 1]);
        System.out.println("Min: " + array[0]);
    }

}
