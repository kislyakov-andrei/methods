import java.time.LocalDate;

public class Main {
    // Task 1
    public static int isLeapYear(int year) {
        if (year > 1584 && year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return 1;}
        return 0;
    }
    //Task 2
    public static int isClientDeviceActual(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            return 1;
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            return 2;
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            return 3;
        } else {
            return 4;
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

        int year = 2021;
        int leapYear = isLeapYear(year);
        if (leapYear == 1) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + "год - не високосный год");
        }

// Task 2
        System.out.println("Task 2");


        int clientOS = 1;
        int clientDeviceYear = 2024;
        if (clientOS == 0 || clientOS == 1) {

            int clientDevice = isClientDeviceActual(clientOS, clientDeviceYear);
            if (clientDevice == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientDevice == 2) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientDevice == 3) {
                System.out.println("Установите  версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию для  Android по ссылке.");
            }
        } else {
            System.out.println("Извините. Ваше устройство не обслуживается");
        }
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