
package interfaceexercise1;
//στα Interface οι variables είναι αυτόματα public final static
//και οι methods public abstract

public interface Driving {
    int speed = 12;
    
    void drive();
    
    public default void slowDown(){
        System.out.println("Slowing down...");
    };
    
    public default void speedUp() {
        System.out.println("Speeding up...");
    }
    
    public static int getSpeed() {
        return speed;
    }
}
