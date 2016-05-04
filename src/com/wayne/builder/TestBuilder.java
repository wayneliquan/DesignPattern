package com.wayne.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Computer lenoveComputer, hpComputer;
        ComputerBuilder lenoveComputerBuilder = new LenoveComputerBuilder();
        ComputerBuilder hpComputerBuilder = new HPComputerBuilder();
        Director director;
        director = new Director(lenoveComputerBuilder);
        lenoveComputer = director.construct();
        director = new Director(hpComputerBuilder);
        hpComputer = director.construct();
        System.out.println("lenoveComputer is made by:" + lenoveComputer.getCpu() + lenoveComputer.getMemory() + lenoveComputer.getMainboard());
        System.out.println("hpComputer is made by:" + hpComputer.getCpu() + hpComputer.getMemory() + hpComputer.getMainboard());
    }

}
