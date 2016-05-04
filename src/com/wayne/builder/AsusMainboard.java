package com.wayne.builder;

public class AsusMainboard extends Mainboard {

    @Override
    public Mainboard getMainboard() {
        return new AsusMainboard();
    }

    @Override
    public String toString() {
        return " AsusMainboard ";
    }
}
