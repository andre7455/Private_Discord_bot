package org.example;

public class Main {

    public static void main(String[] args) {
        //Starting the program in a ugly way
        Main instance = new Main();
        instance.run();
    }

    public void run() {
        UserInput userInput = new UserInput();
        boolean running = true;
        while (running) {
            int choice = userInput.menuOptions();
            if (choice == 2) {
                break;
            } else {
                userInput.menuController(choice);
            }
        }
    }
}