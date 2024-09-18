import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        //create input
        Scanner input = new Scanner(System.in);
        
        //HashMap to store numbers and counts
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        
        System.out.println("Enter integers (input ends with 0): ");
        int number;
        
        //read numbers until input 0
        while ((number = input.nextInt()) != 0) {
            occurrences.put(number, occurrences.getOrDefault(number, 0) + 1);
        }
        
        //find the max
        int maxCount = 0;
        for (int count : occurrences.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        
        //find all numbers that have max occurrence
        System.out.println("The number(s) with the most occurrences: ");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() == maxCount) {
                System.out.println(entry.getKey() + " occurred " + maxCount + " times.");
            }
        }
        
        //close the scanner
        input.close();
    }
}