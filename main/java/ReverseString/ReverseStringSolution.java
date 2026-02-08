package ReverseString;

import java.sql.SQLOutput;

public class ReverseStringSolution {

    public void solution(String originalString){

        StringBuilder sb = new StringBuilder(originalString);

        String reversedString = sb.reverse().toString();

        System.out.println("String before: " + originalString);
        System.out.println("String after: " + reversedString);

    }

}
