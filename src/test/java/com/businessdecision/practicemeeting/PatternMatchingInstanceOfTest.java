package com.businessdecision.practicemeeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PatternMatchingInstanceOfTest {

    @Test
    void givenOldImpl_whenCheckingStringType_thenCorrectTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypeOldSchool("Java");
        assertThat(actual).isEqualTo("Object is a string: Java");
    }

    @Test
    void givenOldImpl_whenCheckingNumberType_thenCorrectTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypeOldSchool(17);
        assertThat(actual).isEqualTo("Object is a number: 17");
    }

    @Test
    void givenOldImpl_whenCheckingUnknownType_thenUnknownTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypeOldSchool(false);
        assertThat(actual).isEqualTo("Object is not recognized");
    }

    @Test
    void givenPatternMatchingImpl_whenCheckingStringType_thenCorrectTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypePatternMatching("Java");
        assertThat(actual).isEqualTo("Object is a string: Java");
    }

    @Test
    void givenPatternMatchingImpl_whenCheckingNumberType_thenCorrectTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypePatternMatching(17);
        assertThat(actual).isEqualTo("Object is a number: 17");
    }

    @Test
    void givenPatternMatchingImpl_whenCheckingUnknownType_thenUnknownTypeIsReturned() {
        String actual = PatternMatchingInstanceOf.checkTypePatternMatching(false);
        assertThat(actual).isEqualTo("Object is not recognized");
    }

}
