public class Main {
    public static void main(String[] args) {
        //Starting the program in a ugly way i really need a better way to get out of a static context
        Main instance = new Main();
        instance.run();
    }

    public void run() {
        System.out.println("kaas");
        boolean running = true;
        UserInput userInput = new UserInput();
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