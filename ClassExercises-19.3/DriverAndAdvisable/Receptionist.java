
package interfaceexercise1;


public class Receptionist extends Employee implements Driving{

    public Receptionist() {
    }

    public Receptionist(String name, int salary) {
        super(name, salary);
    }
    
    
    
    public void greet() {
        System.out.println(getName()  + " greets like a receptionist...");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " receptionist is driving.");
    }

    @Override
    public void work() {
        greet();
    }
}
