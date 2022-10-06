package bai2;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number=3;
        String  expected="fizz";
        String result=FizzBuzz.fizzbuzz(number);
        assertEquals(expected,result);
    }
}