package com.businessdecision.practicemeeting;

import com.businessdecision.practicemeeting.sealed.Car;
import com.businessdecision.practicemeeting.sealed.Truck;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class SealedTest {

    @Test
    void givenCarRecord_whenInstantiatingIt_thenPropertiesCanBeRetrived() {
        Car car = new Car(5, "VZ-345-OS");
        assertAll(
                () -> assertThat(car.registrationNumber()).isEqualTo("VZ-345-OS"),
                () -> assertThat(car.numberOfSeats()).isEqualTo(5)
        );
    }

    @Test
    void givenTruckRecord_whenInstantiatingIt_thenPropertiesCanBeRetrived() {
        Truck truck = new Truck(5000, "VZ-123-OS");
        assertAll(
                () -> assertThat(truck.registrationNumber()).isEqualTo("VZ-123-OS"),
                () -> assertThat(truck.loadCapacity()).isEqualTo(5000)
        );
    }

}
