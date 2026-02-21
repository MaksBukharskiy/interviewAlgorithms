package PalindromeCheck;

public class PalindromeSolution {

    public boolean solution(String palString){

        if (palString == null){
            throw new IllegalArgumentException("String is empty, please retry");
        }

        int leftPointer = 0;
        int rightPointer = palString.length() - 1;

        while(leftPointer < rightPointer){

            if(palString.charAt(leftPointer) != palString.charAt(rightPointer)){
                System.out.println("false");
                return false;
            }

            leftPointer++;
            rightPointer--;
        }

        System.out.println("true");
        return true;
    }
}
