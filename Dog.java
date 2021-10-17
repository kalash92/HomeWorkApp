package lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    protected void doRun(int run) {
        if (run >= 0 && run <= 500) {
            System.out.println(super.getName() + " пробежал " + run + " метров");
        } else if (run > 500) {
            System.out.println(super.getName() + " пробежал " + " 500 метров");
        } else {
            System.out.println("Отрицательное значение.");
        }
    }

    @Override
    protected void doSwim(int swim) {
        if (swim >= 0 && swim <= 10) {
            System.out.println(super.getName() + " проплыл " + swim + " метров");
        } else if (swim > 10) {
            System.out.println(super.getName() + " проплыл " + " 10 метров");
        } else {
            System.out.println("Отрицательное значение.");
        }

    }
}
