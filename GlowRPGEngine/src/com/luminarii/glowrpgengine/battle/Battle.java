package com.luminarii.glowrpgengine.battle;

import java.util.Arrays;
import java.util.Scanner;

import com.luminarii.glowrpgengine.battle.characters.*;
import com.luminarii.glowrpgengine.battle.foes.Foe;

public class Battle {

	public static boolean battle(String[] params){
		Hero.params[0]();
		System.out.println(Arrays.toString(params));
		return false;
		Foe.Foe(3, 3, 3, 3, 1, 0, "Goblin");
	}
	
}