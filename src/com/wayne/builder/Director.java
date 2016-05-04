package com.wayne.builder;

public class Director {
    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }

    /**
     * 这里是具体组装的过程
     * @return
     */
    public Computer construct() {
        return builder.getComputer();
    }

}