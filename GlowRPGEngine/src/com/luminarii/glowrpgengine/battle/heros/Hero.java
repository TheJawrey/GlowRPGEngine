package com.luminarii.glowrpgengine.battle.heros;

import com.luminarii.glowrpgengine.battle.Battler;

public class Hero extends Battler {

	public int AP, freeAP, XP;

	public void setAP(int par1){
		AP = par1;
	}
	public void setFreeAP(int par1){
		freeAP = par1;
	}
}
