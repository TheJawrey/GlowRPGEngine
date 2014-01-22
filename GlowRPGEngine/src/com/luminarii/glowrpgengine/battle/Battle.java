package com.luminarii.glowrpgengine.battle;

import com.luminarii.glowrpgengine.battle.foes.*;

public class Battle {

	public static boolean battle(String[] params){
		System.out.println(params[0]+" and "+params[1]+" are here!");
		FoeSlime enemy1 = new FoeSlime();
		FoeZombie enemy2 = new FoeZombie();
		
		enemy1.lowerHP(1);
		enemy2.raiseSP(1);
		enemy1.print();
		enemy2.print();
		
		System.out.print("\nRestarting...\n\n");
		return false;
	}
	
}