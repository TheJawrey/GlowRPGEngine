package com.luminarii.glowrpgengine.battle;

import com.luminarii.glowrpgengine.battle.heros.Hero;
import javax.swing.*;
import java.awt.*;

public class Battle{

	public static JFrame frame;
	
	
	public static Hero[] battle(String[] params, Hero[] party){
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		frame.setTitle("Battle");
		frame.setName("BattleFrame");
	    JLabel label = new JLabel(party[0].name+":\n HP:"+party[0].HP+"");
	    label.setFont(new Font("Serif", Font.PLAIN, 12));
	    frame.add(label);

		
		System.out.print("\nRestarting...\n\n");
		return party;
	}
	
}

