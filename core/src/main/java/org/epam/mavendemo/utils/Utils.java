package org.epam.mavendemo.utils;

import com.epam.mavendemo.utils.StringUtils;

import java.util.Arrays;

public class Utils {
    public boolean isAllPositiveNumbers(String... str) {
        StringUtils stringUtils = new StringUtils();

        return Arrays.stream(str).allMatch(stringUtils::isPositiveNumber);
    }
}
