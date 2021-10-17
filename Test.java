package lesson7;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Cat barsik = new Cat("Бариск");
        Cat kuzya = new Cat("Кузя");
        Cat sema = new Cat("Сёма");
        Cat vasya = new Cat("Вася");
        Cat ryzhik = new Cat("Рыжик");
        Plate plate = new Plate(75);

        Cat[] cats = {barsik, kuzya, sema, vasya, ryzhik};
        for (int i = 0; i < cats.length; i++) {
            plate.printInfo();
            cats[i].eat(plate);
            plate.printInfo();
            plate.putMoreFood();
        }
    }
}
