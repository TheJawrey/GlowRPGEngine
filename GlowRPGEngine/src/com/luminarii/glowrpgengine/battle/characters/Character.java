package com.luminarii.glowrpgengine.battle.characters;

public class Character {
	String Name = null;
	int HP = 15;
	int SP = 15;
	int AP = 15;
	int XP = 0;
	
	void rewardXP(int rewardedXP){
		XP = XP+rewardedXP;
	}

	void levelUp(){
		if(XP >= 100){
		
		}
	}
}