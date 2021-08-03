import java.util.*;

public class Map {
	
	static final int MAP_WIDTH = 1000;
	
	static final int MAP_HEIGHT = 1000;
	
	private String[][] World;
	
	private Random random;
	
	Map(int startTownX, int startTownY){
		
		World = new String[MAP_WIDTH][MAP_HEIGHT];
		
		random = new Random();
		
		int randNum;
		
		for (int i = 0 ; i < MAP_WIDTH ; i++) {
			
			for (int j = 0 ; j < MAP_HEIGHT ; j++) {
			
				randNum = random.nextInt(100);
				
				if (randNum >= 0 && randNum < 30) {
					World[i][j] = "G";
				}
				else if (randNum >= 30 && randNum < 60) {
					World[i][j] = "F";
				}
				else if (randNum >= 60 && randNum < 90) {
					World[i][j] = "D";
				}
				else {
					World[i][j] = "T";
				}
				
			}
			
		}
		
		World[startTownX][startTownY] = "T";
		
	}
	
	public void getEnvironment(int x, int y) {
		
		switch(World[x][y]) {
		
			case("T"):
				System.out.println("You're in a town. It is bustling with but it is quite smelly.");
				break;
				
			case("G"):
				System.out.println("You're in a Grassfield. The smell of grass feels refreshing.");
				break;
				
			case("F"):
				System.out.println("You're in a forest. You can hear the sounds of birds and see sun rays piercing through the tree leaves.");
				break;
				
			case("D"):
				System.out.println("You're in a desert. The temperature is high as drops of sweat roll down your face.");
				break;
			
		}
		
	}
	
}
