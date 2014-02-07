package com.luminarii.glowrpgengine;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import com.luminarii.glowrpgengine.battle.heros.*;
import com.luminarii.glowrpgengine.battle.foes.*;
import com.luminarii.glowrpgengine.battle.Battle;

public class Game extends JFrame implements ActionListener{
	Party party = new Party();
	
	JLayeredPane layered = new JLayeredPane();
    JPanel menu = new JPanel();
    
	public Game(){
		super("GlowRPGEngine");
		add(layered);
		layered.setSize(500, 500);
		
		layered.add(menu);
	}

	    public void actionPerformed(ActionEvent e){
	    	
	    }
}