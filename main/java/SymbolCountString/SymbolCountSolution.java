package SymbolCountString;

import java.util.HashMap;
import java.util.Map;

public class SymbolCountSolution {

    public Map<Character, Integer> solution(String array){

        Map<Character, Integer> finalPrint = new HashMap<>();

        for(char c : array.toCharArray()){
            finalPrint.put(c, finalPrint.getOrDefault(c, 0) + 1);
        }

        System.out.println(finalPrint);
        return finalPrint;
    }
}
