package TheMaxElement;

import java.util.Arrays;

public class TheMaxSolution {

    public void solution(int[] arr ){

        if (arr == null || arr.length == 0){
            throw  new IllegalArgumentException("The arrayc is empty");
        }

        int index1 = 0;
        int index2 = 0;

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < min ){
                min = arr[i];
                index1 = i;

            }
            if (arr[i] > max){
                max = arr[i];
                index2 = i;
            }

        }

        System.out.println("The max int is: " + max);
        System.out.println("The index is: " + index2);

        System.out.println("\nThe min int is: " + min);
        System.out.println("The index is: " + index1);

    }
}
