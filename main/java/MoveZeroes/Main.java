package MoveZeroes;

public class Main {
    public static void main(String[] args) {

        Zeroes solution = new Zeroes();

        int[] array = {1, 2, 0, 4, 0, 8};
        int[] result = solution.solutionZeroes(array);

        System.out.println("После: " + java.util.Arrays.toString(result));
    }
}
