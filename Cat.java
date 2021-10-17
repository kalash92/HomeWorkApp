package lesson7;

import java.util.Random;

public class Cat {
    private Random random = new Random();
    private final String name;
    private int catEat;

    public Cat(String name) {
        this.name = name;
    }

    public boolean full(int a) {
        if (a >= 15) {
            return true;
        }
        return false;
    }

    public void eat(Plate plate) throws InterruptedException {
        System.out.println("Кот " + this.name + " кушает");
        catEat = random.nextInt(10) + 10;
        if (plate.getFoodCount() >= catEat) {
            plate.decreaseFood(catEat);
            System.out.println("Кот " + this.name + " скушал " + catEat + " еды");
            System.out.println("Сытость кота " + this.name + ": " + full(catEat));
            Thread.sleep(3000);
        } else {
            System.out.println("Кот " + this.name + " хотел съесть " + catEat + " еды, а в миске было " + plate.getFoodCount());
            System.out.println("Сытость кота " + this.name + ": " + full(0));
        }
        System.out.println("-------------------------");
    }
}

