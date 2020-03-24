
package bunnyexercise;

import java.util.ArrayList;
import java.util.List;


public class BunnyExercise {

    
    public static void main(String[] args) {
        //1st part
        List<Bunny> bunnies = new ArrayList();
        Bunny.createBunny(bunnies);
        Bunny.loopThroughListWithGet(bunnies);
        Bunny.loopThroughListWithIterator(bunnies);
        
        //2nd part        
        Bunny.loopThroughMap(Bunny.converListToMap(bunnies));
    }
    
}
