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
        Bootcamp bootcamp1 = new Bootcamp();
        listOfBootCamps.add(bootcamp1);
        System.out.println("Now a second one.");
        Bootcamp bootcamp2 = new Bootcamp();
        listOfBootCamps.add(bootcamp2);
        System.out.println("Lastly, the third one.");
        Bootcamp bootcamp3 = new Bootcamp();
        listOfBootCamps.add(bootcamp3);
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

}
