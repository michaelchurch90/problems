package com.bettercloud.challenges._2017._01Jan;

/**
 * Created by davidesposito on 1/20/17.
 */
public class _012717_FizzBuzz {

    public interface FizzBuzzifier {
        /**
         * For each number from min to max, when the number is evenly divisible by 3 output "Fizz", when evenly
         * divisible by 5 output "Buzz", when evenly divisible by 3 and 5 output "FizzBuzz". Otherwise output just the
         * number. Each resulting string should be on its own line.
         *
         * Returns the FizzBuzz String. Each case from min-max inclusive will have its one line in the return string.
         * Ignore all values <= 0.
         *
         *      e.g. min=1, max=5, expected="1\n2\nFizz\n4\nBuzz"
         *          1
         *          2
         *          Fizz
         *          4
         *          Buzz
         *
         *      e.g. min=28, max=32, expected="28\n29\nFizzBuzz\n31\nFizz"
         *          28
         *          29
         *          FizzBuzz
         *          31
         *          Fizz
         *
         * @param min
         * @param max
         * @return
         */
        String process(int min, int max);
    }

    public static class MyFizzBuzzifier implements FizzBuzzifier {

        @Override
        public String process(int min, int max) {
            return "";
        }
    }
}
