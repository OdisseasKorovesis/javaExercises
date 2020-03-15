
package weightondifferentplanets;

import java.util.Scanner;


public class WeightOnDifferentPlanets {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight.");
        double weight = sc.nextInt();
        System.out.println("Which planet would you like to go to?");
        
        final String planet = sc.next();
        switch(planet) {
            case "Venus":
                weight *= 0.78;
                System.out.println("Your weight in Venus is " + weight);
                break;
            case "Mars":
                weight *= 0.39;
                System.out.println("Your weight in Mars is " + weight);
                break;
            case "Jupiter":
                weight *= 2.65;
                System.out.println("Your weight in Jupiter is " + weight);
                break;
            case "Saturn":
                weight *= 1.17;
                System.out.println("Your weight in Saturn is " + weight);
                break;
            case "Uranus":
                weight *= 1.05;
                System.out.println("Your weight in Uranus is " + weight);
                break;
            case "Neptune":
                weight *= 1.23;
                System.out.println("Your weight in Neptune is " + weight);
                break;
            default:                
                System.out.println("Invalid planet.");              
                
                
            
        }
    }
    
}
