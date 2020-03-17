package createpersons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreatePersons {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename = "C:\\Users\\Odisseas KD\\Desktop\\Coding\\Bootcamp\\TerminalExercises\\familyFile.txt";
        File file = new File(filename);
        String initialMessage = String.format("%-15s%-5s%-8s%-8s", "NAME", "AGE", "HEIGHT", "WEIGHT");
        FileWriter fr = new FileWriter(file, true);
        PrintWriter pr = new PrintWriter(fr);
        pr.print(initialMessage);
        fr.close();
        pr.close();
        
        String exit = "";
        while(!"exit".equals(exit)) {
        createFamilyMembers(file, filename);
            System.out.println("Do you want to exit? If yes type exit, else press any key...");
            exit = sc.next();
        }
        
        

    }

    public static void createFamilyMembers(File file, String filename) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filename2 = "C:\\Users\\Odisseas KD\\Desktop\\Coding\\Bootcamp\\TerminalExercises\\familyFile.txt";
        File file2 = new File(filename2);
        file.createNewFile();
        FileWriter fr = new FileWriter(file2, true);
        PrintWriter pr = new PrintWriter(fr);
        
        
        System.out.println("Creating a new family member...");
        System.out.println("What is his/her name?");
        String name = sc.next();
        
        int age;
        do{
            System.out.println("What is his/her age? (0-100)");
            while(!sc.hasNextInt()) {
            System.out.println("Please enter a number.");
            sc.next(); 
        }
            age = sc.nextInt();
        }while(age<0 || age >100);   
        

        double height;        
        do{
            System.out.println("What is his/her height? (0-2.40)");
            while(!sc.hasNextDouble()) {
            System.out.println("Please enter a number.");
            sc.next();
        }
            height = sc.nextDouble();
        }while(height<0 || height>2.40); 
        
        double weight;        
        do{
            System.out.println("What is his/her weight? (0-200.0)");
            while(!sc.hasNextDouble()) {
            System.out.println("Please enter a number.");
            sc.next();
        }
            weight = sc.nextDouble();
        }while(weight<0 || weight>200);  
        
        pr.append("\n");
        String toPrint = String.format("%-15s%-5d%-8.2f%-8.2f", name, age, height, weight);
        pr.append(toPrint);
        fr.close();
        pr.close();
        System.out.println("Person succesfully created.");
    }

    
    
}
