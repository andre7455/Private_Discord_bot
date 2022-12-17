package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class KeyController {
    GeneralTools generalTools = new GeneralTools();

    public void WriteFile(String input) {
        //this will write a file in the root directory
        if (GetKey().equals("")) {
            try {
                FileWriter writer = new FileWriter("Storage.txt");
                writer.write(input);
                writer.close();
                generalTools.ClearTheTerminal();
            } catch (Exception e) {
                System.out.println("File could not be written for some reason");
                generalTools.waitTillInput();
                generalTools.ClearTheTerminal();
                //e.printStackTrace();
            }
        } else {
            System.out.println("There was already a key stored");
            System.out.println("Delete the Key first before writing a new one");
            generalTools.waitTillInput();
        }

    }

    public void RemoveKey() {
        File file = new File("Storage.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure you want to delete the file that stores the private key?[Y/N]");
        if (scanner.nextLine().equals("Y") || scanner.nextLine().equals("y")) {
            if (file.delete()) {
                System.out.println("The file has been deleted.");
                generalTools.waitTillInput();
                generalTools.ClearTheTerminal();
            } else {
                System.out.println("The file could not be deleted.");
                generalTools.waitTillInput();
                generalTools.ClearTheTerminal();
            }
        } else {
            System.out.println("File not deleted");
            generalTools.waitTillInput();
            generalTools.ClearTheTerminal();
        }
    }

    public String GetKey() {
        String Filecontent = "";
        try {
            FileReader reader = new FileReader("Storage.txt");
            int character;
            while ((character = reader.read()) != -1) {
                Filecontent = Filecontent + (char) character;
            }
            reader.close();
            return Filecontent;
        } catch (Exception e) {
            generalTools.waitTillInput();
            return Filecontent;
        }
        //todo:Make it so that this file will add everything to a string and returns it. and remove the sout that echo's the code
    }
}
