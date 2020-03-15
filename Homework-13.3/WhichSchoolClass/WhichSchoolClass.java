
package WhichSchoolClass;


public class WhichSchoolClass {

   
    public static void main(String[] args) {
        schoolClass(-5);
    }
    
    static void schoolClass (int age) {
        if(age < 0) {
            System.out.println("Invalid age.");
        } else if(age < 4) {
            System.out.println("You don't go to school yet.");
        } else if (age >= 4 && age < 6) {
            System.out.println("You go to pre-school.");
        } else if (age >= 6 && age < 12) {
            System.out.println("You go to primary school.");
        } else if (age >=12 && age < 15) {
            System.out.println("You go to middle school.");
        } else if (age >=15 && age < 18) {
            System.out.println("You go to high schoool.");
        } else if (age >= 18 && age < 24) {
            System.out.println("You go to university.");
        } else {
            System.out.println("You've finished every kind of school!");
        }
        
        //εφόσον το switch δεν μπορεί να πάρει υπόθεση ως case
        //δεν μπορούν να μπουν όρια (π.χ. age >= 6 && age <12)
        //άρα θα πρέπει να γίνει ξεχωριστό case για κάθε πιθανή ηλικία
        //και ένα default στο τέλος για να απορρίπτει με
        //ξεχωριστο μύνημα μικρότερα και μεγαλύτερα νούμερα
        
        switch (age) {
            case 0:
                System.out.println("Invalid age.");
                break;
            case 1:
                System.out.println("You don't go to school yet.");
                break;
            case 2:
                System.out.println("You don't go to school yet.");
                break;
            case 3:
                System.out.println("You don't go to school yet.");
                break;
            case 4:
                System.out.println("You go to pre-school.");
                break;
                //συνεχίζει για κάθε νούμερο έως το default
            default:
                if(age<= 0) {
                System.out.println("Invalid age!");
                } else if (age > 24) {
                    System.out.println("You've finished every kind of school.");
                }
                break;
        } 
    }
    
    
    
}
