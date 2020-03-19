
package interfaceexercise1;


public class Teacher extends Employee implements Advisable {

    public Teacher() {
    }

    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
    
    
    public void teach() {
        System.out.println(getName() + " teaches like a teacher...");
    }

    @Override
    public void giveAdvice() {
        System.out.println(getName() + " teacher is giving advice.");
    }

    @Override
    public void work() {
        teach();
    }
}
