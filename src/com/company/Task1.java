package com.company;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task1 {
    int one, two, three;

    void multiplication(){
        System.out.println("Welcome to TASK 1: I'll return multiplication of 3 integers you'll input here.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input please the first integer: ");
        one = scanner.nextInt();

        System.out.println("Input please the second integer: ");
        two = scanner.nextInt();

        System.out.println("Input please the third integer: ");
        three = scanner.nextInt();

        int multiplication = one * two * three;
        System.out.println("Multiplication of given number are: " + multiplication);
    }
}

// Please implement a method, which takes three integers as input parameters and returns the result of multiplication of these parameters.