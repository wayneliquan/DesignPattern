package com.wayne.builder;

public class GaMainboard extends Mainboard {

    @Override
    public Mainboard getMainboard() {
        return new GaMainboard();
    }

}
