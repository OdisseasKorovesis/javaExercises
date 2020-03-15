
package whatcanyoudobasedonage;


public class WhatCanYouDoBasedOnAge {

    
    public static void main(String[] args) {
        int age = 15;
        if(age < 0 ) {
            System.out.println("Invalid age.");
        } else if (age >=0 && age < 16) {
            System.out.println("You cannot drive");
        } else if (age >= 16 && age <=17) {
            System.out.println("You can drive but not vote.");
        } else if (age >= 18 && age <=21) {
            System.out.println("You can vote but not drink.");
        } else if (age >= 22) {
            System.out.println("You can do anything.");
        }
    }
    
}
