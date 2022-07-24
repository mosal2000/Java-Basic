package com.ronosentono.java;

import java.util.Scanner;

public class SwitchString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three letter month(Jan-Jun): ");
        String input = sc.nextLine();

        switch (input.toLowerCase()) {
            case "jan":
                System.out.println("The month is January");
                break;
            case "feb":
                System.out.println("The month is February");
                break;
            case "mar":
                System.out.println("The month is MArch");
                break;
            case "apr":
                System.out.println("The month is April");
                break;
            case "mei":
                System.out.println("The month is Mei");
                break;
            case "jun":
                System.out.println("The month is June");
                break;
            default:
                System.out.println("You choose a wrong month!");
        }
    }

}
