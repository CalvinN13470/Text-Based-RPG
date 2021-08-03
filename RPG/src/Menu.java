import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Menu{
	
	static UserInput input;
	
	Play Game;
	
	//if the program is running
	boolean Active;
	
	public Menu() {
		
		input = new UserInput();
		
		Active = true;
		
		while(Active) {
		
			System.out.println("Text Adventure!\n\n1.New Game\n2.Continue Game\n3.Quit");
			
			switch(input.getInput()) {
			
				case("1"):
					
					CharacterCreation newCharacter = new CharacterCreation();
					Character Hero = newCharacter.getHero();
					
					Game = new Play(Hero);
					
					break;
					
				case("3"):
					
					Active = false;
					
					break;
					
				default:
					System.out.println("Please enter a valid input");
			
			}
		
		}
		
		System.out.println("Thank you for Playing!");

		
	}

	
	
}
