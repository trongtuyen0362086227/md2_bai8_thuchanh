package bai2;

public class FizzBuzz {
    public static String fizzbuzz(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return "fizzbuzz";
        }
        if (isFizz) {
            return "fizz";
        }
        if (isBuzz) {
            return "buzz";
        }
        return number+"";
    }
}
