package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class KeyController {
    public void WriteFile(String input) {
        //this will write a file in the root directory
        try {
            FileWriter writer = new FileWriter("Storage.txt");
            writer.write(input);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void RemoveKey(){
        File file = new File("Storage.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete the file that stores the private key?[Y/N]");
        if (scanner.nextLine().equals("Y") || scanner.nextLine().equals("y")){
            if (file.delete()){
                System.out.println("The file has been deleted.");
            } else {
                System.out.println("The file could not be deleted.");
            }
        } else {
            System.out.println("File not deleted");
        }
    }

    public String GetKey() {
        try {
            FileReader reader = new FileReader("Storage.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "temp value";
        //todo:Make it so that this file will add everything to a string and returns it.
    }
}
