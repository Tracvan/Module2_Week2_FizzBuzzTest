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
    public void fizzNumber123Test(){
        int inputNumber=123;
        String result = FizzBuzz.fizzBuzzCheck(123);
        String expected ="Fizz";
        assertEquals(expected,result);
    }
    @Test
    public void fizzBuzzNumber154Test(){
        String result = FizzBuzz.fizzBuzzCheck(154);
        String expected ="Buzz";
        assertEquals(expected,result);
    }
    @Test
    public void fizzBuzzNumber1235Test(){
        int inputNumber=1235;
        String result = FizzBuzz.fizzBuzzCheck(1235);
        String expected ="FizzBuzz";
        assertEquals(expected,result);
    }
}
