
package testingtutorial;

import java.util.ArrayList;
import java.util.List;


public class ListOperations {
    private List<String> names;
    
    public boolean addNameToList(String name) {
        if(names == null) {
        names = new ArrayList();
        }
        boolean result = false;
        if(name != null) {
        result = names.add(name);
        
        }
        return result;
    }
    
    public boolean removeNameFromList(String name) {
        if(names == null) {
            System.out.println("Cannot remove name from null list");
        }
        boolean result = false;
        
        if(names != null) { 
        result = names.remove(name);
        }
        return result;
    } 
    
    public int getSizeOfList() {
        if(names == null) {
            System.out.println("Cannot get size of null list.");
            return -1;
        }
        
        if(names != null) {        
            return names.size();        
        }
        return -1;
    }

    public List<String> getNames() {
        return names;
    }
    
    
}
