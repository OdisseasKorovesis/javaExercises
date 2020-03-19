
package interfaceexercise1;


public class Director extends Employee implements Driving, Advisable {

    public Director() {
    }

    public Director(String name, int salary) {
        super(name, salary);
    }
    
        
    public void guide() {
        System.out.println(getName() + " guides like a director...");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " director is driving.");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " director is giving advice.");
    }

    @Override
    public void work() {
        guide();
    }
}
