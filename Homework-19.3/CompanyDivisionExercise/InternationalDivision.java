
package companydivisionsexercise;


public class InternationalDivision extends Division {
    
    private String country;
    private String language;

    public InternationalDivision(String country, String language, String divisionName, int accountNumber) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    public String getDivisionName() {
        return divisionName;
    }   
    

    @Override
    public String printDetails() {
        String details = "International Division " + "\"" +getDivisionName() + "\"" + " with account number " + accountNumber 
                + " is located in " + country + " and the language used is " + language;
        return details;
    }
    
    
}
