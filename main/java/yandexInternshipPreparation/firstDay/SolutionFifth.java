package yandexInternshipPreparation.firstDay;

import java.util.HashMap;
import java.util.Map;

public class SolutionFifth {
    public static boolean isAnagram(String a, String b){

        if (a.length() != b.length()){
            return false;
        }

        Map<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);

            counts.put(c, counts.getOrDefault(c, 0)+1);
        }

        for (int i = 0; i < b.length(); i++){
            char c = a.charAt(i);

            if (!counts.containsKey(c)){
                return false;
            }

            int currentCount = counts.get(c);

            if (currentCount == 1){
                counts.remove(c);
            }
            else {
                counts.put(c, currentCount-1);
            }
        }

        return counts.isEmpty();
    }
}
