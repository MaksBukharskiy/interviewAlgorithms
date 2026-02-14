package ValidParentness;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        String stringOfChars1 = "[()]{}";
        String stringOfChars2 = "(]";

        ValidSolution solution = new ValidSolution();

        System.out.println(solution.parentnessSolution(stringOfChars1));
        System.out.println(solution.parentnessSolution(stringOfChars2));

    }
}
