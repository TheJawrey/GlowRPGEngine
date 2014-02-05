package com.luminarii.glowrpgengine.battle.foes;

public class Group {

	Foe Foe1;
	Foe Foe2;
	Foe Foe3;
	Foe Foe4;
	Foe Foe5;
	Foe Foe6;
	
	public Group(Foe par1, Foe par2, Foe par3, Foe par4, Foe par5, Foe par6){
		Foe1 = par1;
		Foe2 = par2;
		Foe3 = par3;
		Foe4 = par4;
		Foe5 = par5;
		Foe6 = par6;
	}

	public Foe getFoe(int par1){
		switch(par1){
			case 1: return Foe1;
			case 2: return Foe2;
			case 3: return Foe3;
			case 4: return Foe4;
			case 5: return Foe5;
			case 6: return Foe6;
			default: return null;
		}
	}
}