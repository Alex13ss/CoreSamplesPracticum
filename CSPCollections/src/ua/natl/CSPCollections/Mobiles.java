package ua.natl.CSPCollections;

public class Mobiles {
	private int number;
	private String name;
	
	public Mobiles(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}