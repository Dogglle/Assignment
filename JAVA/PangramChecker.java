package JAVA;
import java.util.Scanner;

public class PangramChecker {

        public static boolean isPangram(String input) {
            
            input = input.toLowerCase();
    
           
            boolean[] alphabetPresent = new boolean[26];
    
            // Iterate over the input and mark the corresponding alphabet in the array
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    alphabetPresent[c - 'a'] = true;
                }
            }
    
            // Check if all the alphabets are present in the array
            for (int i = 0; i < alphabetPresent.length; i++) {
                if (!alphabetPresent[i]) {
                    return false;
                }
            }
    
            return true;
        }
    
        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        String a=sc.nextLine();
    
            if (isPangram(a)) {
                System.out.println("The input is a pangram");
            } else {
                System.out.println("The input is not a pangram");
            }
        }
    }
    
