package ListOfNames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    public void newSortedArrayList(List<String> list){
        List<String> result = list.stream()
                .map(s -> s.substring(1))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
