package javagame;

import java.awt.Color;
import java.awt.Font;
import java.io.*;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.*;

public class ChangeLog extends BasicGameState{

	public String mouse = "No input yet!";
	private UnicodeFont l,n;
	Image play;
	boolean pause = false;
	float n1 = 360;
	float n2 = 390;
	float n3 = 440;
	float n4 = 470;
	float n5 = 520;
	float n6 = 550;
	float n7 = 580;
	float n8 = 610;
	float n9 = 660;
	float n10 = 690;
	float n11 = 740;
	float n12 = 770;
	float n13 = 800;
	float n14 = 830;
	float n15 = 880;
	float n16 = 910;
	float tic = 0;
	float lock = 20;
	Music credits;
	boolean fun = false;
	
	public ChangeLog(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		credits = new Music("son/MachineOne.ogg");
		play = new Image("res/GUI/play.png");
		Font font = new Font("Verdana", Font.PLAIN, 20);
		l = new UnicodeFont(font, 20, false, false);
		l.getEffects().add(new ColorEffect(Color.WHITE));
		l.addAsciiGlyphs();
		l.loadGlyphs();
		n = new UnicodeFont(font, 50, false, false);
		n.getEffects().add(new ColorEffect(Color.RED));
		n.addAsciiGlyphs();
		n.loadGlyphs();
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString("© Tie Gaming Studios", 0, 340);
		g.drawString("Menu", 600, 340);
		l.drawString(240, n1, "Project Manager:");
		g.drawString("Ryan lawton", 240, n2);
		l.drawString(240, n3, "Lead Programmer:");
		g.drawString("Ryan Lawton", 240, n4);
		l.drawString(240, n5, "Art Designers:");
		g.drawString("Chelsea House", 240, n6);
		g.drawString("Jamie Bruce", 240, n7);
		g.drawString("Ryan Lawton", 240, n8);
		l.drawString(240, n9, "Story Board Designer:");
		g.drawString("Ryan lawton", 240, n10);
		l.drawString(240, n11, "Music and Sounds:");
		g.drawString("Christopher Cheetham", 240, n12);
		g.drawString("Matt McFarland: www.mattmcfarland.com",240,n13);
		g.drawString("Ryan Lawton", 240, n14);
		l.drawString(240, n15, "Producer:");
		g.drawString("Ryan Lawton", 240, n16);
		if(pause){
			n.drawString(80, 140, "=");
		}
		if(pause == false && lock < 20 && lock > -20){
			play.draw(80,160);
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		
		if(fun == false){
			fun = true;
			credits.loop();
		}
		
		if(posX>600 && posY<20){
			if(Mouse.isButtonDown(0) && lock < 0){
				n1 = 360;
				n2 = 390;
				n3 = 440;
				n4 = 470;
				n5 = 520;
				n6 = 550;
				n7 = 580;
				n8 = 610;
				n9 = 660;
				n10 = 690;
				n11 = 740;
				n12 = 770;
				n13 = 800;
			    n14 = 830;
				n15 = 880;
				n16 = 910;
				lock = 20;
				tic = 0;
				fun = false;
				credits.stop();
			    sbg.enterState(0);
			}
		}
		
		if((posX>600 && posY<20) == false && Mouse.isButtonDown(0)){
			if(lock < 0 && pause == false){
				lock = 20;
				pause = true;
			}
			if(lock < 0 && pause){
				lock = 20;
				pause = false;
			}
		}
		
		if(pause == false){
		n1 -= delta * .05f;
		n2 -= delta * .05f;
		n3 -= delta * .05f;
		n4 -= delta * .05f;
		n5 -= delta * .05f;
		n6 -= delta * .05f;
		n7 -= delta * .05f;
		n8 -= delta * .05f;
		n9 -= delta * .05f;
		n10 -= delta * .05f;
		n11 -= delta * .05f;
		n12 -= delta * .05f;
		n13 -= delta * .05f;
		n14 -= delta * .05f;
		n15 -= delta * .05f;
		n16 -= delta * .05f;
		tic -= delta * .05f;
		if(tic < -1000){
			tic = 0;
			n1 = 360;
			n2 = 390;
			n3 = 440;
			n4 = 470;
			n5 = 520;
			n6 = 550;
			n7 = 580;
			n8 = 610;
			n9 = 660;
			n10 = 690;
			n11 = 740;
			n12 = 770;
			n13 = 800;
		    n14 = 830;
			n15 = 880;
			n16 = 910;
		}
		}
		lock -= delta * .1f;
		
	}
	
	public int getID(){
		return 1000;
	}
	
}
