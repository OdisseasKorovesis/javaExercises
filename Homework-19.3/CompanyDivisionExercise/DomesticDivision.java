
package companydivisionsexercise;


public class DomesticDivision extends Division{
    
    private String state;

    public DomesticDivision(String state, String divisionName, int accountNumber) {
        super(divisionName, accountNumber);
        this.state = state;
    }
    
    public String getDivisionName() {
        return divisionName;
    }
    
    @Override
    public String printDetails() {
        String details = "Domestic Division " + "\"" +getDivisionName() + "\"" + " with account number " + accountNumber 
                + " is located in " + state;
        return details;
    }
    
}
