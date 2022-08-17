package org.epam.mavendemo.utils;

import org.apache.commons.lang3.math.NumberUtils;
import java.util.Arrays;

public class Utils {
    private static final String MINUS = "-";
    private static final String ZERO = "0";

    public boolean isAllPositiveNumbers(String... str) {
        return Arrays.stream(str).allMatch(this::isPositiveNumber);
    }

    private boolean isPositiveNumber(String str) {
        boolean isNumeric = NumberUtils.isParsable(str);
        return !str.startsWith(MINUS) && !str.equals(ZERO) && isNumeric;
    }
}
