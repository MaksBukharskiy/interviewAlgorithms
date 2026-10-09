package yandexInternshipPreparation.firstDay;

public class SolutionFourth {
    public static boolean comparingToPalindrome(String word){
        char[] wordToChar = word.toCharArray();

        int left = 0;
        int right = wordToChar.length-1;

        while(left < right){

            if (wordToChar[left] == wordToChar[right]){
                left++;
                right--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
