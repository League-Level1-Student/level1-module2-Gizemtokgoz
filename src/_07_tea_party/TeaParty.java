package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		String welcomeMessage = "";
		if (isWoman && isKnighted) {
			welcomeMessage = "Lady ";
		}
		
		if (isWoman && !isKnighted) {
			welcomeMessage = "Ms. ";
		}
		
		if (!isWoman && isKnighted) {
			welcomeMessage = "Sir ";
		}
		
		if (!isWoman && !isKnighted) {
			welcomeMessage = "Mr. ";
		}
		
		return "Hello " + welcomeMessage + name;
	}

	private String name;

	TeaParty(String name) {
		this.name = name;
	}

	/*
	 * public String guestName() { String person = "nobody"; if
	 * (name.equals("Austen")) { person = "Ms. "; }
	 * 
	 * else if (name.equals("Orwell")) { person = "Mr. "; }
	 * 
	 * else if (name.equals("Isaac Newton")) { person = "Sir "; }
	 * 
	 * return "Hello " + person + name; }
	 */
}
