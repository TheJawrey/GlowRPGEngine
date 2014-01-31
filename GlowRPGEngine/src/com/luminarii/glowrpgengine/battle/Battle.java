package com.luminarii.glowrpgengine.battle;

import com.luminarii.glowrpgengine.battle.foes.Foe;
import com.luminarii.glowrpgengine.battle.foes.FoeList;

import javax.swing.*;

import java.awt.*;

public class Battle{

	public static JFrame frame;
	
	
	public static void battle(String field, Foe[] foeSet){
		
		/*frame = new JFrame();
		frame.setSize(300, 300);
		frame.setVisible(false);
		frame.setTitle("Battle");
		frame.setName("BattleFrame");
	    JLabel label = new JLabel("Hello");
	    label.setFont(new Font("Serif", Font.PLAIN, 12));
	    frame.add(label);*/
		
	    boolean foe1Alive = true, foe2Alive = true, foe3Alive = true, foe4Alive = true, foe5Alive = true, foe6Alive = true; 
	    Foe foe1, foe2, foe3, foe4, foe5, foe6;
	    
	    if(foeSet.length >0){
	    	foe1 = new Foe(foeSet[0].HP, foeSet[0].maxHP, foeSet[0].SP, foeSet[0].maxSP, foeSet[0].attack, foeSet[0].defense, foeSet[0].solAptitude, foeSet[0].name);
	    }else{foe1 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe1Alive = false;}
	    
	    if(foeSet.length >1){
	    	foe2 = new Foe(foeSet[1].HP, foeSet[1].maxHP, foeSet[1].SP, foeSet[1].maxSP, foeSet[1].attack, foeSet[1].defense, foeSet[1].solAptitude, foeSet[1].name);
	    }else{foe2 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe2Alive = false;}
	    
	    if(foeSet.length >2){
	    	foe3 = new Foe(foeSet[2].HP, foeSet[2].maxHP, foeSet[2].SP, foeSet[2].maxSP, foeSet[2].attack, foeSet[2].defense, foeSet[2].solAptitude, foeSet[2].name);
	    }else{foe3 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe3Alive = false;}

	    if(foeSet.length >3){
	    	foe4 = new Foe(foeSet[3].HP, foeSet[3].maxHP, foeSet[3].SP, foeSet[3].maxSP, foeSet[3].attack, foeSet[3].defense, foeSet[3].solAptitude, foeSet[3].name);
	    }else{foe4 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe4Alive = false;}
	    
	    if(foeSet.length >4){
	    	foe5 = new Foe(foeSet[4].HP, foeSet[4].maxHP, foeSet[4].SP, foeSet[4].maxSP, foeSet[4].attack, foeSet[4].defense, foeSet[4].solAptitude, foeSet[4].name);
	    }else{foe5 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe5Alive = false;}
	    
	    if(foeSet.length >5){
	    	foe6 = new Foe(foeSet[5].HP, foeSet[5].maxHP, foeSet[5].SP, foeSet[5].maxSP, foeSet[5].attack, foeSet[5].defense, foeSet[5].solAptitude, foeSet[5].name);
	    }else{foe6 = new Foe(FoeList.missingNo.HP, FoeList.missingNo.maxHP, FoeList.missingNo.SP, FoeList.missingNo.maxSP, FoeList.missingNo.attack, FoeList.missingNo.defense, FoeList.missingNo.solAptitude, FoeList.missingNo.name); foe6Alive = false;}

	    if(foe1Alive == true) {foe1.print();}
	    if(foe2Alive == true) {foe2.print();}
	    if(foe3Alive == true) {foe3.print();}
	    if(foe4Alive == true) {foe4.print();}
	    if(foe5Alive == true) {foe5.print();}
	    if(foe6Alive == true) {foe6.print();}

		System.out.print("\nRestarting...\n\n");
	}
	
}

