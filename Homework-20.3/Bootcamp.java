
package exercisewithdates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Bootcamp {
    Scanner sc = new Scanner(System.in);
    
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;

    public Bootcamp() {
        System.out.println("What is the name of the Bootcamp?");
        this.name = sc.nextLine();
        
        System.out.println("What is the start date of the Bootcamp? (dd/mm/yyyy)");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean flag = true;
        String startDateInput;
        startDate = null;
        
        while (flag) {

            startDateInput = sc.nextLine();
            try {
                startDate = LocalDate.parse(startDateInput, formatter);
                boolean secondFlag = true;
                while (secondFlag) {
                    if (startDate.isBefore(today)) {
                        System.out.println("Start date must be in the future and in the correct format (dd/mm/yyyy).");
                        startDateInput = sc.nextLine();
                        startDate = LocalDate.parse(startDateInput, formatter);
                    } else {
                        secondFlag = false;
                    }
                }
                flag = false;
            } catch (DateTimeParseException ex) {
                System.out.println("Please enter a date in the correct format: (dd/mm/yyyy)");
            }
        }
        startDateInput = startDate.format(formatter);
        
        System.out.println("What is the end date of the course? (dd/mm/yyyy)");
        flag = true;
        String endDateInput;
        endDate = null;
        
        while (flag) {

            endDateInput = sc.nextLine();
            try {
                endDate = LocalDate.parse(endDateInput, formatter);
                boolean secondFlag = true;
                while(secondFlag) {
                    if(endDate.isBefore(startDate)) {
                        System.out.println("End date must be after start date and in the correct format (dd/mm/yyyy).");
                        endDateInput = sc.nextLine();
                        endDate = LocalDate.parse(endDateInput, formatter);
                    } else {
                        secondFlag = false;
                    }
                }
                flag = false;
            } catch (DateTimeParseException ex) {
                System.out.println("Please enter a date in the correct format: (dd/mm/yyyy)");
            }
        }
        endDateInput = endDate.format(formatter);
         
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public String getName() {
        return name;
    }
    
    
    
    
}
