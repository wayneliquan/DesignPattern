package com.wayne.builder;

public interface ComputerBuilder {
    public void buildCPU();

    public void buildMemory();

    public void buildMainboard();

    public Computer getComputer();
}
