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
        String initialMessage = "NAME \t AGE \t HEIGHT(m) \t WEIGHT(kg)";
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
        System.out.println("What is his/her age?");
        do{
            
            while(!sc.hasNextInt()) {
            System.out.println("Please enter a number.");
            sc.next();
        }
            System.out.println("Please enter a valid age.");
            age = sc.nextInt();
        }while(age<0 || age >100);   
        

        double height;
        System.out.println("What is his/her height?");
        do{
            
            while(!sc.hasNextDouble()) {
            System.out.println("Please enter a number.");
            sc.next();
        }
            System.out.println("Please enter a valid height.");
            height = sc.nextDouble();
        }while(height<0 || age >2.40);
        
        double weight;
        System.out.println("What is his/her weight?");
        do{
            
            while(!sc.hasNextDouble()) {
            System.out.println("Please enter a number.");
            sc.next();
        }
            System.out.println("Please enter a valid weight.");
            weight = sc.nextDouble();
        }while(weight<0 || age >200);
        
        
        pr.append("\n" + name + " \t" + age + " \t" + height + " \t" + weight);
        fr.close();
        pr.close();
        System.out.println("Person succesfully created.");
    }

    
    
}
