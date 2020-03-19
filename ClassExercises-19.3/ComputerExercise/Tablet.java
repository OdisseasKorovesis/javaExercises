
package Computer;


public class Tablet extends Computer{
   
    boolean hasBluetooth;
    
    public Tablet(double price) {
        super(price);
        super.brand = "Unknown Brand";
        setPrice();
    }

    public Tablet(String brand, double price, boolean hasBluetooth) {
        super(brand, price);
        this.hasBluetooth = hasBluetooth;
        setPrice();
    }

    @Override
    public void setPrice() {        
        if(hasBluetooth) {
            super.price += 50.0;
        }
    } 
}
