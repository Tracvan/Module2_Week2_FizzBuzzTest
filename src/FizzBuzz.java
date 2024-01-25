/*
public class FizzBuzz {
    public static int inputNumber;
    public static String result = "";
    public static boolean isInclude3 = false;

    public static boolean isInclude3(int number) {
        String stringInput = Integer.toString(number);
        isInclude3 = false;
        for (int i = 0; i < stringInput.length(); i++) {
            if ('3' == stringInput.charAt(i)) {
                isInclude3 = true;
                break;
            }
        }
        return isInclude3;
    }

    public static boolean isInclude5 = false;

    public static boolean isInclude5(int number) {
        String stringInput = Integer.toString(number);
        isInclude5 = false;
        for (int i = 0; i < stringInput.length(); i++) {
            if ('5' == stringInput.charAt(i)) {
                isInclude5 = true;
                break;
            }
        }
        return isInclude5;
    }

    public static boolean isFizz() {
        if (isInclude3 == true || inputNumber % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBuzz() {
        if (isInclude5 == true || inputNumber % 5 == 0) {
             return true;
        }
        return false;
    }

    public static String fizzBuzzCheck(int input) {
        inputNumber = input;
        if (isBuzz()) {
            result = "Buzz";
        } else if (isFizz()) {
            result = "Fizz";
        } else if (isBuzz() && isFizz()) {
            result = "FizzBuzz";
        } else {
            result = Integer.toString(inputNumber);
        }
        return result;
    }
}
*/
public class FizzBuzz {
    public static int inputNumber;
    public static String result = "";


    public static boolean isInclude3(int number) {
         boolean isInclude3 = false;
        String stringInput = Integer.toString(number);
        isInclude3 = false;
        for (int i = 0; i < stringInput.length(); i++) {
            if ('3' == stringInput.charAt(i)) {
                isInclude3 = true;
                break;
            }
        }
        return isInclude3;
    }

    public static boolean isInclude5(int number) {
        boolean isInclude5 = false;
        String stringInput = Integer.toString(number);
        isInclude5 = false;
        for (int i = 0; i < stringInput.length(); i++) {
            if ('5' == stringInput.charAt(i)) {
                isInclude5 = true;
                break;
            }
        }
        return isInclude5;
    }

    public static boolean isFizz(int number) {
        if (isInclude3(number) || number % 3 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBuzz(int number) {
        if (isInclude5(number) || number % 5 == 0) {
            return true;
        }
        return false;
    }

    public static String fizzBuzzCheck(int input) {
        inputNumber = input;
        if (isBuzz(input) && isFizz(input)) {
            result = "FizzBuzz";
        } else if (isBuzz(input)) {
            result = "Buzz";
        } else if (isFizz(input)) {
            result = "Fizz";
        } else {
            result = Integer.toString(inputNumber);
        }
        return result;
    }
}
