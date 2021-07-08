/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */

import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner s, SimpleDictionary d) {
        this.scanner = s;
        this.dictionary = d;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("end")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
                continue;
            }
            
            if(command.equals("search")) {
                System.out.print("To be translated: ");
                String wordToTranslate = scanner.nextLine();
                String translation = dictionary.translate(wordToTranslate);
                String message = "";
                if (translation != null) {
                    message = "Translation: " + translation;
                    System.out.println(message);
                    continue;
                }
                message = "Word " + wordToTranslate + " was not found";
                System.out.println(message);
                continue;
            }
            
            System.out.println("Unknown command");
        }
        
        System.out.println("Bye bye!");
    }
}
