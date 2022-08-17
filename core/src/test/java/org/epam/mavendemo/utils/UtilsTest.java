package org.epam.mavendemo.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UtilsTest {
    @Test
    void isAllPositiveNumbers() {
        Utils utils = new Utils();
        boolean result = utils.isAllPositiveNumbers("12", "79.56");
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource("numberProvider")
    void isAllPositiveNumbersWithNegative(List<String> strings) {
        Utils utils = new Utils();
        boolean result = utils.isAllPositiveNumbers(strings.toArray(new String[0]));
        Assertions.assertFalse(result);
    }

    private Stream<List<String>> numberProvider() {
        return Stream.of(
                List.of("30", "79", "-14"),
                List.of("12", "0", "79"),
                List.of("11", "3e3"));
    }
}