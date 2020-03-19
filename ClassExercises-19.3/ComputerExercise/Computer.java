
package Computer;


public abstract class Computer {
    private static int computersCreated;
    
    protected String brand;
    protected double price;
    

    public Computer(double price) {
        this.price = price;
        computersCreated++;
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
        computersCreated++;
    }
    
    
    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();

    public static int getComputersCreated() {
        return computersCreated;
    }
    
    
    
    
}
