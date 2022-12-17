package org.example;

public class Main {
    public static void main(String[] args) {
        //Starting the program in a ugly way i really need a better way to get out of a static context
        Main instance = new Main();
        instance.run();
    }

    public void run() {
        UserInput userInput = new UserInput();
        while (1 == 1) {
            int choice = userInput.menuOptions();
            if (choice == 2) {
                break;
            } else {
                userInput.menuController(choice);
            }
        }
    }
}