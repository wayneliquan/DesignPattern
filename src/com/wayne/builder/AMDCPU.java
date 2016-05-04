package com.wayne.builder;

public class AMDCPU extends CPU {

    public CPU getCPU() {
        return new AMDCPU();
    }

    @Override
    public String toString() {
        return " AMDCPU ";
    }
}
