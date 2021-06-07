public class FizzBuzz {
    public String CalculateFizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            return "FizzBuzz!!!";
        }
        else if(num % 3 == 0){
            return "Just Fizz";
        }
        else if (num % 5 == 0){
            return "Just Buzz";
        }
        return String.valueOf(num);
    }
}