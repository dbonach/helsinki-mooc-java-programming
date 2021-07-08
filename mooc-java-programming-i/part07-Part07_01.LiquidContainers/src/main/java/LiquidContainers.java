
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;
        int waste = 0;


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
//            System.out.println("Waste: " + waste);
            
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            System.out.println("");
            
            String[] arg = input.split(" ");
            
            if (Integer.valueOf(arg[1]) < 0) {
                continue;
            }
            
            if (arg[0].equals("add")) {
                if (Integer.valueOf(arg[1]) + first > 100) {
                    waste += Integer.valueOf(arg[1]) + first - 100;
                    first = 100;
                } else {
                    first += Integer.valueOf(arg[1]);
                }
                continue;
            }
            
            if (arg[0].equals("move")) {
                if (first - Integer.valueOf(arg[1]) < 0) {
                    
                    if (first + second > 100) {
                        first = 0;
                        second = 100;
                        waste += first + second - 100;
                    } else {
                        second += first;
                        first = 0;
                    }

                } else {
                    if (Integer.valueOf(arg[1]) + second > 100) {
                        first -= Integer.valueOf(arg[1]);
                        waste += Integer.valueOf(arg[1]) + 50 - 100;
                        second = 100;
                    } else {
                        first -= Integer.valueOf(arg[1]);
                        second += Integer.valueOf(arg[1]);
                    }
                }

                continue;
            }
            
            if (arg[0].equals("remove")) {
                if (Integer.valueOf(arg[1]) > second) {
                    second = 0;
                } else {
                    second -= Integer.valueOf(arg[1]);
                }
            }
        }
    }

}
