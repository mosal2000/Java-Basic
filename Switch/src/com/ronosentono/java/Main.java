package com.ronosentono.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a month number (1-6): ");
        String input = sc.nextLine();

        int monthNumber = Integer.parseInt(input);

        switch (monthNumber) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is MArch");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is Mei");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            default:
                System.out.println("You choose a wrong month!");
        }
    }

}