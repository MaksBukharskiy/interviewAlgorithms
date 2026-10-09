package yandexInternshipPreparation.firstDay;

public class Solution {
    public static int[] solution(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        //1234
        //432100
        //012345

        while (left < right){
            int tempo = arr[left];
            arr[left] = arr[right];
            arr[right] = tempo;

            left++;
            right--;
        }

        return arr;

    }
}
