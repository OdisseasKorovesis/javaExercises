package phoneexercise;

public class PhoneExercise {

    public static void main(String[] args) {
        System.out.println("*****First Part******");
        Phone phone1 = new Android();
        Phone phone2 = new NonAndroid();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        //μέχρι εδώ καλύπτονται τα requirements της Exercise1
        //από εδώ και κάτω καλύπτονται τα requirements της Exercise2
        System.out.println("*****Second Part******");
        
        Phone phone3 = new Android();
        Phone phone4 = new NonAndroid();
        Phone phone5 = new Android();
        Phone phone6 = new NonAndroid();
        Phone phone7 = new Android();
        Phone phone8 = new NonAndroid();
        Phone phone9 = new Android();
        Phone phone10 = new NonAndroid();
        
        Phone[] arrayOfPhones = {phone1, phone2, phone3, phone4, phone5, phone6, phone7, phone8, phone9, phone10};
        int counter =1;
        for(Phone phone : arrayOfPhones) {
            System.out.println("Phone number " + counter + ": " + phone.toString());
            counter++;
        }
        
        
        
    }
    
    

}
