package com.company;


public class Main {

    public static int age = 25, temp = 15;

    public static void main(String[] args) {
        System.out.println(example("Эльдар", 20));

        if (age < 45 && age > 10 && temp < 30 && temp > -20) {
            System.out.println("можно идти гулять!");
        } else if (age > 10 && temp < 0) {

            System.out.println("можно гулять но не долго!");
        } else if (65 > age && temp > -10) {
            System.out.println("лучше остаться дома!");
        } else {
            System.out.println("лучше делай д.з!");
        }
    }
    public static String example(String name, int age) {
        return "My names " + name + " I'm " + age;
    }
}
