package oopsConcepts;

public class Car {
	// color
	private String color;
	//make
	private String make;
	//model
	int speed;
	int gear;
	
	private String model;
	//year
	private int year;
	
	public Car( ) {
		
		this.speed=0;
		this.gear= 0;
		System.out.println("Executing constructor without arguments");
	}
	public Car(int speed, int gear ) {
		//this(10,2);
		this.speed=speed;
		this.gear=gear;
		System.out.println("Executing constructor with arguments");

	}
	
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
	public void setMake(String make) {
		this.make=make;
}
	public String getMake( ) {
		return this.make;
}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year > 1900) {
		this.year = year;
	} else {
		System.out.println("This year is not valid");
	}
}
}