package org.example;

import java.util.Scanner;

public class GeneralTools {
    public void waitTillInput() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    public void ClearTheTerminal(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
