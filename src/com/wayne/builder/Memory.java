package com.wayne.builder;

public abstract class Memory {

	public Memory getMemory() {
		return null;
	}

	@Override
	public String toString() {
	    return this.getClass().getSimpleName();
	}
}
