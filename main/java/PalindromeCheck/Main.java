package PalindromeCheck;

public class Main {
    public static void main(String[] args) {
        PalindromeSolution palindromeSolution = new PalindromeSolution();

        String palindrome = "madam";
        String nonPalindrome = "dslkjgkk";

        palindromeSolution.solution(palindrome);
        palindromeSolution.solution(nonPalindrome);
    }
}
