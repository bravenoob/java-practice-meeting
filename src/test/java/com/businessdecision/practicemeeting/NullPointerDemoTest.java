package com.businessdecision.practicemeeting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NullPointerDemoTest {

    @Test
    void givenMethodThatThrowsNullPointer_whenInvokingIt_thenMessageContainersVariableName() {
        assertThatThrownBy(NullPointerDemo::makeNullPointer).hasMessageContaining("because \"car\" is null");
    }

}
