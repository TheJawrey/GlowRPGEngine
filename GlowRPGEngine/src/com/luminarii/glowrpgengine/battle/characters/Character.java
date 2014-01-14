package com.luminarii.glowrpgengine.battle.characters;

import com.luminarii.glowrpgengine.battle.Battle;

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
		XP = XP+rewardedXP;
	}

	void inBattle(){
		if(XP >= 100){
		XP = XP-100;

		switch (Battle.levelUp(name)){
        	case 1:  maxHP=maxHP+5;
        	case 2:  maxSP=maxSP+5;
        	case 3:  AP=AP+3;
        	default: 
			}
		if(HP<=0){
			//send kill to battle
			}
		}
	}
}