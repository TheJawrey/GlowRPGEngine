package com.luminarii.glowrpgengine.battle.foes;

public class Foe {
	public int HP, SP, maxHP, maxSP, attack, defense, XP;
	public String name;
	
	public void setHP(int par1){
		HP = par1;
		maxHP = par1;
	}
	public void setSP(int par1){
		SP = par1;
		maxSP = par1;
	}
	public void setAttack(int par1){
		attack = par1;
	}
	public void setDefense(int par1){
		defense = par1;
	}
	public void setName(String par1){
		name = par1;
	}
	
	
	public void lowerHP(int par1){
		HP -= par1;
	}
	public void raiseHP(int par1){
		HP += par1;
	}
	public void lowerSP(int par1){
		SP -= par1;
	}
	public void raiseSP(int par1){
		SP += par1;
	}
	
	
	public void print(){
		System.out.println(name+"'s stats:");
		System.out.println("HP = "+HP);
		System.out.println("SP = "+SP);
		System.out.println("Max HP = "+maxHP);
		System.out.println("Max SP = "+maxSP);
		System.out.println("Attack = "+attack);
		System.out.println("Defense = "+defense);
		System.out.println("XP = "+XP);
	}
}