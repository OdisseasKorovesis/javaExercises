
package getgrade;


public class GetGrade {

    
    public static void main(String[] args) {
        char grade = 'D';
        
        switch(grade) {
            case 'A':
                System.out.println("Your grade is perfect.");
                break;
            case 'B':
                System.out.println("Your grade is very good.");
                break;
            case 'C':
                System.out.println("Your grade is good.");
                break;
            case 'D':
                System.out.println("Your grade is pass.");
                break;
            case 'E':
                System.out.println("Your grade is borderline pass.");
                break;
            case 'F':
                System.out.println("Your grade is fail.");
                break;
        }
    }
    
}
