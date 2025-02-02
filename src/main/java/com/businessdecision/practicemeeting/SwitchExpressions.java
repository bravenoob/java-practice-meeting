package com.businessdecision.practicemeeting;

import com.businessdecision.practicemeeting.enums.Day;

public class SwitchExpressions {

    public static int numberOfLettersOldSchool(Day day) {
        int letters = 0;
        switch (day) {
            case MONDAY:
            case FRIDAY:
            case SUNDAY:
                letters = 6;
                break;
            case TUESDAY:
                letters = 7;
                break;
            case THURSDAY:
            case SATURDAY:
                letters = 8;
                break;
            case WEDNESDAY:
                letters = 9;
                break;
        }
        return letters;
    }

    public static int numberOfLettersEnhancedSwitch(Day day) {
        // can you write it more compact?
        return 0;
    }

}
