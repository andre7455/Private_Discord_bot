package org.example;
import java.util.Scanner;

public class UserInput {
    public int menuOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("################################");
        System.out.println("Welcome to the backend of my discord bot");
        System.out.println("Select the option you want to use :)");
        System.out.println();
        System.out.println("Options:");
        System.out.println("1: Start bot");
        System.out.println("2: Exit Application");
        System.out.println("3: Show log");
        System.out.println("4: Add key");
        System.out.println("5: Delete key");
        System.out.println("6: Check internet status");
        return scanner.nextInt();
    }

    public void menuController(int choice) {
        NetworkTools networkTools = new NetworkTools();
        switch (choice) {
            case 1:
                //Start bot
                break;
            case 3:
                //Show log
                break;
            case 4:
                //Add key
                break;
            case 5:
                //Delete key
                break;
            case 6:
                networkTools.checkInternetStatus();
                break;
        }
    }
}
