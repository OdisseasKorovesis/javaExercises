package exercisewithdates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseWithDates {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Bootcamp> listOfBootCamps = new ArrayList();

    public static void main(String[] args) {
        System.out.println("Let's create three Bootcamps!");

        System.out.println("Starting with the first one.");
        createBootcamp();
        System.out.println("Now a second one.");
        createBootcamp();
        System.out.println("Lastly, the third one.");
        createBootcamp();
        while(true) {
            checkAvailability();
            System.out.println("Do you want to check another date? If no press N, else press any key...");
            String choice = sc.nextLine();
            if(choice == "N") {
                break;
            }
        }

    }

    public static void checkAvailability() {
        

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean flag = true;
        String input;
        LocalDate inputDateTime = null;
        System.out.println("Enter a date to check if a Bootcamp is available.");
        while (flag) {

            input = sc.nextLine();
            try {
                inputDateTime = LocalDate.parse(input, formatter);
                boolean secondFlag = true;
                flag = false;
            } catch (DateTimeParseException ex) {
                System.out.println("Please enter a date in the correct format: (dd/mm/yyyy)");
            }
        }
        input = inputDateTime.format(formatter);
        int counter = 0;
        for (Bootcamp bootcamp : listOfBootCamps) {
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
            LocalDate firstDayOfBootcamp = bootcamp.getStartDate();
            LocalDate lastDayOfBootcamp = bootcamp.getEndDate();

            if (inputDateTime.isAfter(firstDayOfBootcamp) || inputDateTime.equals(firstDayOfBootcamp) 
                    && inputDateTime.isBefore(lastDayOfBootcamp) || inputDateTime.equals(lastDayOfBootcamp)) {
                System.out.println("Bootcamp " + bootcamp.getName() + " is available in " + inputDateTime.format(formatter2)); 
                System.out.println("It starts " + bootcamp.getStartDate().format(formatter2)
                        + " and ends " + bootcamp.getEndDate().format(formatter2));
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("No bootcamps available at the specified date.");
        }
    }
    
    public static void createBootcamp() {
        System.out.println("What is the name of the Bootcamp?");
        String name = sc.nextLine();
        
        System.out.println("What is the start date of the Bootcamp? (dd/mm/yyyy)");
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        boolean flag = true;
        String startDateInput;
        LocalDate startDate = null;
        
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
        LocalDate endDate = null;
        
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
        listOfBootCamps.add(new Bootcamp(name, startDate, endDate));
    }
    }


