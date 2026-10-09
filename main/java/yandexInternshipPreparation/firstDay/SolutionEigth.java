package yandexInternshipPreparation.firstDay;

public class SolutionEigth {
    public static int solutionOfBinary(int[] arr, int num){
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = left + (right-left)/2;

            if (arr[mid] == num){
                return mid;
            }
            else if (arr[mid] > num){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }


        }

        return -1;
    }
}
