package Basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
		
		String[] PinTitles = {"Theatre of Magic", "Elvira and the Party Monsters", "Doctor Who", "Last Action Hero", "High Speed 2: the Getaway", "Taxi"};
		System.out.println("For loop results:");
		for(int i = 0; i <=5; i++) {
			if (PinTitles[i].contains("the")) {
				System.out.println(PinTitles[i]);
			}
		}
		
		
		/*System.out.println("*******************************");
		
		System.out.println("Do while loop results:");
		int j = 0;
		do {
			System.out.println(PinTitles[j]);
			++j;
		} while (j <=5);
		System.out.println("*******************************");
		
		System.out.println("While loop results:");
		int k = 0;
		boolean partyTime = false;
		while (!partyTime) {
			String table = PinTitles[k];
			System.out.println(table);
			if (table == "Elvira and the Party Monsters") {
				System.out.println("Party Time!");
				partyTime = true;
			}
			++k;
		}
		*/
		
		
		
	}

}
