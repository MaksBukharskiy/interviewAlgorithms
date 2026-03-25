package ListOfNames;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maks", "Ari", "David");

        Solution solution = new Solution();
        solution.newSortedArrayList(list);
    }
}
