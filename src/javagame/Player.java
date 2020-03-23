package javagame;

import java.util.ArrayList;

public class Player {
	
	private static final int Integer = 0;
	public static boolean FPS = false;
	public static int FPScounter = 1;
	public static double hp = 50;
	public static double max_hp = 50;
	public static double manap = 20;
	public static double max_manap = 20;
	public static int save_location = 1;
	public static int money = 0;
	public static int lvl = 1;
	public static int xp = 0;
	public static int lvl_list[] = {20, 50, 100, 200, 300, 450, 600, 800, 1000, 1300, 1650, 2000, 2500, 3150, 4000, 5000, 6150, 7500, 9000, 11000, 14000, 20000, 999999999};
	public static int room = 10;
	public static int regen_points = 0;
	public static int lesser_potions = 5;
	public static int potions = 0;
	public static int greater_potions = 0;
	public static int lesser_mana = 0;
	public static int mana = 0;
	public static int greater_mana = 0;
	public static int lesser_regen = 0;
	public static int regen = 0;
	public static int greater_regen = 0;
	public static int HMR = 0;
	public static int ocean_gem = 0;
	public static int potion_rounds = 0;
	public static int weapon_ID = 0;
	public static int music_pos = 0;
	public static int footstep = 50;
	public static String name = "";
	public static String clas = "";
	public static boolean silver_horn = false;
	public static boolean silver_message = false;
	public static boolean in_battle = false;
	public static boolean boss_1 = false;
	public static boolean potion_used = false;
	public static float area_1[] = {200, -5, 120, 165};
	public static float area_2[] = {280, -5, 40, 165};
	public static float area_3[] = {115, 115, 205, 45};
	public static float area_5[] = {155, -165, 165, 325};
	public static float cave_1[] = {35, -245, 285, 405};
	public static float Alchemist[] = {200, -45, 120, 205};
	public static float Beer_Hall[] = {280, -45, 40, 205};
	public static float Forest[] = {-240, -240, 560, 400};
	public static float Rift[] = {240, -245, 80, 405};
	//public static ArrayList<Object> Weapons = new ArrayList<Object>();
	//NAME, DAMAGE, COST, CLASS, STRENGTH, DEXTERITY, INTELLIGENCE, VITALITY, DROP RATE, WEAPON ID, WEAPON TYPE, REQUIRED LVL
	public static Object[][] Weapons = {{(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
		                                {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1},
                                        {(String) "",(Integer) -1,(Integer) -1,(String) "null",(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(Integer) -1,(String) "null",(Integer) -1}};
	public static Object[] equipped_weapon = {"",0,0,"",0,0,0,0,0,0,"",0};
	
}
