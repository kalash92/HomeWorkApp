package lesson7;

import java.util.Scanner;

public class Plate {
    private int foodCount;

    private static final Scanner in = new Scanner(System.in);

    public int getFoodCount() {
        return foodCount;
    }

    public Plate(int foodCount) {

        this.foodCount = foodCount;
    }

    public void printInfo() {
        System.out.println("Кол-во еды в миске: " + foodCount);
    }

    public void decreaseFood(int catEatFoodCount) {
        foodCount -= catEatFoodCount;

    }

    public void putMoreFood() {
        if (askFood() == true) {
            foodCount += 15;
        } else {
            foodCount += 0;
        }
    }

    private boolean askFood() {
        System.out.println("Хотите добавить 15 еды в тарелку? y/n");
        return switch (in.next()) {
            case "y", "yes" -> true;
            default -> false;
        };
    }
}


