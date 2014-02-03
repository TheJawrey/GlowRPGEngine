package com.luminarii.glowrpgengine.battle.heros;

public class Hero {
	public int HP, maxHP, SP, maxSP, attack,  defense, solAptitude, AP, freeAP;
	public String name;
	
	public Hero(int par1, int par2, int par3, int par4, int par5, int par6, int par7, int par8, int par9, String par10){
		HP = par1;
		maxHP = par2;
		SP = par3;
		maxSP = par4;
		attack = par5;
		defense = par6;
		solAptitude = par7;
		AP = par8;
		freeAP = par9;
		name = par10;
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