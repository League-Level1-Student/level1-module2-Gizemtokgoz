package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		SeaCreature sponge = new SeaCreature("spongebob");
		SeaCreature star = new SeaCreature("patrick");
		SeaCreature squid = new SeaCreature("squidward");
		
		sponge.getName();
		star.getName();
		squid.getName();
		
		sponge.eat();
		star.eat();
		squid.eat();
		
		sponge.laugh();
		star.laugh();
		squid.laugh();
	}
}