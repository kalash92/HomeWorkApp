package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog bobik = new Dog("Бобик");
        Cat barsik = new Cat("Барсик");

        bobik.doRun(150);
        bobik.doSwim(5);
        barsik.doRun(50);
        barsik.doSwim(5);
    }
}
