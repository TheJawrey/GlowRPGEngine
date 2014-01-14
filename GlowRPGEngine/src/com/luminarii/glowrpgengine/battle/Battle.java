package com.luminarii.glowrpgengine.battle;

import java.util.Scanner;

public class Battle {

	public static int levelUp(String character){
		Scanner scan = new Scanner(System.in);
		System.out.println("Type in 1 for HP, 2 for SP or 3 for AP.");
		switch (scan.nextInt()){
        case 1:  return 1;
        case 2:  return 2;
        case 3:  return 3;
        default: return 0;
		}
	}
}
