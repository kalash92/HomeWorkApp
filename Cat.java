package lesson6;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    protected void doRun(int run) {
        if (run >= 0 && run <= 200) {
            System.out.println(super.getName() + " пробежал " + run + " метров");
        } else if (run > 200) {
            System.out.println(super.getName() + " пробежал " + " 200 метров");
        } else {
            System.out.println("Отрицательное значение.");
        }
    }

    @Override
    protected void doSwim(int swim) {
        if (swim >= 0) {
            System.out.println("Кот не умеет плавать");
        } else {
            System.out.println("Значение отрицателное");
        }
    }
}
