package com.luminarii.glowrpgengine.battle;

import java.awt.Label;

import javax.swing.JPanel;

import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.heros.*;

public class Battle extends JPanel{
	
	public Battle(String field, Party party, Group group){
		
		//Hero initialization
		boolean hero1Alive = true, hero2Alive = true, hero3Alive = true;
		Hero hero1, hero2, hero3;
		
		hero1 = party.getHero(1);
		hero2 = party.getHero(2);
		hero3 = party.getHero(3);
		
		if(hero1.HP <= 0){hero1Alive = false;}
		if(hero2.HP <= 0){hero2Alive = false;}
		if(hero3.HP <= 0){hero3Alive = false;}
		//Hero initialization
		
		//Foe initialization
		boolean foe1Alive = true, foe2Alive = true, foe3Alive = true, foe4Alive = true, foe5Alive = true, foe6Alive = true;
		Foe foe1, foe2, foe3, foe4, foe5, foe6;
		
		foe1 = group.getFoe(1);
		foe2 = group.getFoe(2);
		foe3 = group.getFoe(3);
		foe4 = group.getFoe(4);
		foe5 = group.getFoe(5);
		foe6 = group.getFoe(6);
		
		if(foe1 == null){foe1Alive = false;}
		if(foe2 == null){foe2Alive = false;}
		if(foe3 == null){foe3Alive = false;}
		if(foe4 == null){foe4Alive = false;}
		if(foe5 == null){foe5Alive = false;}
		if(foe6 == null){foe6Alive = false;}
		//Foe initialization
	    add(new Label(hero1.name+": "+hero1.HP+"/"+hero1.maxHP));
	    
	    //battle ending code
	    party.setHero(1, hero1);
	    party.setHero(1, hero2);
	    party.setHero(1, hero3);
	}
	
}

