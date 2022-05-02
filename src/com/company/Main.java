package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);

    // TASK 1
//        Task1 t1 = new Task1();
//        t1.multiplication();

    // TASK 1 version 2
//        Task1_v2 t1_v2 = new Task1_v2();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Input please the first integer: ");
//        int one = scanner.nextInt();
//
//        System.out.println("Input please the second integer: ");
//        int two = scanner.nextInt();
//
//        System.out.println("Input please the third integer: ");
//        int three = scanner.nextInt();
//
//        int multipleValue = t1_v2.multiple(one, two, three);
//        System.out.println("Multiplication: " + multipleValue);

    // TASK 2
//        Task2 t2 = new Task2();
//        System.out.println("Welcome to TASK 2: I'll concatenate your given text");
//
//        System.out.println("input please the first word:");
//        String s1 = strScanner.nextLine();
//
//        System.out.println("input please the second word:");
//        String s2 = strScanner.nextLine();
//
//        System.out.println("input please the third word:");
//        String s3 = strScanner.nextLine();
//
//        String concatenation = t2.concatenation(s1, s2, s3);
//        System.out.println("Concatenation of your input is: " + concatenation);

    // TASK 3
//        Task3 t3 = new Task3();
//        System.out.println("Welcome to TASK 3: I'll give you unique array of your given strings.");
//        String userInput = "";
//
//        t3.addToList(userInput);
//        t3.getDistinct();

    // TASK 4
        Rectangle rectangle = new Rectangle();
        System.out.println("Welcome to TASK 4: I'll give you the area and perimeter of given values.");

        Scanner scanRect = new Scanner(System.in);
        System.out.println("Please input the first value:");
        int a = scanRect.nextInt();

        System.out.println("Please input the second value:");
        int b = scanRect.nextInt();

        System.out.println("Area of " + a + " and " + b + " is equal to " );
        System.out.println(rectangle.getArea(a, b));


        System.out.println("Perimeter of " + a + " and " + b + " is equal to " );
        System.out.println(rectangle.getPerimeter(a, b));
    }
}
