import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        int year = 2021;
        PrintCheckYear(year);
        int clientOS = 1;
        int currentYear = LocalDate.now().getYear();
        printSystemMessage(clientOS, currentYear);
        int deliveryDistance = 95;
        int daysCount = 1;
        System.out.println(countDeliveryDays(deliveryDistance, daysCount));
    }

    public static void PrintCheckYear(int checkYear) {
        if (checkYear % 4 == 0) {
            if (checkYear % 100 == 0 && checkYear % 400 != 0) {
                System.out.println("Год не является високосным");
            }
            if (checkYear % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год является високосным");
            }
        } else {
            System.out.println("Год не является високосным");
        }
    }

    //Задание 1
    public static void printSystemMessage(int getClientOS, int currentYear) {

        if (getClientOS == 0) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (getClientOS == 1) {
            if (currentYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static int countDeliveryDays(int deliveryDistance, int daysCount) {

        if (deliveryDistance <= 20) {
            return daysCount;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return (daysCount + 1);
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return (daysCount + 2);
            } else {
            return 0;
            }
        }

    }



