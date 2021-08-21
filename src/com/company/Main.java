package com.company;


public class Main {

    public static int  age = 25, temp = 15;

    public static void main(String[] args) {


        if (age < 45 && age > 10 && temp < 30 && temp > -20) {
            System.out.println("можно идти гулять!");
        } else if (age > 10 && temp < 0) {

            System.out.println("можно гулять но не долго!");
        } else if (65 > age && temp > -10) {
            System.out.println("лучше остаться дома!");
        } else {
            System.out.println("лучше делай д.з!");
        }


        String num = "воскресенье";
        switch (num) {
            case "понидельник":
                System.out.println("сегодня пониднльник");
                break;
            case "вторник":
                System.out.println("сегодня вторник");
                break;
            case "среда":
                System.out.println("сегодня среда");
                break;
            case "четверг":
                System.out.println("сегодня четерг");
                break;
            case "пятница":
                System.out.println("сегодня пятница");
                break;
            case "суббота":
                System.out.println("сегодня суббота");
                break;
            case "воскресенье":
                System.out.println("сегодня воскресенье");
                break;
        }

        }


    }