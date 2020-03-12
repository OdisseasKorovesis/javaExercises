
package classproject9.pkg3;

import java.util.Scanner;


public class ClassProject93 {

    
    public static void main(String[] args) {
        System.out.println("Programm starting...");
        Scanner sc = new Scanner(System.in);
        String userName = askName(sc);
        int userAge = askAge(sc, userName);
        ageAdditionalInfo(userName, userAge);
        if(userAge > 5 && userAge <= 40) {
        char userGender = askGender(sc, userName);        
        calculatePastAndFutureAge(userName, userAge);
        askForFavoriteSeason(sc, "Odi");
        findBMI(sc, userName);
        String luckyDay = findLuckyDay(userName, userAge);
        enterClub(sc, luckyDay, userAge, userName, userGender);
        } else {
            System.out.println("Thanks for participating.");
        }
    }
    
    static String askName(Scanner sc) {
        System.out.println("What is your name?");
        String name = sc.next();
        return name;
    }
    
    static int askAge (Scanner sc, String name) {
       
        
        boolean flag = true;
        while(flag) {
            System.out.println(name + ", what is your age?");
            int age = sc.nextInt();
            if(age < 0) {
                System.out.println(name + ", please enter a valid age.");                
            } else if (age > 0 && age <=5) {
                System.out.println(name + ", you are too young for this app.");
                flag = false;
                return age;
            } else if (age > 5 && age <=18) {
                System.out.println(name + ", you are a student.");
                flag = false;
                return age;
            } else if (age >18 && age <=40) {
                System.out.println(name + ", you must be employed.");
                flag = false;
                return age;
            } else if (age > 40) {
                System.out.println(name + ", you are too old for this app.");
                flag = false;
                return age;
                
            }
        } return -1;
    }
    
    static char askGender (Scanner sc, String name) {
        
            
        boolean flag = true;
        while(flag) {
            System.out.println(name + ", what is your gender? (M/F)");
            char gender = sc.next().charAt(0);
            if(gender == 'M' || gender == 'F') {
                System.out.println(name + ", your gender is stored.");
                flag = false;
                return gender;
            } else {
                System.out.println("Please enter a valid gender.");
                
            }
                
        }
        return 'n';
    }
    
    static void ageAdditionalInfo (String name, int age) {
        if(age < 6) {
            System.out.println(name + ", come back in " + (6-age) + " years when you will be a student.");           
        } else if (age >= 6 && age <= 18) {
            System.out.println(name + ", keep up... " + (18-age) + " years left and afterwards you will make money.");
        } else if (age > 18 && age <= 40) {
            System.out.println(name + ", you finished school " + (age - 18) + " years ago." );
        } else if (age > 40) {
            System.out.println(name + ", sorry your chance to use this app has passed.");
        }
    }
    
    static void calculatePastAndFutureAge (String name, int age) {
        int yearBorn = 2020 - age;
        if( yearBorn > 1980) {
            System.out.println(name + ", you were not born back in 1980.");
        } else {
        System.out.println(name + ", in 1980 you were " + (1980 - yearBorn) + " years old.");
        }
        System.out.println(name + ", in 2040 you will be " + (2040 - yearBorn) + " years old.");
    }
    
    static void askForFavoriteSeason (Scanner sc, String name) {
        System.out.println(name + ", which is your favorite season?");
        System.out.println("1. Winter");
        System.out.println("2. Spring");
        System.out.println("3. Summer");
        System.out.println("4. Autumn");
        int favoriteSeason = sc.nextInt();
        boolean flag = true;
        while(flag) {
            if(favoriteSeason < 1 || favoriteSeason > 4) {
                System.out.println("Please enter a valid number.");
                favoriteSeason = sc.nextInt();
            } else if (favoriteSeason == 1){
                System.out.println(name + ", it must be cold outside.");
                flag = false;
            } else if (favoriteSeason == 2){
                System.out.println(name + ", flowers are very beautiful these days.");
                flag = false;
            } else if (favoriteSeason == 3){
                System.out.println(name + ", let's go for swimming");
                flag = false;
            } else if (favoriteSeason == 4){
                System.out.println(name + ", the trees are full of brown leaves");
                flag = false;
            }
        }
    }
    
    static void findBMI(Scanner sc, String name) {
        System.out.println(name + ", how tall are you?");        
        double height = sc.nextDouble();
        boolean flag = true;
        while(flag) {
            if(height <= 0 ) {
                System.out.println("Please enter a valid height.");
                height = sc.nextDouble();
            } else 
                flag=false;
        }
        System.out.println(name + ", how much do you weigh?");
        double weight = sc.nextDouble();
        flag = true;
        while(flag) {
            if(weight <= 0 ) {
                System.out.println("Please enter a valid weight.");
                weight = sc.nextDouble();
            } else 
                flag=false;
        }
        double BMI = weight / (height * height);
        System.out.println(name + ", your current BMI is " + BMI);
        
        
        if(BMI <= 18.5) {
            System.out.println(name + ", you are underweight.");
        } else if(BMI > 18.5 && BMI <= 24.9 ) {
            System.out.println(name + ", your weight is normal.");
        } else if(BMI >24.9 && BMI <= 29.9 ) {
            System.out.println(name + ", you are overweight.");
        } else if(BMI >= 30) {
            System.out.println(name + ", you are obese.");
        }
    }
    
    static String findLuckyDay(String name, int age) {
        int ageConvertedToDays = age * 365;
        String luckyDay;
        ageConvertedToDays = sumDigits(ageConvertedToDays);
        
        if (ageConvertedToDays > 6) {
            ageConvertedToDays = ageConvertedToDays % 7;
           
        } 
        
        if(ageConvertedToDays == 0 ) {
            System.out.println(name + ", your lucky day is Monday.");
            luckyDay = "Monday";
            
            return luckyDay;
        } else if (ageConvertedToDays == 1 ) {
            System.out.println(name + ", your lucky day is Tuesday.");
            luckyDay = "Tuesday";
            
            return luckyDay;
        } else if (ageConvertedToDays == 2 ) {
            System.out.println(name + ", your lucky day is Wednesday.");
            luckyDay = "Wednesday";
            
            return luckyDay;
        } else if (ageConvertedToDays == 3 ) {
            System.out.println(name + ", your lucky day is Thursday.");
            luckyDay = "Thursday";
           
            return luckyDay;
        } else if (ageConvertedToDays == 4 ) {
            System.out.println(name + ", your lucky day is Friday.");
            luckyDay = "Friday";
            
            return luckyDay;
        } else if (ageConvertedToDays == 5 ) {
            System.out.println(name + ", your lucky day is Saturday.");
            luckyDay = "Saturday";
           
            return luckyDay;
        } else if (ageConvertedToDays == 6 ) {
            System.out.println(name + ", your lucky day is Sunday.");
            luckyDay = "Sunday";
           
            return luckyDay;
        }
        return null;
    }
    
    public static int sumDigits(int number) {
        int remainingNumber = number;
        if(number < 10) {
            return number;
        }

        int sum = 0;
        while(number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        } return sum;
    }
    
    public static void enterClub(Scanner sc, String luckyDay, int age, String name, char gender) {
        System.out.println("Checking to see if you can enter club...");
        System.out.println("Appropriate age: 20-25. Your age: " + age);
        System.out.println("Necessary lucky day: Wednesday. Your lucky day: " + luckyDay);
        
        if("Wednesday".equals(luckyDay) && age >= 20 && age <= 40) {
            
            if(age >= 20 && age <= 25) {
                System.out.println("You can enter, " + name);
            } else if( age > 25 && gender == 'M') {
                System.out.println("You can enter, " +  "Mr. " + name);
            } else if (age > 25 && gender == 'F') {
                System.out.println("Are you married? (true/false)");
                boolean marriage = sc.nextBoolean();
                if(marriage) {
                    System.out.println("You can enter, Mrs." + name );
                } else {
                    System.out.println("You can enter, Ms." + name);
                }
            }
        } else {
            System.out.println("Unfortunately you cannot enter the club.");
        }
    }
    
    
    
}
