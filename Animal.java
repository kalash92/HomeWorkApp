package lesson6;

public abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    protected abstract void doRun(int run);

    protected abstract void doSwim(int swim);
}
