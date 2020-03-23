package javagame;

import java.io.*;
import java.util.Scanner;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class SharedStorage extends BasicGameState{

	public String mouse = "No input yet!";
	double tic = 0;
	Image Button;
	Image Button_Pressed;
	Image Sword;
	Image Axe;
	Image Cross_Bow;
	Image Staff;
	Image Wand;
	Image Bow;
	Image Orb;
	Image Helmet;
	Image L_Potion;
	Image Potion;
	Image G_Potion;
	Image L_Regen;
	Image Regen;
	Image G_Regen;
	Image L_Mana;
	Image Mana;
	Image G_Mana;
	Image L_Elixer;
	Image Elixer;
	Image G_Elixer;
	Image HRM;
	Image Item;
	Image Item_Select;
	Image Info;
	Image view;
	Image viewP;
	boolean pots_H = false;
	boolean equipment_H = false;
	boolean pots = false;
	boolean equipment = true;
	boolean back = false;
	boolean BL_Potion = false;
	boolean BPotion = false;
	boolean BG_Potion = false;
	boolean BL_Regen = false;
	boolean BRegen = false;
	boolean BG_Regen = false;
	boolean BL_Mana = false;
	boolean BMana = false;
	boolean BG_Mana = false;
	boolean BL_Elixer = false;
	boolean BElixer = false;
	boolean BG_Elixer = false;
	boolean selected = false;
	boolean hovered = false;
	boolean equipped = false;
	boolean equipping = false;
	boolean loading_stuff = true;
	float equipping_time = 0;
	int Selected = 1;
	int Infonum;
	int storage_num = 1;
	Object[] load;
	Object[] equip, dequip = {"",0,0,"",0,0,0,0,0,0,""};
	String wep_0;
	int wep_1;
	int wep_2;
	String wep_3;
	int wep_4;
	int wep_5;
	int wep_6;
	int wep_7;
	int wep_8;
	int wep_9;
	String wep_10;
	
	public SharedStorage(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		Button = new Image("res/GUI/Button.png");
		Button_Pressed = new Image("res/GUI/Button_P.png");
		Sword = new Image("res/Sprites/Sword.png");
		Axe = new Image("res/Sprites/Axe.png");
		Cross_Bow = new Image("res/Sprites/Cross-Bow.png");
		Wand = new Image("res/Sprites/Wand.png");
		Staff = new Image("res/Sprites/Staff.png");
		Orb = new Image("res/Sprites/Orb.png");
		Bow = new Image("res/Sprites/Bow.png");
		Helmet = new Image("res/Sprites/Helmet.png");
		L_Potion = new Image("res/Sprites/Lesser_Potion.png");
		Potion = new Image("res/Sprites/Potion.png");
		G_Potion = new Image("res/Sprites/Greater_Potion.png");
		L_Regen = new Image("res/Sprites/Lesser_Regen.png");
		Regen = new Image("res/Sprites/Regen.png");
		G_Regen = new Image("res/Sprites/Greater_Regen.png");
		L_Mana = new Image("res/Sprites/Lesser_Mana.png");
		Mana = new Image("res/Sprites/Mana.png");
		G_Mana = new Image("res/Sprites/Greater_Mana.png");
		L_Elixer = new Image("res/Sprites/Lesser_Elixer.png");
		Elixer = new Image("res/Sprites/Elixer.png");
		G_Elixer = new Image("res/Sprites/Greater_Elixer.png");
		HRM = new Image("res/Sprites/H.R.M.png");
		Item = new Image("res/GUI/Item_Boarder.png");
		Item_Select = new Image("res/GUI/Item_Boarder_Selected.png");
		Info = new Image("res/GUI/Info.png");
		view = new Image("res/GUI/SD Button.png");
		viewP = new Image("res/GUI/SDP Button.png");
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString(mouse, 0, 0);
		
		//Equipment
		if(equipment){
			Button.draw(440,280);
			g.drawString("Back", 520, 310);
			if(back){
		        Button_Pressed.draw(440,280);
    		    if(back == false){
	    	    	g.clear();
		        }
		    }
			Info.draw(0,0);
			Item.draw(0,0);
			if(javagame.Player.Weapons[0][10].equals("sword")){
				Sword.draw(3,3,2);
			}else if(javagame.Player.Weapons[0][10].equals("axe")){
				Axe.draw(3,3,2);
			}else if(javagame.Player.Weapons[0][10].equals("wand")){
				Wand.draw(3,3,2);
			}else if(javagame.Player.Weapons[0][10].equals("staff")){
				Staff.draw(3,3,2);
			}else if(javagame.Player.Weapons[0][10].equals("bow")){
				Bow.draw(3,3,2);
			}else if(javagame.Player.Weapons[0][10].equals("cross-bow")){
				Cross_Bow.draw(3,3,2);
			}
			Item.draw(40,0);
			if(javagame.Player.Weapons[1][10].equals("sword")){
				Sword.draw(43,3,2);
			}else if(javagame.Player.Weapons[1][10].equals("axe")){
				Axe.draw(43,3,2);
			}else if(javagame.Player.Weapons[1][10].equals("wand")){
				Wand.draw(43,3,2);
			}else if(javagame.Player.Weapons[1][10].equals("staff")){
				Staff.draw(43,3,2);
			}else if(javagame.Player.Weapons[1][10].equals("bow")){
				Bow.draw(43,3,2);
			}else if(javagame.Player.Weapons[1][10].equals("cross-bow")){
				Cross_Bow.draw(43,3,2);
			}
			Item.draw(80,0);
			if(javagame.Player.Weapons[2][10].equals("sword")){
				Sword.draw(83,3,2);
			}else if(javagame.Player.Weapons[2][10].equals("axe")){
				Axe.draw(83,3,2);
			}else if(javagame.Player.Weapons[2][10].equals("wand")){
				Wand.draw(83,3,2);
			}else if(javagame.Player.Weapons[2][10].equals("staff")){
				Staff.draw(83,3,2);
			}else if(javagame.Player.Weapons[2][10].equals("bow")){
				Bow.draw(83,3,2);
			}else if(javagame.Player.Weapons[2][10].equals("cross-bow")){
				Cross_Bow.draw(83,3,2);
			}
			Item.draw(120,0);
			if(javagame.Player.Weapons[3][10].equals("sword")){
				Sword.draw(123,3,2);
			}else if(javagame.Player.Weapons[3][10].equals("axe")){
				Axe.draw(123,3,2);
			}else if(javagame.Player.Weapons[3][10].equals("wand")){
				Wand.draw(123,3,2);
			}else if(javagame.Player.Weapons[3][10].equals("staff")){
				Staff.draw(123,3,2);
			}else if(javagame.Player.Weapons[3][10].equals("bow")){
				Bow.draw(123,3,2);
			}else if(javagame.Player.Weapons[3][10].equals("cross-bow")){
				Cross_Bow.draw(123,3,2);
			}
			Item.draw(160,0);
			if(javagame.Player.Weapons[4][10].equals("sword")){
				Sword.draw(163,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("axe")){
				Axe.draw(163,3,2);
			}else if(javagame.Player.Weapons[4][10].equals("wand")){
				Wand.draw(163,3,2);
			}else if(javagame.Player.Weapons[4][10].equals("staff")){
				Staff.draw(163,3,2);
			}else if(javagame.Player.Weapons[4][10].equals("bow")){
				Bow.draw(163,3,2);
			}else if(javagame.Player.Weapons[4][10].equals("cross-bow")){
				Cross_Bow.draw(163,3,2);
			}
			Item.draw(0,40);
			if(javagame.Player.Weapons[5][10].equals("sword")){
				Sword.draw(3,43,2);
			}else if(javagame.Player.Weapons[5][10].equals("axe")){
				Axe.draw(3,43,2);
			}else if(javagame.Player.Weapons[5][10].equals("wand")){
				Wand.draw(3,43,2);
			}else if(javagame.Player.Weapons[5][10].equals("staff")){
				Staff.draw(3,43,2);
			}else if(javagame.Player.Weapons[5][10].equals("bow")){
				Bow.draw(3,43,2);
			}else if(javagame.Player.Weapons[5][10].equals("cross-bow")){
				Cross_Bow.draw(3,43,2);
			}
			Item.draw(40,40);
			if(javagame.Player.Weapons[6][10].equals("sword")){
				Sword.draw(43,43,2);
			}else if(javagame.Player.Weapons[6][10].equals("axe")){
				Axe.draw(43,43,2);
			}else if(javagame.Player.Weapons[6][10].equals("wand")){
				Wand.draw(43,43,2);
			}else if(javagame.Player.Weapons[6][10].equals("staff")){
				Staff.draw(43,43,2);
			}else if(javagame.Player.Weapons[6][10].equals("bow")){
				Bow.draw(43,43,2);
			}else if(javagame.Player.Weapons[6][10].equals("cross-bow")){
				Cross_Bow.draw(43,43,2);
			}
			Item.draw(80,40);
			if(javagame.Player.Weapons[7][10].equals("sword")){
				Sword.draw(83,43,2);
			}else if(javagame.Player.Weapons[7][10].equals("axe")){
				Axe.draw(83,43,2);
			}else if(javagame.Player.Weapons[7][10].equals("wand")){
				Wand.draw(83,43,2);
			}else if(javagame.Player.Weapons[7][10].equals("staff")){
				Staff.draw(83,43,2);
			}else if(javagame.Player.Weapons[7][10].equals("bow")){
				Bow.draw(83,43,2);
			}else if(javagame.Player.Weapons[7][10].equals("cross-bow")){
				Cross_Bow.draw(83,43,2);
			}
			Item.draw(120,40);
			if(javagame.Player.Weapons[8][10].equals("sword")){
				Sword.draw(123,43,2);
			}else if(javagame.Player.Weapons[8][10].equals("axe")){
				Axe.draw(123,43,2);
			}else if(javagame.Player.Weapons[8][10].equals("wand")){
				Wand.draw(123,43,2);
			}else if(javagame.Player.Weapons[8][10].equals("staff")){
				Staff.draw(123,43,2);
			}else if(javagame.Player.Weapons[8][10].equals("bow")){
				Bow.draw(123,43,2);
			}else if(javagame.Player.Weapons[8][10].equals("cross-bow")){
				Cross_Bow.draw(123,43,2);
			}
			Item.draw(160,40);
			if(javagame.Player.Weapons[9][10].equals("sword")){
				Sword.draw(163,43,2);
			}else if(javagame.Player.Weapons[9][10].equals("axe")){
				Axe.draw(163,43,2);
			}else if(javagame.Player.Weapons[9][10].equals("wand")){
				Wand.draw(163,43,2);
			}else if(javagame.Player.Weapons[9][10].equals("staff")){
				Staff.draw(163,43,2);
			}else if(javagame.Player.Weapons[9][10].equals("bow")){
				Bow.draw(163,43,2);
			}else if(javagame.Player.Weapons[9][10].equals("cross-bow")){
				Cross_Bow.draw(163,43,2);
			}
			Item.draw(0,80);
			if(javagame.Player.Weapons[10][10].equals("sword")){
				Sword.draw(3,83,2);
			}else if(javagame.Player.Weapons[10][10].equals("axe")){
				Axe.draw(3,83,2);
			}else if(javagame.Player.Weapons[10][10].equals("wand")){
				Wand.draw(3,83,2);
			}else if(javagame.Player.Weapons[10][10].equals("staff")){
				Staff.draw(3,83,2);
			}else if(javagame.Player.Weapons[10][10].equals("bow")){
				Bow.draw(3,83,2);
			}else if(javagame.Player.Weapons[10][10].equals("cross-bow")){
				Cross_Bow.draw(3,83,2);
			}
			Item.draw(40,80);
			if(javagame.Player.Weapons[11][10].equals("sword")){
				Sword.draw(43,83,2);
			}else if(javagame.Player.Weapons[11][10].equals("axe")){
				Axe.draw(43,83,2);
			}else if(javagame.Player.Weapons[11][10].equals("wand")){
				Wand.draw(43,83,2);
			}else if(javagame.Player.Weapons[11][10].equals("staff")){
				Staff.draw(43,83,2);
			}else if(javagame.Player.Weapons[11][10].equals("bow")){
				Bow.draw(43,83,2);
			}else if(javagame.Player.Weapons[11][10].equals("cross-bow")){
				Cross_Bow.draw(43,83,2);
			}
			Item.draw(80,80);
			if(javagame.Player.Weapons[12][10].equals("sword")){
				Sword.draw(83,83,2);
			}else if(javagame.Player.Weapons[12][10].equals("axe")){
				Axe.draw(83,83,2);
			}else if(javagame.Player.Weapons[12][10].equals("wand")){
				Wand.draw(83,83,2);
			}else if(javagame.Player.Weapons[12][10].equals("staff")){
				Staff.draw(83,83,2);
			}else if(javagame.Player.Weapons[12][10].equals("bow")){
				Bow.draw(83,83,2);
			}else if(javagame.Player.Weapons[12][10].equals("cross-bow")){
				Cross_Bow.draw(83,83,2);
			}
			Item.draw(120,80);
			if(javagame.Player.Weapons[13][10].equals("sword")){
				Sword.draw(123,83,2);
			}else if(javagame.Player.Weapons[13][10].equals("axe")){
				Axe.draw(123,83,2);
			}else if(javagame.Player.Weapons[13][10].equals("wand")){
				Wand.draw(123,83,2);
			}else if(javagame.Player.Weapons[13][10].equals("staff")){
				Staff.draw(123,83,2);
			}else if(javagame.Player.Weapons[13][10].equals("bow")){
				Bow.draw(123,83,2);
			}else if(javagame.Player.Weapons[13][10].equals("cross-bow")){
				Cross_Bow.draw(123,83,2);
			}
			Item.draw(160,80);
			if(javagame.Player.Weapons[14][10].equals("sword")){
				Sword.draw(163,83,2);
			}else if(javagame.Player.Weapons[14][10].equals("axe")){
				Axe.draw(163,83,2);
			}else if(javagame.Player.Weapons[14][10].equals("wand")){
				Wand.draw(163,83,2);
			}else if(javagame.Player.Weapons[14][10].equals("staff")){
				Staff.draw(163,83,2);
			}else if(javagame.Player.Weapons[14][10].equals("bow")){
				Bow.draw(163,83,2);
			}else if(javagame.Player.Weapons[14][10].equals("cross-bow")){
				Cross_Bow.draw(163,83,2);
			}
			Item.draw(0,120);
			if(javagame.Player.Weapons[15][10].equals("sword")){
				Sword.draw(3,123,2);
			}else if(javagame.Player.Weapons[15][10].equals("axe")){
				Axe.draw(3,123,2);
			}else if(javagame.Player.Weapons[15][10].equals("wand")){
				Wand.draw(3,123,2);
			}else if(javagame.Player.Weapons[15][10].equals("staff")){
				Staff.draw(3,123,2);
			}else if(javagame.Player.Weapons[15][10].equals("bow")){
				Bow.draw(3,123,2);
			}else if(javagame.Player.Weapons[15][10].equals("cross-bow")){
				Cross_Bow.draw(3,123,2);
			}
			Item.draw(40,120);
			if(javagame.Player.Weapons[16][10].equals("sword")){
				Sword.draw(43,123,2);
			}else if(javagame.Player.Weapons[16][10].equals("axe")){
				Axe.draw(43,123,2);
			}else if(javagame.Player.Weapons[16][10].equals("wand")){
				Wand.draw(43,123,2);
			}else if(javagame.Player.Weapons[16][10].equals("staff")){
				Staff.draw(43,123,2);
			}else if(javagame.Player.Weapons[16][10].equals("bow")){
				Bow.draw(43,123,2);
			}else if(javagame.Player.Weapons[16][10].equals("cross-bow")){
				Cross_Bow.draw(43,123,2);
			}
			Item.draw(80,120);
			if(javagame.Player.Weapons[17][10].equals("sword")){
				Sword.draw(83,123,2);
			}else if(javagame.Player.Weapons[17][10].equals("axe")){
				Axe.draw(83,123,2);
			}else if(javagame.Player.Weapons[17][10].equals("wand")){
				Wand.draw(83,123,2);
			}else if(javagame.Player.Weapons[17][10].equals("staff")){
				Staff.draw(83,123,2);
			}else if(javagame.Player.Weapons[17][10].equals("bow")){
				Bow.draw(83,123,2);
			}else if(javagame.Player.Weapons[17][10].equals("cross-bow")){
				Cross_Bow.draw(83,123,2);
			}
			Item.draw(120,120);
			if(javagame.Player.Weapons[18][10].equals("sword")){
				Sword.draw(123,123,2);
			}else if(javagame.Player.Weapons[18][10].equals("axe")){
				Axe.draw(123,123,2);
			}else if(javagame.Player.Weapons[18][10].equals("wand")){
				Wand.draw(123,123,2);
			}else if(javagame.Player.Weapons[18][10].equals("staff")){
				Staff.draw(123,123,2);
			}else if(javagame.Player.Weapons[18][10].equals("bow")){
				Bow.draw(123,123,2);
			}else if(javagame.Player.Weapons[18][10].equals("cross-bow")){
				Cross_Bow.draw(123,123,2);
			}
			Item.draw(160,120);
			if(javagame.Player.Weapons[19][10].equals("sword")){
				Sword.draw(163,123,2);
			}else if(javagame.Player.Weapons[19][10].equals("axe")){
				Axe.draw(163,123,2);
			}else if(javagame.Player.Weapons[19][10].equals("wand")){
				Wand.draw(163,123,2);
			}else if(javagame.Player.Weapons[19][10].equals("staff")){
				Staff.draw(163,123,2);
			}else if(javagame.Player.Weapons[19][10].equals("bow")){
				Bow.draw(163,123,2);
			}else if(javagame.Player.Weapons[19][10].equals("cross-bow")){
				Cross_Bow.draw(163,123,2);
			}
			Item.draw(0,160);
			if(javagame.Player.Weapons[20][10].equals("sword")){
				Sword.draw(3,163,2);
			}else if(javagame.Player.Weapons[20][10].equals("axe")){
				Axe.draw(3,163,2);
			}else if(javagame.Player.Weapons[20][10].equals("wand")){
				Wand.draw(3,163,2);
			}else if(javagame.Player.Weapons[20][10].equals("staff")){
				Staff.draw(3,163,2);
			}else if(javagame.Player.Weapons[20][10].equals("bow")){
				Bow.draw(3,163,2);
			}else if(javagame.Player.Weapons[20][10].equals("cross-bow")){
				Cross_Bow.draw(3,163,2);
			}
			Item.draw(40,160);
			if(javagame.Player.Weapons[21][10].equals("sword")){
				Sword.draw(43,163,2);
			}else if(javagame.Player.Weapons[21][10].equals("axe")){
				Axe.draw(43,163,2);
			}else if(javagame.Player.Weapons[21][10].equals("wand")){
				Wand.draw(43,163,2);
			}else if(javagame.Player.Weapons[21][10].equals("staff")){
				Staff.draw(43,163,2);
			}else if(javagame.Player.Weapons[21][10].equals("bow")){
				Bow.draw(43,163,2);
			}else if(javagame.Player.Weapons[21][10].equals("cross-bow")){
				Cross_Bow.draw(43,163,2);
			}
			Item.draw(80,160);
			if(javagame.Player.Weapons[22][10].equals("sword")){
				Sword.draw(83,163,2);
			}else if(javagame.Player.Weapons[22][10].equals("axe")){
				Axe.draw(83,163,2);
			}else if(javagame.Player.Weapons[22][10].equals("wand")){
				Wand.draw(83,163,2);
			}else if(javagame.Player.Weapons[22][10].equals("staff")){
				Staff.draw(83,163,2);
			}else if(javagame.Player.Weapons[22][10].equals("bow")){
				Bow.draw(83,163,2);
			}else if(javagame.Player.Weapons[22][10].equals("cross-bow")){
				Cross_Bow.draw(83,163,2);
			}
			Item.draw(120,160);
			if(javagame.Player.Weapons[23][10].equals("sword")){
				Sword.draw(123,163,2);
			}else if(javagame.Player.Weapons[23][10].equals("axe")){
				Axe.draw(123,163,2);
			}else if(javagame.Player.Weapons[23][10].equals("wand")){
				Wand.draw(123,163,2);
			}else if(javagame.Player.Weapons[23][10].equals("staff")){
				Staff.draw(123,163,2);
			}else if(javagame.Player.Weapons[23][10].equals("bow")){
				Bow.draw(123,163,2);
			}else if(javagame.Player.Weapons[23][10].equals("cross-bow")){
				Cross_Bow.draw(123,163,2);
			}
			Item.draw(160,160);
			if(javagame.Player.Weapons[24][10].equals("sword")){
				Sword.draw(163,163,2);
			}else if(javagame.Player.Weapons[24][10].equals("axe")){
				Axe.draw(163,163,2);
			}else if(javagame.Player.Weapons[24][10].equals("wand")){
				Wand.draw(163,163,2);
			}else if(javagame.Player.Weapons[24][10].equals("staff")){
				Staff.draw(163,163,2);
			}else if(javagame.Player.Weapons[24][10].equals("bow")){
				Bow.draw(163,163,2);
			}else if(javagame.Player.Weapons[24][10].equals("cross-bow")){
				Cross_Bow.draw(163,163,2);
			}
			
			
			
			//Storage
			Item.draw(0,322);
			Item.draw(0,282);
			Item.draw(0,242);
			Item.draw(40,322);
			Item.draw(40,282);
			Item.draw(40,242);
			Item.draw(80,322);
			Item.draw(80,282);
			Item.draw(80,242);
			Item.draw(120,322);
			Item.draw(120,282);
			Item.draw(120,242);
			Item.draw(160,322);
			Item.draw(160,282);
			Item.draw(160,242);
			Item.draw(200,322);
			Item.draw(200,282);
			Item.draw(200,242);
			view.draw(240,322);
			view.draw(240,282);
			view.draw(240,242);
			if(storage_num == 1){
				viewP.draw(240,242);
				viewP.draw(240,242);
				//1-1
				if(javagame.Storage_Info.Storage1[0][10].equals("sword")){
					Sword.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage1[0][10].equals("axe")){
					Axe.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage1[0][10].equals("wand")){
					Wand.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage1[0][10].equals("staff")){
					Staff.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage1[0][10].equals("bow")){
					Bow.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage1[0][10].equals("cross-bow")){
					Cross_Bow.draw(3,245,2);
				}
				//1-2
				if(javagame.Storage_Info.Storage1[1][10].equals("sword")){
					Sword.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage1[1][10].equals("axe")){
					Axe.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage1[1][10].equals("wand")){
					Wand.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage1[1][10].equals("staff")){
					Staff.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage1[1][10].equals("bow")){
					Bow.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage1[1][10].equals("cross-bow")){
					Cross_Bow.draw(43,245,2);
				}
				//1-3
				if(javagame.Storage_Info.Storage1[2][10].equals("sword")){
					Sword.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage1[2][10].equals("axe")){
					Axe.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage1[2][10].equals("wand")){
					Wand.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage1[2][10].equals("staff")){
					Staff.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage1[2][10].equals("bow")){
					Bow.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage1[2][10].equals("cross-bow")){
					Cross_Bow.draw(83,245,2);
				}
				//1-4
				if(javagame.Storage_Info.Storage1[3][10].equals("sword")){
					Sword.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage1[3][10].equals("axe")){
					Axe.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage1[3][10].equals("wand")){
					Wand.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage1[3][10].equals("staff")){
					Staff.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage1[3][10].equals("bow")){
					Bow.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage1[3][10].equals("cross-bow")){
					Cross_Bow.draw(123,245,2);
				}
				//1-5
				if(javagame.Storage_Info.Storage1[4][10].equals("sword")){
					Sword.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage1[4][10].equals("axe")){
					Axe.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage1[4][10].equals("wand")){
					Wand.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage1[4][10].equals("staff")){
					Staff.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage1[4][10].equals("bow")){
					Bow.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage1[4][10].equals("cross-bow")){
					Cross_Bow.draw(163,245,2);
				}
				//1-6
				if(javagame.Storage_Info.Storage1[5][10].equals("sword")){
					Sword.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage1[5][10].equals("axe")){
					Axe.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage1[5][10].equals("wand")){
					Wand.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage1[5][10].equals("staff")){
					Staff.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage1[5][10].equals("bow")){
					Bow.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage1[5][10].equals("cross-bow")){
					Cross_Bow.draw(203,245,2);
				}
			}
			if(storage_num == 2){
				//1-1
				if(javagame.Storage_Info.Storage2[0][10].equals("sword")){
					Sword.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage2[0][10].equals("axe")){
					Axe.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage2[0][10].equals("wand")){
					Wand.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage2[0][10].equals("staff")){
					Staff.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage2[0][10].equals("bow")){
					Bow.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage2[0][10].equals("cross-bow")){
					Cross_Bow.draw(3,245,2);
				}
				//1-2
				if(javagame.Storage_Info.Storage2[1][10].equals("sword")){
					Sword.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage2[1][10].equals("axe")){
					Axe.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage2[1][10].equals("wand")){
					Wand.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage2[1][10].equals("staff")){
					Staff.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage2[1][10].equals("bow")){
					Bow.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage2[1][10].equals("cross-bow")){
					Cross_Bow.draw(43,245,2);
				}
				//1-3
				if(javagame.Storage_Info.Storage2[2][10].equals("sword")){
					Sword.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage2[2][10].equals("axe")){
					Axe.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage2[2][10].equals("wand")){
					Wand.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage2[2][10].equals("staff")){
					Staff.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage2[2][10].equals("bow")){
					Bow.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage2[2][10].equals("cross-bow")){
					Cross_Bow.draw(83,245,2);
				}
				//1-4
				if(javagame.Storage_Info.Storage2[3][10].equals("sword")){
					Sword.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage2[3][10].equals("axe")){
					Axe.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage2[3][10].equals("wand")){
					Wand.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage2[3][10].equals("staff")){
					Staff.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage2[3][10].equals("bow")){
					Bow.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage2[3][10].equals("cross-bow")){
					Cross_Bow.draw(123,245,2);
				}
				//1-5
				if(javagame.Storage_Info.Storage2[4][10].equals("sword")){
					Sword.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage2[4][10].equals("axe")){
					Axe.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage2[4][10].equals("wand")){
					Wand.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage2[4][10].equals("staff")){
					Staff.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage2[4][10].equals("bow")){
					Bow.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage2[4][10].equals("cross-bow")){
					Cross_Bow.draw(163,245,2);
				}
				//1-6
				if(javagame.Storage_Info.Storage2[5][10].equals("sword")){
					Sword.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage2[5][10].equals("axe")){
					Axe.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage2[5][10].equals("wand")){
					Wand.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage2[5][10].equals("staff")){
					Staff.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage2[5][10].equals("bow")){
					Bow.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage2[5][10].equals("cross-bow")){
					Cross_Bow.draw(203,245,2);
				}
				viewP.draw(240,282);
				viewP.draw(240,282);
			}
			if(storage_num == 3){
				//1-1
				if(javagame.Storage_Info.Storage3[0][10].equals("sword")){
					Sword.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage3[0][10].equals("axe")){
					Axe.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage3[0][10].equals("wand")){
					Wand.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage3[0][10].equals("staff")){
					Staff.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage3[0][10].equals("bow")){
					Bow.draw(3,245,2);
				}else if(javagame.Storage_Info.Storage3[0][10].equals("cross-bow")){
					Cross_Bow.draw(3,245,2);
				}
				//1-2
				if(javagame.Storage_Info.Storage3[1][10].equals("sword")){
					Sword.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage3[1][10].equals("axe")){
					Axe.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage3[1][10].equals("wand")){
					Wand.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage3[1][10].equals("staff")){
					Staff.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage3[1][10].equals("bow")){
					Bow.draw(43,245,2);
				}else if(javagame.Storage_Info.Storage3[1][10].equals("cross-bow")){
					Cross_Bow.draw(43,245,2);
				}
				//1-3
				if(javagame.Storage_Info.Storage3[2][10].equals("sword")){
					Sword.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage3[2][10].equals("axe")){
					Axe.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage3[2][10].equals("wand")){
					Wand.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage3[2][10].equals("staff")){
					Staff.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage3[2][10].equals("bow")){
					Bow.draw(83,245,2);
				}else if(javagame.Storage_Info.Storage3[2][10].equals("cross-bow")){
					Cross_Bow.draw(83,245,2);
				}
				//1-4
				if(javagame.Storage_Info.Storage3[3][10].equals("sword")){
					Sword.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage3[3][10].equals("axe")){
					Axe.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage3[3][10].equals("wand")){
					Wand.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage3[3][10].equals("staff")){
					Staff.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage3[3][10].equals("bow")){
					Bow.draw(123,245,2);
				}else if(javagame.Storage_Info.Storage3[3][10].equals("cross-bow")){
					Cross_Bow.draw(123,245,2);
				}
				//1-5
				if(javagame.Storage_Info.Storage3[4][10].equals("sword")){
					Sword.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage3[4][10].equals("axe")){
					Axe.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage3[4][10].equals("wand")){
					Wand.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage3[4][10].equals("staff")){
					Staff.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage3[4][10].equals("bow")){
					Bow.draw(163,245,2);
				}else if(javagame.Storage_Info.Storage3[4][10].equals("cross-bow")){
					Cross_Bow.draw(163,245,2);
				}
				//1-6
				if(javagame.Storage_Info.Storage3[5][10].equals("sword")){
					Sword.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage3[5][10].equals("axe")){
					Axe.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage3[5][10].equals("wand")){
					Wand.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage3[5][10].equals("staff")){
					Staff.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage3[5][10].equals("bow")){
					Bow.draw(203,245,2);
				}else if(javagame.Storage_Info.Storage3[5][10].equals("cross-bow")){
					Cross_Bow.draw(203,245,2);
				}
				viewP.draw(240,322);
				viewP.draw(240,322);
			}
			
			if(Selected == 44 && storage_num != 1){
				viewP.draw(240,242);
			}if(Selected == 45 && storage_num != 2){
				viewP.draw(240,282);
			}if(Selected == 46 && storage_num != 3){
				viewP.draw(240,322);
			}
			
			if(javagame.Storage_Info.Storage2_Unlocked == false){
				g.drawString("$1000", 243, 292);
			}else{
				g.drawString("2", 260, 292);
			}
			if(javagame.Storage_Info.Storage3_Unlocked == false){
				g.drawString("$1000", 243, 332);
			}else{
				g.drawString("3", 260, 332);
			}
			
			g.drawString("1", 260, 252);
			g.drawString("$: " + javagame.Player.money, 320, 302);
			
			if(Selected == 1){
				Item_Select.draw(0,0);
			}
			if(Selected == 2){
				Item_Select.draw(40,0);
			}
			if(Selected == 3){
				Item_Select.draw(80,0);
			}
			if(Selected == 4){
				Item_Select.draw(120,0);
			}
			if(Selected == 5){
				Item_Select.draw(160,0);
			}
			if(Selected == 6){
				Item_Select.draw(0,40);
			}
			if(Selected == 7){
				Item_Select.draw(40,40);
			}
			if(Selected == 8){
				Item_Select.draw(80,40);
			}
			if(Selected == 9){
				Item_Select.draw(120,40);
			}
			if(Selected == 10){
				Item_Select.draw(160,40);
			}
			if(Selected == 11){
				Item_Select.draw(0,80);
			}
			if(Selected == 12){
				Item_Select.draw(40,80);
			}
			if(Selected == 13){
				Item_Select.draw(80,80);
			}
			if(Selected == 14){
				Item_Select.draw(120,80);
			}
			if(Selected == 15){
				Item_Select.draw(160,80);
			}
			if(Selected == 16){
				Item_Select.draw(0,120);
			}
			if(Selected == 17){
				Item_Select.draw(40,120);
			}
			if(Selected == 18){
				Item_Select.draw(80,120);
			}
			if(Selected == 19){
				Item_Select.draw(120,120);
			}
			if(Selected == 20){
				Item_Select.draw(160,120);
			}
			if(Selected == 21){
				Item_Select.draw(0,160);
			}
			if(Selected == 22){
				Item_Select.draw(40,160);
			}
			if(Selected == 23){
				Item_Select.draw(80,160);
			}
			if(Selected == 24){
				Item_Select.draw(120,160);
			}
			if(Selected == 25){
				Item_Select.draw(160,160);
			}
			
			//Storage
			if(Selected == 26){
				Item_Select.draw(0,242);
			}
			if(Selected == 27){
				Item_Select.draw(40,242);
			}
			if(Selected == 28){
				Item_Select.draw(80,242);
			}
			if(Selected == 29){
				Item_Select.draw(120,242);
			}
			if(Selected == 30){
				Item_Select.draw(160,242);
			}
			if(Selected == 31){
				Item_Select.draw(200,242);
			}
			if(Selected == 32){
				Item_Select.draw(0,282);
			}
			if(Selected == 33){
				Item_Select.draw(40,282);
			}
			if(Selected == 34){
				Item_Select.draw(80,282);
			}
			if(Selected == 35){
				Item_Select.draw(120,282);
			}
			if(Selected == 36){
				Item_Select.draw(160,282);
			}
			if(Selected == 37){
				Item_Select.draw(200,282);
			}
			if(Selected == 38){
				Item_Select.draw(0,322);
			}
			if(Selected == 39){
				Item_Select.draw(40,322);
			}
			if(Selected == 40){
				Item_Select.draw(80,322);
			}
			if(Selected == 41){
				Item_Select.draw(120,322);
			}
			if(Selected == 42){
				Item_Select.draw(160,322);
			}
			if(Selected == 43){
				Item_Select.draw(200,322);
			}

			if(selected && equipped == false){
				if(Selected <= 25){
				if(javagame.Player.Weapons[Selected-1][10].equals("null")){
					g.drawString("EMPTY", 450, 120);
				}else try{
    			g.drawString((String)(javagame.Player.Weapons[Selected-1][0]), 305, 5);
            	g.drawString("Value: " + (Integer)(javagame.Player.Weapons[Selected-1][2]), 310, 30);
            	g.drawString("Damage: " + (Integer)(javagame.Player.Weapons[Selected-1][1]), 310, 60);
        	    g.drawString("Str: " + (Integer)(javagame.Player.Weapons[Selected-1][4]), 310, 90);
            	g.drawString("Dex: " + (Integer)(javagame.Player.Weapons[Selected-1][5]), 310, 120);
            	g.drawString("Int: " + (Integer)(javagame.Player.Weapons[Selected-1][6]), 310, 150);
            	g.drawString("Vit: " + (Integer)(javagame.Player.Weapons[Selected-1][7]), 310, 180);
        	    g.drawString("Drop Rate: " + (Integer)(javagame.Player.Weapons[Selected-1][8]), 310, 210);
        	    g.drawString("Class: " + (String)(javagame.Player.Weapons[Selected-1][3]), 310, 240);
				}catch(Exception e){
					g.drawString("EMPTY", 450, 120);
				}
				}
				
				if(Selected > 25 && Selected < 44){
					if(storage_num == 1){
					if(javagame.Storage_Info.Storage1[Selected-26][10].equals("null")){
						g.drawString("EMPTY", 450, 120);
					}else try{
	    			g.drawString((String)(javagame.Storage_Info.Storage1[Selected-26][0]), 305, 5);
	            	g.drawString("Value: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][2]), 310, 30);
	            	g.drawString("Damage: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][1]), 310, 60);
	        	    g.drawString("Str: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][4]), 310, 90);
	            	g.drawString("Dex: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][5]), 310, 120);
	            	g.drawString("Int: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][6]), 310, 150);
	            	g.drawString("Vit: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][7]), 310, 180);
	        	    g.drawString("Drop Rate: " + (Integer)(javagame.Storage_Info.Storage1[Selected-26][8]), 310, 210);
	        	    g.drawString("Class: " + (String)(javagame.Storage_Info.Storage1[Selected-26][3]), 310, 240);
					}catch(Exception e){
						g.drawString("EMPTY", 450, 120);
					}}
					if(storage_num == 2){
						if(javagame.Storage_Info.Storage2[Selected-26][10].equals("null")){
							g.drawString("EMPTY", 450, 120);
						}else try{
		    			g.drawString((String)(javagame.Storage_Info.Storage2[Selected-26][0]), 305, 5);
		            	g.drawString("Value: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][2]), 310, 30);
		            	g.drawString("Damage: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][1]), 310, 60);
		        	    g.drawString("Str: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][4]), 310, 90);
		            	g.drawString("Dex: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][5]), 310, 120);
		            	g.drawString("Int: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][6]), 310, 150);
		            	g.drawString("Vit: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][7]), 310, 180);
		        	    g.drawString("Drop Rate: " + (Integer)(javagame.Storage_Info.Storage2[Selected-26][8]), 310, 210);
		        	    g.drawString("Class: " + (String)(javagame.Storage_Info.Storage2[Selected-26][3]), 310, 240);
						}catch(Exception e){
							g.drawString("EMPTY", 450, 120);
						}}
					if(storage_num == 3){
						if(javagame.Storage_Info.Storage3[Selected-26][10].equals("null")){
							g.drawString("EMPTY", 450, 120);
						}else try{
		    			g.drawString((String)(javagame.Storage_Info.Storage3[Selected-26][0]), 305, 5);
		            	g.drawString("Value: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][2]), 310, 30);
		            	g.drawString("Damage: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][1]), 310, 60);
		        	    g.drawString("Str: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][4]), 310, 90);
		            	g.drawString("Dex: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][5]), 310, 120);
		            	g.drawString("Int: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][6]), 310, 150);
		            	g.drawString("Vit: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][7]), 310, 180);
		        	    g.drawString("Drop Rate: " + (Integer)(javagame.Storage_Info.Storage3[Selected-26][8]), 310, 210);
		        	    g.drawString("Class: " + (String)(javagame.Storage_Info.Storage3[Selected-26][3]), 310, 240);
						}catch(Exception e){
							g.drawString("EMPTY", 450, 120);
						}}
				}
			}
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		tic -= delta * .1f;
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		
		if(loading_stuff){
			loading_stuff = false;
			Load_Share();
		}
		
		
		//Equipment
		if(equipment){
			//Back Button
	    	if((posX>440 && posX<640) && (posY>0 && posY<80)){
		    	back = true;
			    if(Mouse.isButtonDown(0) && tic <= 0){
			    	loading_stuff = true;
			    	Save_Share();
			    	if(javagame.Player.save_location == 1){
						javagame.Save.Save1();	
					}else if(javagame.Player.save_location == 2){
						javagame.Save.Save2();	
					}else if(javagame.Player.save_location == 3){
						javagame.Save.Save3();	
					}
					tic = 50;
					sbg.enterState(javagame.Player.room);
	    		}
	    	}else{
		    	back = false;
    		}
	    	
	    	equipping_time -= delta * .1f;
	    	
	    	//Equip1
	    	if(posX>0 && posX<38 && posY<360 && posY>322){
	    		Selected = 1;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(0);
	    		}
	    	}
	    	//Equip2
	    	if(posX>40 && posX<78 && posY<360 && posY>322){
	    		Selected = 2;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(1);
	    		}
	    	}
	    	//Equip3
	    	if(posX>80 && posX<118 && posY<360 && posY>322){
	    		Selected = 3;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(2);
	    		}
	    	}
	    	//Equip4
	    	if(posX>120 && posX<158 && posY<360 && posY>322){
	    		Selected = 4;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(3);
	    		}
	    	}
	    	//Equip5
	    	if(posX>160 && posX<198 && posY<360 && posY>322){
	    		Selected = 5;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(4);
	    		}
	    	}
	    	//Equip6
	    	if(posX>0 && posX<38 && posY<320 && posY>282){
	    		Selected = 6;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(5);
	    		}
	    	}
	    	//Equip7
	    	if(posX>40 && posX<78 && posY<320 && posY>282){
	    		Selected = 7;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(6);
	    		}
	    	}
	    	//Equip8
	    	if(posX>80 && posX<118 && posY<320 && posY>282){
	    		Selected = 8;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(7);
	    		}
	    	}
	    	//Equip9
	    	if(posX>120 && posX<158 && posY<320 && posY>282){
	    		Selected = 9;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(8);
	    		}
	    	}
	    	//Equip10
	    	if(posX>160 && posX<198 && posY<320 && posY>282){
	    		Selected = 10;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(9);
	    		}
	    	}
	    	//Equip11
	    	if(posX>0 && posX<38 && posY<280 && posY>242){
	    		Selected = 11;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(10);
	    		}
	    	}
	    	//Equip12
	    	if(posX>40 && posX<78 && posY<280 && posY>242){
	    		Selected = 12;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(11);
	    		}
	    	}
	    	//Equip13
	    	if(posX>80 && posX<118 && posY<280 && posY>242){
	    		Selected = 13;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(12);
	    		}
	    	}
	    	//Equip14
	    	if(posX>120 && posX<158 && posY<280 && posY>242){
	    		Selected = 14;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(13);
	    		}
	    	}
	    	//Equip15
	    	if(posX>160 && posX<198 && posY<280 && posY>242){
	    		Selected = 15;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(14);
	    		}
	    	}
	    	//Equip16
	    	if(posX>0 && posX<38 && posY<240 && posY>202){
	    		Selected = 16;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(15);
	    		}
	    	}
	    	//Equip17
	    	if(posX>40 && posX<78 && posY<240 && posY>202){
	    		Selected = 17;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(16);
	    		}
	    	}
	    	//Equip18
	    	if(posX>80 && posX<118 && posY<240 && posY>202){
	    		Selected = 18;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(17);
	    		}
	    	}
	    	//Equip19
	    	if(posX>120 && posX<158 && posY<240 && posY>202){
	    		Selected = 19;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(18);
	    		}
	    	}
	    	//Equip20
	    	if(posX>160 && posX<198 && posY<240 && posY>202){
	    		Selected = 20;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(19);
	    		}
	    	}
	    	//Equip21
	    	if(posX>0 && posX<38 && posY<200 && posY>162){
	    		Selected = 21;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(20);
	    		}
	    	}
	    	//Equip22
	    	if(posX>40 && posX<78 && posY<200 && posY>162){
	    		Selected = 22;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(21);
	    		}
	    	}
	    	//Equip23
	    	if(posX>80 && posX<118 && posY<200 && posY>162){
	    		Selected = 23;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(22);
	    		}
	    	}
	    	//Equip24
	    	if(posX>120 && posX<158 && posY<200 && posY>162){
	    		Selected = 24;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(23);
	    		}
	    	}
	    	//Equip25
	    	if(posX>160 && posX<198 && posY<200 && posY>162){
	    		Selected = 25;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(24);
	    		}
	    	}
	    	
	    	//Storage Level 1
	    	if(posX>0 && posX<38 && posY<118 && posY>80){
	    		Selected = 26;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(0);
	    		}
	    	}
	    	if(posX>40 && posX<78 && posY<118 && posY>80){
	    		Selected = 27;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(1);
	    		}
	    	}
	    	if(posX>80 && posX<118 && posY<118 && posY>80){
	    		Selected = 28;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(2);
	    		}
	    	}
	    	if(posX>120 && posX<158 && posY<118 && posY>80){
	    		Selected = 29;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(3);
	    		}
	    	}
	    	if(posX>160 && posX<198 && posY<118 && posY>80){
	    		Selected = 30;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(4);
	    		}
	    	}
	    	if(posX>200 && posX<238 && posY<118 && posY>80){
	    		Selected = 31;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(5);
	    		}
	    	}
	    	
	    	//Storage Level 2
	    	if(posX>0 && posX<38 && posY<78 && posY>40){
	    		Selected = 32;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(6);
	    		}
	    	}
	    	if(posX>40 && posX<78 && posY<78 && posY>40){
	    		Selected = 33;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(7);
	    		}
	    	}
	    	if(posX>80 && posX<118 && posY<78 && posY>40){
	    		Selected = 34;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(8);
	    		}
	    	}
	    	if(posX>120 && posX<158 && posY<78 && posY>40){
	    		Selected = 35;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(9);
	    		}
	    	}
	    	if(posX>160 && posX<198 && posY<78 && posY>40){
	    		Selected = 36;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(10);
	    		}
	    	}
	    	if(posX>200 && posX<238 && posY<78 && posY>40){
	    		Selected = 37;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(11);
	    		}
	    	}
	    	
	    	//Storage Level 3
	    	if(posX>0 && posX<38 && posY<38 && posY>0){
	    		Selected = 38;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(12);
	    		}
	    	}
	    	if(posX>40 && posX<78 && posY<38 && posY>0){
	    		Selected = 39;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(13);
	    		}
	    	}
	    	if(posX>80 && posX<118 && posY<38 && posY>0){
	    		Selected = 40;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(14);
	    		}
	    	}
	    	if(posX>120 && posX<158 && posY<38 && posY>0){
	    		Selected = 41;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(15);
	    		}
	    	}
	    	if(posX>160 && posX<198 && posY<38 && posY>0){
	    		Selected = 42;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(16);
	    		}
	    	}
	    	if(posX>200 && posX<238 && posY<38 && posY>0){
	    		Selected = 43;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			moving(17);
	    		}
	    	}
	    	
	    	//Storage Buttons
	    	if(posX>240 && posX<298 && posY<118 && posY>80){
	    		Selected = 44;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			storage_num = 1;
	    		}
	    	}if(posX>240 && posX<298 && posY<78 && posY>40){
	    		Selected = 45;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0 && javagame.Storage_Info.Storage2_Unlocked){
	    			storage_num = 2;
	    		}else if(javagame.Storage_Info.Storage2_Unlocked == false && Mouse.isButtonDown(0)){
	    			if(javagame.Player.money >= 1000){
	    				javagame.Player.money -= 1000;
	    				javagame.Storage_Info.Storage2_Unlocked = true;
	    			}
	    		}
	    	}if(posX>240 && posX<298 && posY<38 && posY>0){
	    		Selected = 46;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0 && javagame.Storage_Info.Storage3_Unlocked){
	    			storage_num = 3;
	    		}else if(javagame.Storage_Info.Storage3_Unlocked == false && Mouse.isButtonDown(0)){
	    			if(javagame.Player.money >= 1000){
	    				javagame.Player.money -= 1000;
	    				javagame.Storage_Info.Storage3_Unlocked = true;
	    			}
	    		}
	    	}
	    	
	    	Input input = gc.getInput();
			if(input.isKeyPressed(Input.KEY_LALT) && input.isKeyPressed(Input.KEY_LSHIFT) && input.isKeyPressed(Input.KEY_LCONTROL) && input.isKeyDown(Input.KEY_M)){
	    		javagame.Player.money += 1000;
	    	}
		}
	}
	
	public void equipping(int number){
		boolean load = true;
		int x = 0;
		if(storage_num == 1){
		while(load && x < 18){
			if(javagame.Storage_Info.Storage1[x][10].equals("null")){
				equipping_time = 40;
				javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
				wep_0 = (String) javagame.Player.Weapons[number][0];
				wep_1 = (Integer) javagame.Player.Weapons[number][1];
				wep_2 = (Integer) javagame.Player.Weapons[number][2];
				wep_3 = (String) javagame.Player.Weapons[number][3];
				wep_4 = (Integer) javagame.Player.Weapons[number][4];
				wep_5 = (Integer) javagame.Player.Weapons[number][5];
				wep_6 = (Integer) javagame.Player.Weapons[number][6];
				wep_7 = (Integer) javagame.Player.Weapons[number][7];
				wep_8 = (Integer) javagame.Player.Weapons[number][8];
				wep_9 = (Integer) javagame.Player.Weapons[number][9];
				wep_10 = (String) javagame.Player.Weapons[number][10];
				javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage1[x][0];
				javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage1[x][1];
				javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage1[x][2];
				javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage1[x][3];
				javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage1[x][4];
				javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage1[x][5];
				javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage1[x][6];
				javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage1[x][7];
				javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage1[x][8];
				javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage1[x][9];
				javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage1[x][10];
				javagame.Storage_Info.Storage1[x][0] = wep_0;
				javagame.Storage_Info.Storage1[x][1] = wep_1;
				javagame.Storage_Info.Storage1[x][2] = wep_2;
				javagame.Storage_Info.Storage1[x][3] = wep_3;
				javagame.Storage_Info.Storage1[x][4] = wep_4;
				javagame.Storage_Info.Storage1[x][5] = wep_5;
				javagame.Storage_Info.Storage1[x][6] = wep_6;
				javagame.Storage_Info.Storage1[x][7] = wep_7;
				javagame.Storage_Info.Storage1[x][8] = wep_8;
				javagame.Storage_Info.Storage1[x][9] = wep_9;
				javagame.Storage_Info.Storage1[x][10] = wep_10;
				load = false;
				equipping = false;
			}
			x += 1;
		}}
		
		if(storage_num == 2){
			while(load && x < 18){
				if(javagame.Storage_Info.Storage2[x][10].equals("null")){
					equipping_time = 40;
					javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
					wep_0 = (String) javagame.Player.Weapons[number][0];
					wep_1 = (Integer) javagame.Player.Weapons[number][1];
					wep_2 = (Integer) javagame.Player.Weapons[number][2];
					wep_3 = (String) javagame.Player.Weapons[number][3];
					wep_4 = (Integer) javagame.Player.Weapons[number][4];
					wep_5 = (Integer) javagame.Player.Weapons[number][5];
					wep_6 = (Integer) javagame.Player.Weapons[number][6];
					wep_7 = (Integer) javagame.Player.Weapons[number][7];
					wep_8 = (Integer) javagame.Player.Weapons[number][8];
					wep_9 = (Integer) javagame.Player.Weapons[number][9];
					wep_10 = (String) javagame.Player.Weapons[number][10];
					javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage2[x][0];
					javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage2[x][1];
					javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage2[x][2];
					javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage2[x][3];
					javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage2[x][4];
					javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage2[x][5];
					javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage2[x][6];
					javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage2[x][7];
					javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage2[x][8];
					javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage2[x][9];
					javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage2[x][10];
					javagame.Storage_Info.Storage2[x][0] = wep_0;
					javagame.Storage_Info.Storage2[x][1] = wep_1;
					javagame.Storage_Info.Storage2[x][2] = wep_2;
					javagame.Storage_Info.Storage2[x][3] = wep_3;
					javagame.Storage_Info.Storage2[x][4] = wep_4;
					javagame.Storage_Info.Storage2[x][5] = wep_5;
					javagame.Storage_Info.Storage2[x][6] = wep_6;
					javagame.Storage_Info.Storage2[x][7] = wep_7;
					javagame.Storage_Info.Storage2[x][8] = wep_8;
					javagame.Storage_Info.Storage2[x][9] = wep_9;
					javagame.Storage_Info.Storage2[x][10] = wep_10;
					load = false;
					equipping = false;
				}
				x += 1;
			}}
		
		if(storage_num == 3){
			while(load && x < 18){
				if(javagame.Storage_Info.Storage3[x][10].equals("null")){
					equipping_time = 40;
					javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
					wep_0 = (String) javagame.Player.Weapons[number][0];
					wep_1 = (Integer) javagame.Player.Weapons[number][1];
					wep_2 = (Integer) javagame.Player.Weapons[number][2];
					wep_3 = (String) javagame.Player.Weapons[number][3];
					wep_4 = (Integer) javagame.Player.Weapons[number][4];
					wep_5 = (Integer) javagame.Player.Weapons[number][5];
					wep_6 = (Integer) javagame.Player.Weapons[number][6];
					wep_7 = (Integer) javagame.Player.Weapons[number][7];
					wep_8 = (Integer) javagame.Player.Weapons[number][8];
					wep_9 = (Integer) javagame.Player.Weapons[number][9];
					wep_10 = (String) javagame.Player.Weapons[number][10];
					javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage3[x][0];
					javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage3[x][1];
					javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage3[x][2];
					javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage3[x][3];
					javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage3[x][4];
					javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage3[x][5];
					javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage3[x][6];
					javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage3[x][7];
					javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage3[x][8];
					javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage3[x][9];
					javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage3[x][10];
					javagame.Storage_Info.Storage3[x][0] = wep_0;
					javagame.Storage_Info.Storage3[x][1] = wep_1;
					javagame.Storage_Info.Storage3[x][2] = wep_2;
					javagame.Storage_Info.Storage3[x][3] = wep_3;
					javagame.Storage_Info.Storage3[x][4] = wep_4;
					javagame.Storage_Info.Storage3[x][5] = wep_5;
					javagame.Storage_Info.Storage3[x][6] = wep_6;
					javagame.Storage_Info.Storage3[x][7] = wep_7;
					javagame.Storage_Info.Storage3[x][8] = wep_8;
					javagame.Storage_Info.Storage3[x][9] = wep_9;
					javagame.Storage_Info.Storage3[x][10] = wep_10;
					load = false;
					equipping = false;
				}
				x += 1;
			}}
	}
	
	public void moving(int x){
		boolean load = true;
		int number = 0;
		System.out.println(storage_num);
		if(storage_num == 1){
		while(load && number < 25){
			if(javagame.Player.Weapons[number][10].equals("null")){
				equipping_time = 40;
				javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
				wep_0 = (String) javagame.Player.Weapons[number][0];
				wep_1 = (Integer) javagame.Player.Weapons[number][1];
				wep_2 = (Integer) javagame.Player.Weapons[number][2];
				wep_3 = (String) javagame.Player.Weapons[number][3];
				wep_4 = (Integer) javagame.Player.Weapons[number][4];
				wep_5 = (Integer) javagame.Player.Weapons[number][5];
				wep_6 = (Integer) javagame.Player.Weapons[number][6];
				wep_7 = (Integer) javagame.Player.Weapons[number][7];
				wep_8 = (Integer) javagame.Player.Weapons[number][8];
				wep_9 = (Integer) javagame.Player.Weapons[number][9];
				wep_10 = (String) javagame.Player.Weapons[number][10];
				javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage1[x][0];
				javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage1[x][1];
				javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage1[x][2];
				javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage1[x][3];
				javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage1[x][4];
				javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage1[x][5];
				javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage1[x][6];
				javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage1[x][7];
				javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage1[x][8];
				javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage1[x][9];
				javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage1[x][10];
				javagame.Storage_Info.Storage1[x][0] = wep_0;
				javagame.Storage_Info.Storage1[x][1] = wep_1;
				javagame.Storage_Info.Storage1[x][2] = wep_2;
				javagame.Storage_Info.Storage1[x][3] = wep_3;
				javagame.Storage_Info.Storage1[x][4] = wep_4;
				javagame.Storage_Info.Storage1[x][5] = wep_5;
				javagame.Storage_Info.Storage1[x][6] = wep_6;
				javagame.Storage_Info.Storage1[x][7] = wep_7;
				javagame.Storage_Info.Storage1[x][8] = wep_8;
				javagame.Storage_Info.Storage1[x][9] = wep_9;
				javagame.Storage_Info.Storage1[x][10] = wep_10;
				load = false;
				equipping = false;
			}
			number += 1;
		}}
		
		if(storage_num == 2){
			while(load && number < 25){
				if(javagame.Player.Weapons[number][10].equals("null")){
					equipping_time = 40;
					javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
					wep_0 = (String) javagame.Player.Weapons[number][0];
					wep_1 = (Integer) javagame.Player.Weapons[number][1];
					wep_2 = (Integer) javagame.Player.Weapons[number][2];
					wep_3 = (String) javagame.Player.Weapons[number][3];
					wep_4 = (Integer) javagame.Player.Weapons[number][4];
					wep_5 = (Integer) javagame.Player.Weapons[number][5];
					wep_6 = (Integer) javagame.Player.Weapons[number][6];
					wep_7 = (Integer) javagame.Player.Weapons[number][7];
					wep_8 = (Integer) javagame.Player.Weapons[number][8];
					wep_9 = (Integer) javagame.Player.Weapons[number][9];
					wep_10 = (String) javagame.Player.Weapons[number][10];
					javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage2[x][0];
					javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage2[x][1];
					javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage2[x][2];
					javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage2[x][3];
					javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage2[x][4];
					javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage2[x][5];
					javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage2[x][6];
					javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage2[x][7];
					javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage2[x][8];
					javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage2[x][9];
					javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage2[x][10];
					javagame.Storage_Info.Storage2[x][0] = wep_0;
					javagame.Storage_Info.Storage2[x][1] = wep_1;
					javagame.Storage_Info.Storage2[x][2] = wep_2;
					javagame.Storage_Info.Storage2[x][3] = wep_3;
					javagame.Storage_Info.Storage2[x][4] = wep_4;
					javagame.Storage_Info.Storage2[x][5] = wep_5;
					javagame.Storage_Info.Storage2[x][6] = wep_6;
					javagame.Storage_Info.Storage2[x][7] = wep_7;
					javagame.Storage_Info.Storage2[x][8] = wep_8;
					javagame.Storage_Info.Storage2[x][9] = wep_9;
					javagame.Storage_Info.Storage2[x][10] = wep_10;
					load = false;
					equipping = false;
				}
				number += 1;
			}}
		
		if(storage_num == 3){
			while(load && number < 25){
				if(javagame.Player.Weapons[number][10].equals("null")){
					equipping_time = 40;
					javagame.Player.max_hp -= ((Integer) javagame.Player.equipped_weapon[7]) * 2;
					wep_0 = (String) javagame.Player.Weapons[number][0];
					wep_1 = (Integer) javagame.Player.Weapons[number][1];
					wep_2 = (Integer) javagame.Player.Weapons[number][2];
					wep_3 = (String) javagame.Player.Weapons[number][3];
					wep_4 = (Integer) javagame.Player.Weapons[number][4];
					wep_5 = (Integer) javagame.Player.Weapons[number][5];
					wep_6 = (Integer) javagame.Player.Weapons[number][6];
					wep_7 = (Integer) javagame.Player.Weapons[number][7];
					wep_8 = (Integer) javagame.Player.Weapons[number][8];
					wep_9 = (Integer) javagame.Player.Weapons[number][9];
					wep_10 = (String) javagame.Player.Weapons[number][10];
					javagame.Player.Weapons[number][0] = javagame.Storage_Info.Storage3[x][0];
					javagame.Player.Weapons[number][1] = javagame.Storage_Info.Storage3[x][1];
					javagame.Player.Weapons[number][2] = javagame.Storage_Info.Storage3[x][2];
					javagame.Player.Weapons[number][3] = javagame.Storage_Info.Storage3[x][3];
					javagame.Player.Weapons[number][4] = javagame.Storage_Info.Storage3[x][4];
					javagame.Player.Weapons[number][5] = javagame.Storage_Info.Storage3[x][5];
					javagame.Player.Weapons[number][6] = javagame.Storage_Info.Storage3[x][6];
					javagame.Player.Weapons[number][7] = javagame.Storage_Info.Storage3[x][7];
					javagame.Player.Weapons[number][8] = javagame.Storage_Info.Storage3[x][8];
					javagame.Player.Weapons[number][9] = javagame.Storage_Info.Storage3[x][9];
					javagame.Player.Weapons[number][10] = javagame.Storage_Info.Storage3[x][10];
					javagame.Storage_Info.Storage3[x][0] = wep_0;
					javagame.Storage_Info.Storage3[x][1] = wep_1;
					javagame.Storage_Info.Storage3[x][2] = wep_2;
					javagame.Storage_Info.Storage3[x][3] = wep_3;
					javagame.Storage_Info.Storage3[x][4] = wep_4;
					javagame.Storage_Info.Storage3[x][5] = wep_5;
					javagame.Storage_Info.Storage3[x][6] = wep_6;
					javagame.Storage_Info.Storage3[x][7] = wep_7;
					javagame.Storage_Info.Storage3[x][8] = wep_8;
					javagame.Storage_Info.Storage3[x][9] = wep_9;
					javagame.Storage_Info.Storage3[x][10] = wep_10;
					load = false;
					equipping = false;
				}
				number += 1;
			}}
	}
	
	public static void Save_Share(){
		try{
	    	PrintStream out = new PrintStream(new File("sharedS3.Gateway"));
	    	//Inventory
	    	out.println(javagame.Storage_Info.Storage3[0][0]+";"+
	    			javagame.Storage_Info.Storage3[0][1]+";"+
	    			javagame.Storage_Info.Storage3[0][2]+";"+
	    			javagame.Storage_Info.Storage3[0][3]+";"+
	    			javagame.Storage_Info.Storage3[0][4]+";"+
	    			javagame.Storage_Info.Storage3[0][5]+";"+
	    			javagame.Storage_Info.Storage3[0][6]+";"+
	    			javagame.Storage_Info.Storage3[0][7]+";"+
	    			javagame.Storage_Info.Storage3[0][8]+";"+
	    			javagame.Storage_Info.Storage3[0][9]+";"+
	    			javagame.Storage_Info.Storage3[0][10]);
	    	out.println(javagame.Storage_Info.Storage3[1][0]+";"+
	    			javagame.Storage_Info.Storage3[1][1]+";"+
	    			javagame.Storage_Info.Storage3[1][2]+";"+
	    			javagame.Storage_Info.Storage3[1][3]+";"+
	    			javagame.Storage_Info.Storage3[1][4]+";"+
	    			javagame.Storage_Info.Storage3[1][5]+";"+
	    			javagame.Storage_Info.Storage3[1][6]+";"+
	    			javagame.Storage_Info.Storage3[1][7]+";"+
	    			javagame.Storage_Info.Storage3[1][8]+";"+
	    			javagame.Storage_Info.Storage3[1][9]+";"+
	    			javagame.Storage_Info.Storage3[1][10]);
	    	out.println(javagame.Storage_Info.Storage3[2][0]+";"+
	    			javagame.Storage_Info.Storage3[2][1]+";"+
	    			javagame.Storage_Info.Storage3[2][2]+";"+
	    			javagame.Storage_Info.Storage3[2][3]+";"+
	    			javagame.Storage_Info.Storage3[2][4]+";"+
	    			javagame.Storage_Info.Storage3[2][5]+";"+
	    			javagame.Storage_Info.Storage3[2][6]+";"+
	    			javagame.Storage_Info.Storage3[2][7]+";"+
	    			javagame.Storage_Info.Storage3[2][8]+";"+
	    			javagame.Storage_Info.Storage3[2][9]+";"+
	    			javagame.Storage_Info.Storage3[2][10]);
	    	out.println(javagame.Storage_Info.Storage3[3][0]+";"+
	    			javagame.Storage_Info.Storage3[3][1]+";"+
	    			javagame.Storage_Info.Storage3[3][2]+";"+
	    			javagame.Storage_Info.Storage3[3][3]+";"+
	    			javagame.Storage_Info.Storage3[3][4]+";"+
	    			javagame.Storage_Info.Storage3[3][5]+";"+
	    			javagame.Storage_Info.Storage3[3][6]+";"+
	    			javagame.Storage_Info.Storage3[3][7]+";"+
	    			javagame.Storage_Info.Storage3[3][8]+";"+
	    			javagame.Storage_Info.Storage3[3][9]+";"+
	    			javagame.Storage_Info.Storage3[3][10]);
	    	out.println(javagame.Storage_Info.Storage3[4][0]+";"+
	    			javagame.Storage_Info.Storage3[4][1]+";"+
	    			javagame.Storage_Info.Storage3[4][2]+";"+
	    			javagame.Storage_Info.Storage3[4][3]+";"+
	    			javagame.Storage_Info.Storage3[4][4]+";"+
	    			javagame.Storage_Info.Storage3[4][5]+";"+
	    			javagame.Storage_Info.Storage3[4][6]+";"+
	    			javagame.Storage_Info.Storage3[4][7]+";"+
	    			javagame.Storage_Info.Storage3[4][8]+";"+
	    			javagame.Storage_Info.Storage3[4][9]+";"+
	    			javagame.Storage_Info.Storage3[4][10]);
	    	out.println(javagame.Storage_Info.Storage3[5][0]+";"+
	    			javagame.Storage_Info.Storage3[5][1]+";"+
	    			javagame.Storage_Info.Storage3[5][2]+";"+
	    			javagame.Storage_Info.Storage3[5][3]+";"+
	    			javagame.Storage_Info.Storage3[5][4]+";"+
	    			javagame.Storage_Info.Storage3[5][5]+";"+
	    			javagame.Storage_Info.Storage3[5][6]+";"+
	    			javagame.Storage_Info.Storage3[5][7]+";"+
	    			javagame.Storage_Info.Storage3[5][8]+";"+
	    			javagame.Storage_Info.Storage3[5][9]+";"+
	    			javagame.Storage_Info.Storage3[5][10]);
	    	out.println(javagame.Storage_Info.Storage3[6][0]+";"+
	    			javagame.Storage_Info.Storage3[6][1]+";"+
	    			javagame.Storage_Info.Storage3[6][2]+";"+
	    			javagame.Storage_Info.Storage3[6][3]+";"+
	    			javagame.Storage_Info.Storage3[6][4]+";"+
	    			javagame.Storage_Info.Storage3[6][5]+";"+
	    			javagame.Storage_Info.Storage3[6][6]+";"+
	    			javagame.Storage_Info.Storage3[6][7]+";"+
	    			javagame.Storage_Info.Storage3[6][8]+";"+
	    			javagame.Storage_Info.Storage3[6][9]+";"+
	    			javagame.Storage_Info.Storage3[6][10]);
	    	out.println(javagame.Storage_Info.Storage3[7][0]+";"+
	    			javagame.Storage_Info.Storage3[7][1]+";"+
	    			javagame.Storage_Info.Storage3[7][2]+";"+
	    			javagame.Storage_Info.Storage3[7][3]+";"+
	    			javagame.Storage_Info.Storage3[7][4]+";"+
	    			javagame.Storage_Info.Storage3[7][5]+";"+
	    			javagame.Storage_Info.Storage3[7][6]+";"+
	    			javagame.Storage_Info.Storage3[7][7]+";"+
	    			javagame.Storage_Info.Storage3[7][8]+";"+
	    			javagame.Storage_Info.Storage3[7][9]+";"+
	    			javagame.Storage_Info.Storage3[7][10]);
	    	out.println(javagame.Storage_Info.Storage3[8][0]+";"+
	    			javagame.Storage_Info.Storage3[8][1]+";"+
	    			javagame.Storage_Info.Storage3[8][2]+";"+
	    			javagame.Storage_Info.Storage3[8][3]+";"+
	    			javagame.Storage_Info.Storage3[8][4]+";"+
	    			javagame.Storage_Info.Storage3[8][5]+";"+
	    			javagame.Storage_Info.Storage3[8][6]+";"+
	    			javagame.Storage_Info.Storage3[8][7]+";"+
	    			javagame.Storage_Info.Storage3[8][8]+";"+
	    			javagame.Storage_Info.Storage3[8][9]+";"+
	    			javagame.Storage_Info.Storage3[8][10]);
	    	out.println(javagame.Storage_Info.Storage3[9][0]+";"+
	    			javagame.Storage_Info.Storage3[9][1]+";"+
	    			javagame.Storage_Info.Storage3[9][2]+";"+
	    			javagame.Storage_Info.Storage3[9][3]+";"+
	    			javagame.Storage_Info.Storage3[9][4]+";"+
	    			javagame.Storage_Info.Storage3[9][5]+";"+
	    			javagame.Storage_Info.Storage3[9][6]+";"+
	    			javagame.Storage_Info.Storage3[9][7]+";"+
	    			javagame.Storage_Info.Storage3[9][8]+";"+
	    			javagame.Storage_Info.Storage3[9][9]+";"+
	    			javagame.Storage_Info.Storage3[9][10]);
	    	out.println(javagame.Storage_Info.Storage3[10][0]+";"+
	    			javagame.Storage_Info.Storage3[10][1]+";"+
	    			javagame.Storage_Info.Storage3[10][2]+";"+
	    			javagame.Storage_Info.Storage3[10][3]+";"+
	    			javagame.Storage_Info.Storage3[10][4]+";"+
	    			javagame.Storage_Info.Storage3[10][5]+";"+
	    			javagame.Storage_Info.Storage3[10][6]+";"+
	    			javagame.Storage_Info.Storage3[10][7]+";"+
	    			javagame.Storage_Info.Storage3[10][8]+";"+
	    			javagame.Storage_Info.Storage3[10][9]+";"+
	    			javagame.Storage_Info.Storage3[10][10]);
	    	out.println(javagame.Storage_Info.Storage3[11][0]+";"+
	    			javagame.Storage_Info.Storage3[11][1]+";"+
	    			javagame.Storage_Info.Storage3[11][2]+";"+
	    			javagame.Storage_Info.Storage3[11][3]+";"+
	    			javagame.Storage_Info.Storage3[11][4]+";"+
	    			javagame.Storage_Info.Storage3[11][5]+";"+
	    			javagame.Storage_Info.Storage3[11][6]+";"+
	    			javagame.Storage_Info.Storage3[11][7]+";"+
	    			javagame.Storage_Info.Storage3[11][8]+";"+
	    			javagame.Storage_Info.Storage3[11][9]+";"+
	    			javagame.Storage_Info.Storage3[11][10]);
	    	out.println(javagame.Storage_Info.Storage3[12][0]+";"+
	    			javagame.Storage_Info.Storage3[12][1]+";"+
	    			javagame.Storage_Info.Storage3[12][2]+";"+
	    			javagame.Storage_Info.Storage3[12][3]+";"+
	    			javagame.Storage_Info.Storage3[12][4]+";"+
	    			javagame.Storage_Info.Storage3[12][5]+";"+
	    			javagame.Storage_Info.Storage3[12][6]+";"+
	    			javagame.Storage_Info.Storage3[12][7]+";"+
	    			javagame.Storage_Info.Storage3[12][8]+";"+
	    			javagame.Storage_Info.Storage3[12][9]+";"+
	    			javagame.Storage_Info.Storage3[12][10]);
	    	out.println(javagame.Storage_Info.Storage3[13][0]+";"+
	    			javagame.Storage_Info.Storage3[13][1]+";"+
	    			javagame.Storage_Info.Storage3[13][2]+";"+
	    			javagame.Storage_Info.Storage3[13][3]+";"+
	    			javagame.Storage_Info.Storage3[13][4]+";"+
	    			javagame.Storage_Info.Storage3[13][5]+";"+
	    			javagame.Storage_Info.Storage3[13][6]+";"+
	    			javagame.Storage_Info.Storage3[13][7]+";"+
	    			javagame.Storage_Info.Storage3[13][8]+";"+
	    			javagame.Storage_Info.Storage3[13][9]+";"+
	    			javagame.Storage_Info.Storage3[13][10]);
	    	out.println(javagame.Storage_Info.Storage3[14][0]+";"+
	    			javagame.Storage_Info.Storage3[14][1]+";"+
	    			javagame.Storage_Info.Storage3[14][2]+";"+
	    			javagame.Storage_Info.Storage3[14][3]+";"+
	    			javagame.Storage_Info.Storage3[14][4]+";"+
	    			javagame.Storage_Info.Storage3[14][5]+";"+
	    			javagame.Storage_Info.Storage3[14][6]+";"+
	    			javagame.Storage_Info.Storage3[14][7]+";"+
	    			javagame.Storage_Info.Storage3[14][8]+";"+
	    			javagame.Storage_Info.Storage3[14][9]+";"+
	    			javagame.Storage_Info.Storage3[14][10]);
	    	out.println(javagame.Storage_Info.Storage3[15][0]+";"+
	    			javagame.Storage_Info.Storage3[15][1]+";"+
	    			javagame.Storage_Info.Storage3[15][2]+";"+
	    			javagame.Storage_Info.Storage3[15][3]+";"+
	    			javagame.Storage_Info.Storage3[15][4]+";"+
	    			javagame.Storage_Info.Storage3[15][5]+";"+
	    			javagame.Storage_Info.Storage3[15][6]+";"+
	    			javagame.Storage_Info.Storage3[15][7]+";"+
	    			javagame.Storage_Info.Storage3[15][8]+";"+
	    			javagame.Storage_Info.Storage3[15][9]+";"+
	    			javagame.Storage_Info.Storage3[15][10]);
	    	out.println(javagame.Storage_Info.Storage3[16][0]+";"+
	    			javagame.Storage_Info.Storage3[16][1]+";"+
	    			javagame.Storage_Info.Storage3[16][2]+";"+
	    			javagame.Storage_Info.Storage3[16][3]+";"+
	    			javagame.Storage_Info.Storage3[16][4]+";"+
	    			javagame.Storage_Info.Storage3[16][5]+";"+
	    			javagame.Storage_Info.Storage3[16][6]+";"+
	    			javagame.Storage_Info.Storage3[16][7]+";"+
	    			javagame.Storage_Info.Storage3[16][8]+";"+
	    			javagame.Storage_Info.Storage3[16][9]+";"+
	    			javagame.Storage_Info.Storage3[16][10]);
	    	out.println(javagame.Storage_Info.Storage3[17][0]+";"+
	    			javagame.Storage_Info.Storage3[17][1]+";"+
	    			javagame.Storage_Info.Storage3[17][2]+";"+
	    			javagame.Storage_Info.Storage3[17][3]+";"+
	    			javagame.Storage_Info.Storage3[17][4]+";"+
	    			javagame.Storage_Info.Storage3[17][5]+";"+
	    			javagame.Storage_Info.Storage3[17][6]+";"+
	    			javagame.Storage_Info.Storage3[17][7]+";"+
	    			javagame.Storage_Info.Storage3[17][8]+";"+
	    			javagame.Storage_Info.Storage3[17][9]+";"+
	    			javagame.Storage_Info.Storage3[17][10]);
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		try{
	    	PrintStream out = new PrintStream(new File("sharedS2.Gateway"));
	    	//Inventory
	    	out.println(javagame.Storage_Info.Storage2[0][0]+";"+
	    			javagame.Storage_Info.Storage2[0][1]+";"+
	    			javagame.Storage_Info.Storage2[0][2]+";"+
	    			javagame.Storage_Info.Storage2[0][3]+";"+
	    			javagame.Storage_Info.Storage2[0][4]+";"+
	    			javagame.Storage_Info.Storage2[0][5]+";"+
	    			javagame.Storage_Info.Storage2[0][6]+";"+
	    			javagame.Storage_Info.Storage2[0][7]+";"+
	    			javagame.Storage_Info.Storage2[0][8]+";"+
	    			javagame.Storage_Info.Storage2[0][9]+";"+
	    			javagame.Storage_Info.Storage2[0][10]);
	    	out.println(javagame.Storage_Info.Storage2[1][0]+";"+
	    			javagame.Storage_Info.Storage2[1][1]+";"+
	    			javagame.Storage_Info.Storage2[1][2]+";"+
	    			javagame.Storage_Info.Storage2[1][3]+";"+
	    			javagame.Storage_Info.Storage2[1][4]+";"+
	    			javagame.Storage_Info.Storage2[1][5]+";"+
	    			javagame.Storage_Info.Storage2[1][6]+";"+
	    			javagame.Storage_Info.Storage2[1][7]+";"+
	    			javagame.Storage_Info.Storage2[1][8]+";"+
	    			javagame.Storage_Info.Storage2[1][9]+";"+
	    			javagame.Storage_Info.Storage2[1][10]);
	    	out.println(javagame.Storage_Info.Storage2[2][0]+";"+
	    			javagame.Storage_Info.Storage2[2][1]+";"+
	    			javagame.Storage_Info.Storage2[2][2]+";"+
	    			javagame.Storage_Info.Storage2[2][3]+";"+
	    			javagame.Storage_Info.Storage2[2][4]+";"+
	    			javagame.Storage_Info.Storage2[2][5]+";"+
	    			javagame.Storage_Info.Storage2[2][6]+";"+
	    			javagame.Storage_Info.Storage2[2][7]+";"+
	    			javagame.Storage_Info.Storage2[2][8]+";"+
	    			javagame.Storage_Info.Storage2[2][9]+";"+
	    			javagame.Storage_Info.Storage2[2][10]);
	    	out.println(javagame.Storage_Info.Storage2[3][0]+";"+
	    			javagame.Storage_Info.Storage2[3][1]+";"+
	    			javagame.Storage_Info.Storage2[3][2]+";"+
	    			javagame.Storage_Info.Storage2[3][3]+";"+
	    			javagame.Storage_Info.Storage2[3][4]+";"+
	    			javagame.Storage_Info.Storage2[3][5]+";"+
	    			javagame.Storage_Info.Storage2[3][6]+";"+
	    			javagame.Storage_Info.Storage2[3][7]+";"+
	    			javagame.Storage_Info.Storage2[3][8]+";"+
	    			javagame.Storage_Info.Storage2[3][9]+";"+
	    			javagame.Storage_Info.Storage2[3][10]);
	    	out.println(javagame.Storage_Info.Storage2[4][0]+";"+
	    			javagame.Storage_Info.Storage2[4][1]+";"+
	    			javagame.Storage_Info.Storage2[4][2]+";"+
	    			javagame.Storage_Info.Storage2[4][3]+";"+
	    			javagame.Storage_Info.Storage2[4][4]+";"+
	    			javagame.Storage_Info.Storage2[4][5]+";"+
	    			javagame.Storage_Info.Storage2[4][6]+";"+
	    			javagame.Storage_Info.Storage2[4][7]+";"+
	    			javagame.Storage_Info.Storage2[4][8]+";"+
	    			javagame.Storage_Info.Storage2[4][9]+";"+
	    			javagame.Storage_Info.Storage2[4][10]);
	    	out.println(javagame.Storage_Info.Storage2[5][0]+";"+
	    			javagame.Storage_Info.Storage2[5][1]+";"+
	    			javagame.Storage_Info.Storage2[5][2]+";"+
	    			javagame.Storage_Info.Storage2[5][3]+";"+
	    			javagame.Storage_Info.Storage2[5][4]+";"+
	    			javagame.Storage_Info.Storage2[5][5]+";"+
	    			javagame.Storage_Info.Storage2[5][6]+";"+
	    			javagame.Storage_Info.Storage2[5][7]+";"+
	    			javagame.Storage_Info.Storage2[5][8]+";"+
	    			javagame.Storage_Info.Storage2[5][9]+";"+
	    			javagame.Storage_Info.Storage2[5][10]);
	    	out.println(javagame.Storage_Info.Storage2[6][0]+";"+
	    			javagame.Storage_Info.Storage2[6][1]+";"+
	    			javagame.Storage_Info.Storage2[6][2]+";"+
	    			javagame.Storage_Info.Storage2[6][3]+";"+
	    			javagame.Storage_Info.Storage2[6][4]+";"+
	    			javagame.Storage_Info.Storage2[6][5]+";"+
	    			javagame.Storage_Info.Storage2[6][6]+";"+
	    			javagame.Storage_Info.Storage2[6][7]+";"+
	    			javagame.Storage_Info.Storage2[6][8]+";"+
	    			javagame.Storage_Info.Storage2[6][9]+";"+
	    			javagame.Storage_Info.Storage2[6][10]);
	    	out.println(javagame.Storage_Info.Storage2[7][0]+";"+
	    			javagame.Storage_Info.Storage2[7][1]+";"+
	    			javagame.Storage_Info.Storage2[7][2]+";"+
	    			javagame.Storage_Info.Storage2[7][3]+";"+
	    			javagame.Storage_Info.Storage2[7][4]+";"+
	    			javagame.Storage_Info.Storage2[7][5]+";"+
	    			javagame.Storage_Info.Storage2[7][6]+";"+
	    			javagame.Storage_Info.Storage2[7][7]+";"+
	    			javagame.Storage_Info.Storage2[7][8]+";"+
	    			javagame.Storage_Info.Storage2[7][9]+";"+
	    			javagame.Storage_Info.Storage2[7][10]);
	    	out.println(javagame.Storage_Info.Storage2[8][0]+";"+
	    			javagame.Storage_Info.Storage2[8][1]+";"+
	    			javagame.Storage_Info.Storage2[8][2]+";"+
	    			javagame.Storage_Info.Storage2[8][3]+";"+
	    			javagame.Storage_Info.Storage2[8][4]+";"+
	    			javagame.Storage_Info.Storage2[8][5]+";"+
	    			javagame.Storage_Info.Storage2[8][6]+";"+
	    			javagame.Storage_Info.Storage2[8][7]+";"+
	    			javagame.Storage_Info.Storage2[8][8]+";"+
	    			javagame.Storage_Info.Storage2[8][9]+";"+
	    			javagame.Storage_Info.Storage2[8][10]);
	    	out.println(javagame.Storage_Info.Storage2[9][0]+";"+
	    			javagame.Storage_Info.Storage2[9][1]+";"+
	    			javagame.Storage_Info.Storage2[9][2]+";"+
	    			javagame.Storage_Info.Storage2[9][3]+";"+
	    			javagame.Storage_Info.Storage2[9][4]+";"+
	    			javagame.Storage_Info.Storage2[9][5]+";"+
	    			javagame.Storage_Info.Storage2[9][6]+";"+
	    			javagame.Storage_Info.Storage2[9][7]+";"+
	    			javagame.Storage_Info.Storage2[9][8]+";"+
	    			javagame.Storage_Info.Storage2[9][9]+";"+
	    			javagame.Storage_Info.Storage2[9][10]);
	    	out.println(javagame.Storage_Info.Storage2[10][0]+";"+
	    			javagame.Storage_Info.Storage2[10][1]+";"+
	    			javagame.Storage_Info.Storage2[10][2]+";"+
	    			javagame.Storage_Info.Storage2[10][3]+";"+
	    			javagame.Storage_Info.Storage2[10][4]+";"+
	    			javagame.Storage_Info.Storage2[10][5]+";"+
	    			javagame.Storage_Info.Storage2[10][6]+";"+
	    			javagame.Storage_Info.Storage2[10][7]+";"+
	    			javagame.Storage_Info.Storage2[10][8]+";"+
	    			javagame.Storage_Info.Storage2[10][9]+";"+
	    			javagame.Storage_Info.Storage2[10][10]);
	    	out.println(javagame.Storage_Info.Storage2[11][0]+";"+
	    			javagame.Storage_Info.Storage2[11][1]+";"+
	    			javagame.Storage_Info.Storage2[11][2]+";"+
	    			javagame.Storage_Info.Storage2[11][3]+";"+
	    			javagame.Storage_Info.Storage2[11][4]+";"+
	    			javagame.Storage_Info.Storage2[11][5]+";"+
	    			javagame.Storage_Info.Storage2[11][6]+";"+
	    			javagame.Storage_Info.Storage2[11][7]+";"+
	    			javagame.Storage_Info.Storage2[11][8]+";"+
	    			javagame.Storage_Info.Storage2[11][9]+";"+
	    			javagame.Storage_Info.Storage2[11][10]);
	    	out.println(javagame.Storage_Info.Storage2[12][0]+";"+
	    			javagame.Storage_Info.Storage2[12][1]+";"+
	    			javagame.Storage_Info.Storage2[12][2]+";"+
	    			javagame.Storage_Info.Storage2[12][3]+";"+
	    			javagame.Storage_Info.Storage2[12][4]+";"+
	    			javagame.Storage_Info.Storage2[12][5]+";"+
	    			javagame.Storage_Info.Storage2[12][6]+";"+
	    			javagame.Storage_Info.Storage2[12][7]+";"+
	    			javagame.Storage_Info.Storage2[12][8]+";"+
	    			javagame.Storage_Info.Storage2[12][9]+";"+
	    			javagame.Storage_Info.Storage2[12][10]);
	    	out.println(javagame.Storage_Info.Storage2[13][0]+";"+
	    			javagame.Storage_Info.Storage2[13][1]+";"+
	    			javagame.Storage_Info.Storage2[13][2]+";"+
	    			javagame.Storage_Info.Storage2[13][3]+";"+
	    			javagame.Storage_Info.Storage2[13][4]+";"+
	    			javagame.Storage_Info.Storage2[13][5]+";"+
	    			javagame.Storage_Info.Storage2[13][6]+";"+
	    			javagame.Storage_Info.Storage2[13][7]+";"+
	    			javagame.Storage_Info.Storage2[13][8]+";"+
	    			javagame.Storage_Info.Storage2[13][9]+";"+
	    			javagame.Storage_Info.Storage2[13][10]);
	    	out.println(javagame.Storage_Info.Storage2[14][0]+";"+
	    			javagame.Storage_Info.Storage2[14][1]+";"+
	    			javagame.Storage_Info.Storage2[14][2]+";"+
	    			javagame.Storage_Info.Storage2[14][3]+";"+
	    			javagame.Storage_Info.Storage2[14][4]+";"+
	    			javagame.Storage_Info.Storage2[14][5]+";"+
	    			javagame.Storage_Info.Storage2[14][6]+";"+
	    			javagame.Storage_Info.Storage2[14][7]+";"+
	    			javagame.Storage_Info.Storage2[14][8]+";"+
	    			javagame.Storage_Info.Storage2[14][9]+";"+
	    			javagame.Storage_Info.Storage2[14][10]);
	    	out.println(javagame.Storage_Info.Storage2[15][0]+";"+
	    			javagame.Storage_Info.Storage2[15][1]+";"+
	    			javagame.Storage_Info.Storage2[15][2]+";"+
	    			javagame.Storage_Info.Storage2[15][3]+";"+
	    			javagame.Storage_Info.Storage2[15][4]+";"+
	    			javagame.Storage_Info.Storage2[15][5]+";"+
	    			javagame.Storage_Info.Storage2[15][6]+";"+
	    			javagame.Storage_Info.Storage2[15][7]+";"+
	    			javagame.Storage_Info.Storage2[15][8]+";"+
	    			javagame.Storage_Info.Storage2[15][9]+";"+
	    			javagame.Storage_Info.Storage2[15][10]);
	    	out.println(javagame.Storage_Info.Storage2[16][0]+";"+
	    			javagame.Storage_Info.Storage2[16][1]+";"+
	    			javagame.Storage_Info.Storage2[16][2]+";"+
	    			javagame.Storage_Info.Storage2[16][3]+";"+
	    			javagame.Storage_Info.Storage2[16][4]+";"+
	    			javagame.Storage_Info.Storage2[16][5]+";"+
	    			javagame.Storage_Info.Storage2[16][6]+";"+
	    			javagame.Storage_Info.Storage2[16][7]+";"+
	    			javagame.Storage_Info.Storage2[16][8]+";"+
	    			javagame.Storage_Info.Storage2[16][9]+";"+
	    			javagame.Storage_Info.Storage2[16][10]);
	    	out.println(javagame.Storage_Info.Storage2[17][0]+";"+
	    			javagame.Storage_Info.Storage2[17][1]+";"+
	    			javagame.Storage_Info.Storage2[17][2]+";"+
	    			javagame.Storage_Info.Storage2[17][3]+";"+
	    			javagame.Storage_Info.Storage2[17][4]+";"+
	    			javagame.Storage_Info.Storage2[17][5]+";"+
	    			javagame.Storage_Info.Storage2[17][6]+";"+
	    			javagame.Storage_Info.Storage2[17][7]+";"+
	    			javagame.Storage_Info.Storage2[17][8]+";"+
	    			javagame.Storage_Info.Storage2[17][9]+";"+
	    			javagame.Storage_Info.Storage2[17][10]);
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		try{
	    	PrintStream out = new PrintStream(new File("sharedS1.Gateway"));
	    	//Inventory
	    	out.println(javagame.Storage_Info.Storage1[0][0]+";"+
	    			javagame.Storage_Info.Storage1[0][1]+";"+
	    			javagame.Storage_Info.Storage1[0][2]+";"+
	    			javagame.Storage_Info.Storage1[0][3]+";"+
	    			javagame.Storage_Info.Storage1[0][4]+";"+
	    			javagame.Storage_Info.Storage1[0][5]+";"+
	    			javagame.Storage_Info.Storage1[0][6]+";"+
	    			javagame.Storage_Info.Storage1[0][7]+";"+
	    			javagame.Storage_Info.Storage1[0][8]+";"+
	    			javagame.Storage_Info.Storage1[0][9]+";"+
	    			javagame.Storage_Info.Storage1[0][10]);
	    	out.println(javagame.Storage_Info.Storage1[1][0]+";"+
	    			javagame.Storage_Info.Storage1[1][1]+";"+
	    			javagame.Storage_Info.Storage1[1][2]+";"+
	    			javagame.Storage_Info.Storage1[1][3]+";"+
	    			javagame.Storage_Info.Storage1[1][4]+";"+
	    			javagame.Storage_Info.Storage1[1][5]+";"+
	    			javagame.Storage_Info.Storage1[1][6]+";"+
	    			javagame.Storage_Info.Storage1[1][7]+";"+
	    			javagame.Storage_Info.Storage1[1][8]+";"+
	    			javagame.Storage_Info.Storage1[1][9]+";"+
	    			javagame.Storage_Info.Storage1[1][10]);
	    	out.println(javagame.Storage_Info.Storage1[2][0]+";"+
	    			javagame.Storage_Info.Storage1[2][1]+";"+
	    			javagame.Storage_Info.Storage1[2][2]+";"+
	    			javagame.Storage_Info.Storage1[2][3]+";"+
	    			javagame.Storage_Info.Storage1[2][4]+";"+
	    			javagame.Storage_Info.Storage1[2][5]+";"+
	    			javagame.Storage_Info.Storage1[2][6]+";"+
	    			javagame.Storage_Info.Storage1[2][7]+";"+
	    			javagame.Storage_Info.Storage1[2][8]+";"+
	    			javagame.Storage_Info.Storage1[2][9]+";"+
	    			javagame.Storage_Info.Storage1[2][10]);
	    	out.println(javagame.Storage_Info.Storage1[3][0]+";"+
	    			javagame.Storage_Info.Storage1[3][1]+";"+
	    			javagame.Storage_Info.Storage1[3][2]+";"+
	    			javagame.Storage_Info.Storage1[3][3]+";"+
	    			javagame.Storage_Info.Storage1[3][4]+";"+
	    			javagame.Storage_Info.Storage1[3][5]+";"+
	    			javagame.Storage_Info.Storage1[3][6]+";"+
	    			javagame.Storage_Info.Storage1[3][7]+";"+
	    			javagame.Storage_Info.Storage1[3][8]+";"+
	    			javagame.Storage_Info.Storage1[3][9]+";"+
	    			javagame.Storage_Info.Storage1[3][10]);
	    	out.println(javagame.Storage_Info.Storage1[4][0]+";"+
	    			javagame.Storage_Info.Storage1[4][1]+";"+
	    			javagame.Storage_Info.Storage1[4][2]+";"+
	    			javagame.Storage_Info.Storage1[4][3]+";"+
	    			javagame.Storage_Info.Storage1[4][4]+";"+
	    			javagame.Storage_Info.Storage1[4][5]+";"+
	    			javagame.Storage_Info.Storage1[4][6]+";"+
	    			javagame.Storage_Info.Storage1[4][7]+";"+
	    			javagame.Storage_Info.Storage1[4][8]+";"+
	    			javagame.Storage_Info.Storage1[4][9]+";"+
	    			javagame.Storage_Info.Storage1[4][10]);
	    	out.println(javagame.Storage_Info.Storage1[5][0]+";"+
	    			javagame.Storage_Info.Storage1[5][1]+";"+
	    			javagame.Storage_Info.Storage1[5][2]+";"+
	    			javagame.Storage_Info.Storage1[5][3]+";"+
	    			javagame.Storage_Info.Storage1[5][4]+";"+
	    			javagame.Storage_Info.Storage1[5][5]+";"+
	    			javagame.Storage_Info.Storage1[5][6]+";"+
	    			javagame.Storage_Info.Storage1[5][7]+";"+
	    			javagame.Storage_Info.Storage1[5][8]+";"+
	    			javagame.Storage_Info.Storage1[5][9]+";"+
	    			javagame.Storage_Info.Storage1[5][10]);
	    	out.println(javagame.Storage_Info.Storage1[6][0]+";"+
	    			javagame.Storage_Info.Storage1[6][1]+";"+
	    			javagame.Storage_Info.Storage1[6][2]+";"+
	    			javagame.Storage_Info.Storage1[6][3]+";"+
	    			javagame.Storage_Info.Storage1[6][4]+";"+
	    			javagame.Storage_Info.Storage1[6][5]+";"+
	    			javagame.Storage_Info.Storage1[6][6]+";"+
	    			javagame.Storage_Info.Storage1[6][7]+";"+
	    			javagame.Storage_Info.Storage1[6][8]+";"+
	    			javagame.Storage_Info.Storage1[6][9]+";"+
	    			javagame.Storage_Info.Storage1[6][10]);
	    	out.println(javagame.Storage_Info.Storage1[7][0]+";"+
	    			javagame.Storage_Info.Storage1[7][1]+";"+
	    			javagame.Storage_Info.Storage1[7][2]+";"+
	    			javagame.Storage_Info.Storage1[7][3]+";"+
	    			javagame.Storage_Info.Storage1[7][4]+";"+
	    			javagame.Storage_Info.Storage1[7][5]+";"+
	    			javagame.Storage_Info.Storage1[7][6]+";"+
	    			javagame.Storage_Info.Storage1[7][7]+";"+
	    			javagame.Storage_Info.Storage1[7][8]+";"+
	    			javagame.Storage_Info.Storage1[7][9]+";"+
	    			javagame.Storage_Info.Storage1[7][10]);
	    	out.println(javagame.Storage_Info.Storage1[8][0]+";"+
	    			javagame.Storage_Info.Storage1[8][1]+";"+
	    			javagame.Storage_Info.Storage1[8][2]+";"+
	    			javagame.Storage_Info.Storage1[8][3]+";"+
	    			javagame.Storage_Info.Storage1[8][4]+";"+
	    			javagame.Storage_Info.Storage1[8][5]+";"+
	    			javagame.Storage_Info.Storage1[8][6]+";"+
	    			javagame.Storage_Info.Storage1[8][7]+";"+
	    			javagame.Storage_Info.Storage1[8][8]+";"+
	    			javagame.Storage_Info.Storage1[8][9]+";"+
	    			javagame.Storage_Info.Storage1[8][10]);
	    	out.println(javagame.Storage_Info.Storage1[9][0]+";"+
	    			javagame.Storage_Info.Storage1[9][1]+";"+
	    			javagame.Storage_Info.Storage1[9][2]+";"+
	    			javagame.Storage_Info.Storage1[9][3]+";"+
	    			javagame.Storage_Info.Storage1[9][4]+";"+
	    			javagame.Storage_Info.Storage1[9][5]+";"+
	    			javagame.Storage_Info.Storage1[9][6]+";"+
	    			javagame.Storage_Info.Storage1[9][7]+";"+
	    			javagame.Storage_Info.Storage1[9][8]+";"+
	    			javagame.Storage_Info.Storage1[9][9]+";"+
	    			javagame.Storage_Info.Storage1[9][10]);
	    	out.println(javagame.Storage_Info.Storage1[10][0]+";"+
	    			javagame.Storage_Info.Storage1[10][1]+";"+
	    			javagame.Storage_Info.Storage1[10][2]+";"+
	    			javagame.Storage_Info.Storage1[10][3]+";"+
	    			javagame.Storage_Info.Storage1[10][4]+";"+
	    			javagame.Storage_Info.Storage1[10][5]+";"+
	    			javagame.Storage_Info.Storage1[10][6]+";"+
	    			javagame.Storage_Info.Storage1[10][7]+";"+
	    			javagame.Storage_Info.Storage1[10][8]+";"+
	    			javagame.Storage_Info.Storage1[10][9]+";"+
	    			javagame.Storage_Info.Storage1[10][10]);
	    	out.println(javagame.Storage_Info.Storage1[11][0]+";"+
	    			javagame.Storage_Info.Storage1[11][1]+";"+
	    			javagame.Storage_Info.Storage1[11][2]+";"+
	    			javagame.Storage_Info.Storage1[11][3]+";"+
	    			javagame.Storage_Info.Storage1[11][4]+";"+
	    			javagame.Storage_Info.Storage1[11][5]+";"+
	    			javagame.Storage_Info.Storage1[11][6]+";"+
	    			javagame.Storage_Info.Storage1[11][7]+";"+
	    			javagame.Storage_Info.Storage1[11][8]+";"+
	    			javagame.Storage_Info.Storage1[11][9]+";"+
	    			javagame.Storage_Info.Storage1[11][10]);
	    	out.println(javagame.Storage_Info.Storage1[12][0]+";"+
	    			javagame.Storage_Info.Storage1[12][1]+";"+
	    			javagame.Storage_Info.Storage1[12][2]+";"+
	    			javagame.Storage_Info.Storage1[12][3]+";"+
	    			javagame.Storage_Info.Storage1[12][4]+";"+
	    			javagame.Storage_Info.Storage1[12][5]+";"+
	    			javagame.Storage_Info.Storage1[12][6]+";"+
	    			javagame.Storage_Info.Storage1[12][7]+";"+
	    			javagame.Storage_Info.Storage1[12][8]+";"+
	    			javagame.Storage_Info.Storage1[12][9]+";"+
	    			javagame.Storage_Info.Storage1[12][10]);
	    	out.println(javagame.Storage_Info.Storage1[13][0]+";"+
	    			javagame.Storage_Info.Storage1[13][1]+";"+
	    			javagame.Storage_Info.Storage1[13][2]+";"+
	    			javagame.Storage_Info.Storage1[13][3]+";"+
	    			javagame.Storage_Info.Storage1[13][4]+";"+
	    			javagame.Storage_Info.Storage1[13][5]+";"+
	    			javagame.Storage_Info.Storage1[13][6]+";"+
	    			javagame.Storage_Info.Storage1[13][7]+";"+
	    			javagame.Storage_Info.Storage1[13][8]+";"+
	    			javagame.Storage_Info.Storage1[13][9]+";"+
	    			javagame.Storage_Info.Storage1[13][10]);
	    	out.println(javagame.Storage_Info.Storage1[14][0]+";"+
	    			javagame.Storage_Info.Storage1[14][1]+";"+
	    			javagame.Storage_Info.Storage1[14][2]+";"+
	    			javagame.Storage_Info.Storage1[14][3]+";"+
	    			javagame.Storage_Info.Storage1[14][4]+";"+
	    			javagame.Storage_Info.Storage1[14][5]+";"+
	    			javagame.Storage_Info.Storage1[14][6]+";"+
	    			javagame.Storage_Info.Storage1[14][7]+";"+
	    			javagame.Storage_Info.Storage1[14][8]+";"+
	    			javagame.Storage_Info.Storage1[14][9]+";"+
	    			javagame.Storage_Info.Storage1[14][10]);
	    	out.println(javagame.Storage_Info.Storage1[15][0]+";"+
	    			javagame.Storage_Info.Storage1[15][1]+";"+
	    			javagame.Storage_Info.Storage1[15][2]+";"+
	    			javagame.Storage_Info.Storage1[15][3]+";"+
	    			javagame.Storage_Info.Storage1[15][4]+";"+
	    			javagame.Storage_Info.Storage1[15][5]+";"+
	    			javagame.Storage_Info.Storage1[15][6]+";"+
	    			javagame.Storage_Info.Storage1[15][7]+";"+
	    			javagame.Storage_Info.Storage1[15][8]+";"+
	    			javagame.Storage_Info.Storage1[15][9]+";"+
	    			javagame.Storage_Info.Storage1[15][10]);
	    	out.println(javagame.Storage_Info.Storage1[16][0]+";"+
	    			javagame.Storage_Info.Storage1[16][1]+";"+
	    			javagame.Storage_Info.Storage1[16][2]+";"+
	    			javagame.Storage_Info.Storage1[16][3]+";"+
	    			javagame.Storage_Info.Storage1[16][4]+";"+
	    			javagame.Storage_Info.Storage1[16][5]+";"+
	    			javagame.Storage_Info.Storage1[16][6]+";"+
	    			javagame.Storage_Info.Storage1[16][7]+";"+
	    			javagame.Storage_Info.Storage1[16][8]+";"+
	    			javagame.Storage_Info.Storage1[16][9]+";"+
	    			javagame.Storage_Info.Storage1[16][10]);
	    	out.println(javagame.Storage_Info.Storage1[17][0]+";"+
	    			javagame.Storage_Info.Storage1[17][1]+";"+
	    			javagame.Storage_Info.Storage1[17][2]+";"+
	    			javagame.Storage_Info.Storage1[17][3]+";"+
	    			javagame.Storage_Info.Storage1[17][4]+";"+
	    			javagame.Storage_Info.Storage1[17][5]+";"+
	    			javagame.Storage_Info.Storage1[17][6]+";"+
	    			javagame.Storage_Info.Storage1[17][7]+";"+
	    			javagame.Storage_Info.Storage1[17][8]+";"+
	    			javagame.Storage_Info.Storage1[17][9]+";"+
	    			javagame.Storage_Info.Storage1[17][10]);
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void Load_Share(){
		Scanner in;
		try {
			in = new Scanner(new File("sharedS3.Gateway"));
    	//Equipment
    	String loan1 = in.next();
    	String[] loaned1 = loan1.split(";");
    	    javagame.Storage_Info.Storage3[0][0] = loaned1[0];
    	    javagame.Storage_Info.Storage3[0][1] = Integer.parseInt(loaned1[1]);
    	    javagame.Storage_Info.Storage3[0][2] = Integer.parseInt(loaned1[2]);
    	    javagame.Storage_Info.Storage3[0][3] = loaned1[3];
    	    javagame.Storage_Info.Storage3[0][4] = Integer.parseInt(loaned1[4]);
    	    javagame.Storage_Info.Storage3[0][5] = Integer.parseInt(loaned1[5]);
    	    javagame.Storage_Info.Storage3[0][6] = Integer.parseInt(loaned1[6]);
    	    javagame.Storage_Info.Storage3[0][7] = Integer.parseInt(loaned1[7]);
    	    javagame.Storage_Info.Storage3[0][8] = Integer.parseInt(loaned1[8]);
    	    javagame.Storage_Info.Storage3[0][9] = Integer.parseInt(loaned1[9]);
    	    javagame.Storage_Info.Storage3[0][10] = loaned1[10];
    	String loan2 = in.next();
    	String[] loaned2 = loan2.split(";");
            javagame.Storage_Info.Storage3[1][0] = loaned2[0];
    	    javagame.Storage_Info.Storage3[1][1] = Integer.parseInt(loaned2[1]);
    	    javagame.Storage_Info.Storage3[1][2] = Integer.parseInt(loaned2[2]);
    	    javagame.Storage_Info.Storage3[1][3] = loaned2[3];
    	    javagame.Storage_Info.Storage3[1][4] = Integer.parseInt(loaned2[4]);
    	    javagame.Storage_Info.Storage3[1][5] = Integer.parseInt(loaned2[5]);
    	    javagame.Storage_Info.Storage3[1][6] = Integer.parseInt(loaned2[6]);
    	    javagame.Storage_Info.Storage3[1][7] = Integer.parseInt(loaned2[7]);
    	    javagame.Storage_Info.Storage3[1][8] = Integer.parseInt(loaned2[8]);
    	    javagame.Storage_Info.Storage3[1][9] = Integer.parseInt(loaned2[9]);
    	    javagame.Storage_Info.Storage3[1][10] = loaned2[10];
    	String loan3 = in.next();
    	String[] loaned3 = loan3.split(";");
    	    javagame.Storage_Info.Storage3[2][0] = loaned3[0];
    	    javagame.Storage_Info.Storage3[2][1] = Integer.parseInt(loaned3[1]);
    	    javagame.Storage_Info.Storage3[2][2] = Integer.parseInt(loaned3[2]);
    	    javagame.Storage_Info.Storage3[2][3] = loaned3[3];
    	    javagame.Storage_Info.Storage3[2][4] = Integer.parseInt(loaned3[4]);
    	    javagame.Storage_Info.Storage3[2][5] = Integer.parseInt(loaned3[5]);
    	    javagame.Storage_Info.Storage3[2][6] = Integer.parseInt(loaned3[6]);
    	    javagame.Storage_Info.Storage3[2][7] = Integer.parseInt(loaned3[7]);
    	    javagame.Storage_Info.Storage3[2][8] = Integer.parseInt(loaned3[8]);
    	    javagame.Storage_Info.Storage3[2][9] = Integer.parseInt(loaned3[9]);
    	    javagame.Storage_Info.Storage3[2][10] = loaned3[10];
    	String loan4 = in.next();
    	String[] loaned4 = loan4.split(";");
    	    javagame.Storage_Info.Storage3[3][0] = loaned4[0];
    	    javagame.Storage_Info.Storage3[3][1] = Integer.parseInt(loaned4[1]);
    	    javagame.Storage_Info.Storage3[3][2] = Integer.parseInt(loaned4[2]);
    	    javagame.Storage_Info.Storage3[3][3] = loaned4[3];
    	    javagame.Storage_Info.Storage3[3][4] = Integer.parseInt(loaned4[4]);
    	    javagame.Storage_Info.Storage3[3][5] = Integer.parseInt(loaned4[5]);
    	    javagame.Storage_Info.Storage3[3][6] = Integer.parseInt(loaned4[6]);
    	    javagame.Storage_Info.Storage3[3][7] = Integer.parseInt(loaned4[7]);
    	    javagame.Storage_Info.Storage3[3][8] = Integer.parseInt(loaned4[8]);
    	    javagame.Storage_Info.Storage3[3][9] = Integer.parseInt(loaned4[9]);
    	    javagame.Storage_Info.Storage3[3][10] = loaned4[10];
    	String loan5 = in.next();
    	String[] loaned5 = loan5.split(";");
    	    javagame.Storage_Info.Storage3[4][0] = loaned5[0];
    	    javagame.Storage_Info.Storage3[4][1] = Integer.parseInt(loaned5[1]);
    	    javagame.Storage_Info.Storage3[4][2] = Integer.parseInt(loaned5[2]);
    	    javagame.Storage_Info.Storage3[4][3] = loaned5[3];
    	    javagame.Storage_Info.Storage3[4][4] = Integer.parseInt(loaned5[4]);
    	    javagame.Storage_Info.Storage3[4][5] = Integer.parseInt(loaned5[5]);
    	    javagame.Storage_Info.Storage3[4][6] = Integer.parseInt(loaned5[6]);
    	    javagame.Storage_Info.Storage3[4][7] = Integer.parseInt(loaned5[7]);
    	    javagame.Storage_Info.Storage3[4][8] = Integer.parseInt(loaned5[8]);
    	    javagame.Storage_Info.Storage3[4][9] = Integer.parseInt(loaned5[9]);
    	    javagame.Storage_Info.Storage3[4][10] = loaned5[10];
    	String loan6 = in.next();
    	String[] loaned6 = loan6.split(";");
    	    javagame.Storage_Info.Storage3[5][0] = loaned6[0];
    	    javagame.Storage_Info.Storage3[5][1] = Integer.parseInt(loaned6[1]);
    	    javagame.Storage_Info.Storage3[5][2] = Integer.parseInt(loaned6[2]);
    	    javagame.Storage_Info.Storage3[5][3] = loaned6[3];
    	    javagame.Storage_Info.Storage3[5][4] = Integer.parseInt(loaned6[4]);
    	    javagame.Storage_Info.Storage3[5][5] = Integer.parseInt(loaned6[5]);
    	    javagame.Storage_Info.Storage3[5][6] = Integer.parseInt(loaned6[6]);
    	    javagame.Storage_Info.Storage3[5][7] = Integer.parseInt(loaned6[7]);
    	    javagame.Storage_Info.Storage3[5][8] = Integer.parseInt(loaned6[8]);
    	    javagame.Storage_Info.Storage3[5][9] = Integer.parseInt(loaned6[9]);
    	    javagame.Storage_Info.Storage3[5][10] = loaned6[10];
    	String loan7 = in.next();
    	String[] loaned7 = loan7.split(";");
    	    javagame.Storage_Info.Storage3[6][0] = loaned7[0];
    	    javagame.Storage_Info.Storage3[6][1] = Integer.parseInt(loaned7[1]);
    	    javagame.Storage_Info.Storage3[6][2] = Integer.parseInt(loaned7[2]);
    	    javagame.Storage_Info.Storage3[6][3] = loaned7[3];
    	    javagame.Storage_Info.Storage3[6][4] = Integer.parseInt(loaned7[4]);
    	    javagame.Storage_Info.Storage3[6][5] = Integer.parseInt(loaned7[5]);
    	    javagame.Storage_Info.Storage3[6][6] = Integer.parseInt(loaned7[6]);
    	    javagame.Storage_Info.Storage3[6][7] = Integer.parseInt(loaned7[7]);
    	    javagame.Storage_Info.Storage3[6][8] = Integer.parseInt(loaned7[8]);
    	    javagame.Storage_Info.Storage3[6][9] = Integer.parseInt(loaned7[9]);
    	    javagame.Storage_Info.Storage3[6][10] = loaned7[10];
    	String loan8 = in.next();
    	String[] loaned8 = loan8.split(";");
    	    javagame.Storage_Info.Storage3[7][0] = loaned8[0];
    	    javagame.Storage_Info.Storage3[7][1] = Integer.parseInt(loaned8[1]);
    	    javagame.Storage_Info.Storage3[7][2] = Integer.parseInt(loaned8[2]);
    	    javagame.Storage_Info.Storage3[7][3] = loaned8[3];
    	    javagame.Storage_Info.Storage3[7][4] = Integer.parseInt(loaned8[4]);
    	    javagame.Storage_Info.Storage3[7][5] = Integer.parseInt(loaned8[5]);
    	    javagame.Storage_Info.Storage3[7][6] = Integer.parseInt(loaned8[6]);
    	    javagame.Storage_Info.Storage3[7][7] = Integer.parseInt(loaned8[7]);
    	    javagame.Storage_Info.Storage3[7][8] = Integer.parseInt(loaned8[8]);
    	    javagame.Storage_Info.Storage3[7][9] = Integer.parseInt(loaned8[9]);
    	    javagame.Storage_Info.Storage3[7][10] = loaned8[10];
    	String loan9 = in.next();
    	String[] loaned9 = loan9.split(";");
    	    javagame.Storage_Info.Storage3[8][0] = loaned9[0];
    	    javagame.Storage_Info.Storage3[8][1] = Integer.parseInt(loaned9[1]);
    	    javagame.Storage_Info.Storage3[8][2] = Integer.parseInt(loaned9[2]);
    	    javagame.Storage_Info.Storage3[8][3] = loaned9[3];
    	    javagame.Storage_Info.Storage3[8][4] = Integer.parseInt(loaned9[4]);
    	    javagame.Storage_Info.Storage3[8][5] = Integer.parseInt(loaned9[5]);
    	    javagame.Storage_Info.Storage3[8][6] = Integer.parseInt(loaned9[6]);
    	    javagame.Storage_Info.Storage3[8][7] = Integer.parseInt(loaned9[7]);
    	    javagame.Storage_Info.Storage3[8][8] = Integer.parseInt(loaned9[8]);
    	    javagame.Storage_Info.Storage3[8][9] = Integer.parseInt(loaned9[9]);
    	    javagame.Storage_Info.Storage3[8][10] = loaned9[10];
    	String loan10 = in.next();
    	String[] loaned10 = loan10.split(";");
    	    javagame.Storage_Info.Storage3[9][0] = loaned10[0];
    	    javagame.Storage_Info.Storage3[9][1] = Integer.parseInt(loaned10[1]);
    	    javagame.Storage_Info.Storage3[9][2] = Integer.parseInt(loaned10[2]);
    	    javagame.Storage_Info.Storage3[9][3] = loaned10[3];
    	    javagame.Storage_Info.Storage3[9][4] = Integer.parseInt(loaned10[4]);
    	    javagame.Storage_Info.Storage3[9][5] = Integer.parseInt(loaned10[5]);
    	    javagame.Storage_Info.Storage3[9][6] = Integer.parseInt(loaned10[6]);
    	    javagame.Storage_Info.Storage3[9][7] = Integer.parseInt(loaned10[7]);
    	    javagame.Storage_Info.Storage3[9][8] = Integer.parseInt(loaned10[8]);
    	    javagame.Storage_Info.Storage3[9][9] = Integer.parseInt(loaned10[9]);
    	    javagame.Storage_Info.Storage3[9][10] = loaned10[10];
    	String loan11 = in.next();
    	String[] loaned11 = loan11.split(";");
    	    javagame.Storage_Info.Storage3[10][0] = loaned11[0];
    	    javagame.Storage_Info.Storage3[10][1] = Integer.parseInt(loaned11[1]);
    	    javagame.Storage_Info.Storage3[10][2] = Integer.parseInt(loaned11[2]);
    	    javagame.Storage_Info.Storage3[10][3] = loaned11[3];
    	    javagame.Storage_Info.Storage3[10][4] = Integer.parseInt(loaned11[4]);
    	    javagame.Storage_Info.Storage3[10][5] = Integer.parseInt(loaned11[5]);
    	    javagame.Storage_Info.Storage3[10][6] = Integer.parseInt(loaned11[6]);
    	    javagame.Storage_Info.Storage3[10][7] = Integer.parseInt(loaned11[7]);
    	    javagame.Storage_Info.Storage3[10][8] = Integer.parseInt(loaned11[8]);
    	    javagame.Storage_Info.Storage3[10][9] = Integer.parseInt(loaned11[9]);
    	    javagame.Storage_Info.Storage3[10][10] = loaned11[10];
    	String loan12 = in.next();
    	String[] loaned12 = loan12.split(";");
    	    javagame.Storage_Info.Storage3[11][0] = loaned12[0];
    	    javagame.Storage_Info.Storage3[11][1] = Integer.parseInt(loaned12[1]);
    	    javagame.Storage_Info.Storage3[11][2] = Integer.parseInt(loaned12[2]);
    	    javagame.Storage_Info.Storage3[11][3] = loaned12[3];
    	    javagame.Storage_Info.Storage3[11][4] = Integer.parseInt(loaned12[4]);
    	    javagame.Storage_Info.Storage3[11][5] = Integer.parseInt(loaned12[5]);
    	    javagame.Storage_Info.Storage3[11][6] = Integer.parseInt(loaned12[6]);
    	    javagame.Storage_Info.Storage3[11][7] = Integer.parseInt(loaned12[7]);
    	    javagame.Storage_Info.Storage3[11][8] = Integer.parseInt(loaned12[8]);
    	    javagame.Storage_Info.Storage3[11][9] = Integer.parseInt(loaned12[9]);
    	    javagame.Storage_Info.Storage3[11][10] = loaned12[10];
    	String loan13 = in.next();
    	String[] loaned13 = loan13.split(";");
    	    javagame.Storage_Info.Storage3[12][0] = loaned13[0];
    	    javagame.Storage_Info.Storage3[12][1] = Integer.parseInt(loaned13[1]);
    	    javagame.Storage_Info.Storage3[12][2] = Integer.parseInt(loaned13[2]);
    	    javagame.Storage_Info.Storage3[12][3] = loaned13[3];
    	    javagame.Storage_Info.Storage3[12][4] = Integer.parseInt(loaned13[4]);
    	    javagame.Storage_Info.Storage3[12][5] = Integer.parseInt(loaned13[5]);
    	    javagame.Storage_Info.Storage3[12][6] = Integer.parseInt(loaned13[6]);
    	    javagame.Storage_Info.Storage3[12][7] = Integer.parseInt(loaned13[7]);
    	    javagame.Storage_Info.Storage3[12][8] = Integer.parseInt(loaned13[8]);
    	    javagame.Storage_Info.Storage3[12][9] = Integer.parseInt(loaned13[9]);
    	    javagame.Storage_Info.Storage3[12][10] = loaned13[10];
    	String loan14 = in.next();
    	String[] loaned14 = loan14.split(";");
    	    javagame.Storage_Info.Storage3[13][0] = loaned14[0];
    	    javagame.Storage_Info.Storage3[13][1] = Integer.parseInt(loaned14[1]);
    	    javagame.Storage_Info.Storage3[13][2] = Integer.parseInt(loaned14[2]);
    	    javagame.Storage_Info.Storage3[13][3] = loaned14[3];
    	    javagame.Storage_Info.Storage3[13][4] = Integer.parseInt(loaned14[4]);
    	    javagame.Storage_Info.Storage3[13][5] = Integer.parseInt(loaned14[5]);
    	    javagame.Storage_Info.Storage3[13][6] = Integer.parseInt(loaned14[6]);
    	    javagame.Storage_Info.Storage3[13][7] = Integer.parseInt(loaned14[7]);
    	    javagame.Storage_Info.Storage3[13][8] = Integer.parseInt(loaned14[8]);
    	    javagame.Storage_Info.Storage3[13][9] = Integer.parseInt(loaned14[9]);
    	    javagame.Storage_Info.Storage3[13][10] = loaned14[10];
    	String loan15 = in.next();
    	String[] loaned15 = loan15.split(";");
    	    javagame.Storage_Info.Storage3[14][0] = loaned15[0];
    	    javagame.Storage_Info.Storage3[14][1] = Integer.parseInt(loaned15[1]);
    	    javagame.Storage_Info.Storage3[14][2] = Integer.parseInt(loaned15[2]);
    	    javagame.Storage_Info.Storage3[14][3] = loaned15[3];
    	    javagame.Storage_Info.Storage3[14][4] = Integer.parseInt(loaned15[4]);
    	    javagame.Storage_Info.Storage3[14][5] = Integer.parseInt(loaned15[5]);
    	    javagame.Storage_Info.Storage3[14][6] = Integer.parseInt(loaned15[6]);
    	    javagame.Storage_Info.Storage3[14][7] = Integer.parseInt(loaned15[7]);
    	    javagame.Storage_Info.Storage3[14][8] = Integer.parseInt(loaned15[8]);
    	    javagame.Storage_Info.Storage3[14][9] = Integer.parseInt(loaned15[9]);
    	    javagame.Storage_Info.Storage3[14][10] = loaned15[10];
    	String loan16 = in.next();
    	String[] loaned16 = loan16.split(";");
    	    javagame.Storage_Info.Storage3[15][0] = loaned16[0];
    	    javagame.Storage_Info.Storage3[15][1] = Integer.parseInt(loaned16[1]);
    	    javagame.Storage_Info.Storage3[15][2] = Integer.parseInt(loaned16[2]);
    	    javagame.Storage_Info.Storage3[15][3] = loaned16[3];
    	    javagame.Storage_Info.Storage3[15][4] = Integer.parseInt(loaned16[4]);
    	    javagame.Storage_Info.Storage3[15][5] = Integer.parseInt(loaned16[5]);
    	    javagame.Storage_Info.Storage3[15][6] = Integer.parseInt(loaned16[6]);
    	    javagame.Storage_Info.Storage3[15][7] = Integer.parseInt(loaned16[7]);
    	    javagame.Storage_Info.Storage3[15][8] = Integer.parseInt(loaned16[8]);
    	    javagame.Storage_Info.Storage3[15][9] = Integer.parseInt(loaned16[9]);
    	    javagame.Storage_Info.Storage3[15][10] = loaned16[10];
    	String loan17 = in.next();
    	String[] loaned17 = loan17.split(";");
    	    javagame.Storage_Info.Storage3[16][0] = loaned17[0];
    	    javagame.Storage_Info.Storage3[16][1] = Integer.parseInt(loaned17[1]);
    	    javagame.Storage_Info.Storage3[16][2] = Integer.parseInt(loaned17[2]);
    	    javagame.Storage_Info.Storage3[16][3] = loaned17[3];
    	    javagame.Storage_Info.Storage3[16][4] = Integer.parseInt(loaned17[4]);
    	    javagame.Storage_Info.Storage3[16][5] = Integer.parseInt(loaned17[5]);
    	    javagame.Storage_Info.Storage3[16][6] = Integer.parseInt(loaned17[6]);
    	    javagame.Storage_Info.Storage3[16][7] = Integer.parseInt(loaned17[7]);
    	    javagame.Storage_Info.Storage3[16][8] = Integer.parseInt(loaned17[8]);
    	    javagame.Storage_Info.Storage3[16][9] = Integer.parseInt(loaned17[9]);
    	    javagame.Storage_Info.Storage3[16][10] = loaned17[10];
    	String loan18 = in.next();
    	String[] loaned18 = loan18.split(";");
    	    javagame.Storage_Info.Storage3[17][0] = loaned18[0];
    	    javagame.Storage_Info.Storage3[17][1] = Integer.parseInt(loaned18[1]);
    	    javagame.Storage_Info.Storage3[17][2] = Integer.parseInt(loaned18[2]);
    	    javagame.Storage_Info.Storage3[17][3] = loaned18[3];
    	    javagame.Storage_Info.Storage3[17][4] = Integer.parseInt(loaned18[4]);
    	    javagame.Storage_Info.Storage3[17][5] = Integer.parseInt(loaned18[5]);
    	    javagame.Storage_Info.Storage3[17][6] = Integer.parseInt(loaned18[6]);
    	    javagame.Storage_Info.Storage3[17][7] = Integer.parseInt(loaned18[7]);
    	    javagame.Storage_Info.Storage3[17][8] = Integer.parseInt(loaned18[8]);
    	    javagame.Storage_Info.Storage3[17][9] = Integer.parseInt(loaned18[9]);
    	    javagame.Storage_Info.Storage3[17][10] = loaned18[10];
    	in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		try {
			in = new Scanner(new File("sharedS2.Gateway"));
    	//Equipment
    	String loan1 = in.next();
    	String[] loaned1 = loan1.split(";");
    	    javagame.Storage_Info.Storage2[0][0] = loaned1[0];
    	    javagame.Storage_Info.Storage2[0][1] = Integer.parseInt(loaned1[1]);
    	    javagame.Storage_Info.Storage2[0][2] = Integer.parseInt(loaned1[2]);
    	    javagame.Storage_Info.Storage2[0][3] = loaned1[3];
    	    javagame.Storage_Info.Storage2[0][4] = Integer.parseInt(loaned1[4]);
    	    javagame.Storage_Info.Storage2[0][5] = Integer.parseInt(loaned1[5]);
    	    javagame.Storage_Info.Storage2[0][6] = Integer.parseInt(loaned1[6]);
    	    javagame.Storage_Info.Storage2[0][7] = Integer.parseInt(loaned1[7]);
    	    javagame.Storage_Info.Storage2[0][8] = Integer.parseInt(loaned1[8]);
    	    javagame.Storage_Info.Storage2[0][9] = Integer.parseInt(loaned1[9]);
    	    javagame.Storage_Info.Storage2[0][10] = loaned1[10];
    	String loan2 = in.next();
    	String[] loaned2 = loan2.split(";");
            javagame.Storage_Info.Storage2[1][0] = loaned2[0];
    	    javagame.Storage_Info.Storage2[1][1] = Integer.parseInt(loaned2[1]);
    	    javagame.Storage_Info.Storage2[1][2] = Integer.parseInt(loaned2[2]);
    	    javagame.Storage_Info.Storage2[1][3] = loaned2[3];
    	    javagame.Storage_Info.Storage2[1][4] = Integer.parseInt(loaned2[4]);
    	    javagame.Storage_Info.Storage2[1][5] = Integer.parseInt(loaned2[5]);
    	    javagame.Storage_Info.Storage2[1][6] = Integer.parseInt(loaned2[6]);
    	    javagame.Storage_Info.Storage2[1][7] = Integer.parseInt(loaned2[7]);
    	    javagame.Storage_Info.Storage2[1][8] = Integer.parseInt(loaned2[8]);
    	    javagame.Storage_Info.Storage2[1][9] = Integer.parseInt(loaned2[9]);
    	    javagame.Storage_Info.Storage2[1][10] = loaned2[10];
    	String loan3 = in.next();
    	String[] loaned3 = loan3.split(";");
    	    javagame.Storage_Info.Storage2[2][0] = loaned3[0];
    	    javagame.Storage_Info.Storage2[2][1] = Integer.parseInt(loaned3[1]);
    	    javagame.Storage_Info.Storage2[2][2] = Integer.parseInt(loaned3[2]);
    	    javagame.Storage_Info.Storage2[2][3] = loaned3[3];
    	    javagame.Storage_Info.Storage2[2][4] = Integer.parseInt(loaned3[4]);
    	    javagame.Storage_Info.Storage2[2][5] = Integer.parseInt(loaned3[5]);
    	    javagame.Storage_Info.Storage2[2][6] = Integer.parseInt(loaned3[6]);
    	    javagame.Storage_Info.Storage2[2][7] = Integer.parseInt(loaned3[7]);
    	    javagame.Storage_Info.Storage2[2][8] = Integer.parseInt(loaned3[8]);
    	    javagame.Storage_Info.Storage2[2][9] = Integer.parseInt(loaned3[9]);
    	    javagame.Storage_Info.Storage2[2][10] = loaned3[10];
    	String loan4 = in.next();
    	String[] loaned4 = loan4.split(";");
    	    javagame.Storage_Info.Storage2[3][0] = loaned4[0];
    	    javagame.Storage_Info.Storage2[3][1] = Integer.parseInt(loaned4[1]);
    	    javagame.Storage_Info.Storage2[3][2] = Integer.parseInt(loaned4[2]);
    	    javagame.Storage_Info.Storage2[3][3] = loaned4[3];
    	    javagame.Storage_Info.Storage2[3][4] = Integer.parseInt(loaned4[4]);
    	    javagame.Storage_Info.Storage2[3][5] = Integer.parseInt(loaned4[5]);
    	    javagame.Storage_Info.Storage2[3][6] = Integer.parseInt(loaned4[6]);
    	    javagame.Storage_Info.Storage2[3][7] = Integer.parseInt(loaned4[7]);
    	    javagame.Storage_Info.Storage2[3][8] = Integer.parseInt(loaned4[8]);
    	    javagame.Storage_Info.Storage2[3][9] = Integer.parseInt(loaned4[9]);
    	    javagame.Storage_Info.Storage2[3][10] = loaned4[10];
    	String loan5 = in.next();
    	String[] loaned5 = loan5.split(";");
    	    javagame.Storage_Info.Storage2[4][0] = loaned5[0];
    	    javagame.Storage_Info.Storage2[4][1] = Integer.parseInt(loaned5[1]);
    	    javagame.Storage_Info.Storage2[4][2] = Integer.parseInt(loaned5[2]);
    	    javagame.Storage_Info.Storage2[4][3] = loaned5[3];
    	    javagame.Storage_Info.Storage2[4][4] = Integer.parseInt(loaned5[4]);
    	    javagame.Storage_Info.Storage2[4][5] = Integer.parseInt(loaned5[5]);
    	    javagame.Storage_Info.Storage2[4][6] = Integer.parseInt(loaned5[6]);
    	    javagame.Storage_Info.Storage2[4][7] = Integer.parseInt(loaned5[7]);
    	    javagame.Storage_Info.Storage2[4][8] = Integer.parseInt(loaned5[8]);
    	    javagame.Storage_Info.Storage2[4][9] = Integer.parseInt(loaned5[9]);
    	    javagame.Storage_Info.Storage2[4][10] = loaned5[10];
    	String loan6 = in.next();
    	String[] loaned6 = loan6.split(";");
    	    javagame.Storage_Info.Storage2[5][0] = loaned6[0];
    	    javagame.Storage_Info.Storage2[5][1] = Integer.parseInt(loaned6[1]);
    	    javagame.Storage_Info.Storage2[5][2] = Integer.parseInt(loaned6[2]);
    	    javagame.Storage_Info.Storage2[5][3] = loaned6[3];
    	    javagame.Storage_Info.Storage2[5][4] = Integer.parseInt(loaned6[4]);
    	    javagame.Storage_Info.Storage2[5][5] = Integer.parseInt(loaned6[5]);
    	    javagame.Storage_Info.Storage2[5][6] = Integer.parseInt(loaned6[6]);
    	    javagame.Storage_Info.Storage2[5][7] = Integer.parseInt(loaned6[7]);
    	    javagame.Storage_Info.Storage2[5][8] = Integer.parseInt(loaned6[8]);
    	    javagame.Storage_Info.Storage2[5][9] = Integer.parseInt(loaned6[9]);
    	    javagame.Storage_Info.Storage2[5][10] = loaned6[10];
    	String loan7 = in.next();
    	String[] loaned7 = loan7.split(";");
    	    javagame.Storage_Info.Storage2[6][0] = loaned7[0];
    	    javagame.Storage_Info.Storage2[6][1] = Integer.parseInt(loaned7[1]);
    	    javagame.Storage_Info.Storage2[6][2] = Integer.parseInt(loaned7[2]);
    	    javagame.Storage_Info.Storage2[6][3] = loaned7[3];
    	    javagame.Storage_Info.Storage2[6][4] = Integer.parseInt(loaned7[4]);
    	    javagame.Storage_Info.Storage2[6][5] = Integer.parseInt(loaned7[5]);
    	    javagame.Storage_Info.Storage2[6][6] = Integer.parseInt(loaned7[6]);
    	    javagame.Storage_Info.Storage2[6][7] = Integer.parseInt(loaned7[7]);
    	    javagame.Storage_Info.Storage2[6][8] = Integer.parseInt(loaned7[8]);
    	    javagame.Storage_Info.Storage2[6][9] = Integer.parseInt(loaned7[9]);
    	    javagame.Storage_Info.Storage2[6][10] = loaned7[10];
    	String loan8 = in.next();
    	String[] loaned8 = loan8.split(";");
    	    javagame.Storage_Info.Storage2[7][0] = loaned8[0];
    	    javagame.Storage_Info.Storage2[7][1] = Integer.parseInt(loaned8[1]);
    	    javagame.Storage_Info.Storage2[7][2] = Integer.parseInt(loaned8[2]);
    	    javagame.Storage_Info.Storage2[7][3] = loaned8[3];
    	    javagame.Storage_Info.Storage2[7][4] = Integer.parseInt(loaned8[4]);
    	    javagame.Storage_Info.Storage2[7][5] = Integer.parseInt(loaned8[5]);
    	    javagame.Storage_Info.Storage2[7][6] = Integer.parseInt(loaned8[6]);
    	    javagame.Storage_Info.Storage2[7][7] = Integer.parseInt(loaned8[7]);
    	    javagame.Storage_Info.Storage2[7][8] = Integer.parseInt(loaned8[8]);
    	    javagame.Storage_Info.Storage2[7][9] = Integer.parseInt(loaned8[9]);
    	    javagame.Storage_Info.Storage2[7][10] = loaned8[10];
    	String loan9 = in.next();
    	String[] loaned9 = loan9.split(";");
    	    javagame.Storage_Info.Storage2[8][0] = loaned9[0];
    	    javagame.Storage_Info.Storage2[8][1] = Integer.parseInt(loaned9[1]);
    	    javagame.Storage_Info.Storage2[8][2] = Integer.parseInt(loaned9[2]);
    	    javagame.Storage_Info.Storage2[8][3] = loaned9[3];
    	    javagame.Storage_Info.Storage2[8][4] = Integer.parseInt(loaned9[4]);
    	    javagame.Storage_Info.Storage2[8][5] = Integer.parseInt(loaned9[5]);
    	    javagame.Storage_Info.Storage2[8][6] = Integer.parseInt(loaned9[6]);
    	    javagame.Storage_Info.Storage2[8][7] = Integer.parseInt(loaned9[7]);
    	    javagame.Storage_Info.Storage2[8][8] = Integer.parseInt(loaned9[8]);
    	    javagame.Storage_Info.Storage2[8][9] = Integer.parseInt(loaned9[9]);
    	    javagame.Storage_Info.Storage2[8][10] = loaned9[10];
    	String loan10 = in.next();
    	String[] loaned10 = loan10.split(";");
    	    javagame.Storage_Info.Storage2[9][0] = loaned10[0];
    	    javagame.Storage_Info.Storage2[9][1] = Integer.parseInt(loaned10[1]);
    	    javagame.Storage_Info.Storage2[9][2] = Integer.parseInt(loaned10[2]);
    	    javagame.Storage_Info.Storage2[9][3] = loaned10[3];
    	    javagame.Storage_Info.Storage2[9][4] = Integer.parseInt(loaned10[4]);
    	    javagame.Storage_Info.Storage2[9][5] = Integer.parseInt(loaned10[5]);
    	    javagame.Storage_Info.Storage2[9][6] = Integer.parseInt(loaned10[6]);
    	    javagame.Storage_Info.Storage2[9][7] = Integer.parseInt(loaned10[7]);
    	    javagame.Storage_Info.Storage2[9][8] = Integer.parseInt(loaned10[8]);
    	    javagame.Storage_Info.Storage2[9][9] = Integer.parseInt(loaned10[9]);
    	    javagame.Storage_Info.Storage2[9][10] = loaned10[10];
    	String loan11 = in.next();
    	String[] loaned11 = loan11.split(";");
    	    javagame.Storage_Info.Storage2[10][0] = loaned11[0];
    	    javagame.Storage_Info.Storage2[10][1] = Integer.parseInt(loaned11[1]);
    	    javagame.Storage_Info.Storage2[10][2] = Integer.parseInt(loaned11[2]);
    	    javagame.Storage_Info.Storage2[10][3] = loaned11[3];
    	    javagame.Storage_Info.Storage2[10][4] = Integer.parseInt(loaned11[4]);
    	    javagame.Storage_Info.Storage2[10][5] = Integer.parseInt(loaned11[5]);
    	    javagame.Storage_Info.Storage2[10][6] = Integer.parseInt(loaned11[6]);
    	    javagame.Storage_Info.Storage2[10][7] = Integer.parseInt(loaned11[7]);
    	    javagame.Storage_Info.Storage2[10][8] = Integer.parseInt(loaned11[8]);
    	    javagame.Storage_Info.Storage2[10][9] = Integer.parseInt(loaned11[9]);
    	    javagame.Storage_Info.Storage2[10][10] = loaned11[10];
    	String loan12 = in.next();
    	String[] loaned12 = loan12.split(";");
    	    javagame.Storage_Info.Storage2[11][0] = loaned12[0];
    	    javagame.Storage_Info.Storage2[11][1] = Integer.parseInt(loaned12[1]);
    	    javagame.Storage_Info.Storage2[11][2] = Integer.parseInt(loaned12[2]);
    	    javagame.Storage_Info.Storage2[11][3] = loaned12[3];
    	    javagame.Storage_Info.Storage2[11][4] = Integer.parseInt(loaned12[4]);
    	    javagame.Storage_Info.Storage2[11][5] = Integer.parseInt(loaned12[5]);
    	    javagame.Storage_Info.Storage2[11][6] = Integer.parseInt(loaned12[6]);
    	    javagame.Storage_Info.Storage2[11][7] = Integer.parseInt(loaned12[7]);
    	    javagame.Storage_Info.Storage2[11][8] = Integer.parseInt(loaned12[8]);
    	    javagame.Storage_Info.Storage2[11][9] = Integer.parseInt(loaned12[9]);
    	    javagame.Storage_Info.Storage2[11][10] = loaned12[10];
    	String loan13 = in.next();
    	String[] loaned13 = loan13.split(";");
    	    javagame.Storage_Info.Storage2[12][0] = loaned13[0];
    	    javagame.Storage_Info.Storage2[12][1] = Integer.parseInt(loaned13[1]);
    	    javagame.Storage_Info.Storage2[12][2] = Integer.parseInt(loaned13[2]);
    	    javagame.Storage_Info.Storage2[12][3] = loaned13[3];
    	    javagame.Storage_Info.Storage2[12][4] = Integer.parseInt(loaned13[4]);
    	    javagame.Storage_Info.Storage2[12][5] = Integer.parseInt(loaned13[5]);
    	    javagame.Storage_Info.Storage2[12][6] = Integer.parseInt(loaned13[6]);
    	    javagame.Storage_Info.Storage2[12][7] = Integer.parseInt(loaned13[7]);
    	    javagame.Storage_Info.Storage2[12][8] = Integer.parseInt(loaned13[8]);
    	    javagame.Storage_Info.Storage2[12][9] = Integer.parseInt(loaned13[9]);
    	    javagame.Storage_Info.Storage2[12][10] = loaned13[10];
    	String loan14 = in.next();
    	String[] loaned14 = loan14.split(";");
    	    javagame.Storage_Info.Storage2[13][0] = loaned14[0];
    	    javagame.Storage_Info.Storage2[13][1] = Integer.parseInt(loaned14[1]);
    	    javagame.Storage_Info.Storage2[13][2] = Integer.parseInt(loaned14[2]);
    	    javagame.Storage_Info.Storage2[13][3] = loaned14[3];
    	    javagame.Storage_Info.Storage2[13][4] = Integer.parseInt(loaned14[4]);
    	    javagame.Storage_Info.Storage2[13][5] = Integer.parseInt(loaned14[5]);
    	    javagame.Storage_Info.Storage2[13][6] = Integer.parseInt(loaned14[6]);
    	    javagame.Storage_Info.Storage2[13][7] = Integer.parseInt(loaned14[7]);
    	    javagame.Storage_Info.Storage2[13][8] = Integer.parseInt(loaned14[8]);
    	    javagame.Storage_Info.Storage2[13][9] = Integer.parseInt(loaned14[9]);
    	    javagame.Storage_Info.Storage2[13][10] = loaned14[10];
    	String loan15 = in.next();
    	String[] loaned15 = loan15.split(";");
    	    javagame.Storage_Info.Storage2[14][0] = loaned15[0];
    	    javagame.Storage_Info.Storage2[14][1] = Integer.parseInt(loaned15[1]);
    	    javagame.Storage_Info.Storage2[14][2] = Integer.parseInt(loaned15[2]);
    	    javagame.Storage_Info.Storage2[14][3] = loaned15[3];
    	    javagame.Storage_Info.Storage2[14][4] = Integer.parseInt(loaned15[4]);
    	    javagame.Storage_Info.Storage2[14][5] = Integer.parseInt(loaned15[5]);
    	    javagame.Storage_Info.Storage2[14][6] = Integer.parseInt(loaned15[6]);
    	    javagame.Storage_Info.Storage2[14][7] = Integer.parseInt(loaned15[7]);
    	    javagame.Storage_Info.Storage2[14][8] = Integer.parseInt(loaned15[8]);
    	    javagame.Storage_Info.Storage2[14][9] = Integer.parseInt(loaned15[9]);
    	    javagame.Storage_Info.Storage2[14][10] = loaned15[10];
    	String loan16 = in.next();
    	String[] loaned16 = loan16.split(";");
    	    javagame.Storage_Info.Storage2[15][0] = loaned16[0];
    	    javagame.Storage_Info.Storage2[15][1] = Integer.parseInt(loaned16[1]);
    	    javagame.Storage_Info.Storage2[15][2] = Integer.parseInt(loaned16[2]);
    	    javagame.Storage_Info.Storage2[15][3] = loaned16[3];
    	    javagame.Storage_Info.Storage2[15][4] = Integer.parseInt(loaned16[4]);
    	    javagame.Storage_Info.Storage2[15][5] = Integer.parseInt(loaned16[5]);
    	    javagame.Storage_Info.Storage2[15][6] = Integer.parseInt(loaned16[6]);
    	    javagame.Storage_Info.Storage2[15][7] = Integer.parseInt(loaned16[7]);
    	    javagame.Storage_Info.Storage2[15][8] = Integer.parseInt(loaned16[8]);
    	    javagame.Storage_Info.Storage2[15][9] = Integer.parseInt(loaned16[9]);
    	    javagame.Storage_Info.Storage2[15][10] = loaned16[10];
    	String loan17 = in.next();
    	String[] loaned17 = loan17.split(";");
    	    javagame.Storage_Info.Storage2[16][0] = loaned17[0];
    	    javagame.Storage_Info.Storage2[16][1] = Integer.parseInt(loaned17[1]);
    	    javagame.Storage_Info.Storage2[16][2] = Integer.parseInt(loaned17[2]);
    	    javagame.Storage_Info.Storage2[16][3] = loaned17[3];
    	    javagame.Storage_Info.Storage2[16][4] = Integer.parseInt(loaned17[4]);
    	    javagame.Storage_Info.Storage2[16][5] = Integer.parseInt(loaned17[5]);
    	    javagame.Storage_Info.Storage2[16][6] = Integer.parseInt(loaned17[6]);
    	    javagame.Storage_Info.Storage2[16][7] = Integer.parseInt(loaned17[7]);
    	    javagame.Storage_Info.Storage2[16][8] = Integer.parseInt(loaned17[8]);
    	    javagame.Storage_Info.Storage2[16][9] = Integer.parseInt(loaned17[9]);
    	    javagame.Storage_Info.Storage2[16][10] = loaned17[10];
    	String loan18 = in.next();
    	String[] loaned18 = loan18.split(";");
    	    javagame.Storage_Info.Storage2[17][0] = loaned18[0];
    	    javagame.Storage_Info.Storage2[17][1] = Integer.parseInt(loaned18[1]);
    	    javagame.Storage_Info.Storage2[17][2] = Integer.parseInt(loaned18[2]);
    	    javagame.Storage_Info.Storage2[17][3] = loaned18[3];
    	    javagame.Storage_Info.Storage2[17][4] = Integer.parseInt(loaned18[4]);
    	    javagame.Storage_Info.Storage2[17][5] = Integer.parseInt(loaned18[5]);
    	    javagame.Storage_Info.Storage2[17][6] = Integer.parseInt(loaned18[6]);
    	    javagame.Storage_Info.Storage2[17][7] = Integer.parseInt(loaned18[7]);
    	    javagame.Storage_Info.Storage2[17][8] = Integer.parseInt(loaned18[8]);
    	    javagame.Storage_Info.Storage2[17][9] = Integer.parseInt(loaned18[9]);
    	    javagame.Storage_Info.Storage2[17][10] = loaned18[10];
    	in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
		
		try {
			in = new Scanner(new File("sharedS1.Gateway"));
    	//Equipment
    	String loan1 = in.next();
    	String[] loaned1 = loan1.split(";");
    	    javagame.Storage_Info.Storage1[0][0] = loaned1[0];
    	    javagame.Storage_Info.Storage1[0][1] = Integer.parseInt(loaned1[1]);
    	    javagame.Storage_Info.Storage1[0][2] = Integer.parseInt(loaned1[2]);
    	    javagame.Storage_Info.Storage1[0][3] = loaned1[3];
    	    javagame.Storage_Info.Storage1[0][4] = Integer.parseInt(loaned1[4]);
    	    javagame.Storage_Info.Storage1[0][5] = Integer.parseInt(loaned1[5]);
    	    javagame.Storage_Info.Storage1[0][6] = Integer.parseInt(loaned1[6]);
    	    javagame.Storage_Info.Storage1[0][7] = Integer.parseInt(loaned1[7]);
    	    javagame.Storage_Info.Storage1[0][8] = Integer.parseInt(loaned1[8]);
    	    javagame.Storage_Info.Storage1[0][9] = Integer.parseInt(loaned1[9]);
    	    javagame.Storage_Info.Storage1[0][10] = loaned1[10];
    	String loan2 = in.next();
    	String[] loaned2 = loan2.split(";");
            javagame.Storage_Info.Storage1[1][0] = loaned2[0];
    	    javagame.Storage_Info.Storage1[1][1] = Integer.parseInt(loaned2[1]);
    	    javagame.Storage_Info.Storage1[1][2] = Integer.parseInt(loaned2[2]);
    	    javagame.Storage_Info.Storage1[1][3] = loaned2[3];
    	    javagame.Storage_Info.Storage1[1][4] = Integer.parseInt(loaned2[4]);
    	    javagame.Storage_Info.Storage1[1][5] = Integer.parseInt(loaned2[5]);
    	    javagame.Storage_Info.Storage1[1][6] = Integer.parseInt(loaned2[6]);
    	    javagame.Storage_Info.Storage1[1][7] = Integer.parseInt(loaned2[7]);
    	    javagame.Storage_Info.Storage1[1][8] = Integer.parseInt(loaned2[8]);
    	    javagame.Storage_Info.Storage1[1][9] = Integer.parseInt(loaned2[9]);
    	    javagame.Storage_Info.Storage1[1][10] = loaned2[10];
    	String loan3 = in.next();
    	String[] loaned3 = loan3.split(";");
    	    javagame.Storage_Info.Storage1[2][0] = loaned3[0];
    	    javagame.Storage_Info.Storage1[2][1] = Integer.parseInt(loaned3[1]);
    	    javagame.Storage_Info.Storage1[2][2] = Integer.parseInt(loaned3[2]);
    	    javagame.Storage_Info.Storage1[2][3] = loaned3[3];
    	    javagame.Storage_Info.Storage1[2][4] = Integer.parseInt(loaned3[4]);
    	    javagame.Storage_Info.Storage1[2][5] = Integer.parseInt(loaned3[5]);
    	    javagame.Storage_Info.Storage1[2][6] = Integer.parseInt(loaned3[6]);
    	    javagame.Storage_Info.Storage1[2][7] = Integer.parseInt(loaned3[7]);
    	    javagame.Storage_Info.Storage1[2][8] = Integer.parseInt(loaned3[8]);
    	    javagame.Storage_Info.Storage1[2][9] = Integer.parseInt(loaned3[9]);
    	    javagame.Storage_Info.Storage1[2][10] = loaned3[10];
    	String loan4 = in.next();
    	String[] loaned4 = loan4.split(";");
    	    javagame.Storage_Info.Storage1[3][0] = loaned4[0];
    	    javagame.Storage_Info.Storage1[3][1] = Integer.parseInt(loaned4[1]);
    	    javagame.Storage_Info.Storage1[3][2] = Integer.parseInt(loaned4[2]);
    	    javagame.Storage_Info.Storage1[3][3] = loaned4[3];
    	    javagame.Storage_Info.Storage1[3][4] = Integer.parseInt(loaned4[4]);
    	    javagame.Storage_Info.Storage1[3][5] = Integer.parseInt(loaned4[5]);
    	    javagame.Storage_Info.Storage1[3][6] = Integer.parseInt(loaned4[6]);
    	    javagame.Storage_Info.Storage1[3][7] = Integer.parseInt(loaned4[7]);
    	    javagame.Storage_Info.Storage1[3][8] = Integer.parseInt(loaned4[8]);
    	    javagame.Storage_Info.Storage1[3][9] = Integer.parseInt(loaned4[9]);
    	    javagame.Storage_Info.Storage1[3][10] = loaned4[10];
    	String loan5 = in.next();
    	String[] loaned5 = loan5.split(";");
    	    javagame.Storage_Info.Storage1[4][0] = loaned5[0];
    	    javagame.Storage_Info.Storage1[4][1] = Integer.parseInt(loaned5[1]);
    	    javagame.Storage_Info.Storage1[4][2] = Integer.parseInt(loaned5[2]);
    	    javagame.Storage_Info.Storage1[4][3] = loaned5[3];
    	    javagame.Storage_Info.Storage1[4][4] = Integer.parseInt(loaned5[4]);
    	    javagame.Storage_Info.Storage1[4][5] = Integer.parseInt(loaned5[5]);
    	    javagame.Storage_Info.Storage1[4][6] = Integer.parseInt(loaned5[6]);
    	    javagame.Storage_Info.Storage1[4][7] = Integer.parseInt(loaned5[7]);
    	    javagame.Storage_Info.Storage1[4][8] = Integer.parseInt(loaned5[8]);
    	    javagame.Storage_Info.Storage1[4][9] = Integer.parseInt(loaned5[9]);
    	    javagame.Storage_Info.Storage1[4][10] = loaned5[10];
    	String loan6 = in.next();
    	String[] loaned6 = loan6.split(";");
    	    javagame.Storage_Info.Storage1[5][0] = loaned6[0];
    	    javagame.Storage_Info.Storage1[5][1] = Integer.parseInt(loaned6[1]);
    	    javagame.Storage_Info.Storage1[5][2] = Integer.parseInt(loaned6[2]);
    	    javagame.Storage_Info.Storage1[5][3] = loaned6[3];
    	    javagame.Storage_Info.Storage1[5][4] = Integer.parseInt(loaned6[4]);
    	    javagame.Storage_Info.Storage1[5][5] = Integer.parseInt(loaned6[5]);
    	    javagame.Storage_Info.Storage1[5][6] = Integer.parseInt(loaned6[6]);
    	    javagame.Storage_Info.Storage1[5][7] = Integer.parseInt(loaned6[7]);
    	    javagame.Storage_Info.Storage1[5][8] = Integer.parseInt(loaned6[8]);
    	    javagame.Storage_Info.Storage1[5][9] = Integer.parseInt(loaned6[9]);
    	    javagame.Storage_Info.Storage1[5][10] = loaned6[10];
    	String loan7 = in.next();
    	String[] loaned7 = loan7.split(";");
    	    javagame.Storage_Info.Storage1[6][0] = loaned7[0];
    	    javagame.Storage_Info.Storage1[6][1] = Integer.parseInt(loaned7[1]);
    	    javagame.Storage_Info.Storage1[6][2] = Integer.parseInt(loaned7[2]);
    	    javagame.Storage_Info.Storage1[6][3] = loaned7[3];
    	    javagame.Storage_Info.Storage1[6][4] = Integer.parseInt(loaned7[4]);
    	    javagame.Storage_Info.Storage1[6][5] = Integer.parseInt(loaned7[5]);
    	    javagame.Storage_Info.Storage1[6][6] = Integer.parseInt(loaned7[6]);
    	    javagame.Storage_Info.Storage1[6][7] = Integer.parseInt(loaned7[7]);
    	    javagame.Storage_Info.Storage1[6][8] = Integer.parseInt(loaned7[8]);
    	    javagame.Storage_Info.Storage1[6][9] = Integer.parseInt(loaned7[9]);
    	    javagame.Storage_Info.Storage1[6][10] = loaned7[10];
    	String loan8 = in.next();
    	String[] loaned8 = loan8.split(";");
    	    javagame.Storage_Info.Storage1[7][0] = loaned8[0];
    	    javagame.Storage_Info.Storage1[7][1] = Integer.parseInt(loaned8[1]);
    	    javagame.Storage_Info.Storage1[7][2] = Integer.parseInt(loaned8[2]);
    	    javagame.Storage_Info.Storage1[7][3] = loaned8[3];
    	    javagame.Storage_Info.Storage1[7][4] = Integer.parseInt(loaned8[4]);
    	    javagame.Storage_Info.Storage1[7][5] = Integer.parseInt(loaned8[5]);
    	    javagame.Storage_Info.Storage1[7][6] = Integer.parseInt(loaned8[6]);
    	    javagame.Storage_Info.Storage1[7][7] = Integer.parseInt(loaned8[7]);
    	    javagame.Storage_Info.Storage1[7][8] = Integer.parseInt(loaned8[8]);
    	    javagame.Storage_Info.Storage1[7][9] = Integer.parseInt(loaned8[9]);
    	    javagame.Storage_Info.Storage1[7][10] = loaned8[10];
    	String loan9 = in.next();
    	String[] loaned9 = loan9.split(";");
    	    javagame.Storage_Info.Storage1[8][0] = loaned9[0];
    	    javagame.Storage_Info.Storage1[8][1] = Integer.parseInt(loaned9[1]);
    	    javagame.Storage_Info.Storage1[8][2] = Integer.parseInt(loaned9[2]);
    	    javagame.Storage_Info.Storage1[8][3] = loaned9[3];
    	    javagame.Storage_Info.Storage1[8][4] = Integer.parseInt(loaned9[4]);
    	    javagame.Storage_Info.Storage1[8][5] = Integer.parseInt(loaned9[5]);
    	    javagame.Storage_Info.Storage1[8][6] = Integer.parseInt(loaned9[6]);
    	    javagame.Storage_Info.Storage1[8][7] = Integer.parseInt(loaned9[7]);
    	    javagame.Storage_Info.Storage1[8][8] = Integer.parseInt(loaned9[8]);
    	    javagame.Storage_Info.Storage1[8][9] = Integer.parseInt(loaned9[9]);
    	    javagame.Storage_Info.Storage1[8][10] = loaned9[10];
    	String loan10 = in.next();
    	String[] loaned10 = loan10.split(";");
    	    javagame.Storage_Info.Storage1[9][0] = loaned10[0];
    	    javagame.Storage_Info.Storage1[9][1] = Integer.parseInt(loaned10[1]);
    	    javagame.Storage_Info.Storage1[9][2] = Integer.parseInt(loaned10[2]);
    	    javagame.Storage_Info.Storage1[9][3] = loaned10[3];
    	    javagame.Storage_Info.Storage1[9][4] = Integer.parseInt(loaned10[4]);
    	    javagame.Storage_Info.Storage1[9][5] = Integer.parseInt(loaned10[5]);
    	    javagame.Storage_Info.Storage1[9][6] = Integer.parseInt(loaned10[6]);
    	    javagame.Storage_Info.Storage1[9][7] = Integer.parseInt(loaned10[7]);
    	    javagame.Storage_Info.Storage1[9][8] = Integer.parseInt(loaned10[8]);
    	    javagame.Storage_Info.Storage1[9][9] = Integer.parseInt(loaned10[9]);
    	    javagame.Storage_Info.Storage1[9][10] = loaned10[10];
    	String loan11 = in.next();
    	String[] loaned11 = loan11.split(";");
    	    javagame.Storage_Info.Storage1[10][0] = loaned11[0];
    	    javagame.Storage_Info.Storage1[10][1] = Integer.parseInt(loaned11[1]);
    	    javagame.Storage_Info.Storage1[10][2] = Integer.parseInt(loaned11[2]);
    	    javagame.Storage_Info.Storage1[10][3] = loaned11[3];
    	    javagame.Storage_Info.Storage1[10][4] = Integer.parseInt(loaned11[4]);
    	    javagame.Storage_Info.Storage1[10][5] = Integer.parseInt(loaned11[5]);
    	    javagame.Storage_Info.Storage1[10][6] = Integer.parseInt(loaned11[6]);
    	    javagame.Storage_Info.Storage1[10][7] = Integer.parseInt(loaned11[7]);
    	    javagame.Storage_Info.Storage1[10][8] = Integer.parseInt(loaned11[8]);
    	    javagame.Storage_Info.Storage1[10][9] = Integer.parseInt(loaned11[9]);
    	    javagame.Storage_Info.Storage1[10][10] = loaned11[10];
    	String loan12 = in.next();
    	String[] loaned12 = loan12.split(";");
    	    javagame.Storage_Info.Storage1[11][0] = loaned12[0];
    	    javagame.Storage_Info.Storage1[11][1] = Integer.parseInt(loaned12[1]);
    	    javagame.Storage_Info.Storage1[11][2] = Integer.parseInt(loaned12[2]);
    	    javagame.Storage_Info.Storage1[11][3] = loaned12[3];
    	    javagame.Storage_Info.Storage1[11][4] = Integer.parseInt(loaned12[4]);
    	    javagame.Storage_Info.Storage1[11][5] = Integer.parseInt(loaned12[5]);
    	    javagame.Storage_Info.Storage1[11][6] = Integer.parseInt(loaned12[6]);
    	    javagame.Storage_Info.Storage1[11][7] = Integer.parseInt(loaned12[7]);
    	    javagame.Storage_Info.Storage1[11][8] = Integer.parseInt(loaned12[8]);
    	    javagame.Storage_Info.Storage1[11][9] = Integer.parseInt(loaned12[9]);
    	    javagame.Storage_Info.Storage1[11][10] = loaned12[10];
    	String loan13 = in.next();
    	String[] loaned13 = loan13.split(";");
    	    javagame.Storage_Info.Storage1[12][0] = loaned13[0];
    	    javagame.Storage_Info.Storage1[12][1] = Integer.parseInt(loaned13[1]);
    	    javagame.Storage_Info.Storage1[12][2] = Integer.parseInt(loaned13[2]);
    	    javagame.Storage_Info.Storage1[12][3] = loaned13[3];
    	    javagame.Storage_Info.Storage1[12][4] = Integer.parseInt(loaned13[4]);
    	    javagame.Storage_Info.Storage1[12][5] = Integer.parseInt(loaned13[5]);
    	    javagame.Storage_Info.Storage1[12][6] = Integer.parseInt(loaned13[6]);
    	    javagame.Storage_Info.Storage1[12][7] = Integer.parseInt(loaned13[7]);
    	    javagame.Storage_Info.Storage1[12][8] = Integer.parseInt(loaned13[8]);
    	    javagame.Storage_Info.Storage1[12][9] = Integer.parseInt(loaned13[9]);
    	    javagame.Storage_Info.Storage1[12][10] = loaned13[10];
    	String loan14 = in.next();
    	String[] loaned14 = loan14.split(";");
    	    javagame.Storage_Info.Storage1[13][0] = loaned14[0];
    	    javagame.Storage_Info.Storage1[13][1] = Integer.parseInt(loaned14[1]);
    	    javagame.Storage_Info.Storage1[13][2] = Integer.parseInt(loaned14[2]);
    	    javagame.Storage_Info.Storage1[13][3] = loaned14[3];
    	    javagame.Storage_Info.Storage1[13][4] = Integer.parseInt(loaned14[4]);
    	    javagame.Storage_Info.Storage1[13][5] = Integer.parseInt(loaned14[5]);
    	    javagame.Storage_Info.Storage1[13][6] = Integer.parseInt(loaned14[6]);
    	    javagame.Storage_Info.Storage1[13][7] = Integer.parseInt(loaned14[7]);
    	    javagame.Storage_Info.Storage1[13][8] = Integer.parseInt(loaned14[8]);
    	    javagame.Storage_Info.Storage1[13][9] = Integer.parseInt(loaned14[9]);
    	    javagame.Storage_Info.Storage1[13][10] = loaned14[10];
    	String loan15 = in.next();
    	String[] loaned15 = loan15.split(";");
    	    javagame.Storage_Info.Storage1[14][0] = loaned15[0];
    	    javagame.Storage_Info.Storage1[14][1] = Integer.parseInt(loaned15[1]);
    	    javagame.Storage_Info.Storage1[14][2] = Integer.parseInt(loaned15[2]);
    	    javagame.Storage_Info.Storage1[14][3] = loaned15[3];
    	    javagame.Storage_Info.Storage1[14][4] = Integer.parseInt(loaned15[4]);
    	    javagame.Storage_Info.Storage1[14][5] = Integer.parseInt(loaned15[5]);
    	    javagame.Storage_Info.Storage1[14][6] = Integer.parseInt(loaned15[6]);
    	    javagame.Storage_Info.Storage1[14][7] = Integer.parseInt(loaned15[7]);
    	    javagame.Storage_Info.Storage1[14][8] = Integer.parseInt(loaned15[8]);
    	    javagame.Storage_Info.Storage1[14][9] = Integer.parseInt(loaned15[9]);
    	    javagame.Storage_Info.Storage1[14][10] = loaned15[10];
    	String loan16 = in.next();
    	String[] loaned16 = loan16.split(";");
    	    javagame.Storage_Info.Storage1[15][0] = loaned16[0];
    	    javagame.Storage_Info.Storage1[15][1] = Integer.parseInt(loaned16[1]);
    	    javagame.Storage_Info.Storage1[15][2] = Integer.parseInt(loaned16[2]);
    	    javagame.Storage_Info.Storage1[15][3] = loaned16[3];
    	    javagame.Storage_Info.Storage1[15][4] = Integer.parseInt(loaned16[4]);
    	    javagame.Storage_Info.Storage1[15][5] = Integer.parseInt(loaned16[5]);
    	    javagame.Storage_Info.Storage1[15][6] = Integer.parseInt(loaned16[6]);
    	    javagame.Storage_Info.Storage1[15][7] = Integer.parseInt(loaned16[7]);
    	    javagame.Storage_Info.Storage1[15][8] = Integer.parseInt(loaned16[8]);
    	    javagame.Storage_Info.Storage1[15][9] = Integer.parseInt(loaned16[9]);
    	    javagame.Storage_Info.Storage1[15][10] = loaned16[10];
    	String loan17 = in.next();
    	String[] loaned17 = loan17.split(";");
    	    javagame.Storage_Info.Storage1[16][0] = loaned17[0];
    	    javagame.Storage_Info.Storage1[16][1] = Integer.parseInt(loaned17[1]);
    	    javagame.Storage_Info.Storage1[16][2] = Integer.parseInt(loaned17[2]);
    	    javagame.Storage_Info.Storage1[16][3] = loaned17[3];
    	    javagame.Storage_Info.Storage1[16][4] = Integer.parseInt(loaned17[4]);
    	    javagame.Storage_Info.Storage1[16][5] = Integer.parseInt(loaned17[5]);
    	    javagame.Storage_Info.Storage1[16][6] = Integer.parseInt(loaned17[6]);
    	    javagame.Storage_Info.Storage1[16][7] = Integer.parseInt(loaned17[7]);
    	    javagame.Storage_Info.Storage1[16][8] = Integer.parseInt(loaned17[8]);
    	    javagame.Storage_Info.Storage1[16][9] = Integer.parseInt(loaned17[9]);
    	    javagame.Storage_Info.Storage1[16][10] = loaned17[10];
    	String loan18 = in.next();
    	String[] loaned18 = loan18.split(";");
    	    javagame.Storage_Info.Storage1[17][0] = loaned18[0];
    	    javagame.Storage_Info.Storage1[17][1] = Integer.parseInt(loaned18[1]);
    	    javagame.Storage_Info.Storage1[17][2] = Integer.parseInt(loaned18[2]);
    	    javagame.Storage_Info.Storage1[17][3] = loaned18[3];
    	    javagame.Storage_Info.Storage1[17][4] = Integer.parseInt(loaned18[4]);
    	    javagame.Storage_Info.Storage1[17][5] = Integer.parseInt(loaned18[5]);
    	    javagame.Storage_Info.Storage1[17][6] = Integer.parseInt(loaned18[6]);
    	    javagame.Storage_Info.Storage1[17][7] = Integer.parseInt(loaned18[7]);
    	    javagame.Storage_Info.Storage1[17][8] = Integer.parseInt(loaned18[8]);
    	    javagame.Storage_Info.Storage1[17][9] = Integer.parseInt(loaned18[9]);
    	    javagame.Storage_Info.Storage1[17][10] = loaned18[10];
    	in.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public int getID(){
		return 995;
	}
	
}
