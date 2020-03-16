
package readurl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadURL {

    
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\Odisseas KD\\Desktop\\Coding\\Bootcamp\\TerminalExercises\\urlFile.txt";
        File file = new File(filename);
        file.createNewFile();
        FileWriter fr = new FileWriter(file, true);
        PrintWriter pr = new PrintWriter(fr);
        pr.print("https://www.javatpoint.com/");
        pr.print("\nhttps://docs.oracle.com/javase/8/docs/");
        pr.print("\nhttps://www.baeldung.com/");
        pr.print("\nhttps://www.vogella.com//tutorials/java.html");
        pr.print("\nhttps://www.tutorialspoint.com/java_technology_tutorials.html");
        fr.close();
        pr.close();
        
        readAndPrintSubdomain(file);
        System.out.println("*********");
        printWordsContaining(file);
        
    }
    
    public static void readAndPrintSubdomain (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            if(line.contains("www")) {
            line = line.substring(line.indexOf("w.") + 2, line.indexOf(".c"));
            System.out.println(line);
            } else {
                line = line.substring(line.indexOf("//") + 2, line.indexOf(".c"));
                System.out.println(line);
            }            
        }
    }
    
    public static void printWordsContaining (File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            if(line.contains("java")) {
                System.out.println("This line containts the keyword: " + line);
            }
        }
    }
    
}
