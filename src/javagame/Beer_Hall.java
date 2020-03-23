package javagame;

import java.io.*;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Beer_Hall extends BasicGameState{
	
	Animation bucky, movingUp1, movingUp2, movingDown1, movingDown2, movingLeft1, movingLeft2, movingRight1, movingRight2;
	Image worldMap;
	Music door;
	boolean quit = false;
	boolean inventory = false;
	int[] duration = {200,200,200,200};
	int[] stand = {200,200};
	float buckyPositionX = javagame.Player.Beer_Hall[0];
	float buckyPositionY = javagame.Player.Beer_Hall[1];
	float shiftX = buckyPositionX + javagame.Player.Beer_Hall[2];
	float shiftY = buckyPositionY + javagame.Player.Beer_Hall[3];
	Image mask;
	String looking = "front";

	public Beer_Hall(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		door = new Music("son/Door.ogg");
		worldMap = new Image("res/Map/Rushmanov (Black) (bird).png");
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
		worldMap.draw(javagame.Player.Beer_Hall[0], javagame.Player.Beer_Hall[1]);
		bucky.draw(shiftX, shiftY);
		
		g.drawString("Buckys X: " + javagame.Player.Beer_Hall[0] + "\nBuckys Y: " + javagame.Player.Beer_Hall[1] + " ID: " + sbg.getCurrentStateID(), 400, 20);
		
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
		g.drawString("Buckys X: " + javagame.Player.Beer_Hall[0] + "\nBuckys Y: " + javagame.Player.Beer_Hall[1], 400, 20);
		
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
		
		//Up
		if(input.isKeyDown(Input.KEY_UP) || input.isKeyDown(Input.KEY_W)){
			bucky = movingUp1;
			javagame.Player.Beer_Hall[1] += delta * .1f;
			looking = "back";
			//Wall
			if(javagame.Player.Beer_Hall[1]>130){
				javagame.Player.Beer_Hall[1] -= delta * .1f;
			}
			//Bench
			if(javagame.Player.Beer_Hall[1]>50 && javagame.Player.Beer_Hall[1]<110 && javagame.Player.Beer_Hall[0]>200){
				javagame.Player.Beer_Hall[1] -= delta * .1f;
			}
		}
		
		//Down
		if(input.isKeyDown(Input.KEY_DOWN) || input.isKeyDown(Input.KEY_S)){
			bucky = movingDown1;
			javagame.Player.Beer_Hall[1] -= delta * .1f;
			looking = "front";
			//Wall
			if(javagame.Player.Beer_Hall[1]<-48){
				javagame.Player.Beer_Hall[1] += delta * .1f;
			}
			//Bench
			if(javagame.Player.Beer_Hall[1]>50 && javagame.Player.Beer_Hall[1]<110 && javagame.Player.Beer_Hall[0]>200){
				javagame.Player.Beer_Hall[1] += delta * .1f;
			}
		}
		
		//Left
		if(input.isKeyDown(Input.KEY_LEFT) || input.isKeyDown(Input.KEY_A)){
			bucky = movingLeft1;
			javagame.Player.Beer_Hall[0] += delta * .1f;
			looking = "left";
			//Wall
			if(javagame.Player.Beer_Hall[0]>280){
				javagame.Player.Beer_Hall[0] -= delta * .1f;
				//Door - Rift
				if(javagame.Player.Beer_Hall[1]>-48 && javagame.Player.Beer_Hall[1]<-30){
					javagame.Player.room = 1;
					if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					door.play();
					sbg.enterState(1);
				}
			}
			//Bench
			if(javagame.Player.Beer_Hall[1]>50 && javagame.Player.Beer_Hall[1]<110 && javagame.Player.Beer_Hall[0]>200){
				javagame.Player.Beer_Hall[0] -= delta * .1f;
			}
		}
		
		//Right
		if(input.isKeyDown(Input.KEY_RIGHT) || input.isKeyDown(Input.KEY_D)){
			bucky = movingRight1;
			javagame.Player.Beer_Hall[0] -= delta * .1f;
			looking = "right";
			//Wall
			if(javagame.Player.Beer_Hall[0]<190){
				javagame.Player.Beer_Hall[0] += delta * .1f;
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
		return 3;
	}
	
}
