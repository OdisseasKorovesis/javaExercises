
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
        
    }

    public Bootcamp(String name, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
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
