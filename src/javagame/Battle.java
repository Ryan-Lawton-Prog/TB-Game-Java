package javagame;

import java.io.*;
import java.util.Random;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.font.effects.ColorEffect;

import java.awt.Color;
import java.awt.Font;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javagame.Player;

public class Battle extends BasicGameState{
	
	Animation health, OpHealth, healthSet0, healthSet1, healthSet2, healthSet3, healthSet4, healthSet5, healthSet6, healthSet7, healthSet8, healthSet9, healthSet10, healthSetDEAD;
	Image worldMap;
	private UnicodeFont fUnicodeFont;
	private UnicodeFont woot;
	boolean quit = false;
	boolean clicked1 = false;
	boolean clicked2 = false;
	boolean clicked3 = false;
	boolean clicked4 = false;
	boolean damage = false;
	boolean OpDamage = false;
	boolean Win = false;
	boolean Lose = false;
	boolean leveling1 = false;
	boolean leveling2 = false;
	boolean items = false;
	boolean drops = false;
	boolean rewards = false;
	boolean masking = false;
	int[] duration = {100000,100000};
	double damaged;
	double num1;
	double num2;
	Music battle_mus;
	Image battleWindow;
	Image mask;
	Image basic_attack;
	Image pressed_attack;
	Image Sword;
	Image Axe;
	Image Cross_Bow;
	Image Staff;
	Image Wand;
	Image Bow;
	double healthNum;
	String mouse = "";
	int player_attack;
	int enemy_attack;
	int xp_storage;
	double enemy_defence;
	double player_defence;
	double battle;
	Random random = new Random();
	Random rand = new Random();
	float tic;
	float count;
	boolean music = false;

	public Battle(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		battle_mus = new Music("son/Strangled.ogg");
		count = 1000;
		Font font = new Font("Verdana", Font.PLAIN, 20);
		fUnicodeFont = new UnicodeFont(font, 80, false, false);
		fUnicodeFont.getEffects().add(new ColorEffect(Color.RED));
		fUnicodeFont.addAsciiGlyphs();
		fUnicodeFont.loadGlyphs();
		woot = new UnicodeFont(font, 50, false, false);
		woot.getEffects().add(new ColorEffect(Color.RED));
		woot.addAsciiGlyphs();
		woot.loadGlyphs();
		tic = 0;
		battleWindow = new Image("res/GUI/Battle.png");
		mask =  new Image("res/GUI/Mask Menu.png");
		basic_attack = new Image("res/GUI/Skill_Button.png");
		pressed_attack = new Image("res/GUI/Skill_Pressed.png");
		Sword = new Image("res/Sprites/Sword.png");
		Axe = new Image("res/Sprites/Axe.png");
		Cross_Bow = new Image("res/Sprites/Cross-Bow.png");
		Wand = new Image("res/Sprites/Wand.png");
		Staff = new Image("res/Sprites/Staff.png");
		Bow = new Image("res/Sprites/Bow.png");
		Image[] health0 = {new Image("res/GUI/Health Bar (0).png"),new Image("res/GUI/Health Bar (0).png")};
		Image[] health1 = {new Image("res/GUI/Health Bar (10).png"),new Image("res/GUI/Health Bar (10).png")};
		Image[] health2 = {new Image("res/GUI/Health Bar (20).png"),new Image("res/GUI/Health Bar (20).png")};
		Image[] health3 = {new Image("res/GUI/Health Bar (30).png"),new Image("res/GUI/Health Bar (30).png")};
		Image[] health4 = {new Image("res/GUI/Health Bar (40).png"),new Image("res/GUI/Health Bar (40).png")};
		Image[] health5 = {new Image("res/GUI/Health Bar (50).png"),new Image("res/GUI/Health Bar (50).png")};
		Image[] health6 = {new Image("res/GUI/Health Bar (60).png"),new Image("res/GUI/Health Bar (60).png")};
		Image[] health7 = {new Image("res/GUI/Health Bar (70).png"),new Image("res/GUI/Health Bar (70).png")};
		Image[] health8 = {new Image("res/GUI/Health Bar (80).png"),new Image("res/GUI/Health Bar (80).png")};
		Image[] health9 = {new Image("res/GUI/Health Bar (90).png"),new Image("res/GUI/Health Bar (90).png")};
		Image[] health10 = {new Image("res/GUI/Health Bar (100).png"),new Image("res/GUI/Health Bar (100).png")};
		Image[] healthDEAD = {new Image("res/GUI/Health Bar (DEAD).png"),new Image("res/GUI/Health Bar (DEAD).png")};
		healthSet0 = new Animation(health0, duration, false);
		healthSet1 = new Animation(health1, duration, false);
		healthSet2 = new Animation(health2, duration, false);
		healthSet3 = new Animation(health3, duration, false);
		healthSet4 = new Animation(health4, duration, false);
		healthSet5 = new Animation(health5, duration, false);
		healthSet6 = new Animation(health6, duration, false);
		healthSet7 = new Animation(health7, duration, false);
		healthSet8 = new Animation(health8, duration, false);
		healthSet9 = new Animation(health9, duration, false);
		healthSet10 = new Animation(health10, duration, false);
		healthSetDEAD = new Animation(healthDEAD, duration, false);
		healthNum = (long) ((100 * javagame.Player.hp)/javagame.Player.max_hp);
		OpHealth = healthSet10;
		if (healthNum >= 95){
			health = healthSet10;
		}
		if (healthNum >= 85 && healthNum < 95){
			health = healthSet9;
		}
		if (healthNum >= 75 && healthNum < 85){
			health = healthSet8;
		}
		if (healthNum >= 65 && healthNum < 75){
			health = healthSet7;
		}
		if (healthNum >= 55 && healthNum < 65){
			health = healthSet6;
		}
		if (healthNum >= 45 && healthNum < 55){
			health = healthSet5;
		}
		if (healthNum >= 35 && healthNum < 45){
			health = healthSet4;
		}
		if (healthNum >= 25 && healthNum < 35){
			health = healthSet3;
		}
		if (healthNum >= 15 && healthNum < 25){
			health = healthSet2;
		}
		if (healthNum >= 7 && healthNum < 15){
			health = healthSet1;
		}
		if (healthNum >= 1 && healthNum < 7){
			health = healthSet0;
		}
		if (healthNum <= 0){
			health = healthSetDEAD;
		}
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
	    battleWindow.draw(0,0);
		if(leveling1 == false || leveling2 == false || items == false){
		    health.draw(5, 50);
		    OpHealth.draw(535, 50);
		    String CHealth = javagame.Enemy.hp + " / " + javagame.Enemy.max_hp;
		    String CName = javagame.Enemy.name;
		    int CoordHealth = 410;
		    int CoordName = 630;
		    if(CHealth.length() > 11){
		    	int Dif = CHealth.length() - 11;
		    	CoordHealth -= 8 * Dif;
		    }
		    if(CName.length() > 0){
		    	CoordName -= 9 * CName.length();
		    }
		    g.drawString(javagame.Player.name, 5, 30);
		    g.drawString("Level: " + javagame.Player.lvl + " V " + "Level: " + javagame.Enemy.lvl, 220, 5);
		    g.drawString(CName, CoordName, 30);
		    g.drawString(javagame.Player.hp + " / " + javagame.Player.max_hp, 115, 45);
		    g.drawString(CHealth, CoordHealth, 45);
		    basic_attack.draw(50,273);
		    basic_attack.draw(200,273);
		    basic_attack.draw(350,273);
		    basic_attack.draw(500,273);
		    if(javagame.Player.equipped_weapon[10].equals("sword")){
				Sword.draw(73,297,2);
			}else if(javagame.Player.equipped_weapon[10].equals("axe")){
				Axe.draw(73,297,2);
			}else if(javagame.Player.equipped_weapon[10].equals("wand")){
				Wand.draw(73,297,2);
			}else if(javagame.Player.equipped_weapon[10].equals("staff")){
				Staff.draw(73,297,2);
			}else if(javagame.Player.equipped_weapon[10].equals("bow")){
				Bow.draw(73,297,2);
			}else if(javagame.Player.equipped_weapon[10].equals("cross-bow")){
				Cross_Bow.draw(73,297,2);
			}
		    if(leveling1 || leveling2 || items){
		    	g.clear();
		    }
		    g.drawString(mouse, 0, 0);
		}
		
		if(leveling1 || leveling2){
			battleWindow.draw(0,0);
			Win = false;
			OpHealth.draw(270, 150);
			g.drawString("Experience", 275, 130);
			g.drawString(xp_storage + " / " + javagame.Player.lvl_list[javagame.Player.lvl - 1], 280, 180);
			g.drawString("Press E to Continue", 240, 330);
			if(leveling1){
				g.drawString("You have gained " + javagame.Enemy.xp + " XP", 240, 310);
			}
			if(leveling2){
				g.drawString("You are now on " + javagame.Player.xp + " XP", 240, 310);
				if(javagame.Player.xp >= javagame.Player.lvl_list[javagame.Player.lvl - 1]){
					woot.drawString(80, 10, "YOU HAVE LEVELED");
					woot.drawString(160, 60, "     !!UP!!     ");
				}
			}
		}
		
		if(quit==true){
			g.drawString("Num: " + healthNum,100,100);
			g.drawImage(mask, 0, 0);
			g.drawString("Inventory (I)", 250, 50);
			g.drawString("Resume (R)", 250, 100);
			g.drawString("Main Menu (M)", 250, 150);
			g.drawString("Quit Game (Q)", 250, 200);
			if(quit==false){
				g.clear();
			}
		}
		
		if(tic > 0 && masking == false){
			pressed_attack.draw(50,273);
			if(tic <= 0){
				g.clear();
			}
		}
		
		if(Win){
			fUnicodeFont.drawString(100, 250, "YOU WIN!!");
			g.drawString("Press E to Continue", 240, 335);
		}
		if(Lose){
			fUnicodeFont.drawString(80, 250, "YOU LOSE!!");
			g.drawString("Press E to Continue", 240, 335);
		}
	}
	
	private Image Image(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		if(music == false){
			music = true;
			//battle_mus.loop();
		}
		if(count > 1){
			count = -10;
			double wepon = 0;
			int wepon_final = 0;
			if(javagame.Player.clas.equals("warrior")){
				wepon = (Integer)javagame.Player.equipped_weapon[1] + (0.2 * ((Integer)javagame.Player.equipped_weapon[4]));
			}
			if(javagame.Player.clas.equals("mage")){
				wepon = (Integer)javagame.Player.equipped_weapon[1] + (0.2 * ((Integer)javagame.Player.equipped_weapon[6]));
			}
			if(javagame.Player.clas.equals("archer")){
				wepon = (Integer)javagame.Player.equipped_weapon[1] + (0.2 * ((Integer)javagame.Player.equipped_weapon[5]));
			}
			wepon_final = (int) wepon;
			System.out.println(wepon);
			if(wepon_final <=0){
				wepon_final = 0;
			}
			player_attack = javagame.Player.lvl + wepon_final;
			enemy_attack = javagame.Enemy.att;
			System.out.println("ATTACK VALUE: "+javagame.Enemy.att);
			enemy_defence = javagame.Enemy.def;
			System.out.println(javagame.Enemy.def);
			player_defence = javagame.Player.lvl / 1.5;
			player_defence += 0.5 * javagame.Player.lvl;
	    }
		
		if(javagame.Player.potion_used){
			OpDamage = true;
			javagame.Player.potion_rounds = 7;
		}
		
		Input input = gc.getInput();
		//Normal Attack
		if((posX>50 && posX<129) && (posY>8 && posY<85)){
			if(Mouse.isButtonDown(0) && clicked1 == false && damage == false && OpDamage == false){
				clicked1 = true;
				damage = true;
				tic = 100;
			}
		}
		//Attack 1
		if((posX>200 && posX<279) && (posY>8 && posY<85)){
			if(Mouse.isButtonDown(0) && clicked2 == false && damage == false && OpDamage == false){
				clicked2 = true;
				damage = true;
				tic = 100;
			}
		}
		//Attack 2
		if((posX>350 && posX<429) && (posY>8 && posY<85)){
			if(Mouse.isButtonDown(0) && clicked3 == false && damage == false && OpDamage == false){
				clicked3 = true;
				damage = true;
				tic = 100;
			}
		}
		//Attack 3
		if((posX>500 && posX<579) && (posY>8 && posY<85)){
			if(Mouse.isButtonDown(0) && clicked4 == false && damage == false && OpDamage == false){
				clicked4 = true;
				damage = true;
				tic = 100;
			}
		}
		
		
		//leveling
		if(Win){
			
			if(input.isKeyDown(Input.KEY_E) && Win){
				Win = false;
				xp_storage = javagame.Player.xp;
				javagame.Player.xp += javagame.Enemy.xp;
			    tic = 50;
			    count = 1000;
			    javagame.Player.potion_rounds = 0;
			    leveling1 = true;
		    }
		}
		
		if(Lose){
			if(input.isKeyDown(Input.KEY_E) && Lose){
				quit = false;
				clicked1 = false;
				clicked2 = false;
				clicked3 = false;
				clicked4 = false;
				damage = false;
				OpDamage = false;
				Win = false;
				Lose = false;
				leveling1 = false;
			    items = false;
				drops = false;
				rewards = false;
			    masking = false;
			    count = 1000;
			    System.exit(0);
		    }
		}
		
		//rewards
		if(leveling1){
			damage = false;
			num1 = xp_storage;
			try{
			    num2 = javagame.Player.lvl_list[javagame.Player.lvl - 1];
			}catch(Exception e){
				num2 = javagame.Player.lvl_list[javagame.Player.lvl - 2];
			}
			healthNum = num1/num2 * 100;
			System.out.println(healthNum);
			if (healthNum >= 95){
				OpHealth = healthSet10;
			}
			if (healthNum >= 85 && healthNum < 95){
				OpHealth = healthSet9;
			}
			if (healthNum >= 75 && healthNum < 85){
				OpHealth = healthSet8;
			}
			if (healthNum >= 65 && healthNum < 75){
				OpHealth = healthSet7;
			}
			if (healthNum >= 55 && healthNum < 65){
				OpHealth = healthSet6;
			}
			if (healthNum >= 45 && healthNum < 55){
				OpHealth = healthSet5;
			}
			if (healthNum >= 35 && healthNum < 45){
				OpHealth = healthSet4;
			}
			if (healthNum >= 25 && healthNum < 35){
				OpHealth = healthSet3;
			}
			if (healthNum >= 15 && healthNum < 25){
				OpHealth = healthSet2;
			}
			if (healthNum >= 7 && healthNum < 15){
				OpHealth = healthSet1;
			}
			if (healthNum >= 1 && healthNum < 7){
				OpHealth = healthSet0;
			}
			if (healthNum <= 0){
				OpHealth = healthSetDEAD;
			}
			if(input.isKeyDown(Input.KEY_E) && tic < 0){
				leveling2 = true;
				leveling1 = false;
				tic = 50;
			}
		}
		
		if(leveling2){
			damage = false;
			xp_storage = javagame.Player.xp;
			num1 = xp_storage;
			try{
			    num2 = javagame.Player.lvl_list[javagame.Player.lvl - 1];
			}catch(Exception e){
				num2 = javagame.Player.lvl_list[javagame.Player.lvl - 2];
			}
			healthNum = num1/num2 * 100;
			if (healthNum >= 95){
				OpHealth = healthSet10;
			}
			if (healthNum >= 85 && healthNum < 95){
				OpHealth = healthSet9;
			}
			if (healthNum >= 75 && healthNum < 85){
				OpHealth = healthSet8;
			}
			if (healthNum >= 65 && healthNum < 75){
				OpHealth = healthSet7;
			}
			if (healthNum >= 55 && healthNum < 65){
				OpHealth = healthSet6;
			}
			if (healthNum >= 45 && healthNum < 55){
				OpHealth = healthSet5;
			}
			if (healthNum >= 35 && healthNum < 45){
				OpHealth = healthSet4;
			}
			if (healthNum >= 25 && healthNum < 35){
				OpHealth = healthSet3;
			}
			if (healthNum >= 15 && healthNum < 25){
				OpHealth = healthSet2;
			}
			if (healthNum >= 7 && healthNum < 15){
				OpHealth = healthSet1;
			}
			if (healthNum >= 1 && healthNum < 7){
				OpHealth = healthSet0;
			}
			if (healthNum <= 0){
				OpHealth = healthSetDEAD;
			}
			if(input.isKeyDown(Input.KEY_E) && tic < 0){
				leveling2 = false;
				if(javagame.Player.xp >= javagame.Player.lvl_list[javagame.Player.lvl - 1]){
					javagame.Player.lvl += 1;
					javagame.Player.max_hp += showRandomInteger(5,10,random);
					javagame.Player.hp = javagame.Player.max_hp;
					javagame.Player.max_manap += 10 * javagame.Player.lvl - 10;
					javagame.Player.manap = javagame.Player.max_manap;
				}
			    quit = false;
			    clicked1 = false;
			    clicked2 = false;
			    clicked3 = false;
			    clicked4 = false;
				damage = false;
				OpDamage = false;
				Win = false;
				Lose = false;
				leveling1 = false;
			    items = false;
				drops = false;
				rewards = false;
			    masking = false;
			    count = 1000;
			    battle_mus.stop();
			    music = false;
			    javagame.Player.in_battle = false;
				sbg.enterState(998);
			}
		}
		
		//tic Time
		tic -= delta * .1f;
		if(tic <= 0){
			clicked1 = false;
			clicked2 = false;
			clicked3 = false;
			clicked4 = false;
		}
		
		//Escape
		if(input.isKeyDown(Input.KEY_ESCAPE)){
			quit = true;
		}
		
		//When menu is Up
		if(quit==true){
			
			//I
			if(input.isKeyDown(Input.KEY_I)){
				quit = false;
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
			
		}
		
		//battle
		if(damage){
			damaged = ((player_attack)* ((showRandomInteger(11,15,random)) / 10.0) * 2.0) - (enemy_defence * (showRandomInteger(10,14,random)) / 10.0);
			if(damaged < 0){
				damaged = 0;
			}
			javagame.Enemy.hp -= (int)(damaged);
			if(javagame.Enemy.hp < 0){
				javagame.Enemy.hp = 0;
			}
			if(javagame.Enemy.hp <= 0){
				Win = true;
				damage = false;
				masking = true;
			}
			if(Win == false){
			    damage = false;
			    OpDamage = true;
			}
		}
		
		if(OpDamage){
			System.out.println(enemy_attack);
			System.out.println(player_defence);
			damaged = (enemy_attack * ((showRandomInteger(14,18,random)) / 10.0) * 2.0) - (player_defence * (showRandomInteger(10,14,random)) / 10.0);
			System.out.println(damaged+"\n");
			if(damaged < 0){
				damaged = 0;
			}
			javagame.Player.hp -= (int)(damaged);
			if(javagame.Player.regen_points > 0){
				javagame.Player.regen_points -= 1;
				javagame.Player.hp += 5;
			}
			if(javagame.Player.hp < 0){
				javagame.Player.hp = 0;
			}
			if(javagame.Player.hp <= 0){
				Lose = true;
				masking = true;
			}
			if(Lose == false){
			    OpDamage = false;
			    javagame.Player.potion_used = false;
			    javagame.Player.potion_rounds -= 1;
			}
		}
		
		//Enemy Health Bar
		healthNum = (long) (javagame.Enemy.hp/javagame.Enemy.max_hp * 100);
		if (healthNum >= 95){
			OpHealth = healthSet10;
		}
		if (healthNum >= 85 && healthNum < 95){
			OpHealth = healthSet9;
		}
		if (healthNum >= 75 && healthNum < 85){
			OpHealth = healthSet8;
		}
		if (healthNum >= 65 && healthNum < 75){
			OpHealth = healthSet7;
		}
		if (healthNum >= 55 && healthNum < 65){
			OpHealth = healthSet6;
		}
		if (healthNum >= 45 && healthNum < 55){
			OpHealth = healthSet5;
		}
		if (healthNum >= 35 && healthNum < 45){
			OpHealth = healthSet4;
		}
		if (healthNum >= 25 && healthNum < 35){
			OpHealth = healthSet3;
		}
		if (healthNum >= 15 && healthNum < 25){
			OpHealth = healthSet2;
		}
		if (healthNum >= 7 && healthNum < 15){
			OpHealth = healthSet1;
		}
		if (healthNum >= 1 && healthNum < 7){
			OpHealth = healthSet0;
		}
		if (healthNum <= 0){
			OpHealth = healthSetDEAD;
		}
		
		//Player Health Bar
		healthNum = (long) (javagame.Player.hp/javagame.Player.max_hp * 100);
		if (healthNum >= 95){
			health = healthSet10;
		}
		if (healthNum >= 85 && healthNum < 95){
			health = healthSet9;
		}
		if (healthNum >= 75 && healthNum < 85){
			health = healthSet8;
		}
		if (healthNum >= 65 && healthNum < 75){
			health = healthSet7;
		}
		if (healthNum >= 55 && healthNum < 65){
			health = healthSet6;
		}
		if (healthNum >= 45 && healthNum < 55){
			health = healthSet5;
		}
		if (healthNum >= 35 && healthNum < 45){
			health = healthSet4;
		}
		if (healthNum >= 25 && healthNum < 35){
			health = healthSet3;
		}
		if (healthNum >= 15 && healthNum < 25){
			health = healthSet2;
		}
		if (healthNum >= 7 && healthNum < 15){
			health = healthSet1;
		}
		if (healthNum >= 1 && healthNum < 7){
			health = healthSet0;
		}
		if (healthNum <= 0){
			health = healthSetDEAD;
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
		return 999;
	}
	
}
