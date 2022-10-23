package hr.dstr89.demo;

import hr.dstr89.demo.records.CarClass;

public class NullPointerDemo {

    public static void makeNullPointer() {
        CarClass car = null;
        car.getMake();
    }

}
