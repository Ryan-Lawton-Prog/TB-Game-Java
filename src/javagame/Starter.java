package javagame;

import java.io.*;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Starter extends BasicGameState{

	Animation bucky, movingLeft2, movingRight2, movingforward;
	public String mouse = "No input yet!";
	public String name = "";
	Image naming;
	Image text_box;
	Image warrior;
	Image archer;
	Image mage;
	boolean starting = false;
	boolean classes = false;
	int mousex = 0;
	float position = 0;
	int[] duration = {200,200,200,200};
	int[] stand = {200,200};
	float tic = 10;
	
	public Starter(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		naming = new Image("res/GUI/name.png");
		text_box = new Image("res/GUI/Text_Box.png");
		warrior = new Image("res/GUI/Warrior.png");
		archer = new Image("res/GUI/Archer.png");
		mage = new Image("res/GUI/Mage.png");
		Image[] walkFront = {new Image("res/Sprites/AdvenFront(2).png"), new Image("res/Sprites/AdvenFront(2).png")};
		Image[] walkLeft1 = {new Image("res/Sprites/AdvenLeft(1).png"), new Image("res/Sprites/AdvenLeft(2).png"), new Image("res/Sprites/AdvenLeft(3).png"), new Image("res/Sprites/AdvenLeft(2).png")};
		Image[] walkRight1 = {new Image("res/Sprites/AdvenRight(1).png"), new Image("res/Sprites/AdvenRight(2).png"), new Image("res/Sprites/AdvenRight(3).png"), new Image("res/Sprites/AdvenRight(2).png")};
		movingLeft2 = new Animation(walkLeft1, duration, true);
		movingRight2 = new Animation(walkRight1, duration, true);
		movingforward = new Animation(walkFront, stand, true);
		bucky = movingforward;
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString(mouse, 0, 0);
		if(starting == false && classes == false){
		    naming.draw(225,198);
		    g.drawString("Enter Your Name Adventurer", 200, 50);
		    g.drawString(name, 230, 200);
		}
		if(starting == true){
			text_box.draw(0, 265);
			g.drawString("You are about to stumble into a strange world", 125, 280);
			g.drawString("       With it comes vicious creatures.      ", 125, 295);
			g.drawString("     Your caravan finally comes to a stop.   ", 125, 310);
			g.drawString("             Press E to Continue             ", 125, 325);
			
		}
		if(classes == true){
			warrior.draw(150,160);
			g.drawString("Warrior", 140, 200);
			archer.draw(300,160);
			g.drawString("Archer", 295, 200);
			mage.draw(450,160);
			g.drawString("Mage", 450, 200);
			bucky.draw(position - 12,120);
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mousex = posX;
		mouse = "Mouse position x: " + posX + " y: " + posY;
		Input input = gc.getInput();
		
		tic -= delta * .1f;
		
		if(tic > 0){
			name = "";
		}
		
		if(posX > position){
			position += delta * .1f;
			bucky = movingRight2;
		}
		if(posX < position){
			position -= delta * .1f;
			bucky = movingLeft2;
		}
		if(posX >= position -1 && posX <= position + 1){
			bucky = movingforward;
		}
		if(input.isKeyDown(Input.KEY_ENTER)){
			javagame.Player.name = name;
			classes = true;
		}
		if(input.isKeyPressed(Input.KEY_A)){
			name += "A";
		}
		if(input.isKeyPressed(Input.KEY_B)){
			name += "B";
		}
		if(input.isKeyPressed(Input.KEY_C)){
			name += "C";
		}
		if(input.isKeyPressed(Input.KEY_D)){
			name += "D";
		}
		if(input.isKeyPressed(Input.KEY_E)){
			if(starting == true){
				starting = false;
				classes = false;
				tic = 20;
				sbg.enterState(2);
			}
			name += "E";
		}
		if(input.isKeyPressed(Input.KEY_F)){
			name += "F";
		}
		if(input.isKeyPressed(Input.KEY_G)){
			name += "G";
		}
		if(input.isKeyPressed(Input.KEY_H)){
			name += "H";
		}
		if(input.isKeyPressed(Input.KEY_I)){
			name += "I";
		}
		if(input.isKeyPressed(Input.KEY_J)){
			name += "J";
		}
		if(input.isKeyPressed(Input.KEY_K)){
			name += "K";
		}
		if(input.isKeyPressed(Input.KEY_L)){
			name += "L";
		}
		if(input.isKeyPressed(Input.KEY_M)){
			name += "M";
		}
		if(input.isKeyPressed(Input.KEY_N)){
			name += "N";
		}
		if(input.isKeyPressed(Input.KEY_O)){
			name += "O";
		}
		if(input.isKeyPressed(Input.KEY_P)){
			name += "P";
		}
		if(input.isKeyPressed(Input.KEY_Q)){
			name += "Q";
		}
		if(input.isKeyPressed(Input.KEY_R)){
			name += "R";
		}
		if(input.isKeyPressed(Input.KEY_S)){
			name += "S";
		}
		if(input.isKeyPressed(Input.KEY_T)){
			name += "T";
		}
		if(input.isKeyPressed(Input.KEY_U)){
			name += "U";
		}
		if(input.isKeyPressed(Input.KEY_V)){
			name += "V";
		}
		if(input.isKeyPressed(Input.KEY_W)){
			name += "W";
		}
		if(input.isKeyPressed(Input.KEY_X)){
			name += "X";
		}
		if(input.isKeyPressed(Input.KEY_Y)){
			name += "Y";
		}
		if(input.isKeyPressed(Input.KEY_Z)){
			name += "Z";
		}
		if(input.isKeyPressed(Input.KEY_SEMICOLON)){
			name += ";";
		}
		if(input.isKeyPressed(Input.KEY_APOSTROPHE)){
			name += "\"";
		}
		if(input.isKeyPressed(Input.KEY_SLASH)){
			name += "/";
		}
		if(input.isKeyPressed(Input.KEY_BACKSLASH)){
			name += "\\";
		}
		if(input.isKeyPressed(Input.KEY_MINUS)){
			name += "-";
		}
		if(input.isKeyPressed(Input.KEY_PERIOD)){
			name += ".";
		}
		if(input.isKeyPressed(Input.KEY_COMMA)){
			name += ",";
		}
		if(input.isKeyPressed(Input.KEY_EQUALS)){
			name += "=";
		}
		if(input.isKeyPressed(Input.KEY_1)){
			name += "1";
		}
		if(input.isKeyPressed(Input.KEY_2)){
			name += "2";
		}
		if(input.isKeyPressed(Input.KEY_3)){
			name += "3";
		}
		if(input.isKeyPressed(Input.KEY_4)){
			name += "4";
		}
		if(input.isKeyPressed(Input.KEY_5)){
			name += "5";
		}
		if(input.isKeyPressed(Input.KEY_6)){
			name += "6";
		}
		if(input.isKeyPressed(Input.KEY_7)){
			name += "7";
		}
		if(input.isKeyPressed(Input.KEY_8)){
			name += "8";
		}
		if(input.isKeyPressed(Input.KEY_9)){
			name += "9";
		}
		if(input.isKeyPressed(Input.KEY_0)){
			name += "0";
		}
		if(input.isKeyPressed(Input.KEY_SPACE)){
			name += "_";
		}
		if(input.isKeyPressed(Input.KEY_BACK)){
			name = name.substring(0, name.length() - 1);
		}
		if(name.length() > 21){
			name = name.substring(0, name.length() - 1);
		}
		
		//classes
		if(classes){
			if(posX > 150 && posX < 190 && posY > 165 && posY < 200){
				if(Mouse.isButtonDown(0)){
					javagame.Player.clas = "warrior"; 
					javagame.Player.room = 7;
					javagame.Player.equipped_weapon[0] = "Beginner_Sword";
					javagame.Player.equipped_weapon[1] = 1;
					javagame.Player.equipped_weapon[2] = 0;
					javagame.Player.equipped_weapon[3] = "warrior";
					javagame.Player.equipped_weapon[4] = 0;
					javagame.Player.equipped_weapon[5] = 0;
					javagame.Player.equipped_weapon[6] = 0;
					javagame.Player.equipped_weapon[7] = 0;
					javagame.Player.equipped_weapon[8] = 0;
					javagame.Player.equipped_weapon[9] = javagame.Player.weapon_ID;
					javagame.Player.weapon_ID += 1;
					javagame.Player.equipped_weapon[10] = "sword";
					System.out.println(javagame.Player.equipped_weapon);
					starting = true;
					classes = false;
				}
			}
			if(posX > 300 && posX < 340 && posY > 165 && posY < 200){
				if(Mouse.isButtonDown(0)){
					javagame.Player.clas = "archer"; 
					javagame.Player.room = 7;
					javagame.Player.equipped_weapon[0] = "Beginner_Bow";
					javagame.Player.equipped_weapon[1] = 1;
					javagame.Player.equipped_weapon[2] = 0;
					javagame.Player.equipped_weapon[3] = "archer";
					javagame.Player.equipped_weapon[4] = 0;
					javagame.Player.equipped_weapon[5] = 0;
					javagame.Player.equipped_weapon[6] = 0;
					javagame.Player.equipped_weapon[7] = 0;
					javagame.Player.equipped_weapon[8] = 0;
					javagame.Player.equipped_weapon[9] = javagame.Player.weapon_ID;
					javagame.Player.weapon_ID += 1;
					javagame.Player.equipped_weapon[10] = "bow";
					System.out.println(javagame.Player.equipped_weapon);
					starting = true;
					classes = false;
				}
			}
			if(posX > 450 && posX < 490 && posY > 165 && posY < 200){
				if(Mouse.isButtonDown(0)){
					javagame.Player.clas = "mage"; 
					javagame.Player.room = 7;
					javagame.Player.equipped_weapon[0] = "Beginner_Staff";
					javagame.Player.equipped_weapon[1] = 1;
					javagame.Player.equipped_weapon[2] = 0;
					javagame.Player.equipped_weapon[3] = "mage";
					javagame.Player.equipped_weapon[4] = 0;
					javagame.Player.equipped_weapon[5] = 0;
					javagame.Player.equipped_weapon[6] = 0;
					javagame.Player.equipped_weapon[7] = 0;
					javagame.Player.equipped_weapon[8] = 0;
					javagame.Player.equipped_weapon[9] = javagame.Player.weapon_ID;
					javagame.Player.weapon_ID += 1;
					javagame.Player.equipped_weapon[10] = "staff";
					System.out.println(javagame.Player.equipped_weapon);
					
					starting = true;
					classes = false;
				}
			}
		}
	}
	
	public int getID(){
		return 10;
	}
	
}
