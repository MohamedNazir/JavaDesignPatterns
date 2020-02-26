package com.rizan.creationalPattern.BuilderPattern;

public class Phone {
	
	private String OperatingSystem;
	
	private int ram;
	
	private String processor;
	
	private double screenSize;
	
	private int battery;

	public Phone(String operatingSystem, int ram, String processor, double screenSize, int battery) {
		super();
		OperatingSystem = operatingSystem;
		this.ram = ram;
		this.processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}

	public String getOperatingSystem() {
		return OperatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		OperatingSystem = operatingSystem;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Phone [OperatingSystem=" + OperatingSystem + ", ram=" + ram + ", processor=" + processor
				+ ", screenSize=" + screenSize + ", battery=" + battery + "]";
	}
	
	

}
