import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    @Test
    public void fizzNumberTest(){
        String expected ="Fizz";
        String result = FizzBuzz.fizzBuzzCheck(3);
        assertEquals(expected,result);
    }
    @Test
    public void buzzNumberTest(){
        String expected ="Buzz";
        String result = FizzBuzz.fizzBuzzCheck(5);
        assertEquals(expected,result);
    }
    @Test
    public void notBuzzNumberTest(){
        int inputNumber=11;
        String result = FizzBuzz.fizzBuzzCheck(11);
        String expected =Integer.toString(inputNumber);
        assertEquals(expected,result);
    }
}
