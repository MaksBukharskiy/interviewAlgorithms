package yandexInternshipPreparation.firstDay;

public class SolutionThird {
    public static String reverseString(String word){
        char[] wordToChar = word.toCharArray();

        int left = 0;
        int right = wordToChar.length-1;

        while(left < right){
            char middle = wordToChar[left];

            wordToChar[left] = wordToChar[right];
            wordToChar[right] = middle;

            left++;
            right--;
        }

        return new String(wordToChar);
    }
}
