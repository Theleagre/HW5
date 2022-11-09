public class Main {
    public static void main(String[] args) {
        //задание 1 и 2
        System.out.println("Задание 1 и 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        //задание 3
        System.out.println("Задание 3");
        int year = 2021;

        if ((year % 4 == 0) && year % 100 != 0)
        {
            System.out.println(year + " год високосный");
        }
        else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0))
        {
            System.out.println(year + " год високосный");
        }
        else
        {
            System.out.println(year + " год не високосный");
        }

        //задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance <20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance >= 20) {
            if (deliveryDistance <60) {
                System.out.println("Потребуется дней: " + 2);
            }
        }
        {
            if (deliveryDistance < 100) {
                System.out.println("Потребуется дней: " + 3);
            }
        }
//задание 5
        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний сезон");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний сезон");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний сезон");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний сезон");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}