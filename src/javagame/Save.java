package javagame;

import java.io.*;
import java.util.Scanner;

public class Save {
	
	public static void delete1() throws FileNotFoundException{
		File save1 = new File("save1.Gateway");
		save1.delete();
	}
	
	public static void delete2() throws FileNotFoundException{
		File save2 = new File("save2.Gateway");
		save2.delete();
	}
	
	public static void delete3() throws FileNotFoundException{
		File save3 = new File("save3.Gateway");
		save3.delete();
	}
	
	public static void test1() throws FileNotFoundException{
		Scanner in = new Scanner(new File("save1.Gateway"));
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		//Stats
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.money1 = Integer.parseInt(in.next());
		in.next();
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.lvl1 = Integer.parseInt(in.next());
		in.next();
		in.next();
		javagame.Save_Menu.clas1 = in.next();
		in.next();
		javagame.Save_Menu.name1 = in.next();
		in.close();
	}
	
	public static void test2() throws FileNotFoundException{
		Scanner in = new Scanner(new File("save2.Gateway"));
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		//Stats
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.money2 = Integer.parseInt(in.next());
		in.next();
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.lvl2 = Integer.parseInt(in.next());
		in.next();
		in.next();
		javagame.Save_Menu.clas2 = in.next();
		in.next();
		javagame.Save_Menu.name2 = in.next();
		in.close();
	}
	
	public static void test3() throws FileNotFoundException{
		Scanner in = new Scanner(new File("save3.Gateway"));
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		in.next();
		//Stats
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.money3 = Integer.parseInt(in.next());
		in.next();
		in.next();
		in.next();
		in.next();
		javagame.Save_Menu.lvl3 = Integer.parseInt(in.next());
		in.next();
		in.next();
		javagame.Save_Menu.clas3 = in.next();
		in.next();
		javagame.Save_Menu.name3 = in.next();
		in.close();
	}
	
	public static void Save1(){
		try{
	    	PrintStream out = new PrintStream(new File("save1.Gateway"));
	    	//Inventory
	    	out.println(javagame.Player.Weapons[0][0]+";"+
	    			javagame.Player.Weapons[0][1]+";"+
	    			javagame.Player.Weapons[0][2]+";"+
	    			javagame.Player.Weapons[0][3]+";"+
	    			javagame.Player.Weapons[0][4]+";"+
	    			javagame.Player.Weapons[0][5]+";"+
	    			javagame.Player.Weapons[0][6]+";"+
	    			javagame.Player.Weapons[0][7]+";"+
	    			javagame.Player.Weapons[0][8]+";"+
	    			javagame.Player.Weapons[0][9]+";"+
	    			javagame.Player.Weapons[0][10]);
	    	out.println(javagame.Player.Weapons[1][0]+";"+
	    			javagame.Player.Weapons[1][1]+";"+
	    			javagame.Player.Weapons[1][2]+";"+
	    			javagame.Player.Weapons[1][3]+";"+
	    			javagame.Player.Weapons[1][4]+";"+
	    			javagame.Player.Weapons[1][5]+";"+
	    			javagame.Player.Weapons[1][6]+";"+
	    			javagame.Player.Weapons[1][7]+";"+
	    			javagame.Player.Weapons[1][8]+";"+
	    			javagame.Player.Weapons[1][9]+";"+
	    			javagame.Player.Weapons[1][10]);
	    	out.println(javagame.Player.Weapons[2][0]+";"+
	    			javagame.Player.Weapons[2][1]+";"+
	    			javagame.Player.Weapons[2][2]+";"+
	    			javagame.Player.Weapons[2][3]+";"+
	    			javagame.Player.Weapons[2][4]+";"+
	    			javagame.Player.Weapons[2][5]+";"+
	    			javagame.Player.Weapons[2][6]+";"+
	    			javagame.Player.Weapons[2][7]+";"+
	    			javagame.Player.Weapons[2][8]+";"+
	    			javagame.Player.Weapons[2][9]+";"+
	    			javagame.Player.Weapons[2][10]);
	    	out.println(javagame.Player.Weapons[3][0]+";"+
	    			javagame.Player.Weapons[3][1]+";"+
	    			javagame.Player.Weapons[3][2]+";"+
	    			javagame.Player.Weapons[3][3]+";"+
	    			javagame.Player.Weapons[3][4]+";"+
	    			javagame.Player.Weapons[3][5]+";"+
	    			javagame.Player.Weapons[3][6]+";"+
	    			javagame.Player.Weapons[3][7]+";"+
	    			javagame.Player.Weapons[3][8]+";"+
	    			javagame.Player.Weapons[3][9]+";"+
	    			javagame.Player.Weapons[3][10]);
	    	out.println(javagame.Player.Weapons[4][0]+";"+
	    			javagame.Player.Weapons[4][1]+";"+
	    			javagame.Player.Weapons[4][2]+";"+
	    			javagame.Player.Weapons[4][3]+";"+
	    			javagame.Player.Weapons[4][4]+";"+
	    			javagame.Player.Weapons[4][5]+";"+
	    			javagame.Player.Weapons[4][6]+";"+
	    			javagame.Player.Weapons[4][7]+";"+
	    			javagame.Player.Weapons[4][8]+";"+
	    			javagame.Player.Weapons[4][9]+";"+
	    			javagame.Player.Weapons[4][10]);
	    	out.println(javagame.Player.Weapons[5][0]+";"+
	    			javagame.Player.Weapons[5][1]+";"+
	    			javagame.Player.Weapons[5][2]+";"+
	    			javagame.Player.Weapons[5][3]+";"+
	    			javagame.Player.Weapons[5][4]+";"+
	    			javagame.Player.Weapons[5][5]+";"+
	    			javagame.Player.Weapons[5][6]+";"+
	    			javagame.Player.Weapons[5][7]+";"+
	    			javagame.Player.Weapons[5][8]+";"+
	    			javagame.Player.Weapons[5][9]+";"+
	    			javagame.Player.Weapons[5][10]);
	    	out.println(javagame.Player.Weapons[6][0]+";"+
	    			javagame.Player.Weapons[6][1]+";"+
	    			javagame.Player.Weapons[6][2]+";"+
	    			javagame.Player.Weapons[6][3]+";"+
	    			javagame.Player.Weapons[6][4]+";"+
	    			javagame.Player.Weapons[6][5]+";"+
	    			javagame.Player.Weapons[6][6]+";"+
	    			javagame.Player.Weapons[6][7]+";"+
	    			javagame.Player.Weapons[6][8]+";"+
	    			javagame.Player.Weapons[6][9]+";"+
	    			javagame.Player.Weapons[6][10]);
	    	out.println(javagame.Player.Weapons[7][0]+";"+
	    			javagame.Player.Weapons[7][1]+";"+
	    			javagame.Player.Weapons[7][2]+";"+
	    			javagame.Player.Weapons[7][3]+";"+
	    			javagame.Player.Weapons[7][4]+";"+
	    			javagame.Player.Weapons[7][5]+";"+
	    			javagame.Player.Weapons[7][6]+";"+
	    			javagame.Player.Weapons[7][7]+";"+
	    			javagame.Player.Weapons[7][8]+";"+
	    			javagame.Player.Weapons[7][9]+";"+
	    			javagame.Player.Weapons[7][10]);
	    	out.println(javagame.Player.Weapons[8][0]+";"+
	    			javagame.Player.Weapons[8][1]+";"+
	    			javagame.Player.Weapons[8][2]+";"+
	    			javagame.Player.Weapons[8][3]+";"+
	    			javagame.Player.Weapons[8][4]+";"+
	    			javagame.Player.Weapons[8][5]+";"+
	    			javagame.Player.Weapons[8][6]+";"+
	    			javagame.Player.Weapons[8][7]+";"+
	    			javagame.Player.Weapons[8][8]+";"+
	    			javagame.Player.Weapons[8][9]+";"+
	    			javagame.Player.Weapons[8][10]);
	    	out.println(javagame.Player.Weapons[9][0]+";"+
	    			javagame.Player.Weapons[9][1]+";"+
	    			javagame.Player.Weapons[9][2]+";"+
	    			javagame.Player.Weapons[9][3]+";"+
	    			javagame.Player.Weapons[9][4]+";"+
	    			javagame.Player.Weapons[9][5]+";"+
	    			javagame.Player.Weapons[9][6]+";"+
	    			javagame.Player.Weapons[9][7]+";"+
	    			javagame.Player.Weapons[9][8]+";"+
	    			javagame.Player.Weapons[9][9]+";"+
	    			javagame.Player.Weapons[9][10]);
	    	out.println(javagame.Player.Weapons[10][0]+";"+
	    			javagame.Player.Weapons[10][1]+";"+
	    			javagame.Player.Weapons[10][2]+";"+
	    			javagame.Player.Weapons[10][3]+";"+
	    			javagame.Player.Weapons[10][4]+";"+
	    			javagame.Player.Weapons[10][5]+";"+
	    			javagame.Player.Weapons[10][6]+";"+
	    			javagame.Player.Weapons[10][7]+";"+
	    			javagame.Player.Weapons[10][8]+";"+
	    			javagame.Player.Weapons[10][9]+";"+
	    			javagame.Player.Weapons[10][10]);
	    	out.println(javagame.Player.Weapons[11][0]+";"+
	    			javagame.Player.Weapons[11][1]+";"+
	    			javagame.Player.Weapons[11][2]+";"+
	    			javagame.Player.Weapons[11][3]+";"+
	    			javagame.Player.Weapons[11][4]+";"+
	    			javagame.Player.Weapons[11][5]+";"+
	    			javagame.Player.Weapons[11][6]+";"+
	    			javagame.Player.Weapons[11][7]+";"+
	    			javagame.Player.Weapons[11][8]+";"+
	    			javagame.Player.Weapons[11][9]+";"+
	    			javagame.Player.Weapons[11][10]);
	    	out.println(javagame.Player.Weapons[12][0]+";"+
	    			javagame.Player.Weapons[12][1]+";"+
	    			javagame.Player.Weapons[12][2]+";"+
	    			javagame.Player.Weapons[12][3]+";"+
	    			javagame.Player.Weapons[12][4]+";"+
	    			javagame.Player.Weapons[12][5]+";"+
	    			javagame.Player.Weapons[12][6]+";"+
	    			javagame.Player.Weapons[12][7]+";"+
	    			javagame.Player.Weapons[12][8]+";"+
	    			javagame.Player.Weapons[12][9]+";"+
	    			javagame.Player.Weapons[12][10]);
	    	out.println(javagame.Player.Weapons[13][0]+";"+
	    			javagame.Player.Weapons[13][1]+";"+
	    			javagame.Player.Weapons[13][2]+";"+
	    			javagame.Player.Weapons[13][3]+";"+
	    			javagame.Player.Weapons[13][4]+";"+
	    			javagame.Player.Weapons[13][5]+";"+
	    			javagame.Player.Weapons[13][6]+";"+
	    			javagame.Player.Weapons[13][7]+";"+
	    			javagame.Player.Weapons[13][8]+";"+
	    			javagame.Player.Weapons[13][9]+";"+
	    			javagame.Player.Weapons[13][10]);
	    	out.println(javagame.Player.Weapons[14][0]+";"+
	    			javagame.Player.Weapons[14][1]+";"+
	    			javagame.Player.Weapons[14][2]+";"+
	    			javagame.Player.Weapons[14][3]+";"+
	    			javagame.Player.Weapons[14][4]+";"+
	    			javagame.Player.Weapons[14][5]+";"+
	    			javagame.Player.Weapons[14][6]+";"+
	    			javagame.Player.Weapons[14][7]+";"+
	    			javagame.Player.Weapons[14][8]+";"+
	    			javagame.Player.Weapons[14][9]+";"+
	    			javagame.Player.Weapons[14][10]);
	    	out.println(javagame.Player.Weapons[15][0]+";"+
	    			javagame.Player.Weapons[15][1]+";"+
	    			javagame.Player.Weapons[15][2]+";"+
	    			javagame.Player.Weapons[15][3]+";"+
	    			javagame.Player.Weapons[15][4]+";"+
	    			javagame.Player.Weapons[15][5]+";"+
	    			javagame.Player.Weapons[15][6]+";"+
	    			javagame.Player.Weapons[15][7]+";"+
	    			javagame.Player.Weapons[15][8]+";"+
	    			javagame.Player.Weapons[15][9]+";"+
	    			javagame.Player.Weapons[15][10]);
	    	out.println(javagame.Player.Weapons[16][0]+";"+
	    			javagame.Player.Weapons[16][1]+";"+
	    			javagame.Player.Weapons[16][2]+";"+
	    			javagame.Player.Weapons[16][3]+";"+
	    			javagame.Player.Weapons[16][4]+";"+
	    			javagame.Player.Weapons[16][5]+";"+
	    			javagame.Player.Weapons[16][6]+";"+
	    			javagame.Player.Weapons[16][7]+";"+
	    			javagame.Player.Weapons[16][8]+";"+
	    			javagame.Player.Weapons[16][9]+";"+
	    			javagame.Player.Weapons[16][10]);
	    	out.println(javagame.Player.Weapons[17][0]+";"+
	    			javagame.Player.Weapons[17][1]+";"+
	    			javagame.Player.Weapons[17][2]+";"+
	    			javagame.Player.Weapons[17][3]+";"+
	    			javagame.Player.Weapons[17][4]+";"+
	    			javagame.Player.Weapons[17][5]+";"+
	    			javagame.Player.Weapons[17][6]+";"+
	    			javagame.Player.Weapons[17][7]+";"+
	    			javagame.Player.Weapons[17][8]+";"+
	    			javagame.Player.Weapons[17][9]+";"+
	    			javagame.Player.Weapons[17][10]);
	    	out.println(javagame.Player.Weapons[18][0]+";"+
	    			javagame.Player.Weapons[18][1]+";"+
	    			javagame.Player.Weapons[18][2]+";"+
	    			javagame.Player.Weapons[18][3]+";"+
	    			javagame.Player.Weapons[18][4]+";"+
	    			javagame.Player.Weapons[18][5]+";"+
	    			javagame.Player.Weapons[18][6]+";"+
	    			javagame.Player.Weapons[18][7]+";"+
	    			javagame.Player.Weapons[18][8]+";"+
	    			javagame.Player.Weapons[18][9]+";"+
	    			javagame.Player.Weapons[18][10]);
	    	out.println(javagame.Player.Weapons[19][0]+";"+
	    			javagame.Player.Weapons[19][1]+";"+
	    			javagame.Player.Weapons[19][2]+";"+
	    			javagame.Player.Weapons[19][3]+";"+
	    			javagame.Player.Weapons[19][4]+";"+
	    			javagame.Player.Weapons[19][5]+";"+
	    			javagame.Player.Weapons[19][6]+";"+
	    			javagame.Player.Weapons[19][7]+";"+
	    			javagame.Player.Weapons[19][8]+";"+
	    			javagame.Player.Weapons[19][9]+";"+
	    			javagame.Player.Weapons[19][10]);
	    	out.println(javagame.Player.Weapons[20][0]+";"+
	    			javagame.Player.Weapons[20][1]+";"+
	    			javagame.Player.Weapons[20][2]+";"+
	    			javagame.Player.Weapons[20][3]+";"+
	    			javagame.Player.Weapons[20][4]+";"+
	    			javagame.Player.Weapons[20][5]+";"+
	    			javagame.Player.Weapons[20][6]+";"+
	    			javagame.Player.Weapons[20][7]+";"+
	    			javagame.Player.Weapons[20][8]+";"+
	    			javagame.Player.Weapons[20][9]+";"+
	    			javagame.Player.Weapons[20][10]);
	    	out.println(javagame.Player.Weapons[21][0]+";"+
	    			javagame.Player.Weapons[21][1]+";"+
	    			javagame.Player.Weapons[21][2]+";"+
	    			javagame.Player.Weapons[21][3]+";"+
	    			javagame.Player.Weapons[21][4]+";"+
	    			javagame.Player.Weapons[21][5]+";"+
	    			javagame.Player.Weapons[21][6]+";"+
	    			javagame.Player.Weapons[21][7]+";"+
	    			javagame.Player.Weapons[21][8]+";"+
	    			javagame.Player.Weapons[21][9]+";"+
	    			javagame.Player.Weapons[21][10]);
	    	out.println(javagame.Player.Weapons[22][0]+";"+
	    			javagame.Player.Weapons[22][1]+";"+
	    			javagame.Player.Weapons[22][2]+";"+
	    			javagame.Player.Weapons[22][3]+";"+
	    			javagame.Player.Weapons[22][4]+";"+
	    			javagame.Player.Weapons[22][5]+";"+
	    			javagame.Player.Weapons[22][6]+";"+
	    			javagame.Player.Weapons[22][7]+";"+
	    			javagame.Player.Weapons[22][8]+";"+
	    			javagame.Player.Weapons[22][9]+";"+
	    			javagame.Player.Weapons[22][10]);
	    	out.println(javagame.Player.Weapons[23][0]+";"+
	    			javagame.Player.Weapons[23][1]+";"+
	    			javagame.Player.Weapons[23][2]+";"+
	    			javagame.Player.Weapons[23][3]+";"+
	    			javagame.Player.Weapons[23][4]+";"+
	    			javagame.Player.Weapons[23][5]+";"+
	    			javagame.Player.Weapons[23][6]+";"+
	    			javagame.Player.Weapons[23][7]+";"+
	    			javagame.Player.Weapons[23][8]+";"+
	    			javagame.Player.Weapons[23][9]+";"+
	    			javagame.Player.Weapons[23][10]);
	    	out.println(javagame.Player.Weapons[24][0]+";"+
	    			javagame.Player.Weapons[24][1]+";"+
	    			javagame.Player.Weapons[24][2]+";"+
	    			javagame.Player.Weapons[24][3]+";"+
	    			javagame.Player.Weapons[24][4]+";"+
	    			javagame.Player.Weapons[24][5]+";"+
	    			javagame.Player.Weapons[24][6]+";"+
	    			javagame.Player.Weapons[24][7]+";"+
	    			javagame.Player.Weapons[24][8]+";"+
	    			javagame.Player.Weapons[24][9]+";"+
	    			javagame.Player.Weapons[24][10]);
	    	out.println(javagame.Player.equipped_weapon[0]+";"+
	    			javagame.Player.equipped_weapon[1]+";"+
	    			javagame.Player.equipped_weapon[2]+";"+
	    			javagame.Player.equipped_weapon[3]+";"+
	    			javagame.Player.equipped_weapon[4]+";"+
	    			javagame.Player.equipped_weapon[5]+";"+
	    			javagame.Player.equipped_weapon[6]+";"+
	    			javagame.Player.equipped_weapon[7]+";"+
	    			javagame.Player.equipped_weapon[8]+";"+
	    			javagame.Player.equipped_weapon[9]+";"+
	    			javagame.Player.equipped_weapon[10]);
	    	//Map Items On/Off
	    	out.println(javagame.Player.silver_message);
	    	out.println(javagame.Player.boss_1);
	    	//Player Stats
	    	out.println(javagame.Player.save_location);
	    	out.println(javagame.Player.money);
	    	out.println(javagame.Player.hp);
	    	out.println(javagame.Player.max_hp);
	    	out.println(javagame.Player.manap);
	    	out.println(javagame.Player.max_manap);
	    	out.println(javagame.Player.lvl);
	    	out.println(javagame.Player.xp);
	    	out.println(javagame.Player.silver_horn);
	    	out.println(javagame.Player.clas);
	    	out.println(javagame.Player.room);
	    	out.println(javagame.Player.name);
	    	out.println(javagame.Player.regen_points);
	    	out.println(javagame.Player.ocean_gem);
	    	out.println(javagame.Player.weapon_ID);
	    	//potions
	    	out.println(javagame.Player.lesser_potions);
	    	out.println(javagame.Player.potions);
	    	out.println(javagame.Player.greater_potions);
	    	out.println(javagame.Player.lesser_mana);
	    	out.println(javagame.Player.mana);
	    	out.println(javagame.Player.greater_mana);
	    	out.println(javagame.Player.lesser_regen);
	    	out.println(javagame.Player.regen);
	    	out.println(javagame.Player.greater_regen);
	    	out.println(javagame.Player.HMR);
	    	//Coordinates
		    out.println(javagame.Player.area_1[0]+";"+javagame.Player.area_1[1]+";"+javagame.Player.area_1[2]+";"+javagame.Player.area_1[3]);
		    out.println(javagame.Player.area_2[0]+";"+javagame.Player.area_2[1]+";"+javagame.Player.area_2[2]+";"+javagame.Player.area_2[3]);
		    out.println(javagame.Player.area_3[0]+";"+javagame.Player.area_3[1]+";"+javagame.Player.area_3[2]+";"+javagame.Player.area_3[3]);
		    out.println(javagame.Player.area_5[0]+";"+javagame.Player.cave_1[1]+";"+javagame.Player.cave_1[2]+";"+javagame.Player.cave_1[3]);
		    out.println(javagame.Player.cave_1[0]+";"+javagame.Player.area_5[1]+";"+javagame.Player.area_5[2]+";"+javagame.Player.area_5[3]);
		    out.println(javagame.Player.Alchemist[0]+";"+javagame.Player.Alchemist[1]+";"+javagame.Player.Alchemist[2]+";"+javagame.Player.Alchemist[3]);
		    out.println(javagame.Player.Beer_Hall[0]+";"+javagame.Player.Beer_Hall[1]+";"+javagame.Player.Beer_Hall[2]+";"+javagame.Player.Beer_Hall[3]);
		    out.println(javagame.Player.Forest[0]+";"+javagame.Player.Forest[1]+";"+javagame.Player.Forest[2]+";"+javagame.Player.Forest[3]);
		    out.println(javagame.Player.Rift[0]+";"+javagame.Player.Rift[1]+";"+javagame.Player.Rift[2]+";"+javagame.Player.Rift[3]);
		    out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void Save2(){
		try{
	    	PrintStream out = new PrintStream(new File("save2.Gateway"));
	    	//Inventory
	    	out.println(javagame.Player.Weapons[0][0]+";"+
	    			javagame.Player.Weapons[0][1]+";"+
	    			javagame.Player.Weapons[0][2]+";"+
	    			javagame.Player.Weapons[0][3]+";"+
	    			javagame.Player.Weapons[0][4]+";"+
	    			javagame.Player.Weapons[0][5]+";"+
	    			javagame.Player.Weapons[0][6]+";"+
	    			javagame.Player.Weapons[0][7]+";"+
	    			javagame.Player.Weapons[0][8]+";"+
	    			javagame.Player.Weapons[0][9]+";"+
	    			javagame.Player.Weapons[0][10]);
	    	out.println(javagame.Player.Weapons[1][0]+";"+
	    			javagame.Player.Weapons[1][1]+";"+
	    			javagame.Player.Weapons[1][2]+";"+
	    			javagame.Player.Weapons[1][3]+";"+
	    			javagame.Player.Weapons[1][4]+";"+
	    			javagame.Player.Weapons[1][5]+";"+
	    			javagame.Player.Weapons[1][6]+";"+
	    			javagame.Player.Weapons[1][7]+";"+
	    			javagame.Player.Weapons[1][8]+";"+
	    			javagame.Player.Weapons[1][9]+";"+
	    			javagame.Player.Weapons[1][10]);
	    	out.println(javagame.Player.Weapons[2][0]+";"+
	    			javagame.Player.Weapons[2][1]+";"+
	    			javagame.Player.Weapons[2][2]+";"+
	    			javagame.Player.Weapons[2][3]+";"+
	    			javagame.Player.Weapons[2][4]+";"+
	    			javagame.Player.Weapons[2][5]+";"+
	    			javagame.Player.Weapons[2][6]+";"+
	    			javagame.Player.Weapons[2][7]+";"+
	    			javagame.Player.Weapons[2][8]+";"+
	    			javagame.Player.Weapons[2][9]+";"+
	    			javagame.Player.Weapons[2][10]);
	    	out.println(javagame.Player.Weapons[3][0]+";"+
	    			javagame.Player.Weapons[3][1]+";"+
	    			javagame.Player.Weapons[3][2]+";"+
	    			javagame.Player.Weapons[3][3]+";"+
	    			javagame.Player.Weapons[3][4]+";"+
	    			javagame.Player.Weapons[3][5]+";"+
	    			javagame.Player.Weapons[3][6]+";"+
	    			javagame.Player.Weapons[3][7]+";"+
	    			javagame.Player.Weapons[3][8]+";"+
	    			javagame.Player.Weapons[3][9]+";"+
	    			javagame.Player.Weapons[3][10]);
	    	out.println(javagame.Player.Weapons[4][0]+";"+
	    			javagame.Player.Weapons[4][1]+";"+
	    			javagame.Player.Weapons[4][2]+";"+
	    			javagame.Player.Weapons[4][3]+";"+
	    			javagame.Player.Weapons[4][4]+";"+
	    			javagame.Player.Weapons[4][5]+";"+
	    			javagame.Player.Weapons[4][6]+";"+
	    			javagame.Player.Weapons[4][7]+";"+
	    			javagame.Player.Weapons[4][8]+";"+
	    			javagame.Player.Weapons[4][9]+";"+
	    			javagame.Player.Weapons[4][10]);
	    	out.println(javagame.Player.Weapons[5][0]+";"+
	    			javagame.Player.Weapons[5][1]+";"+
	    			javagame.Player.Weapons[5][2]+";"+
	    			javagame.Player.Weapons[5][3]+";"+
	    			javagame.Player.Weapons[5][4]+";"+
	    			javagame.Player.Weapons[5][5]+";"+
	    			javagame.Player.Weapons[5][6]+";"+
	    			javagame.Player.Weapons[5][7]+";"+
	    			javagame.Player.Weapons[5][8]+";"+
	    			javagame.Player.Weapons[5][9]+";"+
	    			javagame.Player.Weapons[5][10]);
	    	out.println(javagame.Player.Weapons[6][0]+";"+
	    			javagame.Player.Weapons[6][1]+";"+
	    			javagame.Player.Weapons[6][2]+";"+
	    			javagame.Player.Weapons[6][3]+";"+
	    			javagame.Player.Weapons[6][4]+";"+
	    			javagame.Player.Weapons[6][5]+";"+
	    			javagame.Player.Weapons[6][6]+";"+
	    			javagame.Player.Weapons[6][7]+";"+
	    			javagame.Player.Weapons[6][8]+";"+
	    			javagame.Player.Weapons[6][9]+";"+
	    			javagame.Player.Weapons[6][10]);
	    	out.println(javagame.Player.Weapons[7][0]+";"+
	    			javagame.Player.Weapons[7][1]+";"+
	    			javagame.Player.Weapons[7][2]+";"+
	    			javagame.Player.Weapons[7][3]+";"+
	    			javagame.Player.Weapons[7][4]+";"+
	    			javagame.Player.Weapons[7][5]+";"+
	    			javagame.Player.Weapons[7][6]+";"+
	    			javagame.Player.Weapons[7][7]+";"+
	    			javagame.Player.Weapons[7][8]+";"+
	    			javagame.Player.Weapons[7][9]+";"+
	    			javagame.Player.Weapons[7][10]);
	    	out.println(javagame.Player.Weapons[8][0]+";"+
	    			javagame.Player.Weapons[8][1]+";"+
	    			javagame.Player.Weapons[8][2]+";"+
	    			javagame.Player.Weapons[8][3]+";"+
	    			javagame.Player.Weapons[8][4]+";"+
	    			javagame.Player.Weapons[8][5]+";"+
	    			javagame.Player.Weapons[8][6]+";"+
	    			javagame.Player.Weapons[8][7]+";"+
	    			javagame.Player.Weapons[8][8]+";"+
	    			javagame.Player.Weapons[8][9]+";"+
	    			javagame.Player.Weapons[8][10]);
	    	out.println(javagame.Player.Weapons[9][0]+";"+
	    			javagame.Player.Weapons[9][1]+";"+
	    			javagame.Player.Weapons[9][2]+";"+
	    			javagame.Player.Weapons[9][3]+";"+
	    			javagame.Player.Weapons[9][4]+";"+
	    			javagame.Player.Weapons[9][5]+";"+
	    			javagame.Player.Weapons[9][6]+";"+
	    			javagame.Player.Weapons[9][7]+";"+
	    			javagame.Player.Weapons[9][8]+";"+
	    			javagame.Player.Weapons[9][9]+";"+
	    			javagame.Player.Weapons[9][10]);
	    	out.println(javagame.Player.Weapons[10][0]+";"+
	    			javagame.Player.Weapons[10][1]+";"+
	    			javagame.Player.Weapons[10][2]+";"+
	    			javagame.Player.Weapons[10][3]+";"+
	    			javagame.Player.Weapons[10][4]+";"+
	    			javagame.Player.Weapons[10][5]+";"+
	    			javagame.Player.Weapons[10][6]+";"+
	    			javagame.Player.Weapons[10][7]+";"+
	    			javagame.Player.Weapons[10][8]+";"+
	    			javagame.Player.Weapons[10][9]+";"+
	    			javagame.Player.Weapons[10][10]);
	    	out.println(javagame.Player.Weapons[11][0]+";"+
	    			javagame.Player.Weapons[11][1]+";"+
	    			javagame.Player.Weapons[11][2]+";"+
	    			javagame.Player.Weapons[11][3]+";"+
	    			javagame.Player.Weapons[11][4]+";"+
	    			javagame.Player.Weapons[11][5]+";"+
	    			javagame.Player.Weapons[11][6]+";"+
	    			javagame.Player.Weapons[11][7]+";"+
	    			javagame.Player.Weapons[11][8]+";"+
	    			javagame.Player.Weapons[11][9]+";"+
	    			javagame.Player.Weapons[11][10]);
	    	out.println(javagame.Player.Weapons[12][0]+";"+
	    			javagame.Player.Weapons[12][1]+";"+
	    			javagame.Player.Weapons[12][2]+";"+
	    			javagame.Player.Weapons[12][3]+";"+
	    			javagame.Player.Weapons[12][4]+";"+
	    			javagame.Player.Weapons[12][5]+";"+
	    			javagame.Player.Weapons[12][6]+";"+
	    			javagame.Player.Weapons[12][7]+";"+
	    			javagame.Player.Weapons[12][8]+";"+
	    			javagame.Player.Weapons[12][9]+";"+
	    			javagame.Player.Weapons[12][10]);
	    	out.println(javagame.Player.Weapons[13][0]+";"+
	    			javagame.Player.Weapons[13][1]+";"+
	    			javagame.Player.Weapons[13][2]+";"+
	    			javagame.Player.Weapons[13][3]+";"+
	    			javagame.Player.Weapons[13][4]+";"+
	    			javagame.Player.Weapons[13][5]+";"+
	    			javagame.Player.Weapons[13][6]+";"+
	    			javagame.Player.Weapons[13][7]+";"+
	    			javagame.Player.Weapons[13][8]+";"+
	    			javagame.Player.Weapons[13][9]+";"+
	    			javagame.Player.Weapons[13][10]);
	    	out.println(javagame.Player.Weapons[14][0]+";"+
	    			javagame.Player.Weapons[14][1]+";"+
	    			javagame.Player.Weapons[14][2]+";"+
	    			javagame.Player.Weapons[14][3]+";"+
	    			javagame.Player.Weapons[14][4]+";"+
	    			javagame.Player.Weapons[14][5]+";"+
	    			javagame.Player.Weapons[14][6]+";"+
	    			javagame.Player.Weapons[14][7]+";"+
	    			javagame.Player.Weapons[14][8]+";"+
	    			javagame.Player.Weapons[14][9]+";"+
	    			javagame.Player.Weapons[14][10]);
	    	out.println(javagame.Player.Weapons[15][0]+";"+
	    			javagame.Player.Weapons[15][1]+";"+
	    			javagame.Player.Weapons[15][2]+";"+
	    			javagame.Player.Weapons[15][3]+";"+
	    			javagame.Player.Weapons[15][4]+";"+
	    			javagame.Player.Weapons[15][5]+";"+
	    			javagame.Player.Weapons[15][6]+";"+
	    			javagame.Player.Weapons[15][7]+";"+
	    			javagame.Player.Weapons[15][8]+";"+
	    			javagame.Player.Weapons[15][9]+";"+
	    			javagame.Player.Weapons[15][10]);
	    	out.println(javagame.Player.Weapons[16][0]+";"+
	    			javagame.Player.Weapons[16][1]+";"+
	    			javagame.Player.Weapons[16][2]+";"+
	    			javagame.Player.Weapons[16][3]+";"+
	    			javagame.Player.Weapons[16][4]+";"+
	    			javagame.Player.Weapons[16][5]+";"+
	    			javagame.Player.Weapons[16][6]+";"+
	    			javagame.Player.Weapons[16][7]+";"+
	    			javagame.Player.Weapons[16][8]+";"+
	    			javagame.Player.Weapons[16][9]+";"+
	    			javagame.Player.Weapons[16][10]);
	    	out.println(javagame.Player.Weapons[17][0]+";"+
	    			javagame.Player.Weapons[17][1]+";"+
	    			javagame.Player.Weapons[17][2]+";"+
	    			javagame.Player.Weapons[17][3]+";"+
	    			javagame.Player.Weapons[17][4]+";"+
	    			javagame.Player.Weapons[17][5]+";"+
	    			javagame.Player.Weapons[17][6]+";"+
	    			javagame.Player.Weapons[17][7]+";"+
	    			javagame.Player.Weapons[17][8]+";"+
	    			javagame.Player.Weapons[17][9]+";"+
	    			javagame.Player.Weapons[17][10]);
	    	out.println(javagame.Player.Weapons[18][0]+";"+
	    			javagame.Player.Weapons[18][1]+";"+
	    			javagame.Player.Weapons[18][2]+";"+
	    			javagame.Player.Weapons[18][3]+";"+
	    			javagame.Player.Weapons[18][4]+";"+
	    			javagame.Player.Weapons[18][5]+";"+
	    			javagame.Player.Weapons[18][6]+";"+
	    			javagame.Player.Weapons[18][7]+";"+
	    			javagame.Player.Weapons[18][8]+";"+
	    			javagame.Player.Weapons[18][9]+";"+
	    			javagame.Player.Weapons[18][10]);
	    	out.println(javagame.Player.Weapons[19][0]+";"+
	    			javagame.Player.Weapons[19][1]+";"+
	    			javagame.Player.Weapons[19][2]+";"+
	    			javagame.Player.Weapons[19][3]+";"+
	    			javagame.Player.Weapons[19][4]+";"+
	    			javagame.Player.Weapons[19][5]+";"+
	    			javagame.Player.Weapons[19][6]+";"+
	    			javagame.Player.Weapons[19][7]+";"+
	    			javagame.Player.Weapons[19][8]+";"+
	    			javagame.Player.Weapons[19][9]+";"+
	    			javagame.Player.Weapons[19][10]);
	    	out.println(javagame.Player.Weapons[20][0]+";"+
	    			javagame.Player.Weapons[20][1]+";"+
	    			javagame.Player.Weapons[20][2]+";"+
	    			javagame.Player.Weapons[20][3]+";"+
	    			javagame.Player.Weapons[20][4]+";"+
	    			javagame.Player.Weapons[20][5]+";"+
	    			javagame.Player.Weapons[20][6]+";"+
	    			javagame.Player.Weapons[20][7]+";"+
	    			javagame.Player.Weapons[20][8]+";"+
	    			javagame.Player.Weapons[20][9]+";"+
	    			javagame.Player.Weapons[20][10]);
	    	out.println(javagame.Player.Weapons[21][0]+";"+
	    			javagame.Player.Weapons[21][1]+";"+
	    			javagame.Player.Weapons[21][2]+";"+
	    			javagame.Player.Weapons[21][3]+";"+
	    			javagame.Player.Weapons[21][4]+";"+
	    			javagame.Player.Weapons[21][5]+";"+
	    			javagame.Player.Weapons[21][6]+";"+
	    			javagame.Player.Weapons[21][7]+";"+
	    			javagame.Player.Weapons[21][8]+";"+
	    			javagame.Player.Weapons[21][9]+";"+
	    			javagame.Player.Weapons[21][10]);
	    	out.println(javagame.Player.Weapons[22][0]+";"+
	    			javagame.Player.Weapons[22][1]+";"+
	    			javagame.Player.Weapons[22][2]+";"+
	    			javagame.Player.Weapons[22][3]+";"+
	    			javagame.Player.Weapons[22][4]+";"+
	    			javagame.Player.Weapons[22][5]+";"+
	    			javagame.Player.Weapons[22][6]+";"+
	    			javagame.Player.Weapons[22][7]+";"+
	    			javagame.Player.Weapons[22][8]+";"+
	    			javagame.Player.Weapons[22][9]+";"+
	    			javagame.Player.Weapons[22][10]);
	    	out.println(javagame.Player.Weapons[23][0]+";"+
	    			javagame.Player.Weapons[23][1]+";"+
	    			javagame.Player.Weapons[23][2]+";"+
	    			javagame.Player.Weapons[23][3]+";"+
	    			javagame.Player.Weapons[23][4]+";"+
	    			javagame.Player.Weapons[23][5]+";"+
	    			javagame.Player.Weapons[23][6]+";"+
	    			javagame.Player.Weapons[23][7]+";"+
	    			javagame.Player.Weapons[23][8]+";"+
	    			javagame.Player.Weapons[23][9]+";"+
	    			javagame.Player.Weapons[23][10]);
	    	out.println(javagame.Player.Weapons[24][0]+";"+
	    			javagame.Player.Weapons[24][1]+";"+
	    			javagame.Player.Weapons[24][2]+";"+
	    			javagame.Player.Weapons[24][3]+";"+
	    			javagame.Player.Weapons[24][4]+";"+
	    			javagame.Player.Weapons[24][5]+";"+
	    			javagame.Player.Weapons[24][6]+";"+
	    			javagame.Player.Weapons[24][7]+";"+
	    			javagame.Player.Weapons[24][8]+";"+
	    			javagame.Player.Weapons[24][9]+";"+
	    			javagame.Player.Weapons[24][10]);
	    	out.println(javagame.Player.equipped_weapon[0]+";"+
	    			javagame.Player.equipped_weapon[1]+";"+
	    			javagame.Player.equipped_weapon[2]+";"+
	    			javagame.Player.equipped_weapon[3]+";"+
	    			javagame.Player.equipped_weapon[4]+";"+
	    			javagame.Player.equipped_weapon[5]+";"+
	    			javagame.Player.equipped_weapon[6]+";"+
	    			javagame.Player.equipped_weapon[7]+";"+
	    			javagame.Player.equipped_weapon[8]+";"+
	    			javagame.Player.equipped_weapon[9]+";"+
	    			javagame.Player.equipped_weapon[10]);
	    	//Map Items On/Off
	    	out.println(javagame.Player.silver_message);
	    	out.println(javagame.Player.boss_1);
	    	//Player Stats
	    	out.println(javagame.Player.save_location);
	    	out.println(javagame.Player.money);
	    	out.println(javagame.Player.hp);
	    	out.println(javagame.Player.max_hp);
	    	out.println(javagame.Player.manap);
	    	out.println(javagame.Player.max_manap);
	    	out.println(javagame.Player.lvl);
	    	out.println(javagame.Player.xp);
	    	out.println(javagame.Player.silver_horn);
	    	out.println(javagame.Player.clas);
	    	out.println(javagame.Player.room);
	    	out.println(javagame.Player.name);
	    	out.println(javagame.Player.regen_points);
	    	out.println(javagame.Player.ocean_gem);
	    	out.println(javagame.Player.weapon_ID);
	    	//potions
	    	out.println(javagame.Player.lesser_potions);
	    	out.println(javagame.Player.potions);
	    	out.println(javagame.Player.greater_potions);
	    	out.println(javagame.Player.lesser_mana);
	    	out.println(javagame.Player.mana);
	    	out.println(javagame.Player.greater_mana);
	    	out.println(javagame.Player.lesser_regen);
	    	out.println(javagame.Player.regen);
	    	out.println(javagame.Player.greater_regen);
	    	out.println(javagame.Player.HMR);
	    	//Coordinates
		    out.println(javagame.Player.area_1[0]+";"+javagame.Player.area_1[1]+";"+javagame.Player.area_1[2]+";"+javagame.Player.area_1[3]);
		    out.println(javagame.Player.area_2[0]+";"+javagame.Player.area_2[1]+";"+javagame.Player.area_2[2]+";"+javagame.Player.area_2[3]);
		    out.println(javagame.Player.area_3[0]+";"+javagame.Player.area_3[1]+";"+javagame.Player.area_3[2]+";"+javagame.Player.area_3[3]);
		    out.println(javagame.Player.area_5[0]+";"+javagame.Player.cave_1[1]+";"+javagame.Player.cave_1[2]+";"+javagame.Player.cave_1[3]);
		    out.println(javagame.Player.cave_1[0]+";"+javagame.Player.area_5[1]+";"+javagame.Player.area_5[2]+";"+javagame.Player.area_5[3]);
		    out.println(javagame.Player.Alchemist[0]+";"+javagame.Player.Alchemist[1]+";"+javagame.Player.Alchemist[2]+";"+javagame.Player.Alchemist[3]);
		    out.println(javagame.Player.Beer_Hall[0]+";"+javagame.Player.Beer_Hall[1]+";"+javagame.Player.Beer_Hall[2]+";"+javagame.Player.Beer_Hall[3]);
		    out.println(javagame.Player.Forest[0]+";"+javagame.Player.Forest[1]+";"+javagame.Player.Forest[2]+";"+javagame.Player.Forest[3]);
		    out.println(javagame.Player.Rift[0]+";"+javagame.Player.Rift[1]+";"+javagame.Player.Rift[2]+";"+javagame.Player.Rift[3]);
		    out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void Save3(){
		try{
	    	PrintStream out = new PrintStream(new File("save3.Gateway"));
	    	//Inventory
	    	out.println(javagame.Player.Weapons[0][0]+";"+
	    			javagame.Player.Weapons[0][1]+";"+
	    			javagame.Player.Weapons[0][2]+";"+
	    			javagame.Player.Weapons[0][3]+";"+
	    			javagame.Player.Weapons[0][4]+";"+
	    			javagame.Player.Weapons[0][5]+";"+
	    			javagame.Player.Weapons[0][6]+";"+
	    			javagame.Player.Weapons[0][7]+";"+
	    			javagame.Player.Weapons[0][8]+";"+
	    			javagame.Player.Weapons[0][9]+";"+
	    			javagame.Player.Weapons[0][10]);
	    	out.println(javagame.Player.Weapons[1][0]+";"+
	    			javagame.Player.Weapons[1][1]+";"+
	    			javagame.Player.Weapons[1][2]+";"+
	    			javagame.Player.Weapons[1][3]+";"+
	    			javagame.Player.Weapons[1][4]+";"+
	    			javagame.Player.Weapons[1][5]+";"+
	    			javagame.Player.Weapons[1][6]+";"+
	    			javagame.Player.Weapons[1][7]+";"+
	    			javagame.Player.Weapons[1][8]+";"+
	    			javagame.Player.Weapons[1][9]+";"+
	    			javagame.Player.Weapons[1][10]);
	    	out.println(javagame.Player.Weapons[2][0]+";"+
	    			javagame.Player.Weapons[2][1]+";"+
	    			javagame.Player.Weapons[2][2]+";"+
	    			javagame.Player.Weapons[2][3]+";"+
	    			javagame.Player.Weapons[2][4]+";"+
	    			javagame.Player.Weapons[2][5]+";"+
	    			javagame.Player.Weapons[2][6]+";"+
	    			javagame.Player.Weapons[2][7]+";"+
	    			javagame.Player.Weapons[2][8]+";"+
	    			javagame.Player.Weapons[2][9]+";"+
	    			javagame.Player.Weapons[2][10]);
	    	out.println(javagame.Player.Weapons[3][0]+";"+
	    			javagame.Player.Weapons[3][1]+";"+
	    			javagame.Player.Weapons[3][2]+";"+
	    			javagame.Player.Weapons[3][3]+";"+
	    			javagame.Player.Weapons[3][4]+";"+
	    			javagame.Player.Weapons[3][5]+";"+
	    			javagame.Player.Weapons[3][6]+";"+
	    			javagame.Player.Weapons[3][7]+";"+
	    			javagame.Player.Weapons[3][8]+";"+
	    			javagame.Player.Weapons[3][9]+";"+
	    			javagame.Player.Weapons[3][10]);
	    	out.println(javagame.Player.Weapons[4][0]+";"+
	    			javagame.Player.Weapons[4][1]+";"+
	    			javagame.Player.Weapons[4][2]+";"+
	    			javagame.Player.Weapons[4][3]+";"+
	    			javagame.Player.Weapons[4][4]+";"+
	    			javagame.Player.Weapons[4][5]+";"+
	    			javagame.Player.Weapons[4][6]+";"+
	    			javagame.Player.Weapons[4][7]+";"+
	    			javagame.Player.Weapons[4][8]+";"+
	    			javagame.Player.Weapons[4][9]+";"+
	    			javagame.Player.Weapons[4][10]);
	    	out.println(javagame.Player.Weapons[5][0]+";"+
	    			javagame.Player.Weapons[5][1]+";"+
	    			javagame.Player.Weapons[5][2]+";"+
	    			javagame.Player.Weapons[5][3]+";"+
	    			javagame.Player.Weapons[5][4]+";"+
	    			javagame.Player.Weapons[5][5]+";"+
	    			javagame.Player.Weapons[5][6]+";"+
	    			javagame.Player.Weapons[5][7]+";"+
	    			javagame.Player.Weapons[5][8]+";"+
	    			javagame.Player.Weapons[5][9]+";"+
	    			javagame.Player.Weapons[5][10]);
	    	out.println(javagame.Player.Weapons[6][0]+";"+
	    			javagame.Player.Weapons[6][1]+";"+
	    			javagame.Player.Weapons[6][2]+";"+
	    			javagame.Player.Weapons[6][3]+";"+
	    			javagame.Player.Weapons[6][4]+";"+
	    			javagame.Player.Weapons[6][5]+";"+
	    			javagame.Player.Weapons[6][6]+";"+
	    			javagame.Player.Weapons[6][7]+";"+
	    			javagame.Player.Weapons[6][8]+";"+
	    			javagame.Player.Weapons[6][9]+";"+
	    			javagame.Player.Weapons[6][10]);
	    	out.println(javagame.Player.Weapons[7][0]+";"+
	    			javagame.Player.Weapons[7][1]+";"+
	    			javagame.Player.Weapons[7][2]+";"+
	    			javagame.Player.Weapons[7][3]+";"+
	    			javagame.Player.Weapons[7][4]+";"+
	    			javagame.Player.Weapons[7][5]+";"+
	    			javagame.Player.Weapons[7][6]+";"+
	    			javagame.Player.Weapons[7][7]+";"+
	    			javagame.Player.Weapons[7][8]+";"+
	    			javagame.Player.Weapons[7][9]+";"+
	    			javagame.Player.Weapons[7][10]);
	    	out.println(javagame.Player.Weapons[8][0]+";"+
	    			javagame.Player.Weapons[8][1]+";"+
	    			javagame.Player.Weapons[8][2]+";"+
	    			javagame.Player.Weapons[8][3]+";"+
	    			javagame.Player.Weapons[8][4]+";"+
	    			javagame.Player.Weapons[8][5]+";"+
	    			javagame.Player.Weapons[8][6]+";"+
	    			javagame.Player.Weapons[8][7]+";"+
	    			javagame.Player.Weapons[8][8]+";"+
	    			javagame.Player.Weapons[8][9]+";"+
	    			javagame.Player.Weapons[8][10]);
	    	out.println(javagame.Player.Weapons[9][0]+";"+
	    			javagame.Player.Weapons[9][1]+";"+
	    			javagame.Player.Weapons[9][2]+";"+
	    			javagame.Player.Weapons[9][3]+";"+
	    			javagame.Player.Weapons[9][4]+";"+
	    			javagame.Player.Weapons[9][5]+";"+
	    			javagame.Player.Weapons[9][6]+";"+
	    			javagame.Player.Weapons[9][7]+";"+
	    			javagame.Player.Weapons[9][8]+";"+
	    			javagame.Player.Weapons[9][9]+";"+
	    			javagame.Player.Weapons[9][10]);
	    	out.println(javagame.Player.Weapons[10][0]+";"+
	    			javagame.Player.Weapons[10][1]+";"+
	    			javagame.Player.Weapons[10][2]+";"+
	    			javagame.Player.Weapons[10][3]+";"+
	    			javagame.Player.Weapons[10][4]+";"+
	    			javagame.Player.Weapons[10][5]+";"+
	    			javagame.Player.Weapons[10][6]+";"+
	    			javagame.Player.Weapons[10][7]+";"+
	    			javagame.Player.Weapons[10][8]+";"+
	    			javagame.Player.Weapons[10][9]+";"+
	    			javagame.Player.Weapons[10][10]);
	    	out.println(javagame.Player.Weapons[11][0]+";"+
	    			javagame.Player.Weapons[11][1]+";"+
	    			javagame.Player.Weapons[11][2]+";"+
	    			javagame.Player.Weapons[11][3]+";"+
	    			javagame.Player.Weapons[11][4]+";"+
	    			javagame.Player.Weapons[11][5]+";"+
	    			javagame.Player.Weapons[11][6]+";"+
	    			javagame.Player.Weapons[11][7]+";"+
	    			javagame.Player.Weapons[11][8]+";"+
	    			javagame.Player.Weapons[11][9]+";"+
	    			javagame.Player.Weapons[11][10]);
	    	out.println(javagame.Player.Weapons[12][0]+";"+
	    			javagame.Player.Weapons[12][1]+";"+
	    			javagame.Player.Weapons[12][2]+";"+
	    			javagame.Player.Weapons[12][3]+";"+
	    			javagame.Player.Weapons[12][4]+";"+
	    			javagame.Player.Weapons[12][5]+";"+
	    			javagame.Player.Weapons[12][6]+";"+
	    			javagame.Player.Weapons[12][7]+";"+
	    			javagame.Player.Weapons[12][8]+";"+
	    			javagame.Player.Weapons[12][9]+";"+
	    			javagame.Player.Weapons[12][10]);
	    	out.println(javagame.Player.Weapons[13][0]+";"+
	    			javagame.Player.Weapons[13][1]+";"+
	    			javagame.Player.Weapons[13][2]+";"+
	    			javagame.Player.Weapons[13][3]+";"+
	    			javagame.Player.Weapons[13][4]+";"+
	    			javagame.Player.Weapons[13][5]+";"+
	    			javagame.Player.Weapons[13][6]+";"+
	    			javagame.Player.Weapons[13][7]+";"+
	    			javagame.Player.Weapons[13][8]+";"+
	    			javagame.Player.Weapons[13][9]+";"+
	    			javagame.Player.Weapons[13][10]);
	    	out.println(javagame.Player.Weapons[14][0]+";"+
	    			javagame.Player.Weapons[14][1]+";"+
	    			javagame.Player.Weapons[14][2]+";"+
	    			javagame.Player.Weapons[14][3]+";"+
	    			javagame.Player.Weapons[14][4]+";"+
	    			javagame.Player.Weapons[14][5]+";"+
	    			javagame.Player.Weapons[14][6]+";"+
	    			javagame.Player.Weapons[14][7]+";"+
	    			javagame.Player.Weapons[14][8]+";"+
	    			javagame.Player.Weapons[14][9]+";"+
	    			javagame.Player.Weapons[14][10]);
	    	out.println(javagame.Player.Weapons[15][0]+";"+
	    			javagame.Player.Weapons[15][1]+";"+
	    			javagame.Player.Weapons[15][2]+";"+
	    			javagame.Player.Weapons[15][3]+";"+
	    			javagame.Player.Weapons[15][4]+";"+
	    			javagame.Player.Weapons[15][5]+";"+
	    			javagame.Player.Weapons[15][6]+";"+
	    			javagame.Player.Weapons[15][7]+";"+
	    			javagame.Player.Weapons[15][8]+";"+
	    			javagame.Player.Weapons[15][9]+";"+
	    			javagame.Player.Weapons[15][10]);
	    	out.println(javagame.Player.Weapons[16][0]+";"+
	    			javagame.Player.Weapons[16][1]+";"+
	    			javagame.Player.Weapons[16][2]+";"+
	    			javagame.Player.Weapons[16][3]+";"+
	    			javagame.Player.Weapons[16][4]+";"+
	    			javagame.Player.Weapons[16][5]+";"+
	    			javagame.Player.Weapons[16][6]+";"+
	    			javagame.Player.Weapons[16][7]+";"+
	    			javagame.Player.Weapons[16][8]+";"+
	    			javagame.Player.Weapons[16][9]+";"+
	    			javagame.Player.Weapons[16][10]);
	    	out.println(javagame.Player.Weapons[17][0]+";"+
	    			javagame.Player.Weapons[17][1]+";"+
	    			javagame.Player.Weapons[17][2]+";"+
	    			javagame.Player.Weapons[17][3]+";"+
	    			javagame.Player.Weapons[17][4]+";"+
	    			javagame.Player.Weapons[17][5]+";"+
	    			javagame.Player.Weapons[17][6]+";"+
	    			javagame.Player.Weapons[17][7]+";"+
	    			javagame.Player.Weapons[17][8]+";"+
	    			javagame.Player.Weapons[17][9]+";"+
	    			javagame.Player.Weapons[17][10]);
	    	out.println(javagame.Player.Weapons[18][0]+";"+
	    			javagame.Player.Weapons[18][1]+";"+
	    			javagame.Player.Weapons[18][2]+";"+
	    			javagame.Player.Weapons[18][3]+";"+
	    			javagame.Player.Weapons[18][4]+";"+
	    			javagame.Player.Weapons[18][5]+";"+
	    			javagame.Player.Weapons[18][6]+";"+
	    			javagame.Player.Weapons[18][7]+";"+
	    			javagame.Player.Weapons[18][8]+";"+
	    			javagame.Player.Weapons[18][9]+";"+
	    			javagame.Player.Weapons[18][10]);
	    	out.println(javagame.Player.Weapons[19][0]+";"+
	    			javagame.Player.Weapons[19][1]+";"+
	    			javagame.Player.Weapons[19][2]+";"+
	    			javagame.Player.Weapons[19][3]+";"+
	    			javagame.Player.Weapons[19][4]+";"+
	    			javagame.Player.Weapons[19][5]+";"+
	    			javagame.Player.Weapons[19][6]+";"+
	    			javagame.Player.Weapons[19][7]+";"+
	    			javagame.Player.Weapons[19][8]+";"+
	    			javagame.Player.Weapons[19][9]+";"+
	    			javagame.Player.Weapons[19][10]);
	    	out.println(javagame.Player.Weapons[20][0]+";"+
	    			javagame.Player.Weapons[20][1]+";"+
	    			javagame.Player.Weapons[20][2]+";"+
	    			javagame.Player.Weapons[20][3]+";"+
	    			javagame.Player.Weapons[20][4]+";"+
	    			javagame.Player.Weapons[20][5]+";"+
	    			javagame.Player.Weapons[20][6]+";"+
	    			javagame.Player.Weapons[20][7]+";"+
	    			javagame.Player.Weapons[20][8]+";"+
	    			javagame.Player.Weapons[20][9]+";"+
	    			javagame.Player.Weapons[20][10]);
	    	out.println(javagame.Player.Weapons[21][0]+";"+
	    			javagame.Player.Weapons[21][1]+";"+
	    			javagame.Player.Weapons[21][2]+";"+
	    			javagame.Player.Weapons[21][3]+";"+
	    			javagame.Player.Weapons[21][4]+";"+
	    			javagame.Player.Weapons[21][5]+";"+
	    			javagame.Player.Weapons[21][6]+";"+
	    			javagame.Player.Weapons[21][7]+";"+
	    			javagame.Player.Weapons[21][8]+";"+
	    			javagame.Player.Weapons[21][9]+";"+
	    			javagame.Player.Weapons[21][10]);
	    	out.println(javagame.Player.Weapons[22][0]+";"+
	    			javagame.Player.Weapons[22][1]+";"+
	    			javagame.Player.Weapons[22][2]+";"+
	    			javagame.Player.Weapons[22][3]+";"+
	    			javagame.Player.Weapons[22][4]+";"+
	    			javagame.Player.Weapons[22][5]+";"+
	    			javagame.Player.Weapons[22][6]+";"+
	    			javagame.Player.Weapons[22][7]+";"+
	    			javagame.Player.Weapons[22][8]+";"+
	    			javagame.Player.Weapons[22][9]+";"+
	    			javagame.Player.Weapons[22][10]);
	    	out.println(javagame.Player.Weapons[23][0]+";"+
	    			javagame.Player.Weapons[23][1]+";"+
	    			javagame.Player.Weapons[23][2]+";"+
	    			javagame.Player.Weapons[23][3]+";"+
	    			javagame.Player.Weapons[23][4]+";"+
	    			javagame.Player.Weapons[23][5]+";"+
	    			javagame.Player.Weapons[23][6]+";"+
	    			javagame.Player.Weapons[23][7]+";"+
	    			javagame.Player.Weapons[23][8]+";"+
	    			javagame.Player.Weapons[23][9]+";"+
	    			javagame.Player.Weapons[23][10]);
	    	out.println(javagame.Player.Weapons[24][0]+";"+
	    			javagame.Player.Weapons[24][1]+";"+
	    			javagame.Player.Weapons[24][2]+";"+
	    			javagame.Player.Weapons[24][3]+";"+
	    			javagame.Player.Weapons[24][4]+";"+
	    			javagame.Player.Weapons[24][5]+";"+
	    			javagame.Player.Weapons[24][6]+";"+
	    			javagame.Player.Weapons[24][7]+";"+
	    			javagame.Player.Weapons[24][8]+";"+
	    			javagame.Player.Weapons[24][9]+";"+
	    			javagame.Player.Weapons[24][10]);
	    	out.println(javagame.Player.equipped_weapon[0]+";"+
	    			javagame.Player.equipped_weapon[1]+";"+
	    			javagame.Player.equipped_weapon[2]+";"+
	    			javagame.Player.equipped_weapon[3]+";"+
	    			javagame.Player.equipped_weapon[4]+";"+
	    			javagame.Player.equipped_weapon[5]+";"+
	    			javagame.Player.equipped_weapon[6]+";"+
	    			javagame.Player.equipped_weapon[7]+";"+
	    			javagame.Player.equipped_weapon[8]+";"+
	    			javagame.Player.equipped_weapon[9]+";"+
	    			javagame.Player.equipped_weapon[10]);
	    	//Map Items On/Off
	    	out.println(javagame.Player.silver_message);
	    	out.println(javagame.Player.boss_1);
	    	//Player Stats
	    	out.println(javagame.Player.save_location);
	    	out.println(javagame.Player.money);
	    	out.println(javagame.Player.hp);
	    	out.println(javagame.Player.max_hp);
	    	out.println(javagame.Player.manap);
	    	out.println(javagame.Player.max_manap);
	    	out.println(javagame.Player.lvl);
	    	out.println(javagame.Player.xp);
	    	out.println(javagame.Player.silver_horn);
	    	out.println(javagame.Player.clas);
	    	out.println(javagame.Player.room);
	    	out.println(javagame.Player.name);
	    	out.println(javagame.Player.regen_points);
	    	out.println(javagame.Player.ocean_gem);
	    	out.println(javagame.Player.weapon_ID);
	    	//potions
	    	out.println(javagame.Player.lesser_potions);
	    	out.println(javagame.Player.potions);
	    	out.println(javagame.Player.greater_potions);
	    	out.println(javagame.Player.lesser_mana);
	    	out.println(javagame.Player.mana);
	    	out.println(javagame.Player.greater_mana);
	    	out.println(javagame.Player.lesser_regen);
	    	out.println(javagame.Player.regen);
	    	out.println(javagame.Player.greater_regen);
	    	out.println(javagame.Player.HMR);
	    	//Coordinates
		    out.println(javagame.Player.area_1[0]+";"+javagame.Player.area_1[1]+";"+javagame.Player.area_1[2]+";"+javagame.Player.area_1[3]);
		    out.println(javagame.Player.area_2[0]+";"+javagame.Player.area_2[1]+";"+javagame.Player.area_2[2]+";"+javagame.Player.area_2[3]);
		    out.println(javagame.Player.area_3[0]+";"+javagame.Player.area_3[1]+";"+javagame.Player.area_3[2]+";"+javagame.Player.area_3[3]);
		    out.println(javagame.Player.area_5[0]+";"+javagame.Player.cave_1[1]+";"+javagame.Player.cave_1[2]+";"+javagame.Player.cave_1[3]);
		    out.println(javagame.Player.cave_1[0]+";"+javagame.Player.area_5[1]+";"+javagame.Player.area_5[2]+";"+javagame.Player.area_5[3]);
		    out.println(javagame.Player.Alchemist[0]+";"+javagame.Player.Alchemist[1]+";"+javagame.Player.Alchemist[2]+";"+javagame.Player.Alchemist[3]);
		    out.println(javagame.Player.Beer_Hall[0]+";"+javagame.Player.Beer_Hall[1]+";"+javagame.Player.Beer_Hall[2]+";"+javagame.Player.Beer_Hall[3]);
		    out.println(javagame.Player.Forest[0]+";"+javagame.Player.Forest[1]+";"+javagame.Player.Forest[2]+";"+javagame.Player.Forest[3]);
		    out.println(javagame.Player.Rift[0]+";"+javagame.Player.Rift[1]+";"+javagame.Player.Rift[2]+";"+javagame.Player.Rift[3]);
		    out.close();
		}catch (Exception e){
			System.err.println("Error: " + e.getMessage());
		}
	}
	
	public static void Load1() throws FileNotFoundException{
	    	Scanner in = new Scanner(new File("save1.Gateway"));
	    	//Equipment
	    	String loan1 = in.next();
	    	String[] loaned1 = loan1.split(";");
	    	    javagame.Player.Weapons[0][0] = loaned1[0];
	    	    javagame.Player.Weapons[0][1] = Integer.parseInt(loaned1[1]);
	    	    javagame.Player.Weapons[0][2] = Integer.parseInt(loaned1[2]);
	    	    javagame.Player.Weapons[0][3] = loaned1[3];
	    	    javagame.Player.Weapons[0][4] = Integer.parseInt(loaned1[4]);
	    	    javagame.Player.Weapons[0][5] = Integer.parseInt(loaned1[5]);
	    	    javagame.Player.Weapons[0][6] = Integer.parseInt(loaned1[6]);
	    	    javagame.Player.Weapons[0][7] = Integer.parseInt(loaned1[7]);
	    	    javagame.Player.Weapons[0][8] = Integer.parseInt(loaned1[8]);
	    	    javagame.Player.Weapons[0][9] = Integer.parseInt(loaned1[9]);
	    	    javagame.Player.Weapons[0][10] = loaned1[10];
	    	    System.out.println(loan1);
	    	    System.out.println(javagame.Player.Weapons[0][0] +";"+ javagame.Player.Weapons[0][1] +";"+ javagame.Player.Weapons[0][2] +";"+ javagame.Player.Weapons[0][10]);
	    	String loan2 = in.next();
	    	String[] loaned2 = loan2.split(";");
                javagame.Player.Weapons[1][0] = loaned2[0];
	    	    javagame.Player.Weapons[1][1] = Integer.parseInt(loaned2[1]);
	    	    javagame.Player.Weapons[1][2] = Integer.parseInt(loaned2[2]);
	    	    javagame.Player.Weapons[1][3] = loaned2[3];
	    	    javagame.Player.Weapons[1][4] = Integer.parseInt(loaned2[4]);
	    	    javagame.Player.Weapons[1][5] = Integer.parseInt(loaned2[5]);
	    	    javagame.Player.Weapons[1][6] = Integer.parseInt(loaned2[6]);
	    	    javagame.Player.Weapons[1][7] = Integer.parseInt(loaned2[7]);
	    	    javagame.Player.Weapons[1][8] = Integer.parseInt(loaned2[8]);
	    	    javagame.Player.Weapons[1][9] = Integer.parseInt(loaned2[9]);
	    	    javagame.Player.Weapons[1][10] = loaned2[10];
	    	String loan3 = in.next();
	    	String[] loaned3 = loan3.split(";");
	    	    javagame.Player.Weapons[2][0] = loaned3[0];
	    	    javagame.Player.Weapons[2][1] = Integer.parseInt(loaned3[1]);
	    	    javagame.Player.Weapons[2][2] = Integer.parseInt(loaned3[2]);
	    	    javagame.Player.Weapons[2][3] = loaned3[3];
	    	    javagame.Player.Weapons[2][4] = Integer.parseInt(loaned3[4]);
	    	    javagame.Player.Weapons[2][5] = Integer.parseInt(loaned3[5]);
	    	    javagame.Player.Weapons[2][6] = Integer.parseInt(loaned3[6]);
	    	    javagame.Player.Weapons[2][7] = Integer.parseInt(loaned3[7]);
	    	    javagame.Player.Weapons[2][8] = Integer.parseInt(loaned3[8]);
	    	    javagame.Player.Weapons[2][9] = Integer.parseInt(loaned3[9]);
	    	    javagame.Player.Weapons[2][10] = loaned3[10];
	    	String loan4 = in.next();
	    	String[] loaned4 = loan4.split(";");
	    	    javagame.Player.Weapons[3][0] = loaned4[0];
	    	    javagame.Player.Weapons[3][1] = Integer.parseInt(loaned4[1]);
	    	    javagame.Player.Weapons[3][2] = Integer.parseInt(loaned4[2]);
	    	    javagame.Player.Weapons[3][3] = loaned4[3];
	    	    javagame.Player.Weapons[3][4] = Integer.parseInt(loaned4[4]);
	    	    javagame.Player.Weapons[3][5] = Integer.parseInt(loaned4[5]);
	    	    javagame.Player.Weapons[3][6] = Integer.parseInt(loaned4[6]);
	    	    javagame.Player.Weapons[3][7] = Integer.parseInt(loaned4[7]);
	    	    javagame.Player.Weapons[3][8] = Integer.parseInt(loaned4[8]);
	    	    javagame.Player.Weapons[3][9] = Integer.parseInt(loaned4[9]);
	    	    javagame.Player.Weapons[3][10] = loaned4[10];
	    	String loan5 = in.next();
	    	String[] loaned5 = loan5.split(";");
	    	    javagame.Player.Weapons[4][0] = loaned5[0];
	    	    javagame.Player.Weapons[4][1] = Integer.parseInt(loaned5[1]);
	    	    javagame.Player.Weapons[4][2] = Integer.parseInt(loaned5[2]);
	    	    javagame.Player.Weapons[4][3] = loaned5[3];
	    	    javagame.Player.Weapons[4][4] = Integer.parseInt(loaned5[4]);
	    	    javagame.Player.Weapons[4][5] = Integer.parseInt(loaned5[5]);
	    	    javagame.Player.Weapons[4][6] = Integer.parseInt(loaned5[6]);
	    	    javagame.Player.Weapons[4][7] = Integer.parseInt(loaned5[7]);
	    	    javagame.Player.Weapons[4][8] = Integer.parseInt(loaned5[8]);
	    	    javagame.Player.Weapons[4][9] = Integer.parseInt(loaned5[9]);
	    	    javagame.Player.Weapons[4][10] = loaned5[10];
	    	String loan6 = in.next();
	    	String[] loaned6 = loan6.split(";");
	    	    javagame.Player.Weapons[5][0] = loaned6[0];
	    	    javagame.Player.Weapons[5][1] = Integer.parseInt(loaned6[1]);
	    	    javagame.Player.Weapons[5][2] = Integer.parseInt(loaned6[2]);
	    	    javagame.Player.Weapons[5][3] = loaned6[3];
	    	    javagame.Player.Weapons[5][4] = Integer.parseInt(loaned6[4]);
	    	    javagame.Player.Weapons[5][5] = Integer.parseInt(loaned6[5]);
	    	    javagame.Player.Weapons[5][6] = Integer.parseInt(loaned6[6]);
	    	    javagame.Player.Weapons[5][7] = Integer.parseInt(loaned6[7]);
	    	    javagame.Player.Weapons[5][8] = Integer.parseInt(loaned6[8]);
	    	    javagame.Player.Weapons[5][9] = Integer.parseInt(loaned6[9]);
	    	    javagame.Player.Weapons[5][10] = loaned6[10];
	    	String loan7 = in.next();
	    	String[] loaned7 = loan7.split(";");
	    	    javagame.Player.Weapons[6][0] = loaned7[0];
	    	    javagame.Player.Weapons[6][1] = Integer.parseInt(loaned7[1]);
	    	    javagame.Player.Weapons[6][2] = Integer.parseInt(loaned7[2]);
	    	    javagame.Player.Weapons[6][3] = loaned7[3];
	    	    javagame.Player.Weapons[6][4] = Integer.parseInt(loaned7[4]);
	    	    javagame.Player.Weapons[6][5] = Integer.parseInt(loaned7[5]);
	    	    javagame.Player.Weapons[6][6] = Integer.parseInt(loaned7[6]);
	    	    javagame.Player.Weapons[6][7] = Integer.parseInt(loaned7[7]);
	    	    javagame.Player.Weapons[6][8] = Integer.parseInt(loaned7[8]);
	    	    javagame.Player.Weapons[6][9] = Integer.parseInt(loaned7[9]);
	    	    javagame.Player.Weapons[6][10] = loaned7[10];
	    	String loan8 = in.next();
	    	String[] loaned8 = loan8.split(";");
	    	    javagame.Player.Weapons[7][0] = loaned8[0];
	    	    javagame.Player.Weapons[7][1] = Integer.parseInt(loaned8[1]);
	    	    javagame.Player.Weapons[7][2] = Integer.parseInt(loaned8[2]);
	    	    javagame.Player.Weapons[7][3] = loaned8[3];
	    	    javagame.Player.Weapons[7][4] = Integer.parseInt(loaned8[4]);
	    	    javagame.Player.Weapons[7][5] = Integer.parseInt(loaned8[5]);
	    	    javagame.Player.Weapons[7][6] = Integer.parseInt(loaned8[6]);
	    	    javagame.Player.Weapons[7][7] = Integer.parseInt(loaned8[7]);
	    	    javagame.Player.Weapons[7][8] = Integer.parseInt(loaned8[8]);
	    	    javagame.Player.Weapons[7][9] = Integer.parseInt(loaned8[9]);
	    	    javagame.Player.Weapons[7][10] = loaned8[10];
	    	String loan9 = in.next();
	    	String[] loaned9 = loan9.split(";");
	    	    javagame.Player.Weapons[8][0] = loaned9[0];
	    	    javagame.Player.Weapons[8][1] = Integer.parseInt(loaned9[1]);
	    	    javagame.Player.Weapons[8][2] = Integer.parseInt(loaned9[2]);
	    	    javagame.Player.Weapons[8][3] = loaned9[3];
	    	    javagame.Player.Weapons[8][4] = Integer.parseInt(loaned9[4]);
	    	    javagame.Player.Weapons[8][5] = Integer.parseInt(loaned9[5]);
	    	    javagame.Player.Weapons[8][6] = Integer.parseInt(loaned9[6]);
	    	    javagame.Player.Weapons[8][7] = Integer.parseInt(loaned9[7]);
	    	    javagame.Player.Weapons[8][8] = Integer.parseInt(loaned9[8]);
	    	    javagame.Player.Weapons[8][9] = Integer.parseInt(loaned9[9]);
	    	    javagame.Player.Weapons[8][10] = loaned9[10];
	    	String loan10 = in.next();
	    	String[] loaned10 = loan10.split(";");
	    	    javagame.Player.Weapons[9][0] = loaned10[0];
	    	    javagame.Player.Weapons[9][1] = Integer.parseInt(loaned10[1]);
	    	    javagame.Player.Weapons[9][2] = Integer.parseInt(loaned10[2]);
	    	    javagame.Player.Weapons[9][3] = loaned10[3];
	    	    javagame.Player.Weapons[9][4] = Integer.parseInt(loaned10[4]);
	    	    javagame.Player.Weapons[9][5] = Integer.parseInt(loaned10[5]);
	    	    javagame.Player.Weapons[9][6] = Integer.parseInt(loaned10[6]);
	    	    javagame.Player.Weapons[9][7] = Integer.parseInt(loaned10[7]);
	    	    javagame.Player.Weapons[9][8] = Integer.parseInt(loaned10[8]);
	    	    javagame.Player.Weapons[9][9] = Integer.parseInt(loaned10[9]);
	    	    javagame.Player.Weapons[9][10] = loaned10[10];
	    	String loan11 = in.next();
	    	String[] loaned11 = loan11.split(";");
	    	    javagame.Player.Weapons[10][0] = loaned11[0];
	    	    javagame.Player.Weapons[10][1] = Integer.parseInt(loaned11[1]);
	    	    javagame.Player.Weapons[10][2] = Integer.parseInt(loaned11[2]);
	    	    javagame.Player.Weapons[10][3] = loaned11[3];
	    	    javagame.Player.Weapons[10][4] = Integer.parseInt(loaned11[4]);
	    	    javagame.Player.Weapons[10][5] = Integer.parseInt(loaned11[5]);
	    	    javagame.Player.Weapons[10][6] = Integer.parseInt(loaned11[6]);
	    	    javagame.Player.Weapons[10][7] = Integer.parseInt(loaned11[7]);
	    	    javagame.Player.Weapons[10][8] = Integer.parseInt(loaned11[8]);
	    	    javagame.Player.Weapons[10][9] = Integer.parseInt(loaned11[9]);
	    	    javagame.Player.Weapons[10][10] = loaned11[10];
	    	String loan12 = in.next();
	    	String[] loaned12 = loan12.split(";");
	    	    javagame.Player.Weapons[11][0] = loaned12[0];
	    	    javagame.Player.Weapons[11][1] = Integer.parseInt(loaned12[1]);
	    	    javagame.Player.Weapons[11][2] = Integer.parseInt(loaned12[2]);
	    	    javagame.Player.Weapons[11][3] = loaned12[3];
	    	    javagame.Player.Weapons[11][4] = Integer.parseInt(loaned12[4]);
	    	    javagame.Player.Weapons[11][5] = Integer.parseInt(loaned12[5]);
	    	    javagame.Player.Weapons[11][6] = Integer.parseInt(loaned12[6]);
	    	    javagame.Player.Weapons[11][7] = Integer.parseInt(loaned12[7]);
	    	    javagame.Player.Weapons[11][8] = Integer.parseInt(loaned12[8]);
	    	    javagame.Player.Weapons[11][9] = Integer.parseInt(loaned12[9]);
	    	    javagame.Player.Weapons[11][10] = loaned12[10];
	    	String loan13 = in.next();
	    	String[] loaned13 = loan13.split(";");
	    	    javagame.Player.Weapons[12][0] = loaned13[0];
	    	    javagame.Player.Weapons[12][1] = Integer.parseInt(loaned13[1]);
	    	    javagame.Player.Weapons[12][2] = Integer.parseInt(loaned13[2]);
	    	    javagame.Player.Weapons[12][3] = loaned13[3];
	    	    javagame.Player.Weapons[12][4] = Integer.parseInt(loaned13[4]);
	    	    javagame.Player.Weapons[12][5] = Integer.parseInt(loaned13[5]);
	    	    javagame.Player.Weapons[12][6] = Integer.parseInt(loaned13[6]);
	    	    javagame.Player.Weapons[12][7] = Integer.parseInt(loaned13[7]);
	    	    javagame.Player.Weapons[12][8] = Integer.parseInt(loaned13[8]);
	    	    javagame.Player.Weapons[12][9] = Integer.parseInt(loaned13[9]);
	    	    javagame.Player.Weapons[12][10] = loaned13[10];
	    	String loan14 = in.next();
	    	String[] loaned14 = loan14.split(";");
	    	    javagame.Player.Weapons[13][0] = loaned14[0];
	    	    javagame.Player.Weapons[13][1] = Integer.parseInt(loaned14[1]);
	    	    javagame.Player.Weapons[13][2] = Integer.parseInt(loaned14[2]);
	    	    javagame.Player.Weapons[13][3] = loaned14[3];
	    	    javagame.Player.Weapons[13][4] = Integer.parseInt(loaned14[4]);
	    	    javagame.Player.Weapons[13][5] = Integer.parseInt(loaned14[5]);
	    	    javagame.Player.Weapons[13][6] = Integer.parseInt(loaned14[6]);
	    	    javagame.Player.Weapons[13][7] = Integer.parseInt(loaned14[7]);
	    	    javagame.Player.Weapons[13][8] = Integer.parseInt(loaned14[8]);
	    	    javagame.Player.Weapons[13][9] = Integer.parseInt(loaned14[9]);
	    	    javagame.Player.Weapons[13][10] = loaned14[10];
	    	String loan15 = in.next();
	    	String[] loaned15 = loan15.split(";");
	    	    javagame.Player.Weapons[14][0] = loaned15[0];
	    	    javagame.Player.Weapons[14][1] = Integer.parseInt(loaned15[1]);
	    	    javagame.Player.Weapons[14][2] = Integer.parseInt(loaned15[2]);
	    	    javagame.Player.Weapons[14][3] = loaned15[3];
	    	    javagame.Player.Weapons[14][4] = Integer.parseInt(loaned15[4]);
	    	    javagame.Player.Weapons[14][5] = Integer.parseInt(loaned15[5]);
	    	    javagame.Player.Weapons[14][6] = Integer.parseInt(loaned15[6]);
	    	    javagame.Player.Weapons[14][7] = Integer.parseInt(loaned15[7]);
	    	    javagame.Player.Weapons[14][8] = Integer.parseInt(loaned15[8]);
	    	    javagame.Player.Weapons[14][9] = Integer.parseInt(loaned15[9]);
	    	    javagame.Player.Weapons[14][10] = loaned15[10];
	    	String loan16 = in.next();
	    	String[] loaned16 = loan16.split(";");
	    	    javagame.Player.Weapons[15][0] = loaned16[0];
	    	    javagame.Player.Weapons[15][1] = Integer.parseInt(loaned16[1]);
	    	    javagame.Player.Weapons[15][2] = Integer.parseInt(loaned16[2]);
	    	    javagame.Player.Weapons[15][3] = loaned16[3];
	    	    javagame.Player.Weapons[15][4] = Integer.parseInt(loaned16[4]);
	    	    javagame.Player.Weapons[15][5] = Integer.parseInt(loaned16[5]);
	    	    javagame.Player.Weapons[15][6] = Integer.parseInt(loaned16[6]);
	    	    javagame.Player.Weapons[15][7] = Integer.parseInt(loaned16[7]);
	    	    javagame.Player.Weapons[15][8] = Integer.parseInt(loaned16[8]);
	    	    javagame.Player.Weapons[15][9] = Integer.parseInt(loaned16[9]);
	    	    javagame.Player.Weapons[15][10] = loaned16[10];
	    	String loan17 = in.next();
	    	String[] loaned17 = loan17.split(";");
	    	    javagame.Player.Weapons[16][0] = loaned17[0];
	    	    javagame.Player.Weapons[16][1] = Integer.parseInt(loaned17[1]);
	    	    javagame.Player.Weapons[16][2] = Integer.parseInt(loaned17[2]);
	    	    javagame.Player.Weapons[16][3] = loaned17[3];
	    	    javagame.Player.Weapons[16][4] = Integer.parseInt(loaned17[4]);
	    	    javagame.Player.Weapons[16][5] = Integer.parseInt(loaned17[5]);
	    	    javagame.Player.Weapons[16][6] = Integer.parseInt(loaned17[6]);
	    	    javagame.Player.Weapons[16][7] = Integer.parseInt(loaned17[7]);
	    	    javagame.Player.Weapons[16][8] = Integer.parseInt(loaned17[8]);
	    	    javagame.Player.Weapons[16][9] = Integer.parseInt(loaned17[9]);
	    	    javagame.Player.Weapons[16][10] = loaned17[10];
	    	String loan18 = in.next();
	    	String[] loaned18 = loan18.split(";");
	    	    javagame.Player.Weapons[17][0] = loaned18[0];
	    	    javagame.Player.Weapons[17][1] = Integer.parseInt(loaned18[1]);
	    	    javagame.Player.Weapons[17][2] = Integer.parseInt(loaned18[2]);
	    	    javagame.Player.Weapons[17][3] = loaned18[3];
	    	    javagame.Player.Weapons[17][4] = Integer.parseInt(loaned18[4]);
	    	    javagame.Player.Weapons[17][5] = Integer.parseInt(loaned18[5]);
	    	    javagame.Player.Weapons[17][6] = Integer.parseInt(loaned18[6]);
	    	    javagame.Player.Weapons[17][7] = Integer.parseInt(loaned18[7]);
	    	    javagame.Player.Weapons[17][8] = Integer.parseInt(loaned18[8]);
	    	    javagame.Player.Weapons[17][9] = Integer.parseInt(loaned18[9]);
	    	    javagame.Player.Weapons[17][10] = loaned18[10];
	    	String loan19 = in.next();
	    	String[] loaned19 = loan19.split(";");
	    	    javagame.Player.Weapons[18][0] = loaned19[0];
	    	    javagame.Player.Weapons[18][1] = Integer.parseInt(loaned19[1]);
	    	    javagame.Player.Weapons[18][2] = Integer.parseInt(loaned19[2]);
	    	    javagame.Player.Weapons[18][3] = loaned19[3];
	    	    javagame.Player.Weapons[18][4] = Integer.parseInt(loaned19[4]);
	    	    javagame.Player.Weapons[18][5] = Integer.parseInt(loaned19[5]);
	    	    javagame.Player.Weapons[18][6] = Integer.parseInt(loaned19[6]);
	    	    javagame.Player.Weapons[18][7] = Integer.parseInt(loaned19[7]);
	    	    javagame.Player.Weapons[18][8] = Integer.parseInt(loaned19[8]);
	    	    javagame.Player.Weapons[18][9] = Integer.parseInt(loaned19[9]);
	    	    javagame.Player.Weapons[18][10] = loaned19[10];
	    	String loan20 = in.next();
	    	String[] loaned20 = loan20.split(";");
	    	    javagame.Player.Weapons[19][0] = loaned20[0];
	    	    javagame.Player.Weapons[19][1] = Integer.parseInt(loaned20[1]);
	    	    javagame.Player.Weapons[19][2] = Integer.parseInt(loaned20[2]);
	    	    javagame.Player.Weapons[19][3] = loaned20[3];
	    	    javagame.Player.Weapons[19][4] = Integer.parseInt(loaned20[4]);
	    	    javagame.Player.Weapons[19][5] = Integer.parseInt(loaned20[5]);
	    	    javagame.Player.Weapons[19][6] = Integer.parseInt(loaned20[6]);
	    	    javagame.Player.Weapons[19][7] = Integer.parseInt(loaned20[7]);
	    	    javagame.Player.Weapons[19][8] = Integer.parseInt(loaned20[8]);
	    	    javagame.Player.Weapons[19][9] = Integer.parseInt(loaned20[9]);
	    	    javagame.Player.Weapons[19][10] = loaned20[10];
	    	String loan21 = in.next();
	    	String[] loaned21 = loan21.split(";");
	    	    javagame.Player.Weapons[20][0] = loaned21[0];
	    	    javagame.Player.Weapons[20][1] = Integer.parseInt(loaned21[1]);
	    	    javagame.Player.Weapons[20][2] = Integer.parseInt(loaned21[2]);
	    	    javagame.Player.Weapons[20][3] = loaned21[3];
	    	    javagame.Player.Weapons[20][4] = Integer.parseInt(loaned21[4]);
	    	    javagame.Player.Weapons[20][5] = Integer.parseInt(loaned21[5]);
	    	    javagame.Player.Weapons[20][6] = Integer.parseInt(loaned21[6]);
	    	    javagame.Player.Weapons[20][7] = Integer.parseInt(loaned21[7]);
	    	    javagame.Player.Weapons[20][8] = Integer.parseInt(loaned21[8]);
	    	    javagame.Player.Weapons[20][9] = Integer.parseInt(loaned21[9]);
	    	    javagame.Player.Weapons[20][10] = loaned21[10];
	    	String loan22 = in.next();
	    	String[] loaned22 = loan22.split(";");
	    	    javagame.Player.Weapons[21][0] = loaned22[0];
	    	    javagame.Player.Weapons[21][1] = Integer.parseInt(loaned22[1]);
	    	    javagame.Player.Weapons[21][2] = Integer.parseInt(loaned22[2]);
	    	    javagame.Player.Weapons[21][3] = loaned22[3];
	    	    javagame.Player.Weapons[21][4] = Integer.parseInt(loaned22[4]);
	    	    javagame.Player.Weapons[21][5] = Integer.parseInt(loaned22[5]);
	    	    javagame.Player.Weapons[21][6] = Integer.parseInt(loaned22[6]);
	    	    javagame.Player.Weapons[21][7] = Integer.parseInt(loaned22[7]);
	    	    javagame.Player.Weapons[21][8] = Integer.parseInt(loaned22[8]);
	    	    javagame.Player.Weapons[21][9] = Integer.parseInt(loaned22[9]);
	    	    javagame.Player.Weapons[21][10] = loaned22[10];
	    	String loan23 = in.next();
	    	String[] loaned23 = loan23.split(";");
	    	    javagame.Player.Weapons[22][0] = loaned23[0];
	    	    javagame.Player.Weapons[22][1] = Integer.parseInt(loaned23[1]);
	    	    javagame.Player.Weapons[22][2] = Integer.parseInt(loaned23[2]);
	    	    javagame.Player.Weapons[22][3] = loaned23[3];
	    	    javagame.Player.Weapons[22][4] = Integer.parseInt(loaned23[4]);
	    	    javagame.Player.Weapons[22][5] = Integer.parseInt(loaned23[5]);
	    	    javagame.Player.Weapons[22][6] = Integer.parseInt(loaned23[6]);
	    	    javagame.Player.Weapons[22][7] = Integer.parseInt(loaned23[7]);
	    	    javagame.Player.Weapons[22][8] = Integer.parseInt(loaned23[8]);
	    	    javagame.Player.Weapons[22][9] = Integer.parseInt(loaned23[9]);
	    	    javagame.Player.Weapons[22][10] = loaned23[10];
	    	String loan24 = in.next();
	    	String[] loaned24 = loan24.split(";");
	    	    javagame.Player.Weapons[23][0] = loaned24[0];
	    	    javagame.Player.Weapons[23][1] = Integer.parseInt(loaned24[1]);
	    	    javagame.Player.Weapons[23][2] = Integer.parseInt(loaned24[2]);
	    	    javagame.Player.Weapons[23][3] = loaned24[3];
	    	    javagame.Player.Weapons[23][4] = Integer.parseInt(loaned24[4]);
	    	    javagame.Player.Weapons[23][5] = Integer.parseInt(loaned24[5]);
	    	    javagame.Player.Weapons[23][6] = Integer.parseInt(loaned24[6]);
	    	    javagame.Player.Weapons[23][7] = Integer.parseInt(loaned24[7]);
	    	    javagame.Player.Weapons[23][8] = Integer.parseInt(loaned24[8]);
	    	    javagame.Player.Weapons[23][9] = Integer.parseInt(loaned24[9]);
	    	    javagame.Player.Weapons[23][10] = loaned24[10];
	    	String loan25 = in.next();
	    	String[] loaned25 = loan25.split(";");
	    	    javagame.Player.Weapons[24][0] = loaned25[0];
	    	    javagame.Player.Weapons[24][1] = Integer.parseInt(loaned25[1]);
	    	    javagame.Player.Weapons[24][2] = Integer.parseInt(loaned25[2]);
	    	    javagame.Player.Weapons[24][3] = loaned25[3];
	    	    javagame.Player.Weapons[24][4] = Integer.parseInt(loaned25[4]);
	    	    javagame.Player.Weapons[24][5] = Integer.parseInt(loaned25[5]);
	    	    javagame.Player.Weapons[24][6] = Integer.parseInt(loaned25[6]);
	    	    javagame.Player.Weapons[24][7] = Integer.parseInt(loaned25[7]);
	    	    javagame.Player.Weapons[24][8] = Integer.parseInt(loaned25[8]);
	    	    javagame.Player.Weapons[24][9] = Integer.parseInt(loaned25[9]);
	    	    javagame.Player.Weapons[24][10] = loaned25[10];
	    	String loan26 = in.next();
		  	String[] loaned26 = loan26.split(";");
		   	    javagame.Player.equipped_weapon[0] = loaned26[0];
		   	    javagame.Player.equipped_weapon[1] = Integer.parseInt(loaned26[1]);
	    	    javagame.Player.equipped_weapon[2] = Integer.parseInt(loaned26[2]);
	    	    javagame.Player.equipped_weapon[3] = loaned26[3];
		    	javagame.Player.equipped_weapon[4] = Integer.parseInt(loaned26[4]);
		        javagame.Player.equipped_weapon[5] = Integer.parseInt(loaned26[5]);
		   	    javagame.Player.equipped_weapon[6] = Integer.parseInt(loaned26[6]);
		   	    javagame.Player.equipped_weapon[7] = Integer.parseInt(loaned26[7]);
		   	    javagame.Player.equipped_weapon[8] = Integer.parseInt(loaned26[8]);
		   	    javagame.Player.equipped_weapon[9] = Integer.parseInt(loaned26[9]);
	    	    javagame.Player.equipped_weapon[10] = loaned26[10];
	    	//Map Items On/Off
	    	javagame.Player.silver_message = Boolean.parseBoolean(in.next());
	    	javagame.Player.boss_1 = Boolean.parseBoolean(in.next());
	    	//Player Stats
	    	javagame.Player.save_location = Integer.parseInt(in.next());
	    	javagame.Player.money = Integer.parseInt(in.next());
	    	javagame.Player.hp = Double.parseDouble(in.next());
	    	javagame.Player.max_hp = Double.parseDouble(in.next());
	    	javagame.Player.manap = Double.parseDouble(in.next());
	    	javagame.Player.max_manap = Double.parseDouble(in.next());
	    	javagame.Player.lvl = Integer.parseInt(in.next());
	    	javagame.Player.xp = Integer.parseInt(in.next());
	    	javagame.Player.silver_horn = Boolean.parseBoolean(in.next());
	    	javagame.Player.clas = in.next();
	    	javagame.Player.room = Integer.parseInt(in.next());
	    	javagame.Player.name = in.next();
	    	javagame.Player.regen_points = Integer.parseInt(in.next());
	    	javagame.Player.ocean_gem = Integer.parseInt(in.next());
	    	javagame.Player.weapon_ID = Integer.parseInt(in.next());
	    	//potions
	    	javagame.Player.lesser_potions = Integer.parseInt(in.next());
	    	javagame.Player.potions = Integer.parseInt(in.next());
	    	javagame.Player.greater_potions = Integer.parseInt(in.next());
	    	javagame.Player.lesser_mana = Integer.parseInt(in.next());
	    	javagame.Player.mana = Integer.parseInt(in.next());
	    	javagame.Player.greater_mana = Integer.parseInt(in.next());
	    	javagame.Player.lesser_regen = Integer.parseInt(in.next());
	    	javagame.Player.regen = Integer.parseInt(in.next());
	    	javagame.Player.greater_regen = Integer.parseInt(in.next());
	    	javagame.Player.HMR = Integer.parseInt(in.next());
	    	//Coordinates
	    	String stat = in.next();
	    	String[] stats = stat.split(";");
	    	javagame.Player.area_1[0] = Float.parseFloat(stats[0]);javagame.Player.area_1[1] = Float.parseFloat(stats[1]);javagame.Player.area_1[2] = Float.parseFloat(stats[2]);javagame.Player.area_1[3] = Float.parseFloat(stats[3]);
	    	String stat1 = in.next();
	    	String[] stats1 = stat1.split(";");
	    	javagame.Player.area_2[0] = Float.parseFloat(stats1[0]);javagame.Player.area_2[1] = Float.parseFloat(stats1[1]);javagame.Player.area_2[2] = Float.parseFloat(stats1[2]);javagame.Player.area_2[3] = Float.parseFloat(stats1[3]);
	    	String stat2 = in.next();
	    	String[] stats2 = stat2.split(";");
	    	javagame.Player.area_3[0] = Float.parseFloat(stats2[0]);javagame.Player.area_3[1] = Float.parseFloat(stats2[1]);javagame.Player.area_3[2] = Float.parseFloat(stats2[2]);javagame.Player.area_3[3] = Float.parseFloat(stats2[3]);
	    	String stat3 = in.next();
	    	String[] stats3 = stat3.split(";");
	    	javagame.Player.area_5[0] = Float.parseFloat(stats3[0]);javagame.Player.area_5[1] = Float.parseFloat(stats3[1]);javagame.Player.area_5[2] = Float.parseFloat(stats3[2]);javagame.Player.area_5[3] = Float.parseFloat(stats3[3]);
	    	String stat4 = in.next();
	    	String[] stats4 = stat4.split(";");
	    	javagame.Player.cave_1[0] = Float.parseFloat(stats4[0]);javagame.Player.cave_1[1] = Float.parseFloat(stats4[1]);javagame.Player.cave_1[2] = Float.parseFloat(stats4[2]);javagame.Player.cave_1[3] = Float.parseFloat(stats4[3]);
	    	String stat5 = in.next();
	    	String[] stats5 = stat5.split(";");
	    	javagame.Player.Alchemist[0] = Float.parseFloat(stats5[0]);javagame.Player.Alchemist[1] = Float.parseFloat(stats5[1]);javagame.Player.Alchemist[2] = Float.parseFloat(stats5[2]);javagame.Player.Alchemist[3] = Float.parseFloat(stats5[3]);
	    	String stat6 = in.next();
	    	String[] stats6 = stat6.split(";");
	    	javagame.Player.Beer_Hall[0] = Float.parseFloat(stats6[0]);javagame.Player.Beer_Hall[1] = Float.parseFloat(stats6[1]);javagame.Player.Beer_Hall[2] = Float.parseFloat(stats6[2]);javagame.Player.Beer_Hall[3] = Float.parseFloat(stats6[3]);
	    	String stat7 = in.next();
	    	String[] stats7 = stat7.split(";");
	    	javagame.Player.Forest[0] = Float.parseFloat(stats7[0]);javagame.Player.Forest[1] = Float.parseFloat(stats7[1]);javagame.Player.Forest[2] = Float.parseFloat(stats7[2]);javagame.Player.Forest[3] = Float.parseFloat(stats7[3]);
	    	String stat8 = in.next();
	    	String[] stats8 = stat8.split(";");
	    	javagame.Player.Rift[0] = Float.parseFloat(stats8[0]);javagame.Player.Rift[1] = Float.parseFloat(stats8[1]);javagame.Player.Rift[2] = Float.parseFloat(stats8[2]);javagame.Player.Rift[3] = Float.parseFloat(stats8[3]);
	    	in.close();
    }
	
	public static void Load2() throws FileNotFoundException{
    	Scanner in = new Scanner(new File("save2.Gateway"));
    	//Equipment
    	String loan1 = in.next();
    	String[] loaned1 = loan1.split(";");
    	    javagame.Player.Weapons[0][0] = loaned1[0];
    	    javagame.Player.Weapons[0][1] = Integer.parseInt(loaned1[1]);
    	    javagame.Player.Weapons[0][2] = Integer.parseInt(loaned1[2]);
    	    javagame.Player.Weapons[0][3] = loaned1[3];
    	    javagame.Player.Weapons[0][4] = Integer.parseInt(loaned1[4]);
    	    javagame.Player.Weapons[0][5] = Integer.parseInt(loaned1[5]);
    	    javagame.Player.Weapons[0][6] = Integer.parseInt(loaned1[6]);
    	    javagame.Player.Weapons[0][7] = Integer.parseInt(loaned1[7]);
    	    javagame.Player.Weapons[0][8] = Integer.parseInt(loaned1[8]);
    	    javagame.Player.Weapons[0][9] = Integer.parseInt(loaned1[9]);
    	    javagame.Player.Weapons[0][10] = loaned1[10];
    	    System.out.println(loan1);
    	    System.out.println(javagame.Player.Weapons[0][0] +";"+ javagame.Player.Weapons[0][1] +";"+ javagame.Player.Weapons[0][2] +";"+ javagame.Player.Weapons[0][10]);
    	String loan2 = in.next();
    	String[] loaned2 = loan2.split(";");
            javagame.Player.Weapons[1][0] = loaned2[0];
    	    javagame.Player.Weapons[1][1] = Integer.parseInt(loaned2[1]);
    	    javagame.Player.Weapons[1][2] = Integer.parseInt(loaned2[2]);
    	    javagame.Player.Weapons[1][3] = loaned2[3];
    	    javagame.Player.Weapons[1][4] = Integer.parseInt(loaned2[4]);
    	    javagame.Player.Weapons[1][5] = Integer.parseInt(loaned2[5]);
    	    javagame.Player.Weapons[1][6] = Integer.parseInt(loaned2[6]);
    	    javagame.Player.Weapons[1][7] = Integer.parseInt(loaned2[7]);
    	    javagame.Player.Weapons[1][8] = Integer.parseInt(loaned2[8]);
    	    javagame.Player.Weapons[1][9] = Integer.parseInt(loaned2[9]);
    	    javagame.Player.Weapons[1][10] = loaned2[10];
    	String loan3 = in.next();
    	String[] loaned3 = loan3.split(";");
    	    javagame.Player.Weapons[2][0] = loaned3[0];
    	    javagame.Player.Weapons[2][1] = Integer.parseInt(loaned3[1]);
    	    javagame.Player.Weapons[2][2] = Integer.parseInt(loaned3[2]);
    	    javagame.Player.Weapons[2][3] = loaned3[3];
    	    javagame.Player.Weapons[2][4] = Integer.parseInt(loaned3[4]);
    	    javagame.Player.Weapons[2][5] = Integer.parseInt(loaned3[5]);
    	    javagame.Player.Weapons[2][6] = Integer.parseInt(loaned3[6]);
    	    javagame.Player.Weapons[2][7] = Integer.parseInt(loaned3[7]);
    	    javagame.Player.Weapons[2][8] = Integer.parseInt(loaned3[8]);
    	    javagame.Player.Weapons[2][9] = Integer.parseInt(loaned3[9]);
    	    javagame.Player.Weapons[2][10] = loaned3[10];
    	String loan4 = in.next();
    	String[] loaned4 = loan4.split(";");
    	    javagame.Player.Weapons[3][0] = loaned4[0];
    	    javagame.Player.Weapons[3][1] = Integer.parseInt(loaned4[1]);
    	    javagame.Player.Weapons[3][2] = Integer.parseInt(loaned4[2]);
    	    javagame.Player.Weapons[3][3] = loaned4[3];
    	    javagame.Player.Weapons[3][4] = Integer.parseInt(loaned4[4]);
    	    javagame.Player.Weapons[3][5] = Integer.parseInt(loaned4[5]);
    	    javagame.Player.Weapons[3][6] = Integer.parseInt(loaned4[6]);
    	    javagame.Player.Weapons[3][7] = Integer.parseInt(loaned4[7]);
    	    javagame.Player.Weapons[3][8] = Integer.parseInt(loaned4[8]);
    	    javagame.Player.Weapons[3][9] = Integer.parseInt(loaned4[9]);
    	    javagame.Player.Weapons[3][10] = loaned4[10];
    	String loan5 = in.next();
    	String[] loaned5 = loan5.split(";");
    	    javagame.Player.Weapons[4][0] = loaned5[0];
    	    javagame.Player.Weapons[4][1] = Integer.parseInt(loaned5[1]);
    	    javagame.Player.Weapons[4][2] = Integer.parseInt(loaned5[2]);
    	    javagame.Player.Weapons[4][3] = loaned5[3];
    	    javagame.Player.Weapons[4][4] = Integer.parseInt(loaned5[4]);
    	    javagame.Player.Weapons[4][5] = Integer.parseInt(loaned5[5]);
    	    javagame.Player.Weapons[4][6] = Integer.parseInt(loaned5[6]);
    	    javagame.Player.Weapons[4][7] = Integer.parseInt(loaned5[7]);
    	    javagame.Player.Weapons[4][8] = Integer.parseInt(loaned5[8]);
    	    javagame.Player.Weapons[4][9] = Integer.parseInt(loaned5[9]);
    	    javagame.Player.Weapons[4][10] = loaned5[10];
    	String loan6 = in.next();
    	String[] loaned6 = loan6.split(";");
    	    javagame.Player.Weapons[5][0] = loaned6[0];
    	    javagame.Player.Weapons[5][1] = Integer.parseInt(loaned6[1]);
    	    javagame.Player.Weapons[5][2] = Integer.parseInt(loaned6[2]);
    	    javagame.Player.Weapons[5][3] = loaned6[3];
    	    javagame.Player.Weapons[5][4] = Integer.parseInt(loaned6[4]);
    	    javagame.Player.Weapons[5][5] = Integer.parseInt(loaned6[5]);
    	    javagame.Player.Weapons[5][6] = Integer.parseInt(loaned6[6]);
    	    javagame.Player.Weapons[5][7] = Integer.parseInt(loaned6[7]);
    	    javagame.Player.Weapons[5][8] = Integer.parseInt(loaned6[8]);
    	    javagame.Player.Weapons[5][9] = Integer.parseInt(loaned6[9]);
    	    javagame.Player.Weapons[5][10] = loaned6[10];
    	String loan7 = in.next();
    	String[] loaned7 = loan7.split(";");
    	    javagame.Player.Weapons[6][0] = loaned7[0];
    	    javagame.Player.Weapons[6][1] = Integer.parseInt(loaned7[1]);
    	    javagame.Player.Weapons[6][2] = Integer.parseInt(loaned7[2]);
    	    javagame.Player.Weapons[6][3] = loaned7[3];
    	    javagame.Player.Weapons[6][4] = Integer.parseInt(loaned7[4]);
    	    javagame.Player.Weapons[6][5] = Integer.parseInt(loaned7[5]);
    	    javagame.Player.Weapons[6][6] = Integer.parseInt(loaned7[6]);
    	    javagame.Player.Weapons[6][7] = Integer.parseInt(loaned7[7]);
    	    javagame.Player.Weapons[6][8] = Integer.parseInt(loaned7[8]);
    	    javagame.Player.Weapons[6][9] = Integer.parseInt(loaned7[9]);
    	    javagame.Player.Weapons[6][10] = loaned7[10];
    	String loan8 = in.next();
    	String[] loaned8 = loan8.split(";");
    	    javagame.Player.Weapons[7][0] = loaned8[0];
    	    javagame.Player.Weapons[7][1] = Integer.parseInt(loaned8[1]);
    	    javagame.Player.Weapons[7][2] = Integer.parseInt(loaned8[2]);
    	    javagame.Player.Weapons[7][3] = loaned8[3];
    	    javagame.Player.Weapons[7][4] = Integer.parseInt(loaned8[4]);
    	    javagame.Player.Weapons[7][5] = Integer.parseInt(loaned8[5]);
    	    javagame.Player.Weapons[7][6] = Integer.parseInt(loaned8[6]);
    	    javagame.Player.Weapons[7][7] = Integer.parseInt(loaned8[7]);
    	    javagame.Player.Weapons[7][8] = Integer.parseInt(loaned8[8]);
    	    javagame.Player.Weapons[7][9] = Integer.parseInt(loaned8[9]);
    	    javagame.Player.Weapons[7][10] = loaned8[10];
    	String loan9 = in.next();
    	String[] loaned9 = loan9.split(";");
    	    javagame.Player.Weapons[8][0] = loaned9[0];
    	    javagame.Player.Weapons[8][1] = Integer.parseInt(loaned9[1]);
    	    javagame.Player.Weapons[8][2] = Integer.parseInt(loaned9[2]);
    	    javagame.Player.Weapons[8][3] = loaned9[3];
    	    javagame.Player.Weapons[8][4] = Integer.parseInt(loaned9[4]);
    	    javagame.Player.Weapons[8][5] = Integer.parseInt(loaned9[5]);
    	    javagame.Player.Weapons[8][6] = Integer.parseInt(loaned9[6]);
    	    javagame.Player.Weapons[8][7] = Integer.parseInt(loaned9[7]);
    	    javagame.Player.Weapons[8][8] = Integer.parseInt(loaned9[8]);
    	    javagame.Player.Weapons[8][9] = Integer.parseInt(loaned9[9]);
    	    javagame.Player.Weapons[8][10] = loaned9[10];
    	String loan10 = in.next();
    	String[] loaned10 = loan10.split(";");
    	    javagame.Player.Weapons[9][0] = loaned10[0];
    	    javagame.Player.Weapons[9][1] = Integer.parseInt(loaned10[1]);
    	    javagame.Player.Weapons[9][2] = Integer.parseInt(loaned10[2]);
    	    javagame.Player.Weapons[9][3] = loaned10[3];
    	    javagame.Player.Weapons[9][4] = Integer.parseInt(loaned10[4]);
    	    javagame.Player.Weapons[9][5] = Integer.parseInt(loaned10[5]);
    	    javagame.Player.Weapons[9][6] = Integer.parseInt(loaned10[6]);
    	    javagame.Player.Weapons[9][7] = Integer.parseInt(loaned10[7]);
    	    javagame.Player.Weapons[9][8] = Integer.parseInt(loaned10[8]);
    	    javagame.Player.Weapons[9][9] = Integer.parseInt(loaned10[9]);
    	    javagame.Player.Weapons[9][10] = loaned10[10];
    	String loan11 = in.next();
    	String[] loaned11 = loan11.split(";");
    	    javagame.Player.Weapons[10][0] = loaned11[0];
    	    javagame.Player.Weapons[10][1] = Integer.parseInt(loaned11[1]);
    	    javagame.Player.Weapons[10][2] = Integer.parseInt(loaned11[2]);
    	    javagame.Player.Weapons[10][3] = loaned11[3];
    	    javagame.Player.Weapons[10][4] = Integer.parseInt(loaned11[4]);
    	    javagame.Player.Weapons[10][5] = Integer.parseInt(loaned11[5]);
    	    javagame.Player.Weapons[10][6] = Integer.parseInt(loaned11[6]);
    	    javagame.Player.Weapons[10][7] = Integer.parseInt(loaned11[7]);
    	    javagame.Player.Weapons[10][8] = Integer.parseInt(loaned11[8]);
    	    javagame.Player.Weapons[10][9] = Integer.parseInt(loaned11[9]);
    	    javagame.Player.Weapons[10][10] = loaned11[10];
    	String loan12 = in.next();
    	String[] loaned12 = loan12.split(";");
    	    javagame.Player.Weapons[11][0] = loaned12[0];
    	    javagame.Player.Weapons[11][1] = Integer.parseInt(loaned12[1]);
    	    javagame.Player.Weapons[11][2] = Integer.parseInt(loaned12[2]);
    	    javagame.Player.Weapons[11][3] = loaned12[3];
    	    javagame.Player.Weapons[11][4] = Integer.parseInt(loaned12[4]);
    	    javagame.Player.Weapons[11][5] = Integer.parseInt(loaned12[5]);
    	    javagame.Player.Weapons[11][6] = Integer.parseInt(loaned12[6]);
    	    javagame.Player.Weapons[11][7] = Integer.parseInt(loaned12[7]);
    	    javagame.Player.Weapons[11][8] = Integer.parseInt(loaned12[8]);
    	    javagame.Player.Weapons[11][9] = Integer.parseInt(loaned12[9]);
    	    javagame.Player.Weapons[11][10] = loaned12[10];
    	String loan13 = in.next();
    	String[] loaned13 = loan13.split(";");
    	    javagame.Player.Weapons[12][0] = loaned13[0];
    	    javagame.Player.Weapons[12][1] = Integer.parseInt(loaned13[1]);
    	    javagame.Player.Weapons[12][2] = Integer.parseInt(loaned13[2]);
    	    javagame.Player.Weapons[12][3] = loaned13[3];
    	    javagame.Player.Weapons[12][4] = Integer.parseInt(loaned13[4]);
    	    javagame.Player.Weapons[12][5] = Integer.parseInt(loaned13[5]);
    	    javagame.Player.Weapons[12][6] = Integer.parseInt(loaned13[6]);
    	    javagame.Player.Weapons[12][7] = Integer.parseInt(loaned13[7]);
    	    javagame.Player.Weapons[12][8] = Integer.parseInt(loaned13[8]);
    	    javagame.Player.Weapons[12][9] = Integer.parseInt(loaned13[9]);
    	    javagame.Player.Weapons[12][10] = loaned13[10];
    	String loan14 = in.next();
    	String[] loaned14 = loan14.split(";");
    	    javagame.Player.Weapons[13][0] = loaned14[0];
    	    javagame.Player.Weapons[13][1] = Integer.parseInt(loaned14[1]);
    	    javagame.Player.Weapons[13][2] = Integer.parseInt(loaned14[2]);
    	    javagame.Player.Weapons[13][3] = loaned14[3];
    	    javagame.Player.Weapons[13][4] = Integer.parseInt(loaned14[4]);
    	    javagame.Player.Weapons[13][5] = Integer.parseInt(loaned14[5]);
    	    javagame.Player.Weapons[13][6] = Integer.parseInt(loaned14[6]);
    	    javagame.Player.Weapons[13][7] = Integer.parseInt(loaned14[7]);
    	    javagame.Player.Weapons[13][8] = Integer.parseInt(loaned14[8]);
    	    javagame.Player.Weapons[13][9] = Integer.parseInt(loaned14[9]);
    	    javagame.Player.Weapons[13][10] = loaned14[10];
    	String loan15 = in.next();
    	String[] loaned15 = loan15.split(";");
    	    javagame.Player.Weapons[14][0] = loaned15[0];
    	    javagame.Player.Weapons[14][1] = Integer.parseInt(loaned15[1]);
    	    javagame.Player.Weapons[14][2] = Integer.parseInt(loaned15[2]);
    	    javagame.Player.Weapons[14][3] = loaned15[3];
    	    javagame.Player.Weapons[14][4] = Integer.parseInt(loaned15[4]);
    	    javagame.Player.Weapons[14][5] = Integer.parseInt(loaned15[5]);
    	    javagame.Player.Weapons[14][6] = Integer.parseInt(loaned15[6]);
    	    javagame.Player.Weapons[14][7] = Integer.parseInt(loaned15[7]);
    	    javagame.Player.Weapons[14][8] = Integer.parseInt(loaned15[8]);
    	    javagame.Player.Weapons[14][9] = Integer.parseInt(loaned15[9]);
    	    javagame.Player.Weapons[14][10] = loaned15[10];
    	String loan16 = in.next();
    	String[] loaned16 = loan16.split(";");
    	    javagame.Player.Weapons[15][0] = loaned16[0];
    	    javagame.Player.Weapons[15][1] = Integer.parseInt(loaned16[1]);
    	    javagame.Player.Weapons[15][2] = Integer.parseInt(loaned16[2]);
    	    javagame.Player.Weapons[15][3] = loaned16[3];
    	    javagame.Player.Weapons[15][4] = Integer.parseInt(loaned16[4]);
    	    javagame.Player.Weapons[15][5] = Integer.parseInt(loaned16[5]);
    	    javagame.Player.Weapons[15][6] = Integer.parseInt(loaned16[6]);
    	    javagame.Player.Weapons[15][7] = Integer.parseInt(loaned16[7]);
    	    javagame.Player.Weapons[15][8] = Integer.parseInt(loaned16[8]);
    	    javagame.Player.Weapons[15][9] = Integer.parseInt(loaned16[9]);
    	    javagame.Player.Weapons[15][10] = loaned16[10];
    	String loan17 = in.next();
    	String[] loaned17 = loan17.split(";");
    	    javagame.Player.Weapons[16][0] = loaned17[0];
    	    javagame.Player.Weapons[16][1] = Integer.parseInt(loaned17[1]);
    	    javagame.Player.Weapons[16][2] = Integer.parseInt(loaned17[2]);
    	    javagame.Player.Weapons[16][3] = loaned17[3];
    	    javagame.Player.Weapons[16][4] = Integer.parseInt(loaned17[4]);
    	    javagame.Player.Weapons[16][5] = Integer.parseInt(loaned17[5]);
    	    javagame.Player.Weapons[16][6] = Integer.parseInt(loaned17[6]);
    	    javagame.Player.Weapons[16][7] = Integer.parseInt(loaned17[7]);
    	    javagame.Player.Weapons[16][8] = Integer.parseInt(loaned17[8]);
    	    javagame.Player.Weapons[16][9] = Integer.parseInt(loaned17[9]);
    	    javagame.Player.Weapons[16][10] = loaned17[10];
    	String loan18 = in.next();
    	String[] loaned18 = loan18.split(";");
    	    javagame.Player.Weapons[17][0] = loaned18[0];
    	    javagame.Player.Weapons[17][1] = Integer.parseInt(loaned18[1]);
    	    javagame.Player.Weapons[17][2] = Integer.parseInt(loaned18[2]);
    	    javagame.Player.Weapons[17][3] = loaned18[3];
    	    javagame.Player.Weapons[17][4] = Integer.parseInt(loaned18[4]);
    	    javagame.Player.Weapons[17][5] = Integer.parseInt(loaned18[5]);
    	    javagame.Player.Weapons[17][6] = Integer.parseInt(loaned18[6]);
    	    javagame.Player.Weapons[17][7] = Integer.parseInt(loaned18[7]);
    	    javagame.Player.Weapons[17][8] = Integer.parseInt(loaned18[8]);
    	    javagame.Player.Weapons[17][9] = Integer.parseInt(loaned18[9]);
    	    javagame.Player.Weapons[17][10] = loaned18[10];
    	String loan19 = in.next();
    	String[] loaned19 = loan19.split(";");
    	    javagame.Player.Weapons[18][0] = loaned19[0];
    	    javagame.Player.Weapons[18][1] = Integer.parseInt(loaned19[1]);
    	    javagame.Player.Weapons[18][2] = Integer.parseInt(loaned19[2]);
    	    javagame.Player.Weapons[18][3] = loaned19[3];
    	    javagame.Player.Weapons[18][4] = Integer.parseInt(loaned19[4]);
    	    javagame.Player.Weapons[18][5] = Integer.parseInt(loaned19[5]);
    	    javagame.Player.Weapons[18][6] = Integer.parseInt(loaned19[6]);
    	    javagame.Player.Weapons[18][7] = Integer.parseInt(loaned19[7]);
    	    javagame.Player.Weapons[18][8] = Integer.parseInt(loaned19[8]);
    	    javagame.Player.Weapons[18][9] = Integer.parseInt(loaned19[9]);
    	    javagame.Player.Weapons[18][10] = loaned19[10];
    	String loan20 = in.next();
    	String[] loaned20 = loan20.split(";");
    	    javagame.Player.Weapons[19][0] = loaned20[0];
    	    javagame.Player.Weapons[19][1] = Integer.parseInt(loaned20[1]);
    	    javagame.Player.Weapons[19][2] = Integer.parseInt(loaned20[2]);
    	    javagame.Player.Weapons[19][3] = loaned20[3];
    	    javagame.Player.Weapons[19][4] = Integer.parseInt(loaned20[4]);
    	    javagame.Player.Weapons[19][5] = Integer.parseInt(loaned20[5]);
    	    javagame.Player.Weapons[19][6] = Integer.parseInt(loaned20[6]);
    	    javagame.Player.Weapons[19][7] = Integer.parseInt(loaned20[7]);
    	    javagame.Player.Weapons[19][8] = Integer.parseInt(loaned20[8]);
    	    javagame.Player.Weapons[19][9] = Integer.parseInt(loaned20[9]);
    	    javagame.Player.Weapons[19][10] = loaned20[10];
    	String loan21 = in.next();
    	String[] loaned21 = loan21.split(";");
    	    javagame.Player.Weapons[20][0] = loaned21[0];
    	    javagame.Player.Weapons[20][1] = Integer.parseInt(loaned21[1]);
    	    javagame.Player.Weapons[20][2] = Integer.parseInt(loaned21[2]);
    	    javagame.Player.Weapons[20][3] = loaned21[3];
    	    javagame.Player.Weapons[20][4] = Integer.parseInt(loaned21[4]);
    	    javagame.Player.Weapons[20][5] = Integer.parseInt(loaned21[5]);
    	    javagame.Player.Weapons[20][6] = Integer.parseInt(loaned21[6]);
    	    javagame.Player.Weapons[20][7] = Integer.parseInt(loaned21[7]);
    	    javagame.Player.Weapons[20][8] = Integer.parseInt(loaned21[8]);
    	    javagame.Player.Weapons[20][9] = Integer.parseInt(loaned21[9]);
    	    javagame.Player.Weapons[20][10] = loaned21[10];
    	String loan22 = in.next();
    	String[] loaned22 = loan22.split(";");
    	    javagame.Player.Weapons[21][0] = loaned22[0];
    	    javagame.Player.Weapons[21][1] = Integer.parseInt(loaned22[1]);
    	    javagame.Player.Weapons[21][2] = Integer.parseInt(loaned22[2]);
    	    javagame.Player.Weapons[21][3] = loaned22[3];
    	    javagame.Player.Weapons[21][4] = Integer.parseInt(loaned22[4]);
    	    javagame.Player.Weapons[21][5] = Integer.parseInt(loaned22[5]);
    	    javagame.Player.Weapons[21][6] = Integer.parseInt(loaned22[6]);
    	    javagame.Player.Weapons[21][7] = Integer.parseInt(loaned22[7]);
    	    javagame.Player.Weapons[21][8] = Integer.parseInt(loaned22[8]);
    	    javagame.Player.Weapons[21][9] = Integer.parseInt(loaned22[9]);
    	    javagame.Player.Weapons[21][10] = loaned22[10];
    	String loan23 = in.next();
    	String[] loaned23 = loan23.split(";");
    	    javagame.Player.Weapons[22][0] = loaned23[0];
    	    javagame.Player.Weapons[22][1] = Integer.parseInt(loaned23[1]);
    	    javagame.Player.Weapons[22][2] = Integer.parseInt(loaned23[2]);
    	    javagame.Player.Weapons[22][3] = loaned23[3];
    	    javagame.Player.Weapons[22][4] = Integer.parseInt(loaned23[4]);
    	    javagame.Player.Weapons[22][5] = Integer.parseInt(loaned23[5]);
    	    javagame.Player.Weapons[22][6] = Integer.parseInt(loaned23[6]);
    	    javagame.Player.Weapons[22][7] = Integer.parseInt(loaned23[7]);
    	    javagame.Player.Weapons[22][8] = Integer.parseInt(loaned23[8]);
    	    javagame.Player.Weapons[22][9] = Integer.parseInt(loaned23[9]);
    	    javagame.Player.Weapons[22][10] = loaned23[10];
    	String loan24 = in.next();
    	String[] loaned24 = loan24.split(";");
    	    javagame.Player.Weapons[23][0] = loaned24[0];
    	    javagame.Player.Weapons[23][1] = Integer.parseInt(loaned24[1]);
    	    javagame.Player.Weapons[23][2] = Integer.parseInt(loaned24[2]);
    	    javagame.Player.Weapons[23][3] = loaned24[3];
    	    javagame.Player.Weapons[23][4] = Integer.parseInt(loaned24[4]);
    	    javagame.Player.Weapons[23][5] = Integer.parseInt(loaned24[5]);
    	    javagame.Player.Weapons[23][6] = Integer.parseInt(loaned24[6]);
    	    javagame.Player.Weapons[23][7] = Integer.parseInt(loaned24[7]);
    	    javagame.Player.Weapons[23][8] = Integer.parseInt(loaned24[8]);
    	    javagame.Player.Weapons[23][9] = Integer.parseInt(loaned24[9]);
    	    javagame.Player.Weapons[23][10] = loaned24[10];
    	String loan25 = in.next();
    	String[] loaned25 = loan25.split(";");
    	    javagame.Player.Weapons[24][0] = loaned25[0];
    	    javagame.Player.Weapons[24][1] = Integer.parseInt(loaned25[1]);
    	    javagame.Player.Weapons[24][2] = Integer.parseInt(loaned25[2]);
    	    javagame.Player.Weapons[24][3] = loaned25[3];
    	    javagame.Player.Weapons[24][4] = Integer.parseInt(loaned25[4]);
    	    javagame.Player.Weapons[24][5] = Integer.parseInt(loaned25[5]);
    	    javagame.Player.Weapons[24][6] = Integer.parseInt(loaned25[6]);
    	    javagame.Player.Weapons[24][7] = Integer.parseInt(loaned25[7]);
    	    javagame.Player.Weapons[24][8] = Integer.parseInt(loaned25[8]);
    	    javagame.Player.Weapons[24][9] = Integer.parseInt(loaned25[9]);
    	    javagame.Player.Weapons[24][10] = loaned25[10];
    	String loan26 = in.next();
	  	String[] loaned26 = loan26.split(";");
	   	    javagame.Player.equipped_weapon[0] = loaned26[0];
	   	    javagame.Player.equipped_weapon[1] = Integer.parseInt(loaned26[1]);
    	    javagame.Player.equipped_weapon[2] = Integer.parseInt(loaned26[2]);
    	    javagame.Player.equipped_weapon[3] = loaned26[3];
	    	javagame.Player.equipped_weapon[4] = Integer.parseInt(loaned26[4]);
	        javagame.Player.equipped_weapon[5] = Integer.parseInt(loaned26[5]);
	   	    javagame.Player.equipped_weapon[6] = Integer.parseInt(loaned26[6]);
	   	    javagame.Player.equipped_weapon[7] = Integer.parseInt(loaned26[7]);
	   	    javagame.Player.equipped_weapon[8] = Integer.parseInt(loaned26[8]);
	   	    javagame.Player.equipped_weapon[9] = Integer.parseInt(loaned26[9]);
    	    javagame.Player.equipped_weapon[10] = loaned26[10];
    	//Map Items On/Off
    	javagame.Player.silver_message = Boolean.parseBoolean(in.next());
    	javagame.Player.boss_1 = Boolean.parseBoolean(in.next());
    	//Player Stats
    	javagame.Player.save_location = Integer.parseInt(in.next());
    	javagame.Player.money = Integer.parseInt(in.next());
    	javagame.Player.hp = Double.parseDouble(in.next());
    	javagame.Player.max_hp = Double.parseDouble(in.next());
    	javagame.Player.manap = Double.parseDouble(in.next());
    	javagame.Player.max_manap = Double.parseDouble(in.next());
    	javagame.Player.lvl = Integer.parseInt(in.next());
    	javagame.Player.xp = Integer.parseInt(in.next());
    	javagame.Player.silver_horn = Boolean.parseBoolean(in.next());
    	javagame.Player.clas = in.next();
    	javagame.Player.room = Integer.parseInt(in.next());
    	javagame.Player.name = in.next();
    	javagame.Player.regen_points = Integer.parseInt(in.next());
    	javagame.Player.ocean_gem = Integer.parseInt(in.next());
    	javagame.Player.weapon_ID = Integer.parseInt(in.next());
    	//potions
    	javagame.Player.lesser_potions = Integer.parseInt(in.next());
    	javagame.Player.potions = Integer.parseInt(in.next());
    	javagame.Player.greater_potions = Integer.parseInt(in.next());
    	javagame.Player.lesser_mana = Integer.parseInt(in.next());
    	javagame.Player.mana = Integer.parseInt(in.next());
    	javagame.Player.greater_mana = Integer.parseInt(in.next());
    	javagame.Player.lesser_regen = Integer.parseInt(in.next());
    	javagame.Player.regen = Integer.parseInt(in.next());
    	javagame.Player.greater_regen = Integer.parseInt(in.next());
    	javagame.Player.HMR = Integer.parseInt(in.next());
    	//Coordinates
    	String stat = in.next();
    	String[] stats = stat.split(";");
    	javagame.Player.area_1[0] = Float.parseFloat(stats[0]);javagame.Player.area_1[1] = Float.parseFloat(stats[1]);javagame.Player.area_1[2] = Float.parseFloat(stats[2]);javagame.Player.area_1[3] = Float.parseFloat(stats[3]);
    	String stat1 = in.next();
    	String[] stats1 = stat1.split(";");
    	javagame.Player.area_2[0] = Float.parseFloat(stats1[0]);javagame.Player.area_2[1] = Float.parseFloat(stats1[1]);javagame.Player.area_2[2] = Float.parseFloat(stats1[2]);javagame.Player.area_2[3] = Float.parseFloat(stats1[3]);
    	String stat2 = in.next();
    	String[] stats2 = stat2.split(";");
    	javagame.Player.area_3[0] = Float.parseFloat(stats2[0]);javagame.Player.area_3[1] = Float.parseFloat(stats2[1]);javagame.Player.area_3[2] = Float.parseFloat(stats2[2]);javagame.Player.area_3[3] = Float.parseFloat(stats2[3]);
    	String stat3 = in.next();
    	String[] stats3 = stat3.split(";");
    	javagame.Player.area_5[0] = Float.parseFloat(stats3[0]);javagame.Player.area_5[1] = Float.parseFloat(stats3[1]);javagame.Player.area_5[2] = Float.parseFloat(stats3[2]);javagame.Player.area_5[3] = Float.parseFloat(stats3[3]);
    	String stat4 = in.next();
    	String[] stats4 = stat4.split(";");
    	javagame.Player.cave_1[0] = Float.parseFloat(stats4[0]);javagame.Player.cave_1[1] = Float.parseFloat(stats4[1]);javagame.Player.cave_1[2] = Float.parseFloat(stats4[2]);javagame.Player.cave_1[3] = Float.parseFloat(stats4[3]);
    	String stat5 = in.next();
    	String[] stats5 = stat5.split(";");
    	javagame.Player.Alchemist[0] = Float.parseFloat(stats5[0]);javagame.Player.Alchemist[1] = Float.parseFloat(stats5[1]);javagame.Player.Alchemist[2] = Float.parseFloat(stats5[2]);javagame.Player.Alchemist[3] = Float.parseFloat(stats5[3]);
    	String stat6 = in.next();
    	String[] stats6 = stat6.split(";");
    	javagame.Player.Beer_Hall[0] = Float.parseFloat(stats6[0]);javagame.Player.Beer_Hall[1] = Float.parseFloat(stats6[1]);javagame.Player.Beer_Hall[2] = Float.parseFloat(stats6[2]);javagame.Player.Beer_Hall[3] = Float.parseFloat(stats6[3]);
    	String stat7 = in.next();
    	String[] stats7 = stat7.split(";");
    	javagame.Player.Forest[0] = Float.parseFloat(stats7[0]);javagame.Player.Forest[1] = Float.parseFloat(stats7[1]);javagame.Player.Forest[2] = Float.parseFloat(stats7[2]);javagame.Player.Forest[3] = Float.parseFloat(stats7[3]);
    	String stat8 = in.next();
    	String[] stats8 = stat8.split(";");
    	javagame.Player.Rift[0] = Float.parseFloat(stats8[0]);javagame.Player.Rift[1] = Float.parseFloat(stats8[1]);javagame.Player.Rift[2] = Float.parseFloat(stats8[2]);javagame.Player.Rift[3] = Float.parseFloat(stats8[3]);
    	in.close();
}
	
	public static void Load3() throws FileNotFoundException{
    	Scanner in = new Scanner(new File("save3.Gateway"));
    	//Equipment
    	String loan1 = in.next();
    	String[] loaned1 = loan1.split(";");
    	    javagame.Player.Weapons[0][0] = loaned1[0];
    	    javagame.Player.Weapons[0][1] = Integer.parseInt(loaned1[1]);
    	    javagame.Player.Weapons[0][2] = Integer.parseInt(loaned1[2]);
    	    javagame.Player.Weapons[0][3] = loaned1[3];
    	    javagame.Player.Weapons[0][4] = Integer.parseInt(loaned1[4]);
    	    javagame.Player.Weapons[0][5] = Integer.parseInt(loaned1[5]);
    	    javagame.Player.Weapons[0][6] = Integer.parseInt(loaned1[6]);
    	    javagame.Player.Weapons[0][7] = Integer.parseInt(loaned1[7]);
    	    javagame.Player.Weapons[0][8] = Integer.parseInt(loaned1[8]);
    	    javagame.Player.Weapons[0][9] = Integer.parseInt(loaned1[9]);
    	    javagame.Player.Weapons[0][10] = loaned1[10];
    	    System.out.println(loan1);
    	    System.out.println(javagame.Player.Weapons[0][0] +";"+ javagame.Player.Weapons[0][1] +";"+ javagame.Player.Weapons[0][2] +";"+ javagame.Player.Weapons[0][10]);
    	String loan2 = in.next();
    	String[] loaned2 = loan2.split(";");
            javagame.Player.Weapons[1][0] = loaned2[0];
    	    javagame.Player.Weapons[1][1] = Integer.parseInt(loaned2[1]);
    	    javagame.Player.Weapons[1][2] = Integer.parseInt(loaned2[2]);
    	    javagame.Player.Weapons[1][3] = loaned2[3];
    	    javagame.Player.Weapons[1][4] = Integer.parseInt(loaned2[4]);
    	    javagame.Player.Weapons[1][5] = Integer.parseInt(loaned2[5]);
    	    javagame.Player.Weapons[1][6] = Integer.parseInt(loaned2[6]);
    	    javagame.Player.Weapons[1][7] = Integer.parseInt(loaned2[7]);
    	    javagame.Player.Weapons[1][8] = Integer.parseInt(loaned2[8]);
    	    javagame.Player.Weapons[1][9] = Integer.parseInt(loaned2[9]);
    	    javagame.Player.Weapons[1][10] = loaned2[10];
    	String loan3 = in.next();
    	String[] loaned3 = loan3.split(";");
    	    javagame.Player.Weapons[2][0] = loaned3[0];
    	    javagame.Player.Weapons[2][1] = Integer.parseInt(loaned3[1]);
    	    javagame.Player.Weapons[2][2] = Integer.parseInt(loaned3[2]);
    	    javagame.Player.Weapons[2][3] = loaned3[3];
    	    javagame.Player.Weapons[2][4] = Integer.parseInt(loaned3[4]);
    	    javagame.Player.Weapons[2][5] = Integer.parseInt(loaned3[5]);
    	    javagame.Player.Weapons[2][6] = Integer.parseInt(loaned3[6]);
    	    javagame.Player.Weapons[2][7] = Integer.parseInt(loaned3[7]);
    	    javagame.Player.Weapons[2][8] = Integer.parseInt(loaned3[8]);
    	    javagame.Player.Weapons[2][9] = Integer.parseInt(loaned3[9]);
    	    javagame.Player.Weapons[2][10] = loaned3[10];
    	String loan4 = in.next();
    	String[] loaned4 = loan4.split(";");
    	    javagame.Player.Weapons[3][0] = loaned4[0];
    	    javagame.Player.Weapons[3][1] = Integer.parseInt(loaned4[1]);
    	    javagame.Player.Weapons[3][2] = Integer.parseInt(loaned4[2]);
    	    javagame.Player.Weapons[3][3] = loaned4[3];
    	    javagame.Player.Weapons[3][4] = Integer.parseInt(loaned4[4]);
    	    javagame.Player.Weapons[3][5] = Integer.parseInt(loaned4[5]);
    	    javagame.Player.Weapons[3][6] = Integer.parseInt(loaned4[6]);
    	    javagame.Player.Weapons[3][7] = Integer.parseInt(loaned4[7]);
    	    javagame.Player.Weapons[3][8] = Integer.parseInt(loaned4[8]);
    	    javagame.Player.Weapons[3][9] = Integer.parseInt(loaned4[9]);
    	    javagame.Player.Weapons[3][10] = loaned4[10];
    	String loan5 = in.next();
    	String[] loaned5 = loan5.split(";");
    	    javagame.Player.Weapons[4][0] = loaned5[0];
    	    javagame.Player.Weapons[4][1] = Integer.parseInt(loaned5[1]);
    	    javagame.Player.Weapons[4][2] = Integer.parseInt(loaned5[2]);
    	    javagame.Player.Weapons[4][3] = loaned5[3];
    	    javagame.Player.Weapons[4][4] = Integer.parseInt(loaned5[4]);
    	    javagame.Player.Weapons[4][5] = Integer.parseInt(loaned5[5]);
    	    javagame.Player.Weapons[4][6] = Integer.parseInt(loaned5[6]);
    	    javagame.Player.Weapons[4][7] = Integer.parseInt(loaned5[7]);
    	    javagame.Player.Weapons[4][8] = Integer.parseInt(loaned5[8]);
    	    javagame.Player.Weapons[4][9] = Integer.parseInt(loaned5[9]);
    	    javagame.Player.Weapons[4][10] = loaned5[10];
    	String loan6 = in.next();
    	String[] loaned6 = loan6.split(";");
    	    javagame.Player.Weapons[5][0] = loaned6[0];
    	    javagame.Player.Weapons[5][1] = Integer.parseInt(loaned6[1]);
    	    javagame.Player.Weapons[5][2] = Integer.parseInt(loaned6[2]);
    	    javagame.Player.Weapons[5][3] = loaned6[3];
    	    javagame.Player.Weapons[5][4] = Integer.parseInt(loaned6[4]);
    	    javagame.Player.Weapons[5][5] = Integer.parseInt(loaned6[5]);
    	    javagame.Player.Weapons[5][6] = Integer.parseInt(loaned6[6]);
    	    javagame.Player.Weapons[5][7] = Integer.parseInt(loaned6[7]);
    	    javagame.Player.Weapons[5][8] = Integer.parseInt(loaned6[8]);
    	    javagame.Player.Weapons[5][9] = Integer.parseInt(loaned6[9]);
    	    javagame.Player.Weapons[5][10] = loaned6[10];
    	String loan7 = in.next();
    	String[] loaned7 = loan7.split(";");
    	    javagame.Player.Weapons[6][0] = loaned7[0];
    	    javagame.Player.Weapons[6][1] = Integer.parseInt(loaned7[1]);
    	    javagame.Player.Weapons[6][2] = Integer.parseInt(loaned7[2]);
    	    javagame.Player.Weapons[6][3] = loaned7[3];
    	    javagame.Player.Weapons[6][4] = Integer.parseInt(loaned7[4]);
    	    javagame.Player.Weapons[6][5] = Integer.parseInt(loaned7[5]);
    	    javagame.Player.Weapons[6][6] = Integer.parseInt(loaned7[6]);
    	    javagame.Player.Weapons[6][7] = Integer.parseInt(loaned7[7]);
    	    javagame.Player.Weapons[6][8] = Integer.parseInt(loaned7[8]);
    	    javagame.Player.Weapons[6][9] = Integer.parseInt(loaned7[9]);
    	    javagame.Player.Weapons[6][10] = loaned7[10];
    	String loan8 = in.next();
    	String[] loaned8 = loan8.split(";");
    	    javagame.Player.Weapons[7][0] = loaned8[0];
    	    javagame.Player.Weapons[7][1] = Integer.parseInt(loaned8[1]);
    	    javagame.Player.Weapons[7][2] = Integer.parseInt(loaned8[2]);
    	    javagame.Player.Weapons[7][3] = loaned8[3];
    	    javagame.Player.Weapons[7][4] = Integer.parseInt(loaned8[4]);
    	    javagame.Player.Weapons[7][5] = Integer.parseInt(loaned8[5]);
    	    javagame.Player.Weapons[7][6] = Integer.parseInt(loaned8[6]);
    	    javagame.Player.Weapons[7][7] = Integer.parseInt(loaned8[7]);
    	    javagame.Player.Weapons[7][8] = Integer.parseInt(loaned8[8]);
    	    javagame.Player.Weapons[7][9] = Integer.parseInt(loaned8[9]);
    	    javagame.Player.Weapons[7][10] = loaned8[10];
    	String loan9 = in.next();
    	String[] loaned9 = loan9.split(";");
    	    javagame.Player.Weapons[8][0] = loaned9[0];
    	    javagame.Player.Weapons[8][1] = Integer.parseInt(loaned9[1]);
    	    javagame.Player.Weapons[8][2] = Integer.parseInt(loaned9[2]);
    	    javagame.Player.Weapons[8][3] = loaned9[3];
    	    javagame.Player.Weapons[8][4] = Integer.parseInt(loaned9[4]);
    	    javagame.Player.Weapons[8][5] = Integer.parseInt(loaned9[5]);
    	    javagame.Player.Weapons[8][6] = Integer.parseInt(loaned9[6]);
    	    javagame.Player.Weapons[8][7] = Integer.parseInt(loaned9[7]);
    	    javagame.Player.Weapons[8][8] = Integer.parseInt(loaned9[8]);
    	    javagame.Player.Weapons[8][9] = Integer.parseInt(loaned9[9]);
    	    javagame.Player.Weapons[8][10] = loaned9[10];
    	String loan10 = in.next();
    	String[] loaned10 = loan10.split(";");
    	    javagame.Player.Weapons[9][0] = loaned10[0];
    	    javagame.Player.Weapons[9][1] = Integer.parseInt(loaned10[1]);
    	    javagame.Player.Weapons[9][2] = Integer.parseInt(loaned10[2]);
    	    javagame.Player.Weapons[9][3] = loaned10[3];
    	    javagame.Player.Weapons[9][4] = Integer.parseInt(loaned10[4]);
    	    javagame.Player.Weapons[9][5] = Integer.parseInt(loaned10[5]);
    	    javagame.Player.Weapons[9][6] = Integer.parseInt(loaned10[6]);
    	    javagame.Player.Weapons[9][7] = Integer.parseInt(loaned10[7]);
    	    javagame.Player.Weapons[9][8] = Integer.parseInt(loaned10[8]);
    	    javagame.Player.Weapons[9][9] = Integer.parseInt(loaned10[9]);
    	    javagame.Player.Weapons[9][10] = loaned10[10];
    	String loan11 = in.next();
    	String[] loaned11 = loan11.split(";");
    	    javagame.Player.Weapons[10][0] = loaned11[0];
    	    javagame.Player.Weapons[10][1] = Integer.parseInt(loaned11[1]);
    	    javagame.Player.Weapons[10][2] = Integer.parseInt(loaned11[2]);
    	    javagame.Player.Weapons[10][3] = loaned11[3];
    	    javagame.Player.Weapons[10][4] = Integer.parseInt(loaned11[4]);
    	    javagame.Player.Weapons[10][5] = Integer.parseInt(loaned11[5]);
    	    javagame.Player.Weapons[10][6] = Integer.parseInt(loaned11[6]);
    	    javagame.Player.Weapons[10][7] = Integer.parseInt(loaned11[7]);
    	    javagame.Player.Weapons[10][8] = Integer.parseInt(loaned11[8]);
    	    javagame.Player.Weapons[10][9] = Integer.parseInt(loaned11[9]);
    	    javagame.Player.Weapons[10][10] = loaned11[10];
    	String loan12 = in.next();
    	String[] loaned12 = loan12.split(";");
    	    javagame.Player.Weapons[11][0] = loaned12[0];
    	    javagame.Player.Weapons[11][1] = Integer.parseInt(loaned12[1]);
    	    javagame.Player.Weapons[11][2] = Integer.parseInt(loaned12[2]);
    	    javagame.Player.Weapons[11][3] = loaned12[3];
    	    javagame.Player.Weapons[11][4] = Integer.parseInt(loaned12[4]);
    	    javagame.Player.Weapons[11][5] = Integer.parseInt(loaned12[5]);
    	    javagame.Player.Weapons[11][6] = Integer.parseInt(loaned12[6]);
    	    javagame.Player.Weapons[11][7] = Integer.parseInt(loaned12[7]);
    	    javagame.Player.Weapons[11][8] = Integer.parseInt(loaned12[8]);
    	    javagame.Player.Weapons[11][9] = Integer.parseInt(loaned12[9]);
    	    javagame.Player.Weapons[11][10] = loaned12[10];
    	String loan13 = in.next();
    	String[] loaned13 = loan13.split(";");
    	    javagame.Player.Weapons[12][0] = loaned13[0];
    	    javagame.Player.Weapons[12][1] = Integer.parseInt(loaned13[1]);
    	    javagame.Player.Weapons[12][2] = Integer.parseInt(loaned13[2]);
    	    javagame.Player.Weapons[12][3] = loaned13[3];
    	    javagame.Player.Weapons[12][4] = Integer.parseInt(loaned13[4]);
    	    javagame.Player.Weapons[12][5] = Integer.parseInt(loaned13[5]);
    	    javagame.Player.Weapons[12][6] = Integer.parseInt(loaned13[6]);
    	    javagame.Player.Weapons[12][7] = Integer.parseInt(loaned13[7]);
    	    javagame.Player.Weapons[12][8] = Integer.parseInt(loaned13[8]);
    	    javagame.Player.Weapons[12][9] = Integer.parseInt(loaned13[9]);
    	    javagame.Player.Weapons[12][10] = loaned13[10];
    	String loan14 = in.next();
    	String[] loaned14 = loan14.split(";");
    	    javagame.Player.Weapons[13][0] = loaned14[0];
    	    javagame.Player.Weapons[13][1] = Integer.parseInt(loaned14[1]);
    	    javagame.Player.Weapons[13][2] = Integer.parseInt(loaned14[2]);
    	    javagame.Player.Weapons[13][3] = loaned14[3];
    	    javagame.Player.Weapons[13][4] = Integer.parseInt(loaned14[4]);
    	    javagame.Player.Weapons[13][5] = Integer.parseInt(loaned14[5]);
    	    javagame.Player.Weapons[13][6] = Integer.parseInt(loaned14[6]);
    	    javagame.Player.Weapons[13][7] = Integer.parseInt(loaned14[7]);
    	    javagame.Player.Weapons[13][8] = Integer.parseInt(loaned14[8]);
    	    javagame.Player.Weapons[13][9] = Integer.parseInt(loaned14[9]);
    	    javagame.Player.Weapons[13][10] = loaned14[10];
    	String loan15 = in.next();
    	String[] loaned15 = loan15.split(";");
    	    javagame.Player.Weapons[14][0] = loaned15[0];
    	    javagame.Player.Weapons[14][1] = Integer.parseInt(loaned15[1]);
    	    javagame.Player.Weapons[14][2] = Integer.parseInt(loaned15[2]);
    	    javagame.Player.Weapons[14][3] = loaned15[3];
    	    javagame.Player.Weapons[14][4] = Integer.parseInt(loaned15[4]);
    	    javagame.Player.Weapons[14][5] = Integer.parseInt(loaned15[5]);
    	    javagame.Player.Weapons[14][6] = Integer.parseInt(loaned15[6]);
    	    javagame.Player.Weapons[14][7] = Integer.parseInt(loaned15[7]);
    	    javagame.Player.Weapons[14][8] = Integer.parseInt(loaned15[8]);
    	    javagame.Player.Weapons[14][9] = Integer.parseInt(loaned15[9]);
    	    javagame.Player.Weapons[14][10] = loaned15[10];
    	String loan16 = in.next();
    	String[] loaned16 = loan16.split(";");
    	    javagame.Player.Weapons[15][0] = loaned16[0];
    	    javagame.Player.Weapons[15][1] = Integer.parseInt(loaned16[1]);
    	    javagame.Player.Weapons[15][2] = Integer.parseInt(loaned16[2]);
    	    javagame.Player.Weapons[15][3] = loaned16[3];
    	    javagame.Player.Weapons[15][4] = Integer.parseInt(loaned16[4]);
    	    javagame.Player.Weapons[15][5] = Integer.parseInt(loaned16[5]);
    	    javagame.Player.Weapons[15][6] = Integer.parseInt(loaned16[6]);
    	    javagame.Player.Weapons[15][7] = Integer.parseInt(loaned16[7]);
    	    javagame.Player.Weapons[15][8] = Integer.parseInt(loaned16[8]);
    	    javagame.Player.Weapons[15][9] = Integer.parseInt(loaned16[9]);
    	    javagame.Player.Weapons[15][10] = loaned16[10];
    	String loan17 = in.next();
    	String[] loaned17 = loan17.split(";");
    	    javagame.Player.Weapons[16][0] = loaned17[0];
    	    javagame.Player.Weapons[16][1] = Integer.parseInt(loaned17[1]);
    	    javagame.Player.Weapons[16][2] = Integer.parseInt(loaned17[2]);
    	    javagame.Player.Weapons[16][3] = loaned17[3];
    	    javagame.Player.Weapons[16][4] = Integer.parseInt(loaned17[4]);
    	    javagame.Player.Weapons[16][5] = Integer.parseInt(loaned17[5]);
    	    javagame.Player.Weapons[16][6] = Integer.parseInt(loaned17[6]);
    	    javagame.Player.Weapons[16][7] = Integer.parseInt(loaned17[7]);
    	    javagame.Player.Weapons[16][8] = Integer.parseInt(loaned17[8]);
    	    javagame.Player.Weapons[16][9] = Integer.parseInt(loaned17[9]);
    	    javagame.Player.Weapons[16][10] = loaned17[10];
    	String loan18 = in.next();
    	String[] loaned18 = loan18.split(";");
    	    javagame.Player.Weapons[17][0] = loaned18[0];
    	    javagame.Player.Weapons[17][1] = Integer.parseInt(loaned18[1]);
    	    javagame.Player.Weapons[17][2] = Integer.parseInt(loaned18[2]);
    	    javagame.Player.Weapons[17][3] = loaned18[3];
    	    javagame.Player.Weapons[17][4] = Integer.parseInt(loaned18[4]);
    	    javagame.Player.Weapons[17][5] = Integer.parseInt(loaned18[5]);
    	    javagame.Player.Weapons[17][6] = Integer.parseInt(loaned18[6]);
    	    javagame.Player.Weapons[17][7] = Integer.parseInt(loaned18[7]);
    	    javagame.Player.Weapons[17][8] = Integer.parseInt(loaned18[8]);
    	    javagame.Player.Weapons[17][9] = Integer.parseInt(loaned18[9]);
    	    javagame.Player.Weapons[17][10] = loaned18[10];
    	String loan19 = in.next();
    	String[] loaned19 = loan19.split(";");
    	    javagame.Player.Weapons[18][0] = loaned19[0];
    	    javagame.Player.Weapons[18][1] = Integer.parseInt(loaned19[1]);
    	    javagame.Player.Weapons[18][2] = Integer.parseInt(loaned19[2]);
    	    javagame.Player.Weapons[18][3] = loaned19[3];
    	    javagame.Player.Weapons[18][4] = Integer.parseInt(loaned19[4]);
    	    javagame.Player.Weapons[18][5] = Integer.parseInt(loaned19[5]);
    	    javagame.Player.Weapons[18][6] = Integer.parseInt(loaned19[6]);
    	    javagame.Player.Weapons[18][7] = Integer.parseInt(loaned19[7]);
    	    javagame.Player.Weapons[18][8] = Integer.parseInt(loaned19[8]);
    	    javagame.Player.Weapons[18][9] = Integer.parseInt(loaned19[9]);
    	    javagame.Player.Weapons[18][10] = loaned19[10];
    	String loan20 = in.next();
    	String[] loaned20 = loan20.split(";");
    	    javagame.Player.Weapons[19][0] = loaned20[0];
    	    javagame.Player.Weapons[19][1] = Integer.parseInt(loaned20[1]);
    	    javagame.Player.Weapons[19][2] = Integer.parseInt(loaned20[2]);
    	    javagame.Player.Weapons[19][3] = loaned20[3];
    	    javagame.Player.Weapons[19][4] = Integer.parseInt(loaned20[4]);
    	    javagame.Player.Weapons[19][5] = Integer.parseInt(loaned20[5]);
    	    javagame.Player.Weapons[19][6] = Integer.parseInt(loaned20[6]);
    	    javagame.Player.Weapons[19][7] = Integer.parseInt(loaned20[7]);
    	    javagame.Player.Weapons[19][8] = Integer.parseInt(loaned20[8]);
    	    javagame.Player.Weapons[19][9] = Integer.parseInt(loaned20[9]);
    	    javagame.Player.Weapons[19][10] = loaned20[10];
    	String loan21 = in.next();
    	String[] loaned21 = loan21.split(";");
    	    javagame.Player.Weapons[20][0] = loaned21[0];
    	    javagame.Player.Weapons[20][1] = Integer.parseInt(loaned21[1]);
    	    javagame.Player.Weapons[20][2] = Integer.parseInt(loaned21[2]);
    	    javagame.Player.Weapons[20][3] = loaned21[3];
    	    javagame.Player.Weapons[20][4] = Integer.parseInt(loaned21[4]);
    	    javagame.Player.Weapons[20][5] = Integer.parseInt(loaned21[5]);
    	    javagame.Player.Weapons[20][6] = Integer.parseInt(loaned21[6]);
    	    javagame.Player.Weapons[20][7] = Integer.parseInt(loaned21[7]);
    	    javagame.Player.Weapons[20][8] = Integer.parseInt(loaned21[8]);
    	    javagame.Player.Weapons[20][9] = Integer.parseInt(loaned21[9]);
    	    javagame.Player.Weapons[20][10] = loaned21[10];
    	String loan22 = in.next();
    	String[] loaned22 = loan22.split(";");
    	    javagame.Player.Weapons[21][0] = loaned22[0];
    	    javagame.Player.Weapons[21][1] = Integer.parseInt(loaned22[1]);
    	    javagame.Player.Weapons[21][2] = Integer.parseInt(loaned22[2]);
    	    javagame.Player.Weapons[21][3] = loaned22[3];
    	    javagame.Player.Weapons[21][4] = Integer.parseInt(loaned22[4]);
    	    javagame.Player.Weapons[21][5] = Integer.parseInt(loaned22[5]);
    	    javagame.Player.Weapons[21][6] = Integer.parseInt(loaned22[6]);
    	    javagame.Player.Weapons[21][7] = Integer.parseInt(loaned22[7]);
    	    javagame.Player.Weapons[21][8] = Integer.parseInt(loaned22[8]);
    	    javagame.Player.Weapons[21][9] = Integer.parseInt(loaned22[9]);
    	    javagame.Player.Weapons[21][10] = loaned22[10];
    	String loan23 = in.next();
    	String[] loaned23 = loan23.split(";");
    	    javagame.Player.Weapons[22][0] = loaned23[0];
    	    javagame.Player.Weapons[22][1] = Integer.parseInt(loaned23[1]);
    	    javagame.Player.Weapons[22][2] = Integer.parseInt(loaned23[2]);
    	    javagame.Player.Weapons[22][3] = loaned23[3];
    	    javagame.Player.Weapons[22][4] = Integer.parseInt(loaned23[4]);
    	    javagame.Player.Weapons[22][5] = Integer.parseInt(loaned23[5]);
    	    javagame.Player.Weapons[22][6] = Integer.parseInt(loaned23[6]);
    	    javagame.Player.Weapons[22][7] = Integer.parseInt(loaned23[7]);
    	    javagame.Player.Weapons[22][8] = Integer.parseInt(loaned23[8]);
    	    javagame.Player.Weapons[22][9] = Integer.parseInt(loaned23[9]);
    	    javagame.Player.Weapons[22][10] = loaned23[10];
    	String loan24 = in.next();
    	String[] loaned24 = loan24.split(";");
    	    javagame.Player.Weapons[23][0] = loaned24[0];
    	    javagame.Player.Weapons[23][1] = Integer.parseInt(loaned24[1]);
    	    javagame.Player.Weapons[23][2] = Integer.parseInt(loaned24[2]);
    	    javagame.Player.Weapons[23][3] = loaned24[3];
    	    javagame.Player.Weapons[23][4] = Integer.parseInt(loaned24[4]);
    	    javagame.Player.Weapons[23][5] = Integer.parseInt(loaned24[5]);
    	    javagame.Player.Weapons[23][6] = Integer.parseInt(loaned24[6]);
    	    javagame.Player.Weapons[23][7] = Integer.parseInt(loaned24[7]);
    	    javagame.Player.Weapons[23][8] = Integer.parseInt(loaned24[8]);
    	    javagame.Player.Weapons[23][9] = Integer.parseInt(loaned24[9]);
    	    javagame.Player.Weapons[23][10] = loaned24[10];
    	String loan25 = in.next();
    	String[] loaned25 = loan25.split(";");
    	    javagame.Player.Weapons[24][0] = loaned25[0];
    	    javagame.Player.Weapons[24][1] = Integer.parseInt(loaned25[1]);
    	    javagame.Player.Weapons[24][2] = Integer.parseInt(loaned25[2]);
    	    javagame.Player.Weapons[24][3] = loaned25[3];
    	    javagame.Player.Weapons[24][4] = Integer.parseInt(loaned25[4]);
    	    javagame.Player.Weapons[24][5] = Integer.parseInt(loaned25[5]);
    	    javagame.Player.Weapons[24][6] = Integer.parseInt(loaned25[6]);
    	    javagame.Player.Weapons[24][7] = Integer.parseInt(loaned25[7]);
    	    javagame.Player.Weapons[24][8] = Integer.parseInt(loaned25[8]);
    	    javagame.Player.Weapons[24][9] = Integer.parseInt(loaned25[9]);
    	    javagame.Player.Weapons[24][10] = loaned25[10];
    	String loan26 = in.next();
	  	String[] loaned26 = loan26.split(";");
	   	    javagame.Player.equipped_weapon[0] = loaned26[0];
	   	    javagame.Player.equipped_weapon[1] = Integer.parseInt(loaned26[1]);
    	    javagame.Player.equipped_weapon[2] = Integer.parseInt(loaned26[2]);
    	    javagame.Player.equipped_weapon[3] = loaned26[3];
	    	javagame.Player.equipped_weapon[4] = Integer.parseInt(loaned26[4]);
	        javagame.Player.equipped_weapon[5] = Integer.parseInt(loaned26[5]);
	   	    javagame.Player.equipped_weapon[6] = Integer.parseInt(loaned26[6]);
	   	    javagame.Player.equipped_weapon[7] = Integer.parseInt(loaned26[7]);
	   	    javagame.Player.equipped_weapon[8] = Integer.parseInt(loaned26[8]);
	   	    javagame.Player.equipped_weapon[9] = Integer.parseInt(loaned26[9]);
    	    javagame.Player.equipped_weapon[10] = loaned26[10];
    	//Map Items On/Off
    	javagame.Player.silver_message = Boolean.parseBoolean(in.next());
    	javagame.Player.boss_1 = Boolean.parseBoolean(in.next());
    	//Player Stats
    	javagame.Player.save_location = Integer.parseInt(in.next());
    	javagame.Player.money = Integer.parseInt(in.next());
    	javagame.Player.hp = Double.parseDouble(in.next());
    	javagame.Player.max_hp = Double.parseDouble(in.next());
    	javagame.Player.manap = Double.parseDouble(in.next());
    	javagame.Player.max_manap = Double.parseDouble(in.next());
    	javagame.Player.lvl = Integer.parseInt(in.next());
    	javagame.Player.xp = Integer.parseInt(in.next());
    	javagame.Player.silver_horn = Boolean.parseBoolean(in.next());
    	javagame.Player.clas = in.next();
    	javagame.Player.room = Integer.parseInt(in.next());
    	javagame.Player.name = in.next();
    	javagame.Player.regen_points = Integer.parseInt(in.next());
    	javagame.Player.ocean_gem = Integer.parseInt(in.next());
    	javagame.Player.weapon_ID = Integer.parseInt(in.next());
    	//potions
    	javagame.Player.lesser_potions = Integer.parseInt(in.next());
    	javagame.Player.potions = Integer.parseInt(in.next());
    	javagame.Player.greater_potions = Integer.parseInt(in.next());
    	javagame.Player.lesser_mana = Integer.parseInt(in.next());
    	javagame.Player.mana = Integer.parseInt(in.next());
    	javagame.Player.greater_mana = Integer.parseInt(in.next());
    	javagame.Player.lesser_regen = Integer.parseInt(in.next());
    	javagame.Player.regen = Integer.parseInt(in.next());
    	javagame.Player.greater_regen = Integer.parseInt(in.next());
    	javagame.Player.HMR = Integer.parseInt(in.next());
    	//Coordinates
    	String stat = in.next();
    	String[] stats = stat.split(";");
    	javagame.Player.area_1[0] = Float.parseFloat(stats[0]);javagame.Player.area_1[1] = Float.parseFloat(stats[1]);javagame.Player.area_1[2] = Float.parseFloat(stats[2]);javagame.Player.area_1[3] = Float.parseFloat(stats[3]);
    	String stat1 = in.next();
    	String[] stats1 = stat1.split(";");
    	javagame.Player.area_2[0] = Float.parseFloat(stats1[0]);javagame.Player.area_2[1] = Float.parseFloat(stats1[1]);javagame.Player.area_2[2] = Float.parseFloat(stats1[2]);javagame.Player.area_2[3] = Float.parseFloat(stats1[3]);
    	String stat2 = in.next();
    	String[] stats2 = stat2.split(";");
    	javagame.Player.area_3[0] = Float.parseFloat(stats2[0]);javagame.Player.area_3[1] = Float.parseFloat(stats2[1]);javagame.Player.area_3[2] = Float.parseFloat(stats2[2]);javagame.Player.area_3[3] = Float.parseFloat(stats2[3]);
    	String stat3 = in.next();
    	String[] stats3 = stat3.split(";");
    	javagame.Player.area_5[0] = Float.parseFloat(stats3[0]);javagame.Player.area_5[1] = Float.parseFloat(stats3[1]);javagame.Player.area_5[2] = Float.parseFloat(stats3[2]);javagame.Player.area_5[3] = Float.parseFloat(stats3[3]);
    	String stat4 = in.next();
    	String[] stats4 = stat4.split(";");
    	javagame.Player.cave_1[0] = Float.parseFloat(stats4[0]);javagame.Player.cave_1[1] = Float.parseFloat(stats4[1]);javagame.Player.cave_1[2] = Float.parseFloat(stats4[2]);javagame.Player.cave_1[3] = Float.parseFloat(stats4[3]);
    	String stat5 = in.next();
    	String[] stats5 = stat5.split(";");
    	javagame.Player.Alchemist[0] = Float.parseFloat(stats5[0]);javagame.Player.Alchemist[1] = Float.parseFloat(stats5[1]);javagame.Player.Alchemist[2] = Float.parseFloat(stats5[2]);javagame.Player.Alchemist[3] = Float.parseFloat(stats5[3]);
    	String stat6 = in.next();
    	String[] stats6 = stat6.split(";");
    	javagame.Player.Beer_Hall[0] = Float.parseFloat(stats6[0]);javagame.Player.Beer_Hall[1] = Float.parseFloat(stats6[1]);javagame.Player.Beer_Hall[2] = Float.parseFloat(stats6[2]);javagame.Player.Beer_Hall[3] = Float.parseFloat(stats6[3]);
    	String stat7 = in.next();
    	String[] stats7 = stat7.split(";");
    	javagame.Player.Forest[0] = Float.parseFloat(stats7[0]);javagame.Player.Forest[1] = Float.parseFloat(stats7[1]);javagame.Player.Forest[2] = Float.parseFloat(stats7[2]);javagame.Player.Forest[3] = Float.parseFloat(stats7[3]);
    	String stat8 = in.next();
    	String[] stats8 = stat8.split(";");
    	javagame.Player.Rift[0] = Float.parseFloat(stats8[0]);javagame.Player.Rift[1] = Float.parseFloat(stats8[1]);javagame.Player.Rift[2] = Float.parseFloat(stats8[2]);javagame.Player.Rift[3] = Float.parseFloat(stats8[3]);
in.close();
}
}
