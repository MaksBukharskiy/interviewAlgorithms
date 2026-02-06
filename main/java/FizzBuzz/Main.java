package FizzBuzz;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        FizzBuzz fizzbuzz = new FizzBuzz();

        for(int i = 1; i < 100; i++){
            System.out.println(fizzbuzz.fizzBuzzSolution(i));
        }

    }
}
