
import java.lang.Math.*;

public class Character {
	
	private String Name;
	
	private int LVL;
	
	private int EXP;
	private int expCap;
	private static final double EXP_CAP_MULTIPLIER = 1.5;
	
	private int HP_CAP;
	
	private int HP;
	
	private int STR;
	
	private int DEX;
	
	private int INT;
	
	private int LUK;
	
	private int SPD;
	
	//constructor when new character is made
	Character(String name){
		
		LVL = 1;
		expCap = 20;
		HP_CAP = 20;
		STR = 1;
		DEX = 1;
		INT = 1;
		LUK = 1;
		SPD = 1;
		
		
	}
	
	//constructor when save file is loaded
	
	public String getName() {
		
		return Name;
		
	}
	
	public int getLVL()
	{
		
		return LVL;
		
	}
	
	public int getEXP() {
		
		return EXP;
		
	}
	
	public int get_expCap() {
		
		return expCap;
		
	}
	
	public void LVLUP() {
		
		LVL++;
		System.out.println(Name + " leveled up!");
		
	}
	
	public void expGain (int earnedExp) {
		
		EXP += earnedExp;
		
		if (EXP >= expCap) {
			
			LVLUP();
			EXP = (EXP % expCap);
			expCap = (int)(expCap * EXP_CAP_MULTIPLIER);
			
			
		}
		
		
	}
	
	public void setHP_CAP(int newHP_CAP) {
		
		HP_CAP = newHP_CAP;
		
	}
	
	public void setHP(int newHP) {
		
		HP = newHP;
		
	}
	
	public void changeHP(int change) {
		
		HP += change;
		
	}
	
	public void setSTR(int newSTR) {
		
		STR = newSTR;
		
	}
	
	public void setDEX(int newDEX) {
		
		DEX = newDEX;
		
	}
	
	public void setINT(int newINT) {
		
		INT = newINT;
		
	}
	
	public void setLUK(int newLUK) {
		
		LUK = newLUK;
		
	}
	
	public void setSPD(int newSPD) {
		
		SPD = newSPD;
		
	}
	
	public int getHP_CAP() {
		
		return HP_CAP;
		
	}
	
	public int getHP() {
		
		return HP;
		
	}
	
	public int getSTR() {
		
		return STR;
		
	}
	
	public int getDEX() {
		
		return DEX;
		
	}
	
	public int getINT() {
		
		return INT;
		
	}
	
	public int getLUK() {
		
		return LUK;
		
	}
	
	public int getSPD() {
		
		return SPD;
		
	}
	
	//changes certain qualities according to character stats
	public void ModifyWithStats() {
		
		HP_CAP = 20 + (STR * 2);
		
	}
	
	public void printStats() {
		
		System.out.println("STR: " + STR);
		System.out.println("DEX: " + DEX);
		System.out.println("INT: " + INT);
		System.out.println("LUK: " + LUK);
		System.out.println("SPD: " + SPD);
		
	}
	
	
}
