package lesson2;

import java.util.Scanner;

public class lesson2 {

    public static void main(String[] args) {
        firstTask(11, 10);
//        System.out.println(firstTask(11, 10)); в задании небыло написано, что ответ надо выводить, но если надо, то это сторока будет ответом.
        secondTask();
        thirdTask();
//        System.out.println(thirdTask()); в задании небыло написано, что ответ надо выводить, но если надо, то это сторока будет ответом.
        fourthTask("Hello, World!", 7);
        System.out.println(fifthTask(1216));
    }

    public static boolean firstTask(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }

    public static void secondTask() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean thirdTask() {
        int a = -1;
        if (a >= 0) {
            return false;
        }
        return true;
    }

    public static void fourthTask(String str, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }

    public static boolean fifthTask(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 25 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        }
        return false;
    }
}


