package com.rizan.creationalPattern.BuilderPattern;

public class Shop {
	
	
	public static void main(String[] args) {
		
		// Build phone without using builder pattern.
		Phone p = new Phone("Andriod", 4, "MediaTek", 6.4, 3200);
		
		System.out.println(p);
		
		//Build Phone object with Builder Pattern;
		
		Phone p1 = new PhoneBuilder().setBattery(100).setRam(2).getPhone();
		System.out.println(p1);
	}

}
