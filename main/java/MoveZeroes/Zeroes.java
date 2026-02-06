package MoveZeroes;

public class Zeroes {

    public int[] solutionZeroes(int[] nums){
        int cntr = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[cntr] = nums[i];
                cntr++;
            }
        }

        for (int i = cntr; i < nums.length; i++){
            nums[i] = 0;
        }

        return nums;
    }
}
