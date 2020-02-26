package com.rizan.creationalPattern.FactoryPattern;

public class MobileFactory {

	public static Mobile getInstance(Phonetype phoneType) {
		switch (phoneType) {

		case APPLE:
			return new Apple();
		case LG:
			return new LG();
		case NOKIA:
			return new Nokia();
		default:
			throw new IllegalArgumentException();
		}
	}

}
