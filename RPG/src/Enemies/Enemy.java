package Enemies;

public class Enemy {

	String Name;
	
	int hitPoints;
	
	int LVL;
	
	Boolean alive;
	
	int expReward;
	
	Enemy(){
		
		alive = true;
		
	}
	
	private void setHP(int HP) {
		
		hitPoints = HP;
		
	}
	
	private void setLVL(int lvl) {
		
		LVL = lvl;
		
	}
	
	public String getName() {
		
		return Name;
		
	}
	
	public int getHP() {
		
		return hitPoints;
		
	}
	
	public int getLVL() {
		
		return LVL;
		
	}
	
	public void damage(int dmg) {
		
		hitPoints -= dmg;
		
		if (hitPoints <= 0) {
			
			alive = false;
			
		}
		
	}
	
	public Boolean checkStatus() {
		
		return alive;
		
	}
	
	public int determineMove() {
		
		//Determines move of the enemy. Code is different for each enemy. Returns dmg.
		
		return 0;
		
	}
	
}
