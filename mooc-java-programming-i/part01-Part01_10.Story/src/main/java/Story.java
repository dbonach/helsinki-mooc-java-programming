
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first." 
        + '\n' + "What is the main character called?");
        
        String caracter = scanner.nextLine();
        
        System.out.println("What is their job?");
        
        String caracter_job = scanner.nextLine();
        
        System.out.println("Here is the story:" + '\n'
        + "Once upon a time there was " + caracter + ", who was " + caracter_job 
        + "." + '\n'
        + "On the way to work, " + caracter + " reflected on life." + '\n' 
        + "Perhaps " + caracter + " will not be " + caracter_job 
        + " forever." );
        
        
        
        
        

    }
}
