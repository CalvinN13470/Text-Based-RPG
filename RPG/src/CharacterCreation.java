
public class CharacterCreation {

	static UserInput input;
	
	private Character newHero;
	
	CharacterCreation(){
		
		System.out.println("What is the name of your hero?");
		
		input = new UserInput();
		
		newHero = new Character(input.getInput());
		
		int skillPoints = 5;
		
		while (skillPoints != 0) {
			
			System.out.println("You have " + skillPoints + " skill points to spend on your hero. Which skills would you like to enhance?");
			System.out.println("1.STR	2.DEX	3.INT	4.LUK	5.SPD");			
			
			switch (input.getInput()) {
			
				case("1"):
					
					newHero.setSTR(newHero.getSTR() + 1);
					skillPoints--;
					
					break;
					
				case("2"):
					
					newHero.setDEX(newHero.getDEX() + 1);
					skillPoints--;
					
					break;
					
				case("3"):
					
					newHero.setINT(newHero.getINT() + 1);
					skillPoints--;
					
					break;
					
				case("4"):
					
					newHero.setINT(newHero.getINT() + 1);
					skillPoints--;
					
					break;
					
				case("5"):
					
					newHero.setSPD(newHero.getSPD() + 1);
					skillPoints--;
					
					break;
					
				default:
					
					System.out.println("Please enter a valid input");
			
			}
			
			newHero.printStats();
			
		}
		
		newHero.ModifyWithStats();
		System.out.println("Your new hero has been created!");
		
	}
	
	public Character getHero() {
		
		return newHero;
		
	}
	
}
