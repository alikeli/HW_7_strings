
public class Main {
    public static void main(String[] args) {

        //Task 1

        String firstName = "Ivan";
        String middleName  = "Ivanovich";
        String  lastName = "Ivanov";
        String  fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s \n", fullName);

        //Task 2

        fullName = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s \n", fullName);

        //Task 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "e");
        System.out.printf("Данные ФИО сотрудника — %s \n", fullName);

        // какя-то нербериха с 3 и 4 задачей в домашке(






    }
}