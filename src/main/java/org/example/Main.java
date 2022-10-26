package org.example;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kaas is nu nieuw");
        System.out.println("wat is getal 1?");
        int inputEen = scanner.nextInt();
        System.out.println("Wat is getal 2");
        int inputTwee = scanner.nextInt();
        System.out.println(inputEen + " + " + inputTwee + " = "+ TestClass.Add(inputTwee, inputTwee));
    }

}