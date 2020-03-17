//Create a BankAccount class with variables number(int), amount(double), name(String), active(boolean), transactions(ArrayList<String>)
//Add getters/setters
//Create methods deposit(), withdraw(). Do you need the setter for amount variable?
//Store each action (deposit, withdraw, creation) in the transactions list.
//If account doesn't have amount, what can you withdraw?
//Create a variable(accountsOpened) that counts the number of accounts opened. This variable shows how many accounts have been opened.
//Create 3 contructors (default, name-number, all(except transactions)). When created all will be active.

package bankexercise;

import java.util.ArrayList;
import java.util.Scanner;


public class BankAccount {
    Scanner sc = new Scanner(System.in);
    
    private int accountNumber;
    private double balance;
    private String holderName;
    private boolean isActive;
    private ArrayList<String> transactions = new ArrayList();
    
    private static int accountsCreated;
    
    private BankAccount() {
        accountsCreated++;        
        isActive = true;
        this.transactions.add("Account Created.");
    }
    
    public BankAccount(String holderName, int accountNumber) {
       this();
       this.holderName = holderName;
       this.accountNumber = accountNumber;
    }
    
    public BankAccount(String holderName, int accountNumber, double balance) {
        this();
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
                
    }
    
    private void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    private void setBalance (double balance) {
        this.balance = balance;
    }
    
    private void setHolderName (String holderName) {
        this.holderName = holderName;
    }
    
    private void setIsActive (boolean isActive) {
        this.isActive = isActive;
    }
    
    private void setTransactions(ArrayList<String> transactions) {
        this.transactions = transactions;
    }
    
    private int getAccountNumber() {
        return this.accountNumber;
    }
    
    private double getBalance() {
        return this.balance;
    }
    
    private String getHolderName() {
        return this.holderName;
    }
    
    private boolean getIsActive() {
        return this.isActive;
    }
    
    private ArrayList<String> getTransactions() {
        return this.transactions;
    }
    
    private void printTransactions() {
        int counter = 0;
        for(String transaction : this.transactions) {
            
            counter++;
            System.out.println(counter + ". " + transaction);
        }
    }
    
    private double deposit () {
        
        System.out.println("How much money do you want to deposit?");
        double depositAmount = sc.nextDouble();
        setBalance(this.balance + depositAmount);
        System.out.println("Your new amount is: " + getBalance());
        this.transactions.add("Deposited " + depositAmount + " euros.");
        return this.balance;
    }
    
    private double withdraw() {
        System.out.println("How much money do you want to withdraw?");
        double withdrawAmount = sc.nextDouble();
        if(withdrawAmount <= getBalance()) {
            setBalance(this.balance - withdrawAmount);
            System.out.println("Your new amount is: " + getBalance());
            this.transactions.add("Withdrawn " + withdrawAmount + " euros.");
            return this.balance;
        } else if (withdrawAmount > getBalance()) {
            System.out.println("Insufficient funds.");
            this.transactions.add("Failed withdrawl due to lack of funds.");
            return this.balance;
        } return this.balance;
    }
    
    public void useBank() {
        System.out.println("Hello, welcome to the bank.");
        System.out.println("What is your name?");
        String name = sc.next();
        if(name.equals(getHolderName())) {
            System.out.println("What is your account number?");
            int number = sc.nextInt();
            if(number == getAccountNumber()) {
                System.out.println("You now have access to your acount.");
                
                
                boolean flag = true;
                while(flag) {
                System.out.println("What would you like to do?");
                System.out.println("1. Make withdrawl");
                System.out.println("2. Make deposit");
                System.out.println("3. Check your transactions");
                System.out.println("4. Leave the bank.");
                int action = sc.nextInt();
                
                switch (action) {
                    case 1:
                        withdraw();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        printTransactions();
                        break;
                    case 4:
                        flag = false;
                        break;
                }
                }
            } else {
                System.out.println("No account with this number. Thank you for coming.");
            }
        } else {
            System.out.println("No account under that name. Thank you for coming.");
        } System.out.println("Goodbye.");
    }
            

}
