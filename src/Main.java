package pro.sky;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 8;
        if (age >= 18){
            System.out.println("If the age of a person is " + age + " than the person is an adult");
        } else {
            System.out.println("If the age of a person is " + age + " than the person is a minor");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        float weather = 4.5f;
        if (weather < 5){
            System.out.println("It's " + weather + "C outside, wear a hat");
        } else {
            System.out.println("It's " + weather + "C outside, you don't need a hat");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 61;
        if (speed > 60){
            System.out.println("If the speed is " + speed + ", than you'll have to pay a fine");
        } else {
            System.out.println("If the speed is " + speed + ", than you can drive calmly");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int age = 61;
        if (age < 2){
            System.out.println("If age of a person is " + age + ", than it's time to sleep");
        }
        if (age >= 2 && age <= 6){
            System.out.println("If age of a person is " + age + ", than (s)he needs to go to kindergarten.");
        }
        if (age >= 7 && age <= 18){
            System.out.println("If age of a person is " + age + ", than (s)he needs to go to school.");
        }
        if (age > 18 && age <= 24){
            System.out.println("If age of a person is " + age + ", than (s)he needs to go to college.");
        }
        if (age > 24 && age <= 60){
            System.out.println("If age of a person is " + age + ", than (s)he needs to go to work.");
        }
        if (age > 60){
            System.out.println("If age of a person is " + age + ", than (s)he needs to rest.");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int age = 6;
        boolean isAdultPresent = true;
        if (age < 5){
            System.out.println("If the age of a child is " + age + ", than (s)he can't ride rides");
        } else if ((age >= 5 && age < 14) && isAdultPresent) {
            System.out.println("If the age of a child is " + age + ", than (s)he can ride but with adults");
        } else if ((age >= 5 && age < 14) && !isAdultPresent) {
            System.out.println("If the age of a child is " + age + ", than (s)he can't ride rides without adults");
        } else if (age >= 14) {
            System.out.println("If the age of a child is " + age + ", than (s)he can ride rides");
        }

    }
    public static void task6 () {
        System.out.println("Задача 6");
        int capacityOccupied = 103;
        int capacityFree = 102;
        int seatsFree = 60;
        if (capacityOccupied < seatsFree){
            System.out.println("There are free seats");
        } else if (capacityOccupied < capacityFree){
            System.out.println("There are standing places");
        } else {
            System.out.println("The cart is full");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two){
            if(one > three){
                System.out.println(one + " is the biggest number");
            }
        } else if (two > three) {
            System.out.println(two + " is the biggest number");
        } else {
            System.out.println(three + " is the biggest number");
        }

    }
}