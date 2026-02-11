package NFactorial;

public class FactorialSolution {

    public void solution(long number){

        long result = 1;

        if(number == 0){
            throw new IllegalArgumentException("Number cant be 0 or less");
        }

        for(int i = 1; i <= number; i++){
                result *= i;
        }

        System.out.println("The answer is: " + result);
    }

}