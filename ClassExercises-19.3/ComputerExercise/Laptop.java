
package Computer;


public class Laptop extends Computer{
    
    boolean hasWifi;
    
    public Laptop(double price) {
        super(price);
        super.brand = "Unknown Brand";
        setPrice();
    }

    public Laptop(String brand, double price, boolean hasWifi) {
        super(brand, price);
        this.hasWifi = hasWifi;
        setPrice();
    }

    @Override
    public void setPrice() {        
        if(hasWifi) {
            super.price += 20.0;
        }
    }
}
