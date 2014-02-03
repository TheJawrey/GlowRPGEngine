package com.luminarii.glowrpgengine;

import java.util.Scanner;
import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.heros.*;

public class Main {

	public static void main(String args[]){
		
		Party party = new Party();
		party.addHero(new HeroWizard());
		party.addHero(new Hero(100,100,100,100,100,100, 100,100,100,"Ms. Vingsness"));
		party.addHero(new Hero(0,1,1,1,1,1,1,1,1,"George"));
		
		Scanner scan = new Scanner(System.in);
		boolean gameOver = false;
		while(gameOver==false){
			
			System.out.println("Choose an option:");
			System.out.println("1. Start batlle with no parameters.");
			System.out.println("2. Start batlle user given foe list.");
			
			switch(scan.nextInt()){
			case 1:
				Battle.battle(null , FoeList.missingList, party);
				break;
			case 2:
				System.out.println("Enter list name:");
				Battle.battle(null , FoeList.getList(scan.next()), party);
				break;
			}
		}
		System.out.println("Game Over");
		scan.close();
		System.exit(0);
	}
}
	