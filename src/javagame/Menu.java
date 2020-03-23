package javagame;

import java.awt.Color;
import java.awt.Font;
import java.io.*;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.*;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.*;

public class Menu extends BasicGameState{

	public String mouse = "No input yet!";
	Image playNow;
	Image exitGame;
	Image Button;
	Image Button_Pressed;
	Image delete;
	float lock = 20;
	boolean save_mode = false;
	float clock = 20;
	boolean save1 = false;
	boolean save2 = false;
	boolean save3 = false;
	boolean hover1 = false;
	boolean hover2 = false;
	boolean hover3 = false;
	boolean stat_reset = false;
	boolean play = false;
	boolean settings = false;
	boolean creditss = false;
	boolean exit = false;
	Music credits;
	private UnicodeFont TEXT;
	int buttonCOUNT = 0;
	
	public Menu(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		credits = new Music("son/MachineOne.ogg");
		Image[] walkDown1 = {new Image("res/Sprites/AdvenFront(1).png"), new Image("res/Sprites/AdvenFront(2).png"), new Image("res/Sprites/AdvenFront(3).png"), new Image("res/Sprites/AdvenFront(2).png")};
		try{
			javagame.Save.test1();
			save1 = true;
		}catch(FileNotFoundException e){
			save1 = false;
		}
        try{
        	javagame.Save.test2();
        	save2 = true;
		}catch(FileNotFoundException e){
			save2 = false;
		}
        try{
        	javagame.Save.test3();
        	save3 = true;
		}catch(FileNotFoundException e){
			save3 = false;
		}
		Button = new Image("res/GUI/Button.png");
		Button_Pressed = new Image("res/GUI/Button_P.png");
		playNow = new Image("res/GUI/playNow.png");
		exitGame = new Image("res/GUI/exitGame.png");
		delete = new Image("res/GUI/delete-icon.png");
		Font font = new Font("Verdana", Font.PLAIN, 20);
		TEXT = new UnicodeFont(font, 40, false, false);
		TEXT.getEffects().add(new ColorEffect(Color.WHITE));
		TEXT.addAsciiGlyphs();
		TEXT.loadGlyphs();
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString(mouse, 0, 0);
		if(save_mode == false){
		g.drawString("© Tie Gaming Studios", 0, 990);
		g.drawString(mouse, 0, 0);
		TEXT.drawString(380, 150, "Welcome to The GateWay!");
		g.drawString("Credits", 605, 530);
		g.drawString("Play", 620, 330);
		g.drawString("Settings", 600, 430);
		g.drawString("Exit", 620, 630);
		Button.draw(540,300);
		Button.draw(540,400);
		Button.draw(540,500);
		Button.draw(540,600);
		if(play){
			Button_Pressed.draw(540,300);
			if(play==false){
				g.clear();
			}
		}
		if(exit){
			Button_Pressed.draw(540,600);
			if(exit==false){
				g.clear();
			}
		}
		if(settings){
			Button_Pressed.draw(540,400);
			if(settings==false){
				g.clear();
			}
		}
		if(creditss){
			Button_Pressed.draw(540,500);
			if(creditss==false){
				g.clear();
			}
		}
		}
		
		if(save_mode){
			g.drawString("Back",620,640);
			Button.draw(540,300);
		    Button.draw(540,400);
    		Button.draw(540,500);
    		g.drawString("Save Data 1", 590, 285);
			g.drawString("Save Data 2", 590, 385);
			g.drawString("Save Data 3", 590, 485);
			delete.draw(745,325);
			delete.draw(745,425);
			delete.draw(745,525);
    		if(save1 == false){
    			g.drawString("No Data", 610,330);
    		}else{
    			g.drawString(javagame.Save_Menu.name1,550,302);
    			g.drawString(javagame.Save_Menu.clas1,550,320);
    			g.drawString("Level: " + javagame.Save_Menu.lvl1,550,338);
    			g.drawString("$" + javagame.Save_Menu.money1,550,356);
    		}
    		if(save2 == false){
    			g.drawString("No Data", 610,430);
    		}else{
    			g.drawString(javagame.Save_Menu.name2,550,402);
    			g.drawString(javagame.Save_Menu.clas2,550,420);
    			g.drawString("Level: " + javagame.Save_Menu.lvl2,550,438);
    			g.drawString("$" + javagame.Save_Menu.money2,550,456);
    		}
    		if(save3 == false){
    			g.drawString("No Data", 610,530);
    		}else{
    			g.drawString(javagame.Save_Menu.name3,550,502);
    			g.drawString(javagame.Save_Menu.clas3,550,520);
    			g.drawString("Level: " + javagame.Save_Menu.lvl3,550,538);
    			g.drawString("$" + javagame.Save_Menu.money3,550,556);
    		}
    		
    		
    		
    		if(hover1){
    			Button_Pressed.draw(540,300);
    			if(hover1 == false){
    				g.clear();
    			}
    		}
    		if(hover2){
    			Button_Pressed.draw(540,400);
    			if(hover2 == false){
    				g.clear();
    			}
    		}
    		if(hover3){
    			Button_Pressed.draw(540,500);
    			if(hover3 == false){
    				g.clear();
    			}
    		}
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		
		lock -= delta * .1f;
		
		clock -= delta * .1f;
		
		if(stat_reset){
			save_mode = false;
			stat_reset = false;
			javagame.Player.hp = 50;
			javagame.Player.max_hp = 50;
			javagame.Player.manap = 20;
			javagame.Player.max_manap = 20;
			javagame.Player.save_location = 1;
			javagame.Player.money = 0;
			javagame.Player.lvl = 1;
			javagame.Player.xp = 0;
			javagame.Player.lvl_list = javagame.Reset.lvl_list;
			javagame.Player.room = 10;
			javagame.Player.regen_points = 0;
			javagame.Player.lesser_potions = 5;
			javagame.Player.potions = 0;
			javagame.Player.greater_potions = 0;
			javagame.Player.lesser_mana = 0;
			javagame.Player.mana = 0;
			javagame.Player.greater_mana = 0;
			javagame.Player.lesser_regen = 0;
			javagame.Player.regen = 0;
			javagame.Player.greater_regen = 0;
			javagame.Player.HMR = 0;
			javagame.Player.ocean_gem = 0;
			javagame.Player.potion_rounds = 0;
			javagame.Player.weapon_ID = 0;
			javagame.Player.name = "";
			javagame.Player.clas = "";
			javagame.Player.silver_horn = false;
			javagame.Player.silver_message = false;
			javagame.Player.in_battle = false;
			javagame.Player.boss_1 = false;
			javagame.Player.potion_used = false;
			javagame.Player.area_1 = javagame.Reset.area_1;
			javagame.Player.area_2 = javagame.Reset.area_2;
			javagame.Player.area_3 = javagame.Reset.area_3;
			javagame.Player.area_5 = javagame.Reset.area_5;
			javagame.Player.cave_1 = javagame.Reset.cave_1;
			javagame.Player.Alchemist = javagame.Reset.Alchemist;
			javagame.Player.Beer_Hall = javagame.Reset.Beer_Hall;
			javagame.Player.Forest = javagame.Reset.Forest;
			javagame.Player.Rift = javagame.Reset.Rift;
			javagame.Player.Weapons = javagame.Reset.Weapons;
			javagame.Player.equipped_weapon = javagame.Reset.equipped_weapon;
			try{
				javagame.Save.test1();
				save1 = true;
			}catch(FileNotFoundException e){
				save1 = false;
			}
	        try{
	        	javagame.Save.test2();
	        	save2 = true;
			}catch(FileNotFoundException e){
				save2 = false;
			}
	        try{
	        	javagame.Save.test3();
	        	save3 = true;
			}catch(FileNotFoundException e){
				save3 = false;
			}
		}
		
		//Saving
		if(save_mode){
			//Back
			if((posX>615 && posX<660) && (posY<385 && posY>365) && lock < 0 && save_mode){
				if(Mouse.isButtonDown(0)){
					lock = 20;
					save_mode = false;
				}
			}
			
			
			
			//delete
			if(posX<780 && posX>750 && posY>670 && posY<700){
				if(Mouse.isButtonDown(0) && clock < 0){
					clock = 40;
					try {
						javagame.Save.delete1();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					save1 = false;
				}
			}
			
			if(posX<780 && posX>750 && posY>570 && posY<600){
				if(Mouse.isButtonDown(0) && clock < 0){
					clock = 40;
					try {
						javagame.Save.delete2();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					save2 = false;
				}
			}
			
			if(posX<780 && posX>750 && posY>470 && posY<500){
				if(Mouse.isButtonDown(0) && clock < 0){
					clock = 40;
					try {
						javagame.Save.delete3();
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					save3 = false;
				}
			}
			
			//Save 1
			if((posX>540 && posX<740) && (posY>645 && posY<720)){
				hover1 = true;
				if(Mouse.isButtonDown(0) && clock < 20){
					try {
						javagame.Save.Load1();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stat_reset = true;
					save_mode = false;
					javagame.Player.save_location = 1;
					sbg.enterState(javagame.Player.room);
				}
			}else{
				hover1 = false;
			}
			
			//Save 2
			if((posX>540 && posX<740) && (posY>545 && posY<620)){
				hover2 = true;
				if(Mouse.isButtonDown(0) && clock < 20){
					try {
						javagame.Save.Load2();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stat_reset = true;
					save_mode = false;
					javagame.Player.save_location = 2;
					sbg.enterState(javagame.Player.room);
				}
			}else{
				hover2 = false;
			}
			
			//Save 3
			if((posX>540 && posX<740) && (posY>445 && posY<520)){
				hover3 = true;
				if(Mouse.isButtonDown(0) && clock < 20){
					try {
						javagame.Save.Load3();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					stat_reset = true;
					save_mode = false;
					javagame.Player.save_location = 3;
					sbg.enterState(javagame.Player.room);
				}
			}else{
				hover3 = false;
			}
			
		}
		
		if(save_mode == false){
			//Play Button
			if((posX>buttons(0,0) && posX<buttons(0,1)) && (posY>buttons(0,2) && posY<buttons(0,3))){
				play = true;
				if(Mouse.isButtonDown(0)){
					clock = 50;
					save_mode = true;
				}
			}else{
				play = false;
			}
			
			//Settings Button
			if((posX>buttons(1,0) && posX<buttons(1,1)) && (posY>buttons(1,2) && posY<buttons(1,3))){
				settings = true;
				if(Mouse.isButtonDown(0)){
					sbg.enterState(5);
				}
			}else{
				settings = false;
			}
			
			//Credits Button
			if((posX>buttons(2,0) && posX<buttons(2,1)) && (posY>buttons(2,2) && posY<buttons(2,3))){
				creditss = true;
				if(Mouse.isButtonDown(0)){
					lock = 20;
					sbg.enterState(1000);
				}
			}else{
				creditss = false;
			}
		
		    //Exit Button
			if((posX>buttons(3,0) && posX<buttons(3,1)) && (posY>buttons(3,2) && posY<buttons(3,3))){
				exit = true;
				if(Mouse.isButtonDown(0) && lock < -20){
					System.exit(0);
				}
			}else{
				exit = false;
			}
		}
	}
	
	public static int buttons(int num,int check){
		int cord[][] = {{540,740,644,724},{540,740,544,624},{540,740,444,524},{540,740,344,424}};
		int listing[] = {cord[num][0],cord[num][1],cord[num][2],cord[num][3]};
		return listing[check];
	}
	
	public int getID(){
		return 0;
	}
	
}
