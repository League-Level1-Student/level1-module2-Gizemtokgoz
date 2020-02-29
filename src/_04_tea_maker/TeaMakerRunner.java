package _04_tea_maker;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaMaker maker = new TeaMaker();
		
		TeaBag bag = new TeaBag(TeaBag.PASSION_FRUIT);
		
		Kettle kettle = new Kettle();
		kettle.boil();
		
		Cup cup = new Cup();
		cup.makeTea(bag, kettle.getWater());
	}
}
