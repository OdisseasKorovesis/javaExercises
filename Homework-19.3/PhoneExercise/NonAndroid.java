
package phoneexercise;


public class NonAndroid extends Phone{
    
    public NonAndroid() {
        super.brand = "Non Android";
        setPrice();
        
    }
    
    public NonAndroid(String brand) {
        super(brand);
        setPrice();
        
    }

    @Override
    public void setPrice() {
        super.price = 37.99;
    }
    
    @Override
    public String toString() {
        String methodDetails = "This is a " + brand + " phone and it costs " + price + " euros.";
        return methodDetails;
    }
}
