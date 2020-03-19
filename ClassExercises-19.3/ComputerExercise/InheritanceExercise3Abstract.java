/*
 1. Create abstract class Computer ("brand", "price", "getPrice()", "getBrand()", "setBrand()").
Only "setPrice()" will be abstract. Subclasses Laptop, Desktop, Tablet.
2. You can only specify "price", "brand" while creating the object(use appropriate Constructors).
No class will have a default constructor.
All classes will have 2 constructors. One with "price" and one with "price-brand".
3. Make 10 objects and store to list.
4. Get the sum of prices according to "brand". Print sum of each brand and print total.
5.Modify the program so that user(main method) cannot change the brand of the computer.
6.Get the sum of prices according to "object type".
 */
package inheritanceexercise3.pkgabstract;

import Computer.Tablet;
import Computer.Desktop;
import Computer.Computer;
import Computer.Laptop;
import java.util.ArrayList;

public class InheritanceExercise3Abstract {

    public static void main(String[] args) {
        ArrayList<Computer> listOfComputers = new ArrayList();

        //ArrayList<Desktop> listOfDesktops = new ArrayList(); για χρήση χωρίς το InstanceOf
        Computer desktop1 = new Desktop("Sony", 500, true);
        listOfComputers.add(desktop1);
        //listOfDesktops.add((Desktop) desktop1);για χρήση χωρίς το InstanceOf
        Computer desktop2 = new Desktop("Assus", 700, false);
        listOfComputers.add(desktop2);
        //listOfDesktops.add((Desktop) desktop2);για χρήση χωρίς το InstanceOf
        Computer desktop3 = new Desktop("Lenovo", 1000, true);
        listOfComputers.add(desktop3);
        //listOfDesktops.add((Desktop) desktop3);για χρήση χωρίς το InstanceOf

        //ArrayList<Laptop> listOfLaptops = new ArrayList();για χρήση χωρίς το InstanceOf
        Computer laptop1 = new Laptop("Sony", 600, true);
        listOfComputers.add(laptop1);
        //listOfLaptops.add((Laptop) laptop1); για χρήση χωρίς το InstanceOf
        Computer laptop2 = new Laptop("Assus", 800, false);
        listOfComputers.add(laptop2);
        //listOfLaptops.add((Laptop) laptop2); για χρήση χωρίς το InstanceOf
        Computer laptop3 = new Laptop("Lenovo", 1100, false);
        listOfComputers.add(laptop3);
        //listOfLaptops.add((Laptop) laptop3); για χρήση χωρίς το InstanceOf

        //ArrayList<Tablet> listOfTablets = new ArrayList();
        Computer tablet1 = new Tablet("Sony", 400, true);
        listOfComputers.add(tablet1);
        //listOfTablets.add((Tablet) tablet1);για χρήση χωρίς το InstanceOf
        Computer tablet2 = new Tablet("Assus", 600, false);
        listOfComputers.add(tablet2);
        //listOfTablets.add((Tablet) tablet2);για χρήση χωρίς το InstanceOf
        Computer tablet3 = new Tablet("Lenovo", 1000, true);
        listOfComputers.add(tablet3);
        //listOfTablets.add((Tablet) tablet3);για χρήση χωρίς το InstanceOf
        Computer tablet4 = new Tablet("Lenovo", 1200, false);
        listOfComputers.add(tablet4);
        //listOfTablets.add((Tablet) tablet4);για χρήση χωρίς το InstanceOf

        double sumOfSony = 0;
        double sumOfLenovo = 0;
        double sumOfAssus = 0;
        double sumTotal = 0;

        for (Computer computer : listOfComputers) {
            sumTotal += computer.getPrice();
            if (computer.getBrand().equals("Sony")) {
                sumOfSony += computer.getPrice();
            } else if (computer.getBrand().equals("Lenovo")) {
                sumOfLenovo += computer.getPrice();
            } else if (computer.getBrand().equals("Assus")) {
                sumOfAssus += computer.getPrice();
            }

        }

        System.out.println("Sum of price for Sony computers is " + sumOfSony);
        System.out.println("Sum of price for Lenovo computers is " + sumOfLenovo);
        System.out.println("Sum of price for Assus computers is " + sumOfAssus);
        System.out.println("Sum of price for all computers is " + sumTotal);

        double sumOfDesktop = 0;
        double sumOfLaptop = 0;
        double sumOfTablet = 0;
        
        for (Computer computer : listOfComputers) {
            
            if (computer instanceof Desktop) {
                sumOfDesktop += computer.getPrice();
            } else if (computer instanceof Laptop) {
                sumOfLaptop += computer.getPrice();
            } else if (computer instanceof Tablet) {
                sumOfTablet += computer.getPrice();
            }

        }
        /* για χρήση χωρίς το InstanceOf
        for (Desktop desktop : listOfDesktops) {
            sumOfDesktop += desktop.getPrice();

        }
        
        for (Laptop laptop : listOfLaptops) {
            sumOfLaptop += laptop.getPrice();

        }
        
        for (Tablet tablet : listOfTablets) {
            sumOfTablet += tablet.getPrice();

        }
        */
        System.out.println("Sum of price for Desktops is " + sumOfDesktop);
        System.out.println("Sum of price for Laptops is " + sumOfLaptop);
        System.out.println("Sum of price for Tablets is " + sumOfTablet);
        
        /*έλεγχοι για χρήση Instanceof
        boolean isLaptop = laptop1 instanceof Laptop;
        boolean isDesktop = laptop1 instanceof Desktop;
        boolean isTablet = laptop1 instanceof Tablet;
        boolean isComputer = laptop1 instanceof Computer;
        boolean isObject = laptop1 instanceof Object;
        System.out.println("laptop 1 isLaptop=" + isLaptop);
        System.out.println("laptop 1 isDesktop=" + isDesktop);
        System.out.println("laptop 1 isTablet=" + isTablet);
        System.out.println("laptop 1 isComputer=" + isComputer);
        System.out.println("laptop 1 isObject=" + isObject);
        */
    }

}
