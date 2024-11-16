import java.time.LocalDate;

public class Main {
    // Task 1
    public static boolean checkLeapYear(int year) {
        return (year > 1584 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    //Task 2
    public static void isClientDeviceActual(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите  версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите  облегченную версию приложения для Android по ссылке.");
        }
    }
    // Task 3
    public static int deliveryTime(int distance){
        if (distance > 100) {
            return 0;
        }else if (distance <= 20){
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        }else {
            return 3;
        }
    }
    public static void main(String[] args) {

// Task 1
        System.out.println("Task 1");

        int year = 2021
                ;
        boolean leapYear = checkLeapYear(year);
        if (leapYear) {
            System.out.println(year + " год - високосный год");
        }
            System.out.println(year + "год - не високосный год");


// Task 2
        System.out.println("Task 2");


        int clientOS = 1;
        int clientDeviceYear = 2014;

        isClientDeviceActual(clientOS, clientDeviceYear);

// Task 3
        System.out.println("Task 3");

        int distance = 55;
        String dni;
        int days = deliveryTime(distance);
        if (days > 0) {
            if (days==1) {
                dni = "день";
            } else { dni = "дня";}

            System.out.println("Для расстояния - " + distance +"км срок доставки: " + days + " " + dni + ".");
        } else {
            System.out.println("На расстояние " + distance + "км доставки нет.");
        }

    }
}