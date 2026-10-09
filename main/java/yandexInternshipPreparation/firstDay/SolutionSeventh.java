package yandexInternshipPreparation.firstDay;

import java.util.HashMap;
import java.util.Map;

public class SolutionSeventh {
    public static int uniqueStringSolution(String s){
        Map<Character, Integer> data= new HashMap<>();
        int maxLength = 0;
        int left = 0;

        if (s.length() == 0){
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(data.containsKey(c)){
                left = Math.max(left, data.get(c) + 1);
            }

            data.put(c, i);

            maxLength = Math.max(maxLength, i - left + 1);
        }

        System.out.println(maxLength);
        return maxLength;
    }
}
