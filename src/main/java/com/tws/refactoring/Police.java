package com.tws.refactoring;

public class Police {
    private int AGE = 18;

    public boolean checkDriver(Driver driver) {
        return driver.getAge() >= AGE;
    }
}
