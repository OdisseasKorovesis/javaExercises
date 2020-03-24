package journeyintotheearthexercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JourneyIntoTheEarthExercise {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        menuOfChoices();

    }

    //διαβάζουμε το αρχείο, το σπάμε σε γραμμές, αποθηκεύουμε τις γραμμές σε μια λίστα
    public static ArrayList<String> breakTextintoLines() throws FileNotFoundException, IOException {
        String filename = "C:\\Users\\Odisseas KD\\Desktop\\Κείμενα\\aJourneyToTheInteriorOfTheEarth.txt";
        File file = new File(filename);
        FileReader fileReader = new FileReader(file);
        BufferedReader rdr = new BufferedReader(fileReader);
        String line = null;
        String word2 = "test";

        ArrayList<String> list = new ArrayList();
        while ((line = rdr.readLine()) != null) {
            list.add(line);
        }
        return list;

    }

    //σπάμε τις γραμμές σε λέξεις, αποθηκεύουμε τις λέξεις σε έναν πίνακα, αποθηκεύουμε τους πίνακες σε μια λίστα
    public static ArrayList<String[]> breakLinesIntoWords(ArrayList<String> list) {
        ArrayList<String[]> list2 = new ArrayList();
        for (String s : list) {
            list2.add(s.split("[\\s\\p{Punct}]+"));
        }
        return list2;
    }

    public static Map<String, Integer> getMapOfOccurencesOfEveryWord(ArrayList<String[]> list) {
        //φτιάχνουμε ένα map
        Map<String, Integer> wordCounts = new HashMap<String, Integer>();
        for (String[] s : list) {

            //παίρνουμε μία-μία τις λέξεις της γραμμής
            for (String word : s) {
                //τσεκάρουμε αν είναι ήδη μαπαρισμένη η συγκεκριμένη λέξη(word)
                if(!word.equals("")) {
                Integer count = 0;
                count = wordCounts.get(word);

                //αν δεν είναι την μαπάρουμε ως 0
                if (count == null) {
                    count = 0;
                }
                //κάθε φορά που την συναντάμε αυξάνουμε την τιμή κατά ένα
                wordCounts.put(word, count + 1);
            }
            }

        }
        return wordCounts;
    }

    //τυπώνουμε τα κλειδιά και τις τιμές του Map, δηλαδή τις ξεχωριστές 
    //λέξεις που εντοπίσαμε και πόσες φορές εμφανίζονται
    public static void outputOccurencesOfEveryWord(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key).toString());
        }
    }

    public static void outputWordsWith500OccurencesAlphabetically(Map<String, Integer> map) {
        System.out.println("Outputting all words with above 500 Occurences"
                + " in alphabetical order...");
        TreeMap<String, Integer> treeMap = new TreeMap(map);
        for (String key : treeMap.keySet()) {
            if (treeMap.get(key) > 500) {                
                System.out.println(key + ": " + treeMap.get(key).toString());
            }
        }
    }

    public static void countOccurencesOfUserInput() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which word would you like to search for?");
        String input = sc.next();
        ArrayList<String> list = breakTextintoLines();
        ArrayList<String[]> list2 = breakLinesIntoWords(list);
        int count = 0;
        for (String[] s : list2) {
            for (String word : s) {
                if (word.equals(input)) {
                    count++;
                }
            }
        }
        System.out.println("The word " + input + " appears " + count + " times.");
    }

    public static void menuOfChoices() throws IOException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("These are your choices.");
            System.out.println("1. Print the occurences of every word of the text");
            System.out.println("2. Print the occurences of every word appearing over 500 times in alphabetical order.");
            System.out.println("3. Print the occurences of a given word");
            System.out.println("4. Exit the program");
            System.out.println("What would you like to do?");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<String> list = breakTextintoLines();
                    ArrayList<String[]> list2 = breakLinesIntoWords(list);
                    Map<String, Integer> wordCounts = getMapOfOccurencesOfEveryWord(list2);
                    outputOccurencesOfEveryWord(wordCounts);
                    break;
                case 2:
                    list = breakTextintoLines();
                    list2 = breakLinesIntoWords(list);
                    wordCounts = getMapOfOccurencesOfEveryWord(list2);
                    outputWordsWith500OccurencesAlphabetically(wordCounts);
                    break;
                case 3:
                    countOccurencesOfUserInput();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }
    }

}
