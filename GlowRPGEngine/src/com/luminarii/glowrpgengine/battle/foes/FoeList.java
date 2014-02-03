package com.luminarii.glowrpgengine.battle.foes;

public class FoeList {
        // (HP, maxHP, SP, maxSP, attack,  defense, solAptitude, name)
		public static Foe goblin = new Foe(5, 5, 0, 0, 2, 0, 0, "Goblin");
		public static Foe slime =  new Foe(3, 3, 0, 0, 1, 1, 0, "Slime");
		public static Foe flamePig =  new Foe(1, 1, 0, 1, 0, 0, 5, "Flaming Pig");
		public static Foe orc =  new Foe(4, 4, 3, 3, 1, 1, 1, "Orc");
		public static Foe manEatingBurger =  new Foe(10, 10, 0, 0, 4, 0, 0, "Man-Eating Burger");
		public static Foe spagettiMonster =  new Foe(100, 100, 70, 70, 10, 10, 10, "The Giant Flying Spagetti Monster");
		
		public static Foe[] setA = {goblin, goblin, slime};
		public static Foe[] setB = {flamePig, goblin, orc};
		public static Foe[] setC = {goblin, orc, slime};
		public static Foe[] slimeX4 = {slime, slime, slime, slime};
		public static Foe[] hardSet = {flamePig, flamePig, manEatingBurger};
		public static Foe[] bossSpagettiMonster = {spagettiMonster};
		
		public static Foe missingNo = new Foe(10, 10, 10, 10, 10, 10, 10,"MissingNO");
		public static Foe[] missingList = {missingNo};
		
		//Tesing code below
		public static Foe[] getList(String name){
			switch(name){
			case "setA": return setA;
			case "setB": return setB;
			case "setC": return setC;
			case "slimeX4": return slimeX4;
			case "hardSet": return hardSet;
			case "bossSpagettiMonster": return bossSpagettiMonster;
			default: return missingList;
			}
		}
}
