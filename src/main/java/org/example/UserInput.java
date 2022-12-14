package org.example;

import java.util.Scanner;

public class UserInput {
    public int menuOptions() {
        //todo when code is working remove debug place
        GeneralTools generalTools = new GeneralTools();
        generalTools.ClearTheTerminal();
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
        System.out.println("7: Debug place");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("That input is not correct");
            generalTools.waitTillInput();
            return 7;
        }

    }

    public void menuController(int choice) {
        GeneralTools generalTools = new GeneralTools();
        NetworkTools networkTools = new NetworkTools();
        KeyController keyController = new KeyController();
        //todo when code is working remove debug place
        switch (choice) {
            case 1:
                //Start bot
                break;
            case 3:
                //Show log
                break;
            case 4:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the key and press enter:");
                keyController.WriteFile(scanner.nextLine());
                break;
            case 5:
                keyController.RemoveKey();
                break;
            case 6:
                networkTools.checkInternetStatus();
                break;
            case 7:
                System.out.println(keyController.GetKey());
                break;
            default:
                break;
        }
    }
}
