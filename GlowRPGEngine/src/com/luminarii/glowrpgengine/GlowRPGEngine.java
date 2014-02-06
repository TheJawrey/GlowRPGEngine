package com.luminarii.glowrpgengine;

import javax.swing.JFrame;
import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.heros.*;

public class GlowRPGEngine{
	
	public static void main(String args[]){

		Party party = new Party();
		party.addHero(new HeroWizard());
		party.addHero(new HeroKnight());
		party.addHero(new HeroScout());
		
		JFrame frame = new JFrame("GlowRPGEngine");
		frame.setSize(200,200);
		frame.setContentPane(new Battle(null, party, new GroupSlimes()));
		frame.setVisible(true);
	}
}