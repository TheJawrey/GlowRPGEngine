package com.luminarii.glowrpgengine;

import java.util.Scanner;
import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.heros.*;

public class Main {

	public static void main(String args[]){
		Hero[] party = new Hero[3];
		
		party[0] = new HeroMage();
		party[1] = new HeroWarrior();
		party[2] = new HeroTheif();
		
		String[] voidArray = new String[5];
		
		Scanner scan = new Scanner(System.in);
		boolean gameOver = false;
		while(gameOver==false){
			
			System.out.println("Choose an option:");
			System.out.println("1. Start batlle with blank parameters.");
			System.out.println("2. Start battle with set parameters.");
			
			switch(scan.nextInt()){
			case 1:
				Battle.battle(voidArray, party);
				break;
				
			case 2:
				System.out.println("Enter number of enemies:");
				int i = scan.nextInt();
				String[] battleParameters = new String[i+4];
				for(int x=0; x<3; x++){
					System.out.println("Enter character "+(x+1)+":");
					battleParameters[x] = scan.next();
				}
				System.out.println("Enter location:");
				battleParameters[3] = scan.next();
			
				for(int x=0; x<i; x++){
					System.out.println("Enter enemy "+(x+1)+":");
					battleParameters[4+x] = scan.next();
				}
				party = Battle.battle(battleParameters, party);
				break;
			}
		}
		System.out.println("Game Over");
		scan.close();
		System.exit(0);
	}
}
	