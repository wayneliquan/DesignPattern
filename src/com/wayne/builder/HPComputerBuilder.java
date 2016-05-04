package com.wayne.builder;

public class HPComputerBuilder implements ComputerBuilder {

    private Computer HPComputer = null;

    public HPComputerBuilder() {
        HPComputer = new Computer();
    }

    @Override
    public void buildCPU() {
        HPComputer.setCpu(new AMDCPU());

    }

    @Override
    public void buildMemory() {
        HPComputer.setMemory(new ApacerMemory());
    }

    @Override
    public void buildMainboard() {
        HPComputer.setMainboard(new GaMainboard());

    }

    @Override
    public Computer getComputer() {
        buildCPU();
        buildMemory();
        buildMainboard();
        return HPComputer;
    }
}
