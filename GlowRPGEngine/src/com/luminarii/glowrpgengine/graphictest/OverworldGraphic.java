package com.luminarii.glowrpgengine.graphictest;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;

public class OverworldGraphic extends Applet{
	public void paint(Graphics Battle){
		boolean game = true;
		Scanner input = new Scanner(System.in);
		int x = 50;
		int y = 50;
		int x0 = 50;
		int y0 = 50;
		while(game == true){
			System.out.println(x);
			System.out.println(y);
			System.out.println(game);
			Battle.clearRect(x0, y0, 100, 100);
			Battle.drawImage(getImage(getDocumentBase(), "Flayrtest.png"), x, y, 100, 100, this);
			int Direction = input.nextInt();
			if(Direction == 1){
				y =  y + 10;
				System.out.println("sucess");
			}
			if(Direction == 2){
				y = y - 10;
			}
			if(Direction == 3){
				x = x - 10;
			}
			if(Direction == 4){
				x = x + 10;
			}
			if(Direction == 0){
				game = false;
			}
			y0 = y;
			x0 = x;
			System.out.println(Direction);
		}
	}
}
