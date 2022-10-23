package com.businessdecision.practicemeeting.sealed;

    public sealed interface Vehicle permits Car, Truck {

        String registrationNumber();

    }
