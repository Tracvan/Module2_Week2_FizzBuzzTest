import java.util.Scanner;

public class FizzBuzz {
    Scanner scanner = new Scanner(System.in);
     int inputNumber = scanner.nextInt();
    public static String fizzBuzzCheck(int inputNumber){
        String result ="";

        if(inputNumber % 3 == 0){
            return "Fizz";
        } else if (inputNumber % 5 == 0) {
            return "Buzz";
        }else {
            result = Integer.toString(inputNumber);
        }
        return result;
    }
}
