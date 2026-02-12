package TwoSums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public void twoSumSolution(int[] nums, int target){


//      Given an array of integers nums and an integer target,
//      return indices of the two numbers such that they add up to target.
//      You may assume that each input has exactly one solution,
//      and you may not use the same element twice.
//      You can return the answer in any order.

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int secondInt = target - nums[i];

            //12123
            //43432

            if (map.containsKey(secondInt)){
                int[] finalRes = {map.get(secondInt), i};

                System.out.println(Arrays.toString(finalRes));
                map.get(secondInt);
                return;
            }


            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("Couldnt find any matches");

    }
}
