package com.luminarii.glowrpgengine.battle.foes;

public class Foe {
	public int HP, maxHP, SP, maxSP, attack,  defense, solAptitude;
	public String name;
	
	public Foe(int par1, int par2, int par3, int par4, int par5, int par6, int par7, String par8){
		HP = par1;
		maxHP = par2;
		SP = par3;
		maxSP = par4;
		attack = par5;
		defense = par6;
		solAptitude = par7;
		name = par8;
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
	}
}