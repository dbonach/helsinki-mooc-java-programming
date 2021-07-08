
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();


        while (true) {
            System.out.print("First: ");
            System.out.println(first);
            System.out.print("Second: ");
            System.out.println(second);
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
                first.add(Integer.valueOf(arg[1]));
                continue;
            }
            
            if (arg[0].equals("move")) {
                
                if (first.contains() - Integer.valueOf(arg[1]) < 0) {
                    second.add(first.contains());
                } else {
                    second.add(Integer.valueOf(arg[1]));
                }
                
                first.remove(Integer.valueOf(arg[1]));
            }
            
            if (arg[0].equals("remove")) {
                second.remove(Integer.valueOf(arg[1]));
            }

        }
        
    }
    
}
