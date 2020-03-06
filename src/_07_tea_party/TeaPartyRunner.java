package _07_tea_party;

import _03_smurf.Smurf;

public class TeaPartyRunner {
	public static void main(String[] args) {
		  TeaParty ms = new TeaParty("Austen");
		  ms.welcome("Austen", true, false);
		  
		  TeaParty mr = new TeaParty("Orwell");
		  ms.welcome("Orwell", false, false);
		  
		  TeaParty sir = new TeaParty("Isaac Newton");
		  ms.welcome("Isaac Newton", false, true);
		
	}
}
