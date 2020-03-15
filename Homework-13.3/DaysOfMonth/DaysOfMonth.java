
package daysofmonth;


public class DaysOfMonth {

    
    public static void main(String[] args) {
        printNumberOfDays("February", 2401);
    }
    
    static void printNumberOfDays (String month, int year) {        
        
        switch(month) {
                case "January":
                    System.out.println("January has 31 days.");
                    break;
                case "February":
                    //διαφορετικό μύνημα για τον Φεβουάριο ανάλογα με το αν είναι δίσεκτο έτος ή όχι, αφού αλλάζουν οι μέρες του
                    if(!isLeapYear(year)) {
                    System.out.println("Normal year, February has 28 days.");
                    break;
                    } else {
                        System.out.println("Leap year, February has 29 days.");
                    break;
                    }
                case "March":
                    System.out.println("March has 31 days.");
                    break;
                case "April":
                    System.out.println("April has 30 days.");
                    break;
                case "May":
                    System.out.println("May has 31 days.");
                    break;
                case "June":
                    System.out.println("June has 30 days.");
                    break;
                case "July":
                    System.out.println("July has 31 days.");
                    break;
                case "August":
                    System.out.println("August has 31 days.");
                    break;
                case "September":
                    System.out.println("September has 30 days.");
                    break;
                case "October":
                    System.out.println("October has 31 days.");
                    break;
                case "November":
                    System.out.println("November has 30 days.");
                    break;
                case "December":
                    System.out.println("December has 31 days.");
                    break;
            }
    }
    //μέθοδος για να υπολογίζει αν είναι δίσεκτο έτος
    static boolean isLeapYear (int year) {
        boolean isLeap;
        if(year % 4 != 0) {
            return isLeap = false;
        } else if(year % 4 == 0 && year % 100 != 0) {
            return isLeap = true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            return isLeap = true;
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
            return isLeap = false;
        } return isLeap = true;
    }
}
