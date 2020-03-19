
package companydivisionsexercise;


public class CompanyDivisionsExercise {

    
    public static void main(String[] args) {
        
        Division d1 = new InternationalDivision("Italy", "Italian", "European Division", 6565);
        Division d2 = new DomesticDivision("Indiana", "North", 1212);
        
        System.out.println(d1.printDetails());
        System.out.println(d2.printDetails());
                
    }
    
}
