package TheMaxElement;

public class TheMaxSolution {

    public void solution(int[] arr ){

        int max = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){

                max = arr[i];
                index = i;

            }

        }

        System.out.println("The max int is: " + max);
        System.out.println("The index is: " + index);

    }
}
