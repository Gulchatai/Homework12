public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int numberOfYear = 240;
        checkStatusYear(numberOfYear);
    }

    public static void checkStatusYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) && (year != 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосный год");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        //int currentYear = LocalDate.now().getYear(); НЕ ПОЛУЧАЕТСЯ ПОКА ИСПОЛЬЗОВАТЬ ПРОШУ ПРОКОНСУЛЬТИРОВАТЬ
        // ВИЖУ ЧТО ПОДГРУЗИЛОСЬ ЧТО-ТО СВЕРХУ
        byte type = 1;
        int yearReleaseDevice = 1000;
        selectTypeOfSystem(type, yearReleaseDevice);
    }

    public static int selectTypeOfSystem(byte typeOfSystem, int year) {
        if (typeOfSystem == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (typeOfSystem == 0 && year >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (typeOfSystem != 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        return (typeOfSystem);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 88;
        calculateQuantityOfDays(deliveryDistance);
    }

    public static int calculateQuantityOfDays(int distance) {
        int days = 1;
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + days);
        }
        if (distance > 20 && distance <= 60) {
            days = days + 1;
            System.out.println("Потребуется дней: " + days);
        }
        if (distance > 60 && distance <= 100) {
            days = days + 2;
            System.out.println("Потребуется дней: " + days);
        }
        if (distance > 100) {
            System.out.println("Доставка невозможна");
        }
        return (distance);
    }
}