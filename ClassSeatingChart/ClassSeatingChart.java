
package classseatingchart;

import java.util.Random;
import java.util.Scanner;


public class ClassSeatingChart {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rdm = new Random();
        
        
        System.out.println("How many students does this class have?");
        
        int students = sc.nextInt();
        while(students < 0) {
            System.out.println("Please enter a valid number.");
            students = sc.nextInt();
        }
        
        System.out.println("How many rows does this class have?");
        
        int rows = sc.nextInt();
        while(rows < 0 || rows > students) {
            System.out.println("Please enter a valid number.");
            rows = sc.nextInt();
        }
        
        int seatsPerRow = 0;
        int extraSeatsOnLastRow = 0;
        if(students % rows == 0) {
            seatsPerRow = students / rows;
            System.out.println("A class with " + students + " students and " 
                    + rows + " rows, will have " + seatsPerRow + " seats per row.");
        } else if(students % rows != 0) {
            seatsPerRow = students / rows;
            extraSeatsOnLastRow = students % rows;
            System.out.println("A class with " + students + " students and " 
                    + rows + " rows, will have " + seatsPerRow + " seats per row" +
                    "and the last row will have " + extraSeatsOnLastRow + " extra seats.");
        }
        
        String[][] classDiagram = new String[rows][seatsPerRow];
        String[] lastRow = new String[seatsPerRow + extraSeatsOnLastRow];
        classDiagram[classDiagram.length-1] = lastRow;
               
        int emptySeatsRemaining = students;     
         
        boolean flag=true;
        while (flag) {
            int random1 = getRandomNumberWithinRange(0, classDiagram.length - 1);
            int random2 = getRandomNumberWithinRange(0, classDiagram[random1].length - 1);
            if (classDiagram[random1][random2] != null) {
                continue;
            } else {
                System.out.println("Please enter student's name for seat [" + random1 + "][" + random2 + "]:");
                classDiagram[random1][random2] = sc.next();
                emptySeatsRemaining--;
                System.out.println(emptySeatsRemaining + " seats are empty!");

                boolean isFull = false;
                for (int i = 0; i < classDiagram.length; i++) {
                    for (int j = 0; j < classDiagram[i].length; j++) {
                        if (classDiagram[i][j] == null) {
                            isFull = true;

                        }

                    }

                }
                if (isFull == false) {
                    flag = false;
                }

            }

        }
        
        System.out.println("Thanks for participating! Here is the structure of the class:");
        
        for(int i=0; i<classDiagram.length; i++ ){
            for(int j=0; j<classDiagram[i].length; j++) {
                System.out.print(classDiagram[i][j] + "\t");
            }
            System.out.println("");
        }
        
        
    }
    
    static int getRandomNumberWithinRange(int startBound, int endBound) {
       Random rdm = new Random();
       if(startBound > endBound) {
           int swap = startBound;
           startBound = endBound;
           endBound = swap;
       }
        int myNumber = rdm.nextInt(endBound - startBound + 1);
        int myNumberWithinBounds = myNumber + startBound;
        return myNumberWithinBounds;
        
    }
    
}
