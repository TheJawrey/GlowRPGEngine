package com.luminarii.glowrpgengine.battle.characters;

public class Character {
	String name = null;
	int maxHP = 15;
	int maxSP = 15;
	int HP = 0;
	int SP = 0;

	int AP = 6;
	int freeAP = 0;
	
	int XP = 0;
	
	void rewardXP(int rewardedXP){
		XP+=rewardedXP;
	}
}