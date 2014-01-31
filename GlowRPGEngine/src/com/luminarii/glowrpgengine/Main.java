package com.luminarii.glowrpgengine;

import java.util.Scanner;
import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.foes.*;

public class Main {

	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		boolean gameOver = false;
		while(gameOver==false){
			
			System.out.println("Choose an option:");
			System.out.println("1. Start batlle with no parameters.");
			System.out.println("2. Start batlle user given foe list.");
			
			switch(scan.nextInt()){
			case 1:
				Battle.battle(null , FoeList.missingList);
				break;
			case 2:
				System.out.println("Enter list name:");
				Battle.battle(null , FoeList.getList(scan.next()));
				break;
			}
		}
		System.out.println("Game Over");
		scan.close();
		System.exit(0);
	}
}
	