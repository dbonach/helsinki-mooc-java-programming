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

public class UserInterface {
    private final Scanner s;
    private final Points pts;
    
    public UserInterface(Scanner scanner, Points pts) {
        this.s = scanner;
        this.pts = pts;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int n = Integer.valueOf(s.nextLine());
           
            if (n == -1) {
                break;
            }
            
            if (n >= 0 && n <= 100) {
                this.pts.add(n);
            }
        }
        
        pts.printAverages();
        pts.printGradeDistribution();
    }
    
}
