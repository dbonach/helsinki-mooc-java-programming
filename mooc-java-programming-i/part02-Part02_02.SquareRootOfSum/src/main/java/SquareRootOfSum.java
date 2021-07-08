
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt(number + second);
        
        System.out.println(squareRoot);

    }
}
