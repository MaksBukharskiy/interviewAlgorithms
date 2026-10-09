package yandexInternshipPreparation.firstDay;

public class SolutionNinth {
    public static int[] solutionOfPrefixProblem(int[] arr){
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i <= arr.length; i = i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        return  prefix;
    }

    public static int prefixIndexMethod(int[] arrOfPref, int left, int right){
        if(left == 0){
            return arrOfPref[right];
        }
        else {
            return arrOfPref[right] - arrOfPref[left - 1];
            //[1, 2, 3, 6, 12]
        }

    }
}
