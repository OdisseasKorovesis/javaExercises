
package bunnyexercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Bunny {
    private int bunnyNumber;    
    

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }
   
    public void hop() {
        System.out.println("Bunny number " + bunnyNumber + " is hopping.");
    }
    
    public static void createBunny(List<Bunny> list) {
        int counter = 1;
        for(int i = 1; i<=5; i++) {            
            list.add(new Bunny(counter));
            
            counter++;
        }
    }
    
    public static void loopThroughListWithGet(List<Bunny> list) {
        System.out.println("Looping through list using get");
        for(int i = 0; i<list.size(); i++) {
            list.get(i).hop();
        }
    }
    
    public static void loopThroughListWithIterator(List<Bunny> list) {
        System.out.println("Looping through list using iterator");
        Iterator<Bunny> it = list.iterator();
        while (it.hasNext()) {
            it.next().hop();
        }
    }
    
    public static Map<Integer, Bunny > converListToMap(List<Bunny> list) {
        Map<Integer, Bunny> bunnyMap = new HashMap();
        for(Bunny bunny : list) {
        bunnyMap.put(bunny.bunnyNumber, bunny);
        }
        return bunnyMap;
    }
    
    public static void loopThroughMap(Map<Integer, Bunny> map) {
        Set<Integer> keysOfMap = map.keySet();        
        Iterator<Integer> it = keysOfMap.iterator();
        while(it.hasNext()) {
            int key = it.next();
            System.out.println("Value of Bunny is: " + key);
            map.get(key).hop();
        }
    }
}
