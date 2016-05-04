package com.wayne.builder;

public class IntelCPU extends CPU {

    public CPU getCPU() {
        return new IntelCPU();
    }

}