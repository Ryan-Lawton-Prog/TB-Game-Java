package javagame;

import java.io.*;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Inventory extends BasicGameState{

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
	boolean pots_H = false;
	boolean equipment_H = false;
	boolean pots = false;
	boolean equipment = false;
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
	float equipping_time = 0;
	int Selected = 1;
	int Infonum;
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
	
	public Inventory(int state){
		
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
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString(mouse, 0, 0);
		if(pots == false && equipment == false){
    		g.drawString(mouse, 0, 0);
	    	g.drawString("Potions & Items", 230, 80);
		    g.drawString("Equipment", 260, 180);
    		g.drawString("Back", 280, 280);
	    	Button.draw(200,50);
		    Button.draw(200,150);
    		Button.draw(200,250);
	    	Sword.draw(300, 160);
		    Orb.draw(210, 180);
    		Helmet.draw(300, 205);
	    	Bow.draw(375, 180);
	    	G_Potion.draw(200,70);
	    	G_Regen.draw(290,50);
	    	G_Mana.draw(370,70);
	    	HRM.draw(290,95);
		    if(pots_H){
		        Button_Pressed.draw(200,50);
    		    if(pots_H == false){
	    	    	g.clear();
		        }
		    }
    		if(equipment_H){
	    	    Button_Pressed.draw(200,150);
		        if(equipment_H == false){
		        	g.clear();
		        }
		    }
		    if(back){
		        Button_Pressed.draw(200,250);
    		    if(back == false){
	    	    	g.clear();
		        }
		    }
		}
		
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
			Item.draw(10,30);
			if(javagame.Player.Weapons[0][10].equals("sword")){
				Sword.draw(13,33,2);
			}else if(javagame.Player.Weapons[0][10].equals("axe")){
				Axe.draw(13,33,2);
			}else if(javagame.Player.Weapons[0][10].equals("wand")){
				Wand.draw(13,33,2);
			}else if(javagame.Player.Weapons[0][10].equals("staff")){
				Staff.draw(13,33,2);
			}else if(javagame.Player.Weapons[0][10].equals("bow")){
				Bow.draw(13,33,2);
			}else if(javagame.Player.Weapons[0][10].equals("cross-bow")){
				Cross_Bow.draw(13,33,2);
			}
			Item.draw(50,30);
			if(javagame.Player.Weapons[1][10].equals("sword")){
				Sword.draw(53,33,2);
			}else if(javagame.Player.Weapons[1][10].equals("axe")){
				Axe.draw(53,33,2);
			}else if(javagame.Player.Weapons[1][10].equals("wand")){
				Wand.draw(53,33,2);
			}else if(javagame.Player.Weapons[1][10].equals("staff")){
				Staff.draw(53,33,2);
			}else if(javagame.Player.Weapons[1][10].equals("bow")){
				Bow.draw(53,33,2);
			}else if(javagame.Player.Weapons[1][10].equals("cross-bow")){
				Cross_Bow.draw(53,33,2);
			}
			Item.draw(90,30);
			if(javagame.Player.Weapons[2][10].equals("sword")){
				Sword.draw(93,33,2);
			}else if(javagame.Player.Weapons[2][10].equals("axe")){
				Axe.draw(93,33,2);
			}else if(javagame.Player.Weapons[2][10].equals("wand")){
				Wand.draw(93,33,2);
			}else if(javagame.Player.Weapons[2][10].equals("staff")){
				Staff.draw(93,33,2);
			}else if(javagame.Player.Weapons[2][10].equals("bow")){
				Bow.draw(93,33,2);
			}else if(javagame.Player.Weapons[2][10].equals("cross-bow")){
				Cross_Bow.draw(93,33,2);
			}
			Item.draw(130,30);
			if(javagame.Player.Weapons[3][10].equals("sword")){
				Sword.draw(133,33,2);
			}else if(javagame.Player.Weapons[3][10].equals("axe")){
				Axe.draw(133,33,2);
			}else if(javagame.Player.Weapons[3][10].equals("wand")){
				Wand.draw(133,33,2);
			}else if(javagame.Player.Weapons[3][10].equals("staff")){
				Staff.draw(133,33,2);
			}else if(javagame.Player.Weapons[3][10].equals("bow")){
				Bow.draw(133,33,2);
			}else if(javagame.Player.Weapons[3][10].equals("cross-bow")){
				Cross_Bow.draw(133,33,2);
			}
			Item.draw(170,30);
			if(javagame.Player.Weapons[4][10].equals("sword")){
				Sword.draw(173,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("axe")){
				Axe.draw(173,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("wand")){
				Wand.draw(173,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("staff")){
				Staff.draw(173,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("bow")){
				Bow.draw(173,33,2);
			}else if(javagame.Player.Weapons[4][10].equals("cross-bow")){
				Cross_Bow.draw(173,33,2);
			}
			Item.draw(10,70);
			if(javagame.Player.Weapons[5][10].equals("sword")){
				Sword.draw(13,73,2);
			}else if(javagame.Player.Weapons[5][10].equals("axe")){
				Axe.draw(13,73,2);
			}else if(javagame.Player.Weapons[5][10].equals("wand")){
				Wand.draw(13,73,2);
			}else if(javagame.Player.Weapons[5][10].equals("staff")){
				Staff.draw(13,73,2);
			}else if(javagame.Player.Weapons[5][10].equals("bow")){
				Bow.draw(13,73,2);
			}else if(javagame.Player.Weapons[5][10].equals("cross-bow")){
				Cross_Bow.draw(13,73,2);
			}
			Item.draw(50,70);
			if(javagame.Player.Weapons[6][10].equals("sword")){
				Sword.draw(53,73,2);
			}else if(javagame.Player.Weapons[6][10].equals("axe")){
				Axe.draw(53,73,2);
			}else if(javagame.Player.Weapons[6][10].equals("wand")){
				Wand.draw(53,73,2);
			}else if(javagame.Player.Weapons[6][10].equals("staff")){
				Staff.draw(53,73,2);
			}else if(javagame.Player.Weapons[6][10].equals("bow")){
				Bow.draw(53,73,2);
			}else if(javagame.Player.Weapons[6][10].equals("cross-bow")){
				Cross_Bow.draw(53,73,2);
			}
			Item.draw(90,70);
			if(javagame.Player.Weapons[7][10].equals("sword")){
				Sword.draw(93,73,2);
			}else if(javagame.Player.Weapons[7][10].equals("axe")){
				Axe.draw(93,73,2);
			}else if(javagame.Player.Weapons[7][10].equals("wand")){
				Wand.draw(93,73,2);
			}else if(javagame.Player.Weapons[7][10].equals("staff")){
				Staff.draw(93,73,2);
			}else if(javagame.Player.Weapons[7][10].equals("bow")){
				Bow.draw(93,73,2);
			}else if(javagame.Player.Weapons[7][10].equals("cross-bow")){
				Cross_Bow.draw(93,73,2);
			}
			Item.draw(130,70);
			if(javagame.Player.Weapons[8][10].equals("sword")){
				Sword.draw(133,73,2);
			}else if(javagame.Player.Weapons[8][10].equals("axe")){
				Axe.draw(133,73,2);
			}else if(javagame.Player.Weapons[8][10].equals("wand")){
				Wand.draw(133,73,2);
			}else if(javagame.Player.Weapons[8][10].equals("staff")){
				Staff.draw(133,73,2);
			}else if(javagame.Player.Weapons[8][10].equals("bow")){
				Bow.draw(133,73,2);
			}else if(javagame.Player.Weapons[8][10].equals("cross-bow")){
				Cross_Bow.draw(133,73,2);
			}
			Item.draw(170,70);
			if(javagame.Player.Weapons[9][10].equals("sword")){
				Sword.draw(173,73,2);
			}else if(javagame.Player.Weapons[9][10].equals("axe")){
				Axe.draw(173,73,2);
			}else if(javagame.Player.Weapons[9][10].equals("wand")){
				Wand.draw(173,73,2);
			}else if(javagame.Player.Weapons[9][10].equals("staff")){
				Staff.draw(173,73,2);
			}else if(javagame.Player.Weapons[9][10].equals("bow")){
				Bow.draw(173,73,2);
			}else if(javagame.Player.Weapons[9][10].equals("cross-bow")){
				Cross_Bow.draw(173,73,2);
			}
			Item.draw(10,110);
			if(javagame.Player.Weapons[10][10].equals("sword")){
				Sword.draw(13,113,2);
			}else if(javagame.Player.Weapons[10][10].equals("axe")){
				Axe.draw(13,113,2);
			}else if(javagame.Player.Weapons[10][10].equals("wand")){
				Wand.draw(13,113,2);
			}else if(javagame.Player.Weapons[10][10].equals("staff")){
				Staff.draw(13,113,2);
			}else if(javagame.Player.Weapons[10][10].equals("bow")){
				Bow.draw(13,113,2);
			}else if(javagame.Player.Weapons[10][10].equals("cross-bow")){
				Cross_Bow.draw(13,113,2);
			}
			Item.draw(50,110);
			if(javagame.Player.Weapons[11][10].equals("sword")){
				Sword.draw(53,113,2);
			}else if(javagame.Player.Weapons[11][10].equals("axe")){
				Axe.draw(53,113,2);
			}else if(javagame.Player.Weapons[11][10].equals("wand")){
				Wand.draw(53,113,2);
			}else if(javagame.Player.Weapons[11][10].equals("staff")){
				Staff.draw(53,113,2);
			}else if(javagame.Player.Weapons[11][10].equals("bow")){
				Bow.draw(53,113,2);
			}else if(javagame.Player.Weapons[11][10].equals("cross-bow")){
				Cross_Bow.draw(53,113,2);
			}
			Item.draw(90,110);
			if(javagame.Player.Weapons[12][10].equals("sword")){
				Sword.draw(93,113,2);
			}else if(javagame.Player.Weapons[12][10].equals("axe")){
				Axe.draw(93,113,2);
			}else if(javagame.Player.Weapons[12][10].equals("wand")){
				Wand.draw(93,113,2);
			}else if(javagame.Player.Weapons[12][10].equals("staff")){
				Staff.draw(93,113,2);
			}else if(javagame.Player.Weapons[12][10].equals("bow")){
				Bow.draw(93,113,2);
			}else if(javagame.Player.Weapons[12][10].equals("cross-bow")){
				Cross_Bow.draw(93,113,2);
			}
			Item.draw(130,110);
			if(javagame.Player.Weapons[13][10].equals("sword")){
				Sword.draw(133,113,2);
			}else if(javagame.Player.Weapons[13][10].equals("axe")){
				Axe.draw(133,113,2);
			}else if(javagame.Player.Weapons[13][10].equals("wand")){
				Wand.draw(133,113,2);
			}else if(javagame.Player.Weapons[13][10].equals("staff")){
				Staff.draw(133,113,2);
			}else if(javagame.Player.Weapons[13][10].equals("bow")){
				Bow.draw(133,113,2);
			}else if(javagame.Player.Weapons[13][10].equals("cross-bow")){
				Cross_Bow.draw(133,113,2);
			}
			Item.draw(170,110);
			if(javagame.Player.Weapons[14][10].equals("sword")){
				Sword.draw(173,113,2);
			}else if(javagame.Player.Weapons[14][10].equals("axe")){
				Axe.draw(173,113,2);
			}else if(javagame.Player.Weapons[14][10].equals("wand")){
				Wand.draw(173,113,2);
			}else if(javagame.Player.Weapons[14][10].equals("staff")){
				Staff.draw(173,113,2);
			}else if(javagame.Player.Weapons[14][10].equals("bow")){
				Bow.draw(173,113,2);
			}else if(javagame.Player.Weapons[14][10].equals("cross-bow")){
				Cross_Bow.draw(173,113,2);
			}
			Item.draw(10,150);
			if(javagame.Player.Weapons[15][10].equals("sword")){
				Sword.draw(13,153,2);
			}else if(javagame.Player.Weapons[15][10].equals("axe")){
				Axe.draw(13,153,2);
			}else if(javagame.Player.Weapons[15][10].equals("wand")){
				Wand.draw(13,153,2);
			}else if(javagame.Player.Weapons[15][10].equals("staff")){
				Staff.draw(13,153,2);
			}else if(javagame.Player.Weapons[15][10].equals("bow")){
				Bow.draw(13,153,2);
			}else if(javagame.Player.Weapons[15][10].equals("cross-bow")){
				Cross_Bow.draw(13,153,2);
			}
			Item.draw(50,150);
			if(javagame.Player.Weapons[16][10].equals("sword")){
				Sword.draw(53,153,2);
			}else if(javagame.Player.Weapons[16][10].equals("axe")){
				Axe.draw(53,153,2);
			}else if(javagame.Player.Weapons[16][10].equals("wand")){
				Wand.draw(53,153,2);
			}else if(javagame.Player.Weapons[16][10].equals("staff")){
				Staff.draw(53,153,2);
			}else if(javagame.Player.Weapons[16][10].equals("bow")){
				Bow.draw(53,153,2);
			}else if(javagame.Player.Weapons[16][10].equals("cross-bow")){
				Cross_Bow.draw(53,153,2);
			}
			Item.draw(90,150);
			if(javagame.Player.Weapons[17][10].equals("sword")){
				Sword.draw(93,153,2);
			}else if(javagame.Player.Weapons[17][10].equals("axe")){
				Axe.draw(93,153,2);
			}else if(javagame.Player.Weapons[17][10].equals("wand")){
				Wand.draw(93,153,2);
			}else if(javagame.Player.Weapons[17][10].equals("staff")){
				Staff.draw(93,153,2);
			}else if(javagame.Player.Weapons[17][10].equals("bow")){
				Bow.draw(93,153,2);
			}else if(javagame.Player.Weapons[17][10].equals("cross-bow")){
				Cross_Bow.draw(93,153,2);
			}
			Item.draw(130,150);
			if(javagame.Player.Weapons[18][10].equals("sword")){
				Sword.draw(133,153,2);
			}else if(javagame.Player.Weapons[18][10].equals("axe")){
				Axe.draw(133,153,2);
			}else if(javagame.Player.Weapons[18][10].equals("wand")){
				Wand.draw(133,153,2);
			}else if(javagame.Player.Weapons[18][10].equals("staff")){
				Staff.draw(133,153,2);
			}else if(javagame.Player.Weapons[18][10].equals("bow")){
				Bow.draw(133,153,2);
			}else if(javagame.Player.Weapons[18][10].equals("cross-bow")){
				Cross_Bow.draw(133,153,2);
			}
			Item.draw(170,150);
			if(javagame.Player.Weapons[19][10].equals("sword")){
				Sword.draw(173,153,2);
			}else if(javagame.Player.Weapons[19][10].equals("axe")){
				Axe.draw(173,153,2);
			}else if(javagame.Player.Weapons[19][10].equals("wand")){
				Wand.draw(173,153,2);
			}else if(javagame.Player.Weapons[19][10].equals("staff")){
				Staff.draw(173,153,2);
			}else if(javagame.Player.Weapons[19][10].equals("bow")){
				Bow.draw(173,153,2);
			}else if(javagame.Player.Weapons[19][10].equals("cross-bow")){
				Cross_Bow.draw(173,153,2);
			}
			Item.draw(10,190);
			if(javagame.Player.Weapons[20][10].equals("sword")){
				Sword.draw(13,193,2);
			}else if(javagame.Player.Weapons[20][10].equals("axe")){
				Axe.draw(13,193,2);
			}else if(javagame.Player.Weapons[20][10].equals("wand")){
				Wand.draw(13,193,2);
			}else if(javagame.Player.Weapons[20][10].equals("staff")){
				Staff.draw(13,193,2);
			}else if(javagame.Player.Weapons[20][10].equals("bow")){
				Bow.draw(13,193,2);
			}else if(javagame.Player.Weapons[20][10].equals("cross-bow")){
				Cross_Bow.draw(13,193,2);
			}
			Item.draw(50,190);
			if(javagame.Player.Weapons[21][10].equals("sword")){
				Sword.draw(53,193,2);
			}else if(javagame.Player.Weapons[21][10].equals("axe")){
				Axe.draw(53,193,2);
			}else if(javagame.Player.Weapons[21][10].equals("wand")){
				Wand.draw(53,193,2);
			}else if(javagame.Player.Weapons[21][10].equals("staff")){
				Staff.draw(53,193,2);
			}else if(javagame.Player.Weapons[21][10].equals("bow")){
				Bow.draw(53,193,2);
			}else if(javagame.Player.Weapons[21][10].equals("cross-bow")){
				Cross_Bow.draw(53,193,2);
			}
			Item.draw(90,190);
			if(javagame.Player.Weapons[22][10].equals("sword")){
				Sword.draw(93,193,2);
			}else if(javagame.Player.Weapons[22][10].equals("axe")){
				Axe.draw(93,193,2);
			}else if(javagame.Player.Weapons[22][10].equals("wand")){
				Wand.draw(93,193,2);
			}else if(javagame.Player.Weapons[22][10].equals("staff")){
				Staff.draw(93,193,2);
			}else if(javagame.Player.Weapons[22][10].equals("bow")){
				Bow.draw(93,193,2);
			}else if(javagame.Player.Weapons[22][10].equals("cross-bow")){
				Cross_Bow.draw(93,193,2);
			}
			Item.draw(130,190);
			if(javagame.Player.Weapons[23][10].equals("sword")){
				Sword.draw(133,193,2);
			}else if(javagame.Player.Weapons[23][10].equals("axe")){
				Axe.draw(133,193,2);
			}else if(javagame.Player.Weapons[23][10].equals("wand")){
				Wand.draw(133,193,2);
			}else if(javagame.Player.Weapons[23][10].equals("staff")){
				Staff.draw(133,193,2);
			}else if(javagame.Player.Weapons[23][10].equals("bow")){
				Bow.draw(133,193,2);
			}else if(javagame.Player.Weapons[23][10].equals("cross-bow")){
				Cross_Bow.draw(133,193,2);
			}
			Item.draw(170,190);
			if(javagame.Player.Weapons[24][10].equals("sword")){
				Sword.draw(173,193,2);
			}else if(javagame.Player.Weapons[24][10].equals("axe")){
				Axe.draw(173,193,2);
			}else if(javagame.Player.Weapons[24][10].equals("wand")){
				Wand.draw(173,193,2);
			}else if(javagame.Player.Weapons[24][10].equals("staff")){
				Staff.draw(173,193,2);
			}else if(javagame.Player.Weapons[24][10].equals("bow")){
				Bow.draw(173,193,2);
			}else if(javagame.Player.Weapons[24][10].equals("cross-bow")){
				Cross_Bow.draw(173,193,2);
			}
			//Equiped
			Item.draw(230,110);
			if(javagame.Player.equipped_weapon[10].equals("sword")){
				Sword.draw(233,113,2);
			}else if(javagame.Player.equipped_weapon[10].equals("axe")){
				Axe.draw(233,113,2);
			}else if(javagame.Player.equipped_weapon[10].equals("wand")){
				Wand.draw(233,113,2);
			}else if(javagame.Player.equipped_weapon[10].equals("staff")){
				Staff.draw(233,113,2);
			}else if(javagame.Player.equipped_weapon[10].equals("bow")){
				Bow.draw(233,113,2);
			}else if(javagame.Player.equipped_weapon[10].equals("cross-bow")){
				Cross_Bow.draw(233,113,2);
			}
			if(Selected == 1){
				Item_Select.draw(10,30);
			}
			if(Selected == 2){
				Item_Select.draw(50,30);
			}
			if(Selected == 3){
				Item_Select.draw(90,30);
			}
			if(Selected == 4){
				Item_Select.draw(130,30);
			}
			if(Selected == 5){
				Item_Select.draw(170,30);
			}
			if(Selected == 6){
				Item_Select.draw(10,70);
			}
			if(Selected == 7){
				Item_Select.draw(50,70);
			}
			if(Selected == 8){
				Item_Select.draw(90,70);
			}
			if(Selected == 9){
				Item_Select.draw(130,70);
			}
			if(Selected == 10){
				Item_Select.draw(170,70);
			}
			if(Selected == 11){
				Item_Select.draw(10,110);
			}
			if(Selected == 12){
				Item_Select.draw(50,110);
			}
			if(Selected == 13){
				Item_Select.draw(90,110);
			}
			if(Selected == 14){
				Item_Select.draw(130,110);
			}
			if(Selected == 15){
				Item_Select.draw(170,110);
			}
			if(Selected == 16){
				Item_Select.draw(10,150);
			}
			if(Selected == 17){
				Item_Select.draw(50,150);
			}
			if(Selected == 18){
				Item_Select.draw(90,150);
			}
			if(Selected == 19){
				Item_Select.draw(130,150);
			}
			if(Selected == 20){
				Item_Select.draw(170,150);
			}
			if(Selected == 21){
				Item_Select.draw(10,190);
			}
			if(Selected == 22){
				Item_Select.draw(50,190);
			}
			if(Selected == 23){
				Item_Select.draw(90,190);
			}
			if(Selected == 24){
				Item_Select.draw(130,190);
			}
			if(Selected == 25){
				Item_Select.draw(170,190);
			}
			//Equiped Weapon
	    	if(equipped){
	    		if((javagame.Player.equipped_weapon[2].equals(-1)) == false){
	    		    Item_Select.draw(230,110);
	    		    g.drawString((String)(javagame.Player.equipped_weapon[0]), 305, 5);
                	g.drawString("Value: " + (Integer)(javagame.Player.equipped_weapon[2]), 310, 30);
                	g.drawString("Damage: " + (Integer)(javagame.Player.equipped_weapon[1]), 310, 50);
            	    g.drawString("Str: " + (Integer)(javagame.Player.equipped_weapon[4]), 310, 70);
                	g.drawString("Dex: " + (Integer)(javagame.Player.equipped_weapon[5]), 310, 90);
            	    g.drawString("Int: " + (Integer)(javagame.Player.equipped_weapon[6]), 310, 110);
                	g.drawString("Vit: " + (Integer)(javagame.Player.equipped_weapon[7]), 310, 130);
            	    g.drawString("Drop Rate: " + (Integer)(javagame.Player.equipped_weapon[8]), 310, 150);
            	    g.drawString("Class: " + (String)(javagame.Player.equipped_weapon[3]), 310, 170);
            	    g.drawString("Level Requirement: " + (Integer)(javagame.Player.equipped_weapon[11]), 310, 190);
	    		}else{
	    			Item_Select.draw(230,110);
	    			g.drawString("EMPTY", 450, 120);
	    		}
	    	}
			if(selected && equipped == false){
				if(javagame.Player.Weapons[Selected-1][10].equals("null")){
					g.drawString("EMPTY", 450, 120);
				}else try{
    			g.drawString((String)(javagame.Player.Weapons[Selected-1][0]), 305, 5);
            	g.drawString("Value: " + (Integer)(javagame.Player.Weapons[Selected-1][2]), 310, 30);
            	g.drawString("Damage: " + (Integer)(javagame.Player.Weapons[Selected-1][1]), 310, 50);
        	    g.drawString("Str: " + (Integer)(javagame.Player.Weapons[Selected-1][4]), 310, 70);
            	g.drawString("Dex: " + (Integer)(javagame.Player.Weapons[Selected-1][5]), 310, 90);
            	g.drawString("Int: " + (Integer)(javagame.Player.Weapons[Selected-1][6]), 310, 110);
            	g.drawString("Vit: " + (Integer)(javagame.Player.Weapons[Selected-1][7]), 310, 130);
        	    g.drawString("Drop Rate: " + (Integer)(javagame.Player.Weapons[Selected-1][8]), 310, 150);
        	    g.drawString("Class: " + (String)(javagame.Player.Weapons[Selected-1][3]), 310, 170);
        	    g.drawString("Level Requirement: " + (Integer)(javagame.Player.Weapons[Selected-1][11]), 310, 190);
				}catch(Exception e){
					g.drawString("EMPTY", 450, 120);
				}
			}
		}
		
		//Pots
	    if(pots){
	    	//Symbols
	    	g.drawString("Health: " + javagame.Player.hp + "/" + javagame.Player.max_hp, 440, 5);
	    	g.drawString("Mana: " + javagame.Player.manap + "/" + javagame.Player.max_manap, 440, 20);
	    	g.drawString("Regeneration Turns: " + javagame.Player.regen_points, 440, 35);
            if(javagame.Player.potion_rounds > 1){
	    		g.drawString("Postions Unusable For: \n" + javagame.Player.potion_rounds + " Turns", 440, 50);
	    	}
	    	Button.draw(220,0);
	    	Button.draw(5,90);
	    	Button.draw(5,180);
	    	Button.draw(5,270);
	    	Button.draw(220,90);
	    	Button.draw(220,180);
	    	Button.draw(220,270);
	    	Button.draw(435,90);
	    	Button.draw(435,180);
	    	Button.draw(435,270);
	    	g.drawString(javagame.Player.lesser_potions + "/20",35,123);
	        g.drawString(javagame.Player.potions + "/20",35,213);
	        g.drawString(javagame.Player.greater_potions + "/20",35,303);
	        g.drawString(javagame.Player.lesser_mana + "/20",250,123);
	        g.drawString(javagame.Player.mana + "/20",250,213);
	        g.drawString(javagame.Player.greater_mana + "/20",250,303);
	        g.drawString(javagame.Player.lesser_regen + "/20",465,123);
	        g.drawString(javagame.Player.regen + "/20",465,213);
	        g.drawString(javagame.Player.greater_regen + "/20",465,303);
	    	L_Potion.draw(10,115);
	        Potion.draw(10,205);
	        G_Potion.draw(10,295);
	        L_Mana.draw(225,115);
	        Mana.draw(225,205);
	        G_Mana.draw(225,295);
	        L_Regen.draw(440,115);
	        Regen.draw(440,205);
	        G_Regen.draw(440,295);
	        g.drawString("Lesser Potion",15,100);
	        g.drawString("Potion",15,190);
	        g.drawString("Greater Potion",15,280);
	        g.drawString("Lesser Mana",230,100);
	        g.drawString("Mana",230,190);
	        g.drawString("Greater Mana",230,280);
	        g.drawString("Lesser Regeneration",445,100);
	        g.drawString("Regeneration",445,190);
	        g.drawString("Greater Regeneration",445,280);
	    	//Back
	    	g.drawString("Back",300,30);
	    	if(back){
		        Button_Pressed.draw(220,0);
    		    if(back == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Lesser potion
	    	if(BL_Potion){
		        Button_Pressed.draw(5,90);
    		    if(BL_Potion == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Potion
	    	if(BPotion){
		        Button_Pressed.draw(5,180);
    		    if(BPotion == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Greater Potion
	    	if(BG_Potion){
		        Button_Pressed.draw(5,270);
    		    if(BG_Potion == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Lesser Mana Potion
	    	if(BL_Mana){
		        Button_Pressed.draw(220,90);
    		    if(BL_Mana == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Mana Potion
	    	if(BMana){
		        Button_Pressed.draw(220,180);
    		    if(BMana == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Greater mana Potion
	    	if(BG_Mana){
		        Button_Pressed.draw(220,270);
    		    if(BG_Mana == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Lesser Regen Potion
	    	if(BL_Regen){
		        Button_Pressed.draw(435,90);
    		    if(BL_Regen == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Regen Potion
	    	if(BRegen){
		        Button_Pressed.draw(435,180);
    		    if(BRegen == false){
	    	    	g.clear();
		        }
		    }
	    	
	    	//Greater Regen Potion
	    	if(BG_Regen){
		        Button_Pressed.draw(435,270);
    		    if(BG_Regen == false){
	    	    	g.clear();
		        }
		    }
	    }
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		tic -= delta * .1f;
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		//Inventory
		if(pots == false && equipment == false){
    		//Pots Button
	    	if((posX>200 && posX<400) && (posY>230 && posY<310)){
		    	pots_H = true;
			    if(Mouse.isButtonDown(0) && tic <= 0){
			    	tic = 50;
				    pots = true;
    			}
	    	}else{
		    	pots_H = false;
    		}
		
	    	//Equipment Button
		    if((posX>200 && posX<400) && (posY>130 && posY<210)){
			    equipment_H = true;
    			if(Mouse.isButtonDown(0) && tic <= 0){
    				tic = 50;
	    			equipment = true;
		    	}
    		}else{
	    		equipment_H = false;
		    }
    		//Back Button
	    	if((posX>200 && posX<400) && (posY>30 && posY<110)){
		    	back = true;
			    if(Mouse.isButtonDown(0) && tic < 0){
			    	if(javagame.Player.in_battle == true){
			    		sbg.enterState(999);
			    	}else{
				        sbg.enterState(javagame.Player.room);
			    	}
    			}
	    	}else{
		    	back = false;
    		}
	    }
		
		//Equipment
		if(equipment){
			//Back Button
	    	if((posX>440 && posX<640) && (posY>0 && posY<80)){
		    	back = true;
			    if(Mouse.isButtonDown(0) && tic <= 0){
					tic = 50;
					equipment = false;
	    		}
	    	}else{
		    	back = false;
    		}
	    	
	    	equipping_time -= delta * .1f;
	    	
	    	//Equip1
	    	if(posX>10 && posX<45 && posY<325 && posY>290){
	    		Selected = 1;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(0);
	    		}
	    	}
	    	//Equip2
	    	if(posX>50 && posX<85 && posY<325 && posY>290){
	    		Selected = 2;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(1);
	    		}
	    	}
	    	//Equip3
	    	if(posX>90 && posX<125 && posY<325 && posY>290){
	    		Selected = 3;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(2);
	    		}
	    	}
	    	//Equip4
	    	if(posX>130 && posX<165 && posY<325 && posY>290){
	    		Selected = 4;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(3);
	    		}
	    	}
	    	//Equip5
	    	if(posX>170 && posX<205 && posY<325 && posY>290){
	    		Selected = 5;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(4);
	    		}
	    	}
	    	//Equip6
	    	if(posX>10 && posX<45 && posY<285 && posY>250){
	    		Selected = 6;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(5);
	    		}
	    	}
	    	//Equip7
	    	if(posX>50 && posX<85 && posY<285 && posY>250){
	    		Selected = 7;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(6);
	    		}
	    	}
	    	//Equip8
	    	if(posX>90 && posX<125 && posY<285 && posY>250){
	    		Selected = 8;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(7);
	    		}
	    	}
	    	//Equip9
	    	if(posX>130 && posX<165 && posY<285 && posY>250){
	    		Selected = 9;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(8);
	    		}
	    	}
	    	//Equip10
	    	if(posX>170 && posX<205 && posY<285 && posY>250){
	    		Selected = 10;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(9);
	    		}
	    	}
	    	//Equip11
	    	if(posX>10 && posX<45 && posY<245 && posY>210){
	    		Selected = 11;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(10);
	    		}
	    	}
	    	//Equip12
	    	if(posX>50 && posX<85 && posY<245 && posY>210){
	    		Selected = 12;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(11);
	    		}
	    	}
	    	//Equip13
	    	if(posX>90 && posX<125 && posY<245 && posY>210){
	    		Selected = 13;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(12);
	    		}
	    	}
	    	//Equip14
	    	if(posX>130 && posX<165 && posY<245 && posY>210){
	    		Selected = 14;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(13);
	    		}
	    	}
	    	//Equip15
	    	if(posX>170 && posX<205 && posY<245 && posY>210){
	    		Selected = 15;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(14);
	    		}
	    	}
	    	//Equip16
	    	if(posX>10 && posX<45 && posY<205 && posY>170){
	    		Selected = 16;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(15);
	    		}
	    	}
	    	//Equip17
	    	if(posX>50 && posX<85 && posY<205 && posY>170){
	    		Selected = 17;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(16);
	    		}
	    	}
	    	//Equip18
	    	if(posX>90 && posX<125 && posY<205 && posY>170){
	    		Selected = 18;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(17);
	    		}
	    	}
	    	//Equip19
	    	if(posX>130 && posX<165 && posY<205 && posY>170){
	    		Selected = 19;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(18);
	    		}
	    	}
	    	//Equip20
	    	if(posX>170 && posX<205 && posY<205 && posY>170){
	    		Selected = 20;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(19);
	    		}
	    	}
	    	//Equip21
	    	if(posX>10 && posX<45 && posY<165 && posY>130){
	    		Selected = 21;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(20);
	    		}
	    	}
	    	//Equip22
	    	if(posX>50 && posX<85 && posY<165 && posY>130){
	    		Selected = 22;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(21);
	    		}
	    	}
	    	//Equip23
	    	if(posX>90 && posX<125 && posY<165 && posY>130){
	    		Selected = 23;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(22);
	    		}
	    	}
	    	//Equip24
	    	if(posX>130 && posX<165 && posY<165 && posY>130){
	    		Selected = 24;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(23);
	    		}
	    	}
	    	//Equip25
	    	if(posX>170 && posX<205 && posY<165 && posY>130){
	    		Selected = 25;
	    		selected = true;
	    		if(Mouse.isButtonDown(0) && equipping_time < 0){
	    			equipping_time = 40;
	    			equipping(24);
	    		}
	    	}
	    	//Equiped Weapon
	    	if(posX>230 && posX<265 && posY<245 && posY>210){
	    		Selected = 26;
	    		equipped = true;
	    		selected = false;
	    	}else{
	    		equipped = false;
	    	}
		}
		
		//Pots
		if(pots){
			//Back Button
			if((posX>220 && posX<420) && (posY>280 && posY<360)){
				back = true;
				if(Mouse.isButtonDown(0) && tic <= 0){
					tic = 50;
					pots = false;
    			}
			}else{
				back = false;
			}
			//Lesser Potion
			if((posX>5 && posX<205) && (posY>190 && posY<270)){
				BL_Potion = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.lesser_potions > 0){
						if(javagame.Player.hp < javagame.Player.max_hp){
							javagame.Player.lesser_potions -= 1;
							javagame.Player.hp += 100;
							if(javagame.Player.hp > javagame.Player.max_hp){
								javagame.Player.hp = javagame.Player.max_hp;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BL_Potion = false;
			}
			//Potion
			if((posX>5 && posX<205) && (posY>100 && posY<180)){
				BPotion = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.potions > 0){
						if(javagame.Player.hp < javagame.Player.max_hp){
							javagame.Player.potions -= 1;
							javagame.Player.hp += 200;
							if(javagame.Player.hp > javagame.Player.max_hp){
								javagame.Player.hp = javagame.Player.max_hp;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BPotion = false;
			}
			//Greater Potion
			if((posX>5 && posX<205) && (posY>10 && posY<90)){
				BG_Potion = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.greater_potions > 0){
						if(javagame.Player.hp < javagame.Player.max_hp){
							javagame.Player.greater_potions -= 1;
							javagame.Player.hp += 300;
							if(javagame.Player.hp > javagame.Player.max_hp){
								javagame.Player.hp = javagame.Player.max_hp;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BG_Potion = false;
			}
			//Lesser Mana
			if((posX>220 && posX<420) && (posY>190 && posY<270)){
				BL_Mana = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.lesser_mana > 0){
						if(javagame.Player.manap < javagame.Player.max_manap){
							javagame.Player.lesser_mana -= 1;
							javagame.Player.manap += 100;
							if(javagame.Player.manap > javagame.Player.max_manap){
								javagame.Player.manap = javagame.Player.max_manap;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BL_Mana = false;
			}
			//Mana
			if((posX>220 && posX<420) && (posY>100 && posY<180)){
				BMana = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.mana > 0){
						if(javagame.Player.manap < javagame.Player.max_manap){
							javagame.Player.mana -= 1;
							javagame.Player.manap += 200;
							if(javagame.Player.manap > javagame.Player.max_manap){
								javagame.Player.manap = javagame.Player.max_manap;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BMana = false;
			}
			//Greater mana
			if((posX>220 && posX<420) && (posY>10 && posY<90)){
				BG_Mana = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.greater_mana > 0){
						if(javagame.Player.manap < javagame.Player.max_manap){
							javagame.Player.greater_mana -= 1;
							javagame.Player.manap += 300;
							if(javagame.Player.manap > javagame.Player.max_manap){
								javagame.Player.manap = javagame.Player.max_manap;
							}
                            if(javagame.Player.in_battle){
								javagame.Player.potion_rounds = 7;
								javagame.Player.potion_used = true;
								sbg.enterState(999);
							}
						}
					}
    			}
			}else{
				BG_Mana = false;
			}
			//Lesser Regen
			if((posX>435 && posX<635) && (posY>190 && posY<270)){
				BL_Regen = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.lesser_regen > 0){
						javagame.Player.lesser_regen -= 1;
						javagame.Player.regen_points += 2;
					}
                    if(javagame.Player.in_battle){
						javagame.Player.potion_rounds = 7;
						javagame.Player.potion_used = true;
						sbg.enterState(999);
					}
    			}
			}else{
				BL_Regen = false;
			}
			//Regen
			if((posX>435 && posX<635) && (posY>100 && posY<180)){
				BRegen = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.regen > 0){
						javagame.Player.regen -= 1;
						javagame.Player.regen_points += 4;
					}
                    if(javagame.Player.in_battle){
						javagame.Player.potion_rounds = 7;
						javagame.Player.potion_used = true;
						sbg.enterState(999);
					}
    			}
			}else{
				BRegen = false;
			}
			//Greater Regen
			if((posX>435 && posX<635) && (posY>10 && posY<90)){
				BG_Regen = true;
				if(Mouse.isButtonDown(0) && tic <= 0 && javagame.Player.potion_rounds < 1){
					tic = 20;
					if(javagame.Player.greater_regen > 0){
						javagame.Player.greater_regen -= 1;
						javagame.Player.regen_points += 6;
					}
                    if(javagame.Player.in_battle){
						javagame.Player.potion_rounds = 7;
						javagame.Player.potion_used = true;
						sbg.enterState(999);
					}
    			}
			}else{
				BG_Regen = false;
			}
		}
	}
	
	public void equipping(int number){
		if(javagame.Player.clas.equals(javagame.Player.Weapons[number][3]) || javagame.Player.Weapons[number][3].equals("null")){
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
			javagame.Player.Weapons[number][0] = javagame.Player.equipped_weapon[0];
			javagame.Player.Weapons[number][1] = javagame.Player.equipped_weapon[1];
			javagame.Player.Weapons[number][2] = javagame.Player.equipped_weapon[2];
			javagame.Player.Weapons[number][3] = javagame.Player.equipped_weapon[3];
			javagame.Player.Weapons[number][4] = javagame.Player.equipped_weapon[4];
			javagame.Player.Weapons[number][5] = javagame.Player.equipped_weapon[5];
			javagame.Player.Weapons[number][6] = javagame.Player.equipped_weapon[6];
			javagame.Player.Weapons[number][7] = javagame.Player.equipped_weapon[7];
			javagame.Player.Weapons[number][8] = javagame.Player.equipped_weapon[8];
			javagame.Player.Weapons[number][9] = javagame.Player.equipped_weapon[9];
			javagame.Player.Weapons[number][10] = javagame.Player.equipped_weapon[10];
			javagame.Player.equipped_weapon[0] = wep_0;
			javagame.Player.equipped_weapon[1] = wep_1;
			javagame.Player.equipped_weapon[2] = wep_2;
			javagame.Player.equipped_weapon[3] = wep_3;
			javagame.Player.equipped_weapon[4] = wep_4;
			javagame.Player.equipped_weapon[5] = wep_5;
			javagame.Player.equipped_weapon[6] = wep_6;
			javagame.Player.equipped_weapon[7] = wep_7;
			javagame.Player.equipped_weapon[8] = wep_8;
			javagame.Player.equipped_weapon[9] = wep_9;
			javagame.Player.equipped_weapon[10] = wep_10;
			javagame.Player.max_hp += ((Integer) javagame.Player.equipped_weapon[7]) * 2;
			equipping = false;
		}
	}
	
	public int getID(){
		return 997;
	}
	
}
