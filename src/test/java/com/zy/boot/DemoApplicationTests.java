package com.zy.boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.BiFunction;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void test() {
        BiFunction<Integer, Integer, Integer> bitFunction = Math::max;
        System.out.println(bitFunction.apply(1,2));
    }
}
