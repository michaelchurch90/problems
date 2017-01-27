package com.bettercloud.challenges._2017._01Jan;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by davidesposito on 1/20/17.
 */
public class _012717_FizzBuzz {

    public interface FizzBuzzifier {
        /**
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
            return IntStream.rangeClosed(min, max)
                    .filter(i -> i > 0)
                    .boxed()
                    .map(i -> new Pair<>(i, ""))
                    .map(p -> { if (p.getA() % 3 == 0) p.setB("Fizz"); return p; })
                    .map(p -> { if (p.getA() % 5 == 0) p.setB(p.getB() +"Buzz"); return p; })
                    .map(p -> p.getB().isEmpty() ? p.getA() + "" : p.getB())
                    .collect(Collectors.joining("\n"));
        }
    }

    @Data
    @AllArgsConstructor
    private static class Pair<A, B> {
        private A a;
        private B b;
    }
}