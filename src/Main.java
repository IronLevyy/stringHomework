
public class Main {
    public static void main(String[] args) {
//        Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        System.out.printf("ФИО сотрудника - %s", fullName);
        System.out.print("\n");

//        Задача 2
        String fullNameUp = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", fullNameUp);

//        Задача 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.printf("Данные ФИО сотрудника — %s", fullName);
    }
}