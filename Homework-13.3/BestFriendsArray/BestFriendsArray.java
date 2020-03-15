
package bestfriendsarray;


public class BestFriendsArray {

    
    public static void main(String[] args) {
        String[] bestFriends = {"Jack", "John", "Mary", "Anna"};
        
        //print using for-traditional
        for(int i =0; i<bestFriends.length; i++) {
            System.out.print(bestFriends[i] + " ");            
        }
        System.out.println("");
        
        //print using for enhanced
        for(String name:bestFriends) {
            System.out.print(name + " ");
        }
        System.out.println("");
        
        //print using while
        int counter = 0;
        while(counter<bestFriends.length) {
            System.out.print(bestFriends[counter] + " ");
            counter++;
        }
        System.out.println("");
        
        //print using do...while
        counter = 0;
        do {
           System.out.print(bestFriends[counter] + " ");
            counter++; 
        } while (counter<bestFriends.length);
        System.out.println("");
    }
    
}
