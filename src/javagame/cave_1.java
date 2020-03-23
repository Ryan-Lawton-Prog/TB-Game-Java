package javagame;

import java.io.*;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class cave_1 extends BasicGameState implements java.io.Serializable{
	
	Animation bucky, movingUp1, movingUp2, movingDown1, movingDown2, movingLeft1, movingLeft2, movingRight1, movingRight2;
	Image worldMap;
	Image ghost;
	Music door;
	Image Igem1;
	Image Igem2;
	Image Igem3;
	Image Igem4;
	Image Igem5;
	boolean quit = false;
	boolean inventory = false;
	boolean gem5 = true;
	boolean gem4 = true;
	boolean gem3 = true;
	boolean gem2 = true;
	boolean gem1 = true;
	int[] duration = {200,200,200,200};
	int[] stand = {200,200};
	float buckyPositionX = javagame.Player.cave_1[0];
	float buckyPositionY = javagame.Player.cave_1[1];
	float shiftX = buckyPositionX + javagame.Player.cave_1[2];
	float shiftY = buckyPositionY + javagame.Player.cave_1[3];
	Image mask;
	String looking = "front";

	public cave_1(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		door = new Music("son/Door.ogg");
		worldMap = new Image("res/Map/Cave1 (Black) (bird).png");
		ghost = new Image("res/Sprites/GhostFront(2).png");
		Igem1 = new Image("res/Map/Ocean_Gem.png");
		Igem2 = new Image("res/Map/Ocean_Gem.png");
		Igem3 = new Image("res/Map/Ocean_Gem.png");
		Igem4 = new Image("res/Map/Ocean_Gem.png");
		Igem5 = new Image("res/Map/Ocean_Gem.png");
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
		bucky = movingDown2;
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		worldMap.draw(javagame.Player.cave_1[0], javagame.Player.cave_1[1]);
		bucky.draw(shiftX, shiftY);
		
		g.drawString("Buckys X: " + javagame.Player.cave_1[0] + "\nBuckys Y: " + javagame.Player.cave_1[1] + " ID: " + sbg.getCurrentStateID(), 400, 20);
		
		if(javagame.Player.boss_1){
			if(gem1){
				Igem1.draw(javagame.Player.cave_1[0]+320,javagame.Player.cave_1[1]+400);
			}
			if(gem2){
				Igem2.draw(javagame.Player.cave_1[0]+440,javagame.Player.cave_1[1]+320);
			}
			if(gem3){
				Igem3.draw(javagame.Player.cave_1[0]+80,javagame.Player.cave_1[1]+280);
			}
			if(gem4){
				Igem4.draw(javagame.Player.cave_1[0]+240,javagame.Player.cave_1[1]+40);
			}
			if(gem5){
				Igem5.draw(javagame.Player.cave_1[0]+480,javagame.Player.cave_1[1]+80);
			}
		}
		
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
		
		if(javagame.Player.boss_1 == false){
			ghost.draw(javagame.Player.cave_1[0]+280,javagame.Player.cave_1[1]+80);
		}
		
		g.drawString("Buckys X: " + javagame.Player.cave_1[0] + "\nBuckys Y: " + javagame.Player.cave_1[1], 400, 20);
		
		if(inventory==true){
			mask =  new Image("res/GUI/Mask Menu.png");
			g.drawImage(mask, 0, 0);
			if(inventory==false){
				g.clear();
			}
		}
	}
	
	private Image Image(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		Input input = gc.getInput();
		
		//Ocean Gems
		if(javagame.Player.cave_1[0]<30 && javagame.Player.cave_1[1]<-220 && javagame.Player.ocean_gem < 5 && gem1){
			gem1 = false;
			javagame.Player.ocean_gem += 1;
		}
		if(javagame.Player.cave_1[0]<-90 && javagame.Player.cave_1[0]>-160 && javagame.Player.cave_1[1]<-140 && javagame.Player.cave_1[1]>-200 && javagame.Player.ocean_gem < 5 && gem2){
			gem2 = false;
			javagame.Player.ocean_gem += 1;
		}
		if(javagame.Player.cave_1[0]<270 && javagame.Player.cave_1[0]>200 && javagame.Player.cave_1[1]<-100 && javagame.Player.cave_1[1]>-160 && javagame.Player.ocean_gem < 5 && gem3){
			gem3 = false;
			javagame.Player.ocean_gem += 1;
		}
		if(javagame.Player.cave_1[0]>40 && javagame.Player.cave_1[1]>80 && javagame.Player.ocean_gem < 5 && gem4){
			gem4 = false;
			javagame.Player.ocean_gem += 1;
		}
		if(javagame.Player.cave_1[0]<-130 && javagame.Player.cave_1[1]>40 && javagame.Player.ocean_gem < 5 && gem5){
			gem5 = false;
			javagame.Player.ocean_gem += 1;
		}
		
		//Up
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W)){
			bucky = movingUp1;
			javagame.Player.cave_1[1] += delta * .1f;
			looking = "back";
			//Wall
			if(javagame.Player.cave_1[1]>130){
				javagame.Player.cave_1[1] -= delta * .1f;
			}
			//Stairs
			if(((javagame.Player.cave_1[0]>120 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]>160 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]>200 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))
				||
			   ((javagame.Player.cave_1[0]<-50 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]<-90 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]<-130 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))){
				javagame.Player.cave_1[1] -= delta * .1f;
			}
			//Wall(Top Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]>90)){
			   javagame.Player.cave_1[1] -= delta * .1f;
			}
			//Cliff
			if((javagame.Player.cave_1[0]<190 && javagame.Player.cave_1[0]>-120 && javagame.Player.cave_1[1]<70 && javagame.Player.cave_1[1]>10) ||
			  (javagame.Player.cave_1[0]<150 && javagame.Player.cave_1[0]>-80 && javagame.Player.cave_1[1]<30 && javagame.Player.cave_1[1]>-30) ||
			  (javagame.Player.cave_1[0]<110 && javagame.Player.cave_1[0]>-40 && javagame.Player.cave_1[1]<-10 && javagame.Player.cave_1[1]>-70) ||
			  (javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[1]<-50 && javagame.Player.cave_1[1]>-110)){
			  javagame.Player.cave_1[1] -= delta * .1f;
			}
		}
		
		//Down
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S)){
			bucky = movingDown1;
			javagame.Player.cave_1[1] -= delta * .1f;
			looking = "front";
			//Wall
			if(javagame.Player.cave_1[1]<-248){
				javagame.Player.cave_1[1] += delta * .1f;
				if(javagame.Player.cave_1[0]<40 && javagame.Player.cave_1[0]>30){
					javagame.Player.room = 6;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					gem1 = true;
					gem2 = true;
					gem3 = true;
					gem4 = true;
					gem5 = true;
					sbg.enterState(6);
				}
			}
			//Wall(Bottom Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]<-170) ||
			   (javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]<-170)){
				javagame.Player.cave_1[1] += delta * .1f;
			}
			//Stairs
			if(((javagame.Player.cave_1[0]>120 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]>160 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]>200 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))
				||
			   ((javagame.Player.cave_1[0]<-50 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]<-90 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]<-130 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))){
				javagame.Player.cave_1[1] += delta * .1f;
			}
			//Cliff
			if((javagame.Player.cave_1[0]<190 && javagame.Player.cave_1[0]>-120 && javagame.Player.cave_1[1]<70 && javagame.Player.cave_1[1]>10) ||
			  (javagame.Player.cave_1[0]<150 && javagame.Player.cave_1[0]>-80 && javagame.Player.cave_1[1]<30 && javagame.Player.cave_1[1]>-30) ||
			  (javagame.Player.cave_1[0]<110 && javagame.Player.cave_1[0]>-40 && javagame.Player.cave_1[1]<-10 && javagame.Player.cave_1[1]>-70) ||
			  (javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[1]<-50 && javagame.Player.cave_1[1]>-110)){
			  javagame.Player.cave_1[1] += delta * .1f;
			}
		}
		
		//Left
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A)){
			bucky = movingLeft1;
			javagame.Player.cave_1[0] += delta * .1f;
			looking = "left";
			//Wall
			if(javagame.Player.cave_1[0]>280){
				javagame.Player.cave_1[0] -= delta * .1f;
			}
			//Wall(Bottom Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]<-170) ||
			   (javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]<-170)){
				javagame.Player.cave_1[0] -= delta * .1f;
			}
			//Stairs
			if(((javagame.Player.cave_1[0]>120 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]>160 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]>200 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))
				||
			   ((javagame.Player.cave_1[0]<-50 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]<-90 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]<-130 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))){
				javagame.Player.cave_1[0] -= delta * .1f;
			}
			//Wall(Top Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]>90)){
			   javagame.Player.cave_1[0] -= delta * .1f;
			}
			//Cliff
			if((javagame.Player.cave_1[0]<190 && javagame.Player.cave_1[0]>-120 && javagame.Player.cave_1[1]<70 && javagame.Player.cave_1[1]>10) ||
			  (javagame.Player.cave_1[0]<150 && javagame.Player.cave_1[0]>-80 && javagame.Player.cave_1[1]<30 && javagame.Player.cave_1[1]>-30) ||
			  (javagame.Player.cave_1[0]<110 && javagame.Player.cave_1[0]>-40 && javagame.Player.cave_1[1]<-10 && javagame.Player.cave_1[1]>-70) ||
			  (javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[1]<-50 && javagame.Player.cave_1[1]>-110)){
			  javagame.Player.cave_1[0] -= delta * .1f;
			}
			//Boss
			if(javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[1]>70 && javagame.Player.cave_1[1]<90 && javagame.Player.boss_1 == false){
				javagame.Random_Enemy.enemy_stats(4);
				javagame.Player.boss_1 = true;
				javagame.Player.in_battle = true;
				sbg.enterState(999);
				javagame.Player.boss_1 = true;
			}
		}
		
		//Right
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D)){
			bucky = movingRight1;
			javagame.Player.cave_1[0] -= delta * .1f;
			looking = "right";
			//Wall
			if(javagame.Player.cave_1[0]<-210){
				javagame.Player.cave_1[0] += delta * .1f;
			}
			//Wall(Bottom Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]<-210) ||
			   (javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]<-170) ||
			   (javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]<-170)){
				javagame.Player.cave_1[0] += delta * .1f;
			}
			//Stairs
			if(((javagame.Player.cave_1[0]>120 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]>160 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]>200 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]>240 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))
				||
			   ((javagame.Player.cave_1[0]<-50 && javagame.Player.cave_1[1]>-110 && javagame.Player.cave_1[1]<-50) ||
				(javagame.Player.cave_1[0]<-90 && javagame.Player.cave_1[1]>-70 && javagame.Player.cave_1[1]<-10) ||
				(javagame.Player.cave_1[0]<-130 && javagame.Player.cave_1[1]>-30 && javagame.Player.cave_1[1]<30) ||
				(javagame.Player.cave_1[0]<-170 && javagame.Player.cave_1[1]>10 && javagame.Player.cave_1[1]<110))){
				javagame.Player.cave_1[0] += delta * .1f;
			}
			//Wall(Top Left And Right)
			if((javagame.Player.cave_1[0]>80 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[1]>90) ||
			   (javagame.Player.cave_1[0]<-10 && javagame.Player.cave_1[1]>90)){
			   javagame.Player.cave_1[0] += delta * .1f;
			}
			//Cliff
			if((javagame.Player.cave_1[0]<190 && javagame.Player.cave_1[0]>-120 && javagame.Player.cave_1[1]<70 && javagame.Player.cave_1[1]>10) ||
			  (javagame.Player.cave_1[0]<150 && javagame.Player.cave_1[0]>-80 && javagame.Player.cave_1[1]<30 && javagame.Player.cave_1[1]>-30) ||
			  (javagame.Player.cave_1[0]<110 && javagame.Player.cave_1[0]>-40 && javagame.Player.cave_1[1]<-10 && javagame.Player.cave_1[1]>-70) ||
			  (javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[1]<-50 && javagame.Player.cave_1[1]>-110)){
			  javagame.Player.cave_1[0] += delta * .1f;
			}
			//Boss
			if(javagame.Player.cave_1[0]>0 && javagame.Player.cave_1[0]<70 && javagame.Player.cave_1[1]>70 && javagame.Player.cave_1[1]<90 && javagame.Player.boss_1 == false){
				javagame.Random_Enemy.enemy_stats(4);
				javagame.Player.boss_1 = true;
				javagame.Player.in_battle = true;
				sbg.enterState(999);
				javagame.Player.boss_1 = true;
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
		return 9;
	}
	
}
