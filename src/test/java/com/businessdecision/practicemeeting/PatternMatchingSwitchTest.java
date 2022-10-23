package com.businessdecision.practicemeeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PatternMatchingSwitchTest {

    @Test
    void givenOldImpl_whenParsingCorrectDouble_thenCorrectValueIsReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool("17.00");
        assertThat(actual).isEqualTo(17.00d);
    }

    @Test
    void givenOldImpl_whenParsingIncorrectDouble_thenDefaultValueIsReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool(false);
        assertThat(actual).isEqualTo(0d);
    }

    @Test
    void givenPatternMatchingImpl_whenParsingCorrectString_thenCorrectValueIsReturned() {
        double actual = PatternMatchingSwitch.parseDoublePatternMatching("17.00");
        assertThat(actual).isEqualTo(17.00d);
    }

    @Test
    void givenPatternMatchingImpl_whenParsingCorrectNumber_thenCorrectValueIsReturned() {
        double actual = PatternMatchingSwitch.parseDoublePatternMatching(25);
        assertThat(actual).isEqualTo(25d);
    }

    @Test
    void givenPatternMatchingImpl_whenParsingIncorrectType_thenDefaultValueIsReturned() {
        double actual = PatternMatchingSwitch.parseDoubleOldSchool(false);
        assertThat(actual).isEqualTo(0d);
    }

}
