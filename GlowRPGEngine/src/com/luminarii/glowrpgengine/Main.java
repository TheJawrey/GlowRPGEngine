package com.luminarii.glowrpgengine;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.luminarii.glowrpgengine.battle.Battle;
import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.heros.*;

public class Main{

	public static void main(String args[]){
		
		Party party = new Party();
		party.addHero(new HeroWizard());
		party.addHero(new HeroKnight());
		party.addHero(new HeroScout());
		
		JFrame frame = new JFrame("FrameDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GlowRPGEngine");
//frame events
		Label label = new Label("Select Enemy Group:");
		JButton slimes = new JButton("Slimes x4");
		frame.add(label);
		frame.add(slimes);
//frame events		
		frame.pack();
		frame.setVisible(true);
		

		Battle.battle(null, party, new GroupSlimes());
	}
}
	