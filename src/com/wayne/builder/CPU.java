package com.wayne.builder;

public abstract class CPU {

    public abstract CPU getCPU();

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
