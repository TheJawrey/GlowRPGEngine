package com.luminarii.glowrpgengine;

import java.util.Scanner;

import com.luminarii.glowrpgengine.battle.Battle;

public class Main {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of enemies:");
		int i = scan.nextInt();
		String[] battleParameters = new String[i+4];
		for(int x=0; x<3; x++){
			System.out.println("Enter character "+(x+1)+":");
			battleParameters[x] = scan.next();
		}
		System.out.println("Enter location:");
		battleParameters[4] = scan.next();
		
		for(int x=0; x<i; x++){
			System.out.println("Enter enemy "+(x+1)+":");
			battleParameters[x] = scan.next();
		}
		Battle.battle(battleParameters);
	}
}