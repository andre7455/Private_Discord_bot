import java.util.Scanner;

public class GeneralTools {
    public void waitTillInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Press enter to continue");
    }

    public void ClearTheTerminal() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static double calculateProgress(int pointsEarned) {
        // Calculate the percentage of progress by dividing the points earned by the total number of points needed
        double progress = (double) pointsEarned / 2000 * 100;
        // Return the progress as a percentage
        return progress;
    }

}
