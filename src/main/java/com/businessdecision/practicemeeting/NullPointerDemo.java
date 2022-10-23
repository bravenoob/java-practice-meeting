package com.businessdecision.practicemeeting;

import com.businessdecision.practicemeeting.records.CarClass;

public class NullPointerDemo {

    public static void makeNullPointer() {
        CarClass car = null;
        car.getMake();
    }

}
