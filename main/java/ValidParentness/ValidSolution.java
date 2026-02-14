package ValidParentness;

import java.util.ArrayDeque;
import java.util.Calendar;
import java.util.Deque;
import java.util.Map;

public class ValidSolution {

    public boolean parentnessSolution(String s){

        Map<Character, Character> pairs = Map.of(
                ')', '(',
                '}', '{',
                ']', '['
        );

        Deque<Character> stack = new ArrayDeque<>();

        for(char ch : s.toCharArray()){

            if(pairs.containsKey(ch)) {

                if (stack.isEmpty() || stack.pop() != pairs.get(ch)){
                    return false;
                }
            }

            else{
                stack.push(ch);
            }
        }

        return true;
    }

}
