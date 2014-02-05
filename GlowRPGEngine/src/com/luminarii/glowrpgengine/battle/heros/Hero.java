package com.luminarii.glowrpgengine.battle.heros;

public class Hero {
	public int HP, maxHP, SP, maxSP, attack,  defense, solAptitude, AP, freeAP, XP, level;
	public String name;
	
	//setters
	public void setHP(int par1){
		HP = par1;
	}
	public void setMaxHP(int par1){
		maxHP = par1;
	}
	public void setSP(int par1){
		SP = par1;
	}
	public void setMaxSP(int par1){
		maxSP = par1;
	}
	public void setAttack(int par1){
		attack = par1;
	}
	public void setDefense(int par1){
		defense = par1;
	}
	public void setSolAptitude(int par1){
		solAptitude = par1;
	}
	public void setAP(int par1){
		AP = par1;
	}
	public void setFreeAP(int par1){
		freeAP = par1;
	}
	public void setXP(int par1){
		XP = par1;
	}
	public void setLevel(int par1){
		level = par1;
	}
	public void setName(String par1){
		name = par1;
	}
	//setters
	
	//modifiers
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
	//modifiers
	
	public void print(){
		System.out.println(name+"'s stats:");
		System.out.println("HP = "+HP);
		System.out.println("SP = "+SP);
		System.out.println("Max HP = "+maxHP);
		System.out.println("Max SP = "+maxSP);
		System.out.println("Attack = "+attack);
		System.out.println("Defense = "+defense);
		System.out.println("Sol Aptitude = "+ solAptitude);
		System.out.println("AP = "+AP);
		System.out.println("XP = "+XP);
		System.out.println("Level = "+level+"\n");
	}
}