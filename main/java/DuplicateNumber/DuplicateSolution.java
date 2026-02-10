package DuplicateNumber;

import java.util.HashSet;
import java.util.Set;

public class DuplicateSolution {

    public boolean solution(int[] nums){

        Set<Integer> haveDuplicates = new HashSet<>();

        for(int number : nums){
            if (haveDuplicates.contains(number)){
                return true;
            }

            haveDuplicates.add(number);
        }

        return false;
    }
}
