package com.businessdecision.practicemeeting;

public class PatternMatchingSwitch {

    public static double parseDoubleOldSchool(Object obj) {
        return switch (obj) {
            case String s -> {
                if (s.length() > 0) {
                    yield Double.parseDouble(s);
                } else {
                    yield 0d;
                }
            }
            default -> 0d;
        };
    }

    public static double parseDoublePatternMatching(Object obj) {
        return switch (obj) {
            // how would you write the first case?
            case Number n -> n.doubleValue();
            default -> 0d;
        };
    }

}
