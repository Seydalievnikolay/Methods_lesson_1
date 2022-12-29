import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

    }
    private static void task2() {
        System.out.println("Задача 2");
        String fullName = "Ivanov Ivan Ivanovich";
        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println(fullName1);
    }
    private static void task3() {
        System.out.println("Задача 3");
        String fillName = "Иванов Семён Семёнович";
        fillName = fillName.replace("ё", "е");
        System.out.println(fillName);
    }
}