package com.wayne.builder;

public abstract class Mainboard {

	public abstract Mainboard getMainboard();

	@Override
	public String toString() {
	    return this.getClass().getSimpleName();
	}

}
