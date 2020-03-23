package javagame;

import java.io.*;
import java.util.Random;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class area_2 extends BasicGameState{
	
	Animation bucky, movingUp1, movingUp2, movingDown1, movingDown2, movingLeft1, movingLeft2, movingRight1, movingRight2;
	Image worldMap;
	Music door;
	boolean quit = false;
	boolean inventory = false;
	int[] duration = {200,200,200,200};
	int[] stand = {200,200};
	float buckyPositionX = javagame.Player.area_2[0];
	float buckyPositionY = javagame.Player.area_2[1];
	float shiftX = buckyPositionX + javagame.Player.area_2[2];
	float shiftY = buckyPositionY + javagame.Player.area_2[3];
	Image mask;
	String looking = "front";
	Random random = new Random();
	int rand_hold = 0;
	float tic = 1000f;

	public area_2(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		door = new Music("son/Door.ogg");
		worldMap = new Image("res/Map/Area2 (Black) (bird).png");
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
		worldMap.draw(javagame.Player.area_2[0], javagame.Player.area_2[1]);
		bucky.draw(shiftX, shiftY);
		
		g.drawString("Buckys X: " + javagame.Player.area_2[0] + "\nBuckys Y: " + javagame.Player.area_2[1] + " ID: " + sbg.getCurrentStateID(), 400, 20);
		
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
		g.drawString("Buckys X: " + javagame.Player.area_2[0] + "\nBuckys Y: " + javagame.Player.area_2[1], 400, 20);
		
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
		
		//enemy Encounter
		if(javagame.Player.footstep <= 0){
			javagame.Player.in_battle = true;
			javagame.Random_Enemy.enemy_stats(2);
			javagame.Player.footstep = showRandomInteger(25, 100, random);
			sbg.enterState(999);
		}
		
		//Up
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W)){
			bucky = movingUp1;
			javagame.Player.area_2[1] += delta * .1f;
			looking = "back";
			tic -= delta * 10f;
			if(tic < 0){
				tic = 1000f;
				javagame.Player.footstep -= 1;
			}
			//Wall
			if(javagame.Player.area_2[1]>130){
				javagame.Player.area_2[1] -= delta * .1f;
				if(javagame.Player.area_2[0]<80 && javagame.Player.area_2[0]>70){
					javagame.Player.room = 8;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(8);
				}
			}
			//Tree
			if((javagame.Player.area_2[0]>80 && javagame.Player.area_2[0]<230 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10) ||
			   (javagame.Player.area_2[0]>120 && javagame.Player.area_2[0]<190 && javagame.Player.area_2[1]>-110 && javagame.Player.area_2[1]<30)){
				javagame.Player.area_2[1] -= delta * .1f;
			}
			//Wood1
			if(javagame.Player.area_2[0]>-40 && javagame.Player.area_2[0]<30 && javagame.Player.area_2[1]>50 && javagame.Player.area_2[1]<110){
				javagame.Player.area_2[1] -= delta * .1f;
			}
			//Wood2
			if(javagame.Player.area_2[0]>-80 && javagame.Player.area_2[0]<-10 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10){
				javagame.Player.area_2[1] -= delta * .1f;
			}
		}
		
		//Down
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S)){
			bucky = movingDown1;
			javagame.Player.area_2[1] -= delta * .1f;
			looking = "front";
			tic -= delta * 10f;
			if(tic < 0){
				tic = 1000f;
				javagame.Player.footstep -= 1;
			}
			//Wall
			if(javagame.Player.area_2[1]<-128){
				javagame.Player.area_2[1] += delta * .1f;
			}
			//Tree
			if((javagame.Player.area_2[0]>80 && javagame.Player.area_2[0]<230 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10) ||
			   (javagame.Player.area_2[0]>120 && javagame.Player.area_2[0]<190 && javagame.Player.area_2[1]>-110 && javagame.Player.area_2[1]<30)){
				javagame.Player.area_2[1] += delta * .1f;
			}
			//Wood1
			if(javagame.Player.area_2[0]>-40 && javagame.Player.area_2[0]<30 && javagame.Player.area_2[1]>50 && javagame.Player.area_2[1]<110){
				javagame.Player.area_2[1] += delta * .1f;
			}
			//Wood2
			if(javagame.Player.area_2[0]>-80 && javagame.Player.area_2[0]<-10 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10){
				javagame.Player.area_2[1] += delta * .1f;
			}
		}
		
		//Left
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A)){
			bucky = movingLeft1;
			javagame.Player.area_2[0] += delta * .1f;
			looking = "left";
			tic -= delta * 10f;
			if(tic < 0){
				tic = 1000f;
				javagame.Player.footstep -= 1;
			}
			//Wall
			if(javagame.Player.area_2[0]>280){
				javagame.Player.area_2[0] -= delta * .1f;
				if(javagame.Player.area_2[1]<10 && javagame.Player.area_2[1]>-10){
					javagame.Player.room = 7;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(7);
				}
			}
			//Tree
			if((javagame.Player.area_2[0]>80 && javagame.Player.area_2[0]<230 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10) ||
			   (javagame.Player.area_2[0]>120 && javagame.Player.area_2[0]<190 && javagame.Player.area_2[1]>-110 && javagame.Player.area_2[1]<30)){
				javagame.Player.area_2[0] -= delta * .1f;
			}
			//Wood1
			if(javagame.Player.area_2[0]>-40 && javagame.Player.area_2[0]<30 && javagame.Player.area_2[1]>50 && javagame.Player.area_2[1]<110){
				javagame.Player.area_2[0] -= delta * .1f;
			}
			//Wood2
			if(javagame.Player.area_2[0]>-80 && javagame.Player.area_2[0]<-10 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10){
				javagame.Player.area_2[0] -= delta * .1f;
			}
		}
		
		//Right
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D)){
			bucky = movingRight1;
			javagame.Player.area_2[0] -= delta * .1f;
			looking = "right";
			tic -= delta * 10f;
			if(tic < 0){
				tic = 1000f;
				javagame.Player.footstep -= 1;
			}
			//Wall
			if(javagame.Player.area_2[0]<-130){
				javagame.Player.area_2[0] += delta * .1f;
				//Cave
				if(javagame.Player.area_2[1]<-110 && javagame.Player.area_2[1]>-130){
					javagame.Player.room = 9;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(9);
				}
			}
			//Tree
			if((javagame.Player.area_2[0]>80 && javagame.Player.area_2[0]<230 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10) ||
			   (javagame.Player.area_2[0]>120 && javagame.Player.area_2[0]<190 && javagame.Player.area_2[1]>-110 && javagame.Player.area_2[1]<30)){
				javagame.Player.area_2[0] += delta * .1f;
			}
			//Wood1
			if(javagame.Player.area_2[0]>-40 && javagame.Player.area_2[0]<30 && javagame.Player.area_2[1]>50 && javagame.Player.area_2[1]<110){
				javagame.Player.area_2[0] += delta * .1f;
			}
			//Wood2
			if(javagame.Player.area_2[0]>-80 && javagame.Player.area_2[0]<-10 && javagame.Player.area_2[1]>-70 && javagame.Player.area_2[1]<-10){
				javagame.Player.area_2[0] += delta * .1f;
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
	
	private static int showRandomInteger(int aStart, int aEnd, Random aRandom){
	    if ( aStart > aEnd ) {
	      throw new IllegalArgumentException("Start cannot exceed End.");
	    }
	    //get the range, casting to long to avoid overflow problems
	    long range = (long)aEnd - (long)aStart + 1;
	    // compute a fraction of the range, 0 <= frac < range
	    long fraction = (long)(range * aRandom.nextDouble());
	    int randomNumber =  (int)(fraction + aStart);    
	    return (randomNumber);
    }
	
	public int getID(){
		return 6;
	}
	
}
