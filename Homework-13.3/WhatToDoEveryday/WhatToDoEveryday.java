
package whattodoeveryday;


public class WhatToDoEveryday {

    
    public static void main(String[] args) {
        whatToDoEveryDay("Saturday");
    }
    
    static void whatToDoEveryDay (String day) {
        switch(day) {
            case "Monday":
                System.out.println("Go to work.");
                break;
            case "Tuesday":
                System.out.println("Go to work.");
                break;
            case "Wednesday":
                System.out.println("Go to work.");
                break;
            case "Thursday":
                System.out.println("Go to work.");
                break;
            case "Friday":
                System.out.println("Go to work.");
                break;
            case "Saturday":
                System.out.println("Relax.");
                break;
            case "Sunday":
                System.out.println("Relax.");
                break;
        }
    }
    
}
