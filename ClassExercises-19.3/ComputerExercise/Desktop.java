
package Computer;


public class Desktop extends Computer {

    boolean hasExtraLight;
    
    public Desktop(double price) {
        super(price);
        super.brand = "Unknown Brand";
        setPrice();
    }

    public Desktop(String brand, double price, boolean hasExtraLight) {
        super(brand, price);
        this.hasExtraLight = hasExtraLight;
        setPrice();
    }

    @Override
    public void setPrice() {        
        if(hasExtraLight) {
            super.price += 10.0;
        }
    }

    
    
}
