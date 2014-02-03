package com.luminarii.glowrpgengine.battle.heros;

public class Party {

	Hero hero1;
	Hero hero2;
	Hero hero3;
	Hero hero4;
	Hero hero5;
	Hero hero6;
	
	public void addHero(Hero newHero){
		if(hero1 == null){
		hero1 = newHero;
		return;}
		if(hero2 == null){
		hero1 = newHero;
		return;}
		if(hero3 == null){
		hero1 = newHero;
		return;}
		if(hero4 == null){
		hero1 = newHero;
		return;}
		if(hero5 == null){
		hero1 = newHero;
		return;}
		if(hero6 == null){
		hero1 = newHero;
		return;}
	}
	
	public void setHero(int par1, Hero par2){
		switch(par1){
		case 1: hero1 = par2;
		case 2: hero2 = par2;
		case 3: hero3 = par2;
		case 4: hero4 = par2;
		case 5: hero5 = par2;
		case 6: hero6 = par2;
		}
	}

	public Hero getHero(int par1){
		switch(par1){
			case 1: return hero1;
			case 2: return hero2;
			case 3: return hero3;
			case 4: return hero4;
			case 5: return hero5;
			case 6: return hero6;
			default: return null;
		}
	}
}