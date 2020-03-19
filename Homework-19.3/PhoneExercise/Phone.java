
package phoneexercise;


public abstract class Phone {
    protected String brand;
    protected double price;

    public Phone() {
    }
        
    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

    @Override
    public abstract String toString();
    
    
    
    
}
