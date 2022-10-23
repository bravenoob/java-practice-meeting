package com.businessdecision.practicemeeting;

import com.businessdecision.practicemeeting.enums.Day;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SwitchExpressionsTest {

    @Test
    void givenOldImpl_whenGettingNumberOfLettersForSunday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersOldSchool(Day.SUNDAY);
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void givenOldImpl_whenGettingNumberOfLettersForTuesday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersOldSchool(Day.TUESDAY);
        assertThat(actual).isEqualTo(7);
    }

    @Test
    void givenOldImpl_whenGettingNumberOfLettersForSaturday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersOldSchool(Day.SATURDAY);
        assertThat(actual).isEqualTo(8);
    }

    @Test
    void givenOldImpl_whenGettingNumberOfLettersForWednesday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersOldSchool(Day.WEDNESDAY);
        assertThat(actual).isEqualTo(9);
    }

    @Test
    void givenEnhancedSwitch_whenGettingNumberOfLettersForSunday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersEnhancedSwitch(Day.SUNDAY);
        assertThat(actual).isEqualTo(6);
    }

    @Test
    void givenEnhancedSwitch_whenGettingNumberOfLettersForTuesday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersEnhancedSwitch(Day.TUESDAY);
        assertThat(actual).isEqualTo(7);
    }

    @Test
    void givenEnhancedSwitch_whenGettingNumberOfLettersForSaturday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersEnhancedSwitch(Day.SATURDAY);
        assertThat(actual).isEqualTo(8);
    }

    @Test
    void givenEnhancedSwitch_whenGettingNumberOfLettersForWednesday_thenCorrectValueIsReturned() {
        int actual = SwitchExpressions.numberOfLettersEnhancedSwitch(Day.WEDNESDAY);
        assertThat(actual).isEqualTo(9);
    }

}
