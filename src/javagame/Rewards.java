package javagame;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Rewards extends BasicGameState{

	public String mouse = "No input yet!";
	public float tic = 20;
	public int drop_limit = 1;
	public int drop_count = 0;
	Random random = new Random();
	public int counter;
	boolean BL_Potion = false;
	boolean BPotion = false;
	boolean BG_Potion = false;
	boolean weapons = false;
	boolean ticking = true;
	Image L_Potion;
	Image Potion;
	Image G_Potion;
	Image battleWindow;
	Image sword;
	Image axe;
	Image wand;
	Image staff;
	Image bow;
	Image cross_bow;
	Image Info;
	Image Boarder;
	Image Boarder_Selected;
	String prefixes[] = {"Dangerous","Exciting","Mysterious","Interesting","Exalted","Battle","Perculiar","Unsightly","Faithful","Thundering","Colossal","Long","Strong","Sticky","The_Famous"};
	String suffixes[] = {"_of_Power","_of_a_King","_of_Death","_of_Misfortune","_of_Destiny","_of_Madness","_of_Orpheus","_of_The_Elements","_of_Greed"};
	String warrior_weapons[] = {"_Sword","_Axe"};
	String mage_weapons[] = {"_Wand","_Staff"};
	String archer_weapons[] = {"_Bow","_Cross-Bow"};
	String weapon_class;
	String weapon_name;
	String weapon_type;
	String holder;
	public int weapon_type_num;
	public int strength = 0;
	public int dexterity = 0;
	public int intelligence = 0;
	public int vitality = 0;
	public int increase_drop = 0;
	public int str_mark;
	public int dex_mark;
	public int int_mark;
	public int vit_mark;
	public int drp_mark;
	public int weapon_damage = 0;
	public int weapon_value = 0;
	public int rare_drop;
	public int legendary_drop;
	public int drop_ID;
	public int drop_CLASS;
	public int array_length;
	public int chance;
	public int stat_range1;
	public int stat_range2;
	public int stat_range3;
	public int display_wep = 1;
	public int equipment_level = 1;
	static ArrayList<Object> WEAPON = new ArrayList<Object>();
	//Object WEAPON[];
	
	public Rewards(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		battleWindow = new Image("res/GUI/Battle.png");
		Boarder = new Image("res/GUI/Item_Boarder.png");
		Boarder_Selected = new Image("res/GUI/Item_Boarder_Selected.png");
		Info = new Image("res/GUI/Info.png");
		L_Potion = new Image("res/Sprites/Lesser_Potion.png");
		Potion = new Image("res/Sprites/Potion.png");
		G_Potion = new Image("res/Sprites/Greater_Potion.png");
		sword = new Image("res/Sprites/Sword.png");
		axe = new Image("res/Sprites/Axe.png");
		bow = new Image("res/Sprites/Bow.png");
		cross_bow = new Image("res/Sprites/Cross-Bow.png");
		wand = new Image("res/Sprites/Wand.png");
		staff = new Image("res/Sprites/Staff.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		battleWindow.draw(0,0);
		g.drawString(mouse, 0, 0);
		g.drawString("Press E to continue.", 240, 310);
		if(BL_Potion){
			L_Potion.draw(300, 140);
		}
        if(BPotion){
        	Potion.draw(300, 140);
		}
        if(BG_Potion){
        	G_Potion.draw(300, 140);
        }
        
        //Weapon display
        if(weapons){
        	Boarder.draw(137,127,1);
        	if(weapon_type.equals("sword")){
        		sword.draw(140,130,2);
        	}else if(weapon_type.equals("axe")){
        		axe.draw(140,130,2);
        	}else if(weapon_type.equals("bow")){
        		bow.draw(140,130,2);
        	}else if(weapon_type.equals("cross-bow")){
        		cross_bow.draw(140,130,2);
        	}else if(weapon_type.equals("wand")){
        		wand.draw(140,130,2);
        	}else if(weapon_type.equals("staff")){
        		staff.draw(140,130,2);
        	}
        	Info.draw(0,0);
        	g.drawString(weapon_name, 305, 5);
        	g.drawString("Value: " + weapon_value, 310, 30);
        	g.drawString("Damage: " + weapon_damage, 310, 50);
        	g.drawString("Str: " + strength, 310, 70);
        	g.drawString("Dex: " + dexterity, 310, 90);
        	g.drawString("Int: " + intelligence, 310, 110);
        	g.drawString("Vit: " + vitality, 310, 130);
        	g.drawString("Drop Rate: " + increase_drop, 310, 150);
        	g.drawString("Class: " + weapon_class, 310, 170);
        	g.drawString("Level Requirement: " + equipment_level, 310, 190);
        }
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		Input input = gc.getInput();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		if(tic >= -4 && tic <= 1){
			ticking = false;
			counter = showRandomInteger(1, 3, random);
			if(counter == 1 && (javagame.Player.lvl < 5 && javagame.Player.lesser_potions < 20|| javagame.Player.lvl < 10 && javagame.Player.lvl >= 5 && javagame.Player.potions < 20 || javagame.Player.lvl >= 10 && javagame.Player.greater_potions < 20)){
				tic = -10;
				if(javagame.Player.lvl < 5){
					BL_Potion = true;
					javagame.Player.lesser_potions += 1;
				}
				if(javagame.Player.lvl < 10 && javagame.Player.lvl >= 5){
					BPotion = true;
					javagame.Player.potions += 1;
				}
				if(javagame.Player.lvl >= 10){
					BG_Potion = true;
					javagame.Player.greater_potions += 1;
				}
			}else{
				drop_count = 0;
				tic = -20;
			}
		}
		
		
		if(tic == -10){
			if(input.isKeyDown(Input.KEY_E)){
				BL_Potion = false;
				BPotion = false;
				BG_Potion = false;
				weapons = true;
				tic = -20;
				drop_count = 0;
			}
		}
		
		if(tic <= -40){
			ticking = false;
			if(input.isKeyDown(Input.KEY_E)){
				if(drop_count < drop_limit){
					tic = -20;
				}else{
					weapon_name = "";
					weapon_damage = 0;
					weapon_value = 0;
					weapon_class = "";
					strength = 0;
					dexterity = 0;
					vitality = 0;
					intelligence = 0;
					increase_drop = 0;
					weapon_type = "";
					drop_count = 1;
					drop_limit = 1;
					ticking = true;
					weapons = false;
					tic = 20;
				    sbg.enterState(2);
				}
			}
		}
		System.out.println("Tick: " + tic);
		System.out.println("Limit: " + drop_limit);
		System.out.println("Count: " + drop_count);
		
		if(tic == -20){
			strength = 0;
			intelligence = 0;
			dexterity = 0;
			vitality = 0;
			increase_drop = 0;
			ticking = true;
			if(javagame.Enemy.rare){
				drop_limit = 3;
				display_wep = 3;
			}
			weapons = true;
			array_length = prefixes.length - 1;
			chance = showRandomInteger(0,array_length,random);
			weapon_name = prefixes[chance];
			if(javagame.Enemy.rare){
				rare_drop = 750 - (2 * (Integer) javagame.Player.equipped_weapon[8]);
				legendary_drop = 949 - (Integer) javagame.Player.equipped_weapon[8];
			}else{
				rare_drop = 850 - (2 * (Integer) javagame.Player.equipped_weapon[8]);
				legendary_drop = 999 - (Integer) javagame.Player.equipped_weapon[8];
			}
			drop_ID = showRandomInteger(1,1000,random);
			drop_CLASS = showRandomInteger(1,3,random);
			if(drop_CLASS == 1){
				weapon_type_num = showRandomInteger(0,1,random);
				if(weapon_type_num == 0){
					weapon_type = "sword";
				}
				if(weapon_type_num == 1){
					weapon_type = "axe";
				}
				weapon_name = weapon_name + warrior_weapons[weapon_type_num];
				weapon_class = "warrior";
			}
			if(drop_CLASS == 2){
				weapon_type_num = showRandomInteger(0,1,random);
				if(weapon_type_num == 0){
					weapon_type = "wand";
				}
				if(weapon_type_num == 1){
					weapon_type = "staff";
				}
				weapon_name = weapon_name + mage_weapons[weapon_type_num];
				weapon_class = "mage";
			}
			if(drop_CLASS == 3){
				weapon_type_num = showRandomInteger(0,1,random);
				if(weapon_type_num == 0){
					weapon_type = "bow";
				}
				if(weapon_type_num == 1){
					weapon_type = "cross-bow";
				}
				weapon_name = weapon_name + archer_weapons[weapon_type_num];
				weapon_class = "archer";
			}
			weapon_damage = (int) javagame.Enemy.lvl / showRandomInteger(4,6,random);
			if(weapon_damage < 1){
				weapon_damage = 1;
			}
			equipment_level = javagame.Enemy.lvl;
			weapon_value = (int) javagame.Enemy.max_hp / 2;
			if(drop_ID >= rare_drop){
				equipment_level += showRandomInteger(1, 2, random);
				array_length = suffixes.length - 1;
				chance = showRandomInteger(0,array_length,random);
				weapon_name = weapon_name + suffixes[chance];
				if(drop_ID < legendary_drop){
					weapon_damage = (int) (javagame.Enemy.lvl / showRandomInteger(2,4,random));
					if(weapon_damage < 1){
						weapon_damage = 1;
					}
					weapon_value = (int) javagame.Enemy.max_hp / 1;
					stat_range1 = showRandomInteger(0,4,random);
					stat_range2 = showRandomInteger(0,4,random);
					while(stat_range1 == stat_range2){stat_range2 = showRandomInteger(0,4,random);}
					if(stat_range1 == 0 || stat_range2 == 0){
						str_mark = javagame.Enemy.lvl * 3;
						strength = showRandomInteger(str_mark-(2*javagame.Enemy.lvl),str_mark,random);
					}
					if(stat_range1 == 1 || stat_range2 == 1){
						dex_mark = javagame.Enemy.lvl * 3;
						dexterity = showRandomInteger(dex_mark-(2*javagame.Enemy.lvl),dex_mark,random);
					}
					if(stat_range1 == 2 || stat_range2 == 2){
						int_mark = javagame.Enemy.lvl * 3;
						intelligence = showRandomInteger(int_mark-(2*javagame.Enemy.lvl),int_mark,random);
					}
					if(stat_range1 == 3 || stat_range2 == 3){
						vit_mark = javagame.Enemy.lvl * 3;
						vitality = showRandomInteger(vit_mark-(2*javagame.Enemy.lvl),vit_mark,random);
					}
					if(stat_range1 == 4 || stat_range2 == 4){
						drp_mark = javagame.Enemy.lvl * 5;
						increase_drop = showRandomInteger(drp_mark-(3*javagame.Enemy.lvl),drp_mark,random);
					}
					
				}
			}
			
			if(drop_ID >= legendary_drop){
				equipment_level += showRandomInteger(1, 2, random);
				weapon_damage = (int) (javagame.Enemy.lvl / showRandomInteger(1,2,random));
				if(weapon_damage < 1){
					weapon_damage = 1;
				}
				weapon_value = (int) (javagame.Enemy.max_hp / 0.5);
				stat_range1 = showRandomInteger(0,4,random);
				stat_range2 = showRandomInteger(0,4,random);
				stat_range3 = showRandomInteger(0,4,random);
				while(stat_range1 == stat_range2 || stat_range1 == stat_range3){stat_range1 = showRandomInteger(0,4,random);}
				while(stat_range2 == stat_range1 || stat_range2 == stat_range3){stat_range2 = showRandomInteger(0,4,random);}
				if(stat_range1 == 0 || stat_range2 == 0 || stat_range3 == 0){
					str_mark = javagame.Enemy.lvl * 4;
					strength = showRandomInteger(str_mark-(2*javagame.Enemy.lvl),str_mark,random);
				}
				if(stat_range1 == 1 || stat_range2 == 1 || stat_range3 == 1){
					dex_mark = javagame.Enemy.lvl * 4;
					dexterity = showRandomInteger(dex_mark-(2*javagame.Enemy.lvl),dex_mark,random);
				}
				if(stat_range1 == 2 || stat_range2 == 2 || stat_range3 == 2){
					int_mark = javagame.Enemy.lvl * 4;
					intelligence = showRandomInteger(int_mark-(2*javagame.Enemy.lvl),int_mark,random);
				}
				if(stat_range1 == 3 || stat_range2 == 3 || stat_range3 == 3){
					vit_mark = javagame.Enemy.lvl * 4;
					vitality = showRandomInteger(vit_mark-(2*javagame.Enemy.lvl),vit_mark,random);
				}
				if(stat_range1 == 4 || stat_range2 == 4 || stat_range3 == 4){
					drp_mark = javagame.Enemy.lvl * 7;
					increase_drop = showRandomInteger(drp_mark-(4*javagame.Enemy.lvl),drp_mark,random);
				}
			}
			
			javagame.Player.weapon_ID += 1;
			System.out.println(WEAPON);
			for(int modifier = 0;modifier<25;modifier++){
				if(javagame.Player.Weapons[modifier][0].equals("")){
					javagame.Player.Weapons[modifier][0] = weapon_name;
					javagame.Player.Weapons[modifier][1] = weapon_damage;
					javagame.Player.Weapons[modifier][2] = weapon_value;
					javagame.Player.Weapons[modifier][3] = weapon_class;
					javagame.Player.Weapons[modifier][4] = strength;
					javagame.Player.Weapons[modifier][5] = dexterity;
					javagame.Player.Weapons[modifier][6] = intelligence;
					javagame.Player.Weapons[modifier][7] = vitality;
					javagame.Player.Weapons[modifier][8] = increase_drop;
					javagame.Player.Weapons[modifier][9] = javagame.Player.weapon_ID;
					javagame.Player.Weapons[modifier][10] = weapon_type;
					javagame.Player.Weapons[modifier][11] = equipment_level;
					break;
				}
			}
			System.out.println(javagame.Player.Weapons);
			drop_count += 1;
			WEAPON.clear();
			
			
			
			
			}
		if(ticking){
			tic -= delta * .1f;
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
		return 998;
	}
	
}
