import java.util.HashSet;
import java.util.Scanner;

public class PalindromicSubstrings {
    
    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    // Method to find all distinct palindromic substrings
    public static HashSet<String> findPalindromicSubstrings(String input) {
        HashSet<String> palindromes = new HashSet<>();
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                if (isPalindrome(sub)) {
                    palindromes.add(sub);
                }
            }
        }
        
        return palindromes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Find palindromic substrings
        HashSet<String> palindromes = findPalindromicSubstrings(input);
        
        // Display the distinct palindromic substrings
        System.out.println("Distinct Palindromic Substrings: " + palindromes);
        
        scanner.close();
    }
}
