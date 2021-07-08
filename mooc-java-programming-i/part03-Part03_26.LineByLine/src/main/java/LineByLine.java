
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            
//            System.out.println(input.equals(""));
            
            if (input.equals("")) {
                break;
            }
            
            String[] stringArray = input.split(" ");

            for (int i = 0; i < stringArray.length; i++) {
                System.out.println(stringArray[i]);
            }
        }


    }
}
