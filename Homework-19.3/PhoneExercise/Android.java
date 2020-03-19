
package phoneexercise;


public class Android extends Phone{

    public Android() {
        super.brand = "Android";
        setPrice();
        
    }

    
    
    public Android(String brand) {
        super(brand);
        setPrice();
        
    }

    @Override
    public void setPrice() {
        super.price = 24.99;
    }

    @Override
    public String toString() {
        String methodDetails = "This is an " + brand + " phone and it costs " + price + " euros.";
        return methodDetails;
    }
    
    
    
}
