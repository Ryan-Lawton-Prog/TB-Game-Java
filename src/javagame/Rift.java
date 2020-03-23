package javagame;

import java.io.*;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Rift extends BasicGameState{
	
	Animation bucky, movingUp1, movingUp2, movingDown1, movingDown2, movingLeft1, movingLeft2, movingRight1, movingRight2;
	Image worldMap;
	Image PortalBlack;
	Image PortalRed;
	Image PortalGreen;
	Image PortalBlue;
	Image mask;
	Music door;
	Music portal;
	boolean quit = false;
	int[] duration = {200,200,200,200};
	int[] stand = {200,200};
	float buckyPositionX = javagame.Player.Rift[0];
	float buckyPositionY = javagame.Player.Rift[1];
	float shiftX = buckyPositionX + javagame.Player.Rift[2];
	float shiftY = buckyPositionY + javagame.Player.Rift[3];
	String looking = "front";

	public Rift(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		try{
    		FileWriter fstream = new FileWriter("out.txt");
	    	BufferedWriter out = new BufferedWriter(fstream);
		    out.write("1");
		    out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		door = new Music("son/Door.ogg");
		portal = new Music("son/Portal.ogg");
		PortalBlack = new Image("res/Map/Black.png");
		worldMap = new Image("res/Map/Rift (Black) (bird).png");
		Image[] walkUp1 = {new Image("res/Sprites/AdvenBack(1).png"), new Image("res/Sprites/AdvenBack(2).png"), new Image("res/Sprites/AdvenBack(3).png"), new Image("res/Sprites/AdvenBack(2).png")};
		Image[] walkDown1 = {new Image("res/Sprites/AdvenFront(1).png"), new Image("res/Sprites/AdvenFront(2).png"), new Image("res/Sprites/AdvenFront(3).png"), new Image("res/Sprites/AdvenFront(2).png")};
		Image[] walkLeft1 = {new Image("res/Sprites/AdvenLeft(1).png"), new Image("res/Sprites/AdvenLeft(2).png"), new Image("res/Sprites/AdvenLeft(3).png"), new Image("res/Sprites/AdvenLeft(2).png")};
		Image[] walkRight1 = {new Image("res/Sprites/AdvenRight(1).png"), new Image("res/Sprites/AdvenRight(2).png"), new Image("res/Sprites/AdvenRight(3).png"), new Image("res/Sprites/AdvenRight(2).png")};
		Image[] walkUp = {new Image("res/Sprites/AdvenBack(2).png"), new Image("res/Sprites/AdvenBack(2).png")};
		Image[] walkDown = {new Image("res/Sprites/AdvenFront(2).png"), new Image("res/Sprites/AdvenFront(2).png")};
		Image[] walkLeft = {new Image("res/Sprites/AdvenLeft(2).png"), new Image("res/Sprites/Advenleft(2).png")};
		Image[] walkRight = {new Image("res/Sprites/AdvenRight(2).png"), new Image("res/Sprites/AdvenRight(2).png")};
		
		movingUp1 = new Animation(walkUp1, duration, true);
		movingDown1 = new Animation(walkDown1, duration, true);
		movingLeft1 = new Animation(walkLeft1, duration, true);
		movingRight1 = new Animation(walkRight1, duration, true);
		movingUp2 = new Animation(walkUp, stand, true);
		movingDown2 = new Animation(walkDown, stand, true);
		movingLeft2 = new Animation(walkLeft, stand, true);
		movingRight2 = new Animation(walkRight, stand, true);
		bucky = movingRight2;
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		worldMap.draw(javagame.Player.Rift[0], javagame.Player.Rift[1]);
		PortalBlack.draw(javagame.Player.Rift[0]+40, javagame.Player.Rift[1]+400);
		bucky.draw(shiftX, shiftY);
		
		if(quit==true){
			mask =  new Image("res/GUI/Mask Menu.png");
			g.drawImage(mask, 0, 0);
			g.drawString("Inventory (I)",250,50);
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit Game (Q)", 250, 200);
			g.drawString("Save Game (B)", 250, 250);
			if(quit==false){
				g.clear();
			}
		}
		g.drawString("Buckys X: " + javagame.Player.Rift[0] + "\nBuckys Y: " + javagame.Player.Rift[1], 400, 20);
	}
	
	private Image Image(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		
		//Up
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W)){
			bucky = movingUp1;
			javagame.Player.Rift[1] += delta * .1f;
			looking = "back";
			//Wall
			if(javagame.Player.Rift[1]>120){
				javagame.Player.Rift[1] -= delta * .1f;
			}
			//House1
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-87 && javagame.Player.Rift[1]>-230){
				javagame.Player.Rift[1] -= delta * .1f;
			}
			//House2
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-248 && javagame.Player.Rift[1]>-390){
				javagame.Player.Rift[1] -= delta * .1f;
			}
			//Alchemist
			if((javagame.Player.Rift[1]>-70 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-120) || (javagame.Player.Rift[1]>-30 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160)){
				javagame.Player.Rift[1] -= delta * .1f;
				//Door - Alchemist
				if(javagame.Player.Rift[0]>-50 && javagame.Player.Rift[0]<-40){
					javagame.Player.room = 4;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(4);
				}
			}
			//BeerHall
			if(javagame.Player.Rift[1]<-168 && javagame.Player.Rift[1]>-390 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[0]<-210){
				javagame.Player.Rift[1] -= delta * .1f;
			}
			//Fountain
 			if((javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-250 && javagame.Player.Rift[1]>-310) ||
			   (javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-170 && javagame.Player.Rift[1]>-230) ||
			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350) ||
			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350)){
				javagame.Player.Rift[1] -= delta * .1f;
			}
 			//Pillars
 			if((javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550)){
 				javagame.Player.Rift[1] -= delta * .1f;
 			}
 			//Blacksmith
 			if((javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[1]>50) ||
 			   (javagame.Player.Rift[0]<-250 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[1]>10) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<30 && javagame.Player.Rift[1]>-30)){
 				javagame.Player.Rift[1] -= delta * .1f;
 			}
		}
		
		//Down
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S)){
			bucky = movingDown1;
			javagame.Player.Rift[1] -= delta * .1f;
			looking = "front";
			//Wall
			if(javagame.Player.Rift[1]<-570){
				javagame.Player.Rift[1] += delta * .1f;
			}
			//House1
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-87 && javagame.Player.Rift[1]>-230){
				javagame.Player.Rift[1] += delta * .1f;
			}
			//House2
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-248 && javagame.Player.Rift[1]>-390){
				javagame.Player.Rift[1] += delta * .1f;
			}
			//Alchemist
			if((javagame.Player.Rift[1]>-70 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-120) || (javagame.Player.Rift[1]>-30 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160)){
				javagame.Player.Rift[1] += delta * .1f;
			}
			//BeerHall
			if(javagame.Player.Rift[1]<-168 && javagame.Player.Rift[1]>-390 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[0]<-210){
				javagame.Player.Rift[1] += delta * .1f;
			}
			//Fountain
 			if((javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-250 && javagame.Player.Rift[1]>-310) ||
			   (javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-170 && javagame.Player.Rift[1]>-230) ||
			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350) ||
			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350)){
				javagame.Player.Rift[1] += delta * .1f;
			}
 			//Pillars
 			if((javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550)){
 				javagame.Player.Rift[1] += delta * .1f;
 			}
 			//Blacksmith
 			if((javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[1]>50) ||
 			   (javagame.Player.Rift[0]<-250 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[1]>10) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<30 && javagame.Player.Rift[1]>-30)){
 				javagame.Player.Rift[1] += delta * .1f;
 			}
		}
		
		//Left
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A)){
			bucky = movingLeft1;
			javagame.Player.Rift[0] += delta * .1f;
			looking = "left";
			//Wall
			if(javagame.Player.Rift[0]>280){
				javagame.Player.Rift[0] -= delta * .1f;
				//Door - Forest
				if(javagame.Player.Rift[1]<0 && javagame.Player.Rift[1]>-80){
					javagame.Player.room = 2;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					javagame.Player.Rift[0] = 280;
					door.play();
					sbg.enterState(2);
				}
			}
			//House1
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-87 && javagame.Player.Rift[1]>-230){
				javagame.Player.Rift[0] -= delta * .1f;
			}
			//House2
			if(javagame.Player.Rift[0]>121 && javagame.Player.Rift[1]<-248 && javagame.Player.Rift[1]>-390){
				javagame.Player.Rift[0] -= delta * .1f;
			}
			//Alchemist
			if((javagame.Player.Rift[1]>-70 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-120) || (javagame.Player.Rift[1]>-30 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160)){
				javagame.Player.Rift[0] -= delta * .1f;
			}
			//BeerHall
			if(javagame.Player.Rift[1]<-168 && javagame.Player.Rift[1]>-390 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[0]<-210){
				javagame.Player.Rift[0] -= delta * .1f;
			}
			//Area3
			if(javagame.Player.Rift[1]>-248 && javagame.Player.Rift[1]<-230 && javagame.Player.Rift[0]>240){
				javagame.Player.Rift[0] -= delta * 1f;
				portal.play();
				sbg.enterState(5);
			}
			//Fountain
 			if((javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-250 && javagame.Player.Rift[1]>-310) ||
			   (javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-170 && javagame.Player.Rift[1]>-230) ||
			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350) ||
			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350)){
				javagame.Player.Rift[0] -= delta * .1f;
			}
 			//Pillars
 			if((javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550)){
 				javagame.Player.Rift[0] -= delta * .1f;
 			}
 			//Blacksmith
 			if((javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[1]>50) ||
 			   (javagame.Player.Rift[0]<-250 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[1]>10) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<30 && javagame.Player.Rift[1]>-30)){
 				javagame.Player.Rift[0] -= delta * .1f;
 			}
		}
		
		//Right
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D)){
			bucky = movingRight1;
			javagame.Player.Rift[0] -= delta * .1f;
			looking = "right";
			//Wall
			if(javagame.Player.Rift[0]<-370){
				javagame.Player.Rift[0] += delta * .1f;
			}
			//Alchemist
			if((javagame.Player.Rift[1]>-70 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-120) || (javagame.Player.Rift[1]>-30 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160)){
				javagame.Player.Rift[0] += delta * .1f;
			}
			//BeerHall
			if(javagame.Player.Rift[1]<-168 && javagame.Player.Rift[1]>-390 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[0]<-210){
				javagame.Player.Rift[0] += delta * .1f;
				//Door - BeerHall
				if(javagame.Player.Rift[1]<-310 && javagame.Player.Rift[1]>-325){
					javagame.Player.room = 3;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(3);
				}
			}
			//Fountain
 			if((javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-250 && javagame.Player.Rift[1]>-310) ||
			   (javagame.Player.Rift[0]<70 && javagame.Player.Rift[0]>-160 && javagame.Player.Rift[1]<-170 && javagame.Player.Rift[1]>-230) ||
			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350) ||
			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-130 && javagame.Player.Rift[1]>-350)){
				javagame.Player.Rift[0] += delta * .1f;
			}
 			//Pillars
 			if((javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-410 && javagame.Player.Rift[1]>-470) ||
 			   (javagame.Player.Rift[0]<270 && javagame.Player.Rift[0]>200 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<190 && javagame.Player.Rift[0]>120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<30 && javagame.Player.Rift[0]>-40 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-50 && javagame.Player.Rift[0]>-120 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-280 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<-490 && javagame.Player.Rift[1]>-550)){
 				javagame.Player.Rift[0] += delta * .1f;
 			}
 			//Blacksmith
 			if((javagame.Player.Rift[0]<-210 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<110 && javagame.Player.Rift[1]>50) ||
 			   (javagame.Player.Rift[0]<-250 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<70 && javagame.Player.Rift[1]>10) ||
 			   (javagame.Player.Rift[0]<-290 && javagame.Player.Rift[0]>-360 && javagame.Player.Rift[1]<30 && javagame.Player.Rift[1]>-30)){
 				javagame.Player.Rift[0] += delta * .1f;
 			}
		}
		
		//Stop Animation
		if(input.isKeyDown(Input.KEY_RIGHT) == false && 
		   input.isKeyDown(Input.KEY_D) == false && 
		   input.isKeyDown(Input.KEY_LEFT) == false && 
		   input.isKeyDown(Input.KEY_A) == false && 
		   input.isKeyDown(Input.KEY_DOWN) == false && 
		   input.isKeyDown(Input.KEY_S) == false && 
		   input.isKeyDown(Input.KEY_UP) == false && 
		   input.isKeyDown(Input.KEY_W) == false ){
			if(looking == "front"){
				bucky = movingDown2;
			}
			
			if(looking == "back"){
				bucky = movingUp2;
			}
			
			if(looking == "left"){
				bucky = movingLeft2;
			}
			
			if(looking == "right"){
				bucky = movingRight2;
			}
		}
		
		//Escape
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			quit = true;
		}
		
		//When menu is Up
		if(quit==true){
			
			//I
			if(input.isKeyDown(Input.KEY_I)){
				sbg.enterState(997);
			}
			
			//R
			if(input.isKeyDown(Input.KEY_R)){
				quit = false;
			}
			
			//M
			if(input.isKeyDown(Input.KEY_M)){
				sbg.enterState(0);
			}
			
			//Q
			if(input.isKeyDown(Input.KEY_Q)){
				System.exit(0);
			}

			//S
			if(input.isKeyDown(Input.KEY_B)){
				if(javagame.Player.save_location == 1){
					javagame.Save.Save1();	
				}else if(javagame.Player.save_location == 2){
					javagame.Save.Save2();	
				}else if(javagame.Player.save_location == 3){
					javagame.Save.Save3();	
				}
			}
			
		}
	}
	
	public int getID(){
		return 1;
	}
	
}
