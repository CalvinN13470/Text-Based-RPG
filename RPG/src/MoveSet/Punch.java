package MoveSet;

public class Punch extends Move {
	
	Punch(){
		
		BASE_DMG = 3;
		
	}
	
	public int CommitMove() {
		
		return BASE_DMG;
		
	}
	
	public String getMoveName() {
		
		return "punch";
		
	}
	
}
