public class WhatSeasonIsIt {

    
    public static void main(String[] args) {
        
        int month = Integer.parseInt(args[0]);
        if(month <= 0 || month > 12) {
            System.out.println("You have typed an invalid month.");
        } else {
            switch(month) {
                case 1:
                    System.out.println("It is winter.");
                    break;
                case 2:
                    System.out.println("It is winter.");
                    break;
                case 3:
                    System.out.println("It is spring.");
                    break;
                case 4:
                    System.out.println("It is spring.");
                    break;
                case 5:
                    System.out.println("It is spring.");
                    break;
                case 6:
                    System.out.println("It is summer.");
                    break;
                case 7:
                    System.out.println("It is summer.");
                    break;
                case 8:
                    System.out.println("It is summer.");
                    break;
                case 9:
                    System.out.println("It is autumn.");
                    break;
                case 10:
                    System.out.println("It is autumn.");
                    break;
                case 11:
                    System.out.println("It is autumn.");
                    break;
                case 12:
                    System.out.println("It is winter.");
                    break;
            }
        }
    }
    
}