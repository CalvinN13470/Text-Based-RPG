import java.util.*;

public class Location {

	static final int MAP_WIDTH = 1000;
	
	static final int MAP_HEIGHT = 1000;
	
	Random random;
	
	int xPos;
	
	int yPos;
	
	Location(){
		
		random = new Random();
		
		//Decides random location in map to spawn
		xPos = random.nextInt(MAP_WIDTH);
		yPos = random.nextInt(MAP_HEIGHT);
		
	}
	
	public void move(String direction) {
		
		switch(direction) {
		case("north"):
			yPos++;
			break;
		
		case("east"):
			xPos++;
			break;
		
		case("south"):
			yPos--;
			break;
		
		case("west"):
			xPos--;
			break;
		}
		
	}
	
	public void getPosition() {
		
		System.out.println("Your position in the world is " + xPos + ", " + yPos);
		
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
}
