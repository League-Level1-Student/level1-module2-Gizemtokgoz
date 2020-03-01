package _06_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}
	
	String getName() {
		return name;
	}
	
	int getEyes() {
		return eyes;
	}
	
	String getColor() {
		return color;
	}
	
	void setMaster(String mast) {
		this.master = mast;
	}
	
	String getMaster() {
		return master;
	}
}
	//Minion stuart = new Minion("Stuart", 1, "yellow", "");
	//Minion dave = new Minion("Dave", 2, "yellow", "");

