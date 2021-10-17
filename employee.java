package lesson5;

public class employee {
    String name;
    String secondName;
    String lastName;
    String position;
    String email;
    String phoneNumb;
    int salary;
    int age;

    public employee(String name, String secondName, String lastName, String position, String email, String phoneNumb, int salary, int age) {
        this.name = name;
        this.secondName = secondName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phoneNumb = phoneNumb;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("Сотрудник: %s %s %s, должность: %s, почта: %s, телефон: %s, зарплата: %d, возраст: %d", name, secondName, lastName, position, email, phoneNumb, salary, age);
    }
}
