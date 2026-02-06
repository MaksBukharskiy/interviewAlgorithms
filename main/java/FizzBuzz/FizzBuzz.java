package FizzBuzz;

public class FizzBuzz {

    public String fizzBuzzSolution(int number){

        boolean divisibleby3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;

        if(divisibleby3 && divisibleBy5) {
            return "FizzBuzz";
        }

        else if (divisibleby3) {
            return "Fizz";
        }

        else if (divisibleBy5){
            return "Buzz";
        }
        else {
            return String.valueOf(number);
        }

    }
}
