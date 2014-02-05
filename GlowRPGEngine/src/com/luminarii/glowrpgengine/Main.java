package com.luminarii.glowrpgengine;

import java.util.Scanner;
import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.heros.*;

public class Main {

	public static void main(String args[]){
		
		Party party = new Party();
		party.addHero(new HeroWizard());
		party.addHero(new HeroKnight());
		party.addHero(new HeroScout());
		
		Scanner scan = new Scanner(System.in);
		boolean gameOver = false;
		while(gameOver==false){
			
			System.out.println("Choose an option:");
			System.out.println("1. Start battle with slimes");
			
			switch(scan.nextInt()){
			case 1:
				Battle.battle(null, party, new GroupSlimes());
				break;
			}
		}
		System.out.println("Game Over");
		scan.close();
		System.exit(0);
	}
}
	