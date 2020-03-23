package javagame;

import java.io.*;
import java.util.Random;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.font.effects.ColorEffect;

import java.awt.Color;
import java.awt.Font;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import javagame.Player;

public class Random_Enemy {
	
	static Random rand = new Random();
	
	public static void enemy_stats(int loc){
		if(loc >= 1 && loc <= 3){
			Random random = new Random();
			int Monster_IDrange[] = {0, 1, 2, 3, 4};
			int Monster_OFID = showRandomInteger(0, 4, random);
			javagame.Enemy.rare = Boolean.valueOf(javagame.Database.Monsters[Monster_OFID][2].toString());
			javagame.Enemy.hp = Double.valueOf(javagame.Database.Monsters[Monster_OFID][3].toString());
			javagame.Enemy.max_hp = javagame.Enemy.hp;
			javagame.Enemy.id = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][0].toString());
			javagame.Enemy.lvl = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][4].toString());
			javagame.Enemy.name = String.valueOf(javagame.Database.Monsters[Monster_OFID][1].toString());
			javagame.Enemy.xp = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][5].toString());
			javagame.Enemy.def = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][6].toString());
			javagame.Enemy.att = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][7].toString());
			System.out.println("EXPERIANCE:     "+Integer.valueOf(javagame.Database.Monsters[Monster_OFID][5].toString()));
			System.out.println("DEFENCE:     "+Integer.valueOf(javagame.Database.Monsters[Monster_OFID][6].toString()));
			System.out.println("ATTACK:      "+Integer.valueOf(javagame.Database.Monsters[Monster_OFID][7].toString()));
		}
		if(loc == 4){
			Random random = new Random();
			int Monster_IDrange[] = {5};
			int Monster_OFID = showRandomInteger(0, 0, random);
			javagame.Enemy.rare = Boolean.valueOf(javagame.Database.Monsters[Monster_OFID][2].toString());
			javagame.Enemy.hp = Double.valueOf(javagame.Database.Monsters[Monster_OFID][3].toString());
			javagame.Enemy.max_hp = javagame.Enemy.hp;
			javagame.Enemy.id = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][0].toString());
			javagame.Enemy.lvl = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][4].toString());
			javagame.Enemy.name = String.valueOf(javagame.Database.Monsters[Monster_OFID][1].toString());
			javagame.Enemy.xp = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][5].toString());
			javagame.Enemy.def = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][6].toString());
			javagame.Enemy.att = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][7].toString());
		}
		if(loc == 5){
			Random random = new Random();
			int Monster_IDrange[] = {6, 7};
			int Monster_OFID = showRandomInteger(0, 1, random);
			javagame.Enemy.rare = Boolean.valueOf(javagame.Database.Monsters[Monster_OFID][2].toString());
			javagame.Enemy.hp = Double.valueOf(javagame.Database.Monsters[Monster_OFID][3].toString());
			javagame.Enemy.max_hp = javagame.Enemy.hp;
			javagame.Enemy.id = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][0].toString());
			javagame.Enemy.lvl = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][4].toString());
			javagame.Enemy.name = String.valueOf(javagame.Database.Monsters[Monster_OFID][1].toString());
			javagame.Enemy.xp = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][5].toString());
			javagame.Enemy.def = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][6].toString());
			javagame.Enemy.att = Integer.valueOf(javagame.Database.Monsters[Monster_OFID][7].toString());
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
}
