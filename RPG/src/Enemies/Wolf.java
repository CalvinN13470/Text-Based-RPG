package Enemies;

import java.util.*;

public class Wolf extends Enemy {
	
	final int BASE_HP = 20;
	
	final int HP_MULTIPLIER = 1;
	
	final int BASE_EXP_REWARD = 10;
	
	final int EXP_MULTIPLIER = 1;
	
	Random random;
	
	Wolf(int level){
		
		random = new Random();
		
		Name = "Wolf";
		
		LVL = level;
		
		//determines HP
		hitPoints = BASE_HP + (HP_MULTIPLIER * LVL);
		
		//determines EXP
		expReward = BASE_EXP_REWARD + (EXP_MULTIPLIER * LVL);
		
	}
	
	public int determineMove() {
		
		int moveNum = random.nextInt(2);
		
		switch(moveNum) {
		
			case(1):
				
				return Bite();
				
			case(2):
				
				return Claw();
					
		}
		
		return 0;
		
	}
	
	//Attacks
	
	private int Bite()
	{
		int Bite_Base = 3;
		
		return (Bite_Base + LVL);
	}
	
	private int Claw()
	{
		int Bite_Base = 1;
		
		return (Bite_Base + LVL);
	}
	
}
