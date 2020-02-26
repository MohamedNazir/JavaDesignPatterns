package com.rizan.creationalPattern.FactoryPattern;

public class Client {

	
	public static void main(String[] args) {
		
		
		Mobile mobile1 = MobileFactory.getInstance(Phonetype.APPLE);
		mobile1.printFeature();
		
		Mobile mobile2 = MobileFactory.getInstance(Phonetype.LG);
		mobile2.printFeature();
		
		Mobile mobile3 = MobileFactory.getInstance(Phonetype.NOKIA);
		mobile3.printFeature();
		
	}
}
