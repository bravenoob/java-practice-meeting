package com.businessdecision.practicemeeting;

import com.businessdecision.practicemeeting.records.CarClass;
import com.businessdecision.practicemeeting.records.CarRecord;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class RecordsTest {

    @Test
    void givenDtoClass_whenInstantiatingIt_thenPropertiesCanBeRetrived() {
        CarClass car = new CarClass("Nissan", "Qashqai");
        assertAll(
                () -> assertThat(car.getMake()).isEqualTo("Nissan"),
                () -> assertThat(car.getModel()).isEqualTo("Qashqai")
        );
    }

    @Test
    void givenRecord_whenInstantiatingIt_thenPropertiesCanBeRetrieved() {
        CarRecord car = new CarRecord("Nissan", "Qashqai");
        assertAll(
                () -> assertThat(car.make()).isEqualTo("Nissan"),
                () -> assertThat(car.model()).isEqualTo("Qashqai")
        );
    }

}
