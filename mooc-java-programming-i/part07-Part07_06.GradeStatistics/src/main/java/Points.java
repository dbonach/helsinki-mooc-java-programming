/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dbonach
 */
import java.util.ArrayList;

public class Points {
    private final ArrayList<Integer> points;
    
    public Points() {
        this.points = new ArrayList<>();
    }
    
    public void add(int n) {
        points.add(n);
    }
    
    public void printAverages() {
        int total = 0;
        int totalPassing = 0;
        int numPassing = 0;
        
        for (int n : points) {
            total += n;
            
            if (n >= 50) {
                totalPassing += n;
                numPassing++;
            }
        }
        
        System.out.print("Point average (all): ");
        System.out.println(1.0 * total/points.size());
        
        System.out.print("Point average (passing): ");
        if (numPassing == 0) {
            System.out.println("-");
        } else {
            System.out.println(1.0 * totalPassing/numPassing);
        }
        
        System.out.print("Pass percentage: ");
        System.out.println(100.0 * numPassing/points.size());
    }
    
    public void printGradeDistribution() {
        int[] grades = new int[6];
        
        for (int n : points) {
            if (n >= 90) {
                grades[5]++;
            } else if (n >= 80) {
                grades[4]++;
            } else if (n >= 70) {
                grades[3]++;
            } else if (n >= 60) {
                grades[2]++;
            } else if (n >= 50) {
                grades[1]++;
            } else {
                grades[0]++;
            }
        }
        
        System.out.println("Grade distribution: ");
        
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(grades[i]);
            System.out.println("");
        }
        
    }
    
    public void printStars(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
    }
}
