package lesson5;

public class main {
    public static void main(String[] args) {
        employee[] empArray = new employee[5];
        empArray[0] = new employee("Иванов", "Иван", "Иванович", "Бухгалтер", "1@mail.ru", "+79239239239", 75000, 39);
        empArray[1] = new employee("Петров", "Петр", "Петрович", "Аналитик", "2@mail.ru", "+79239239240", 85000, 41);
        empArray[2] = new employee("Василий", "Васильевич", "Васильев", "Начальник отдела", "3@mail.ru", "+79239239241", 110000, 47);
        empArray[3] = new employee("Николай", "Николаевич", "Николаев", "Младший разработчик", "4@mail.ru", "+79239239242", 55000, 22);
        empArray[4] = new employee("Павел", "Павлович", "Павлов", "Разработчик", "5@mail.ru", "+79239239243", 70000, 27);

        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 40) {
                empArray[i].printInfo();
            } else {
                continue;
            }
        }
    }
}

