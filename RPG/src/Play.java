
public class Play {

	//boolean that dictates if the player is in-game
	private boolean Ongoing;
	
	private Character Hero;
	
	private Location position;
	
	static UserInput input;
	
	//New Game
	Play(Character hero){
		
		Ongoing = true;
		
		input = new UserInput();
		
		Hero = hero;
		position = new Location();
		Map World = new Map(position.getX(), position.getY());
		
		while(Ongoing) {
		
			//prints newline to space out the text
			System.out.println("");
			
			position.getPosition();
			
			World.getEnvironment(position.getX(), position.getY());
			
			doAction();
			
		}
		
	}
	
	//Prompt player to act
	private void doAction() {
		
		boolean finishedAction = false;
		
			while(!finishedAction) {
			
			System.out.println("What would you like to do?");
			System.out.println("1.Move North	2.Move East		3.Move South	4.Move West");
			System.out.println("5.Character		6.Scan Surroundings		7.Inventory		0.Exit to Menu");
			
				switch(input.getInput()) {
				
					case("1"):
						position.move("north");
						finishedAction = true;
						break;
						
					case("2"):
						position.move("east");
						finishedAction = true;
						break;
						
					case("3"):
						position.move("south");
						finishedAction = true;
						break;
						
					case("4"):
						position.move("west");
						finishedAction = true;
						break;
						
					case("0"):
						Ongoing = false;
						finishedAction = true;
						break;
					
					default:
						System.out.println("Please enter a valid input");
				}
			
			}
		
	}
	
}
