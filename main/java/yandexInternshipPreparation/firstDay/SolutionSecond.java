package yandexInternshipPreparation.firstDay;

public class SolutionSecond {
    public static boolean answer(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            //1234
            if(arr[i] > arr[i+1]){
                return false;
            }
        }

        return true;
    }
}
