package com.luminarii.glowrpgengine.graphictest;

import java.applet.*;
import java.awt.Graphics;
import java.util.Scanner;

public class BattleGraphic extends Applet{
	public void paint(Graphics Battle){
		Scanner input = new Scanner(System.in);
		String fmaxhp = "10";
		String fhp = "10";
		String foename = "Slime";
		String maxhp = "10";
		String hpint = "10";
		String heroname = "Flayr";
		String hp = hpint;
		Battle.drawString(heroname, 20, 20);
		Battle.drawString(hp + "/" + maxhp, 20, 31);
		Battle.drawString(foename, 120, 20);
		Battle.drawString(fhp + "/" + fmaxhp, 120, 31);
		Battle.drawString(foename, 130, 40);
		Battle.drawString(fhp + "/" + fmaxhp, 130, 51);
		Battle.drawImage(getImage(getDocumentBase(), "Flayrtest.png"), -13, 44, 100, 100, this);
		Battle.drawImage(getImage(getDocumentBase(), "slime.png"), 90, 35, 100, 100, this);
		Battle.drawImage(getImage(getDocumentBase(), "slime.png"), 100, 55, 100, 100, this);
		String Direction = input.nextLine();
		if(Direction == "north"){
			
		}
		
	}
}
