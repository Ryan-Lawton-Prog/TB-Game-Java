package javagame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{
	
	public static final String gamename = "The Gateway!";
	public static final int menu = 0;
	public static final int mapping = 2;
	public static final int settings = 5;
	public static final int battle = 999;
	public static final int rewards = 998;
	public static final int inventory = 997;
	public static final int shop = 996;
	public static final int sharedstorage = 995;
	public static final int starter = 10;
	public static final int changelog = 1000;
	public static int height;
	public static int width;
	public static boolean FPSmeter;
	public static int FPS;
	public static int FrameRate;
	
	public Game(String gamename){
		super(gamename);
		this.addState(new Menu(menu));
		this.addState(new Mapping(mapping));
		this.addState(new Settings(settings));
		this.addState(new Battle(battle));
		this.addState(new Rewards(rewards));
		this.addState(new Shop(shop));
		this.addState(new Inventory(inventory));
		this.addState(new Starter(starter));
		this.addState(new ChangeLog(changelog));
		this.addState(new SharedStorage(sharedstorage));
	}
	
	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(menu).init(gc, this);
		this.getState(mapping).init(gc, this);
		this.getState(settings).init(gc, this);
		this.getState(battle).init(gc, this);
		this.getState(rewards).init(gc, this);
		this.getState(inventory).init(gc, this);
		this.getState(shop).init(gc, this);
		this.getState(starter).init(gc, this);
		this.getState(changelog).init(gc, this);
		this.getState(sharedstorage).init(gc, this);
		this.enterState(menu);
	}

	public static void main(String[] args) {
		AppGameContainer appgc;
		Scanner in;
		try {
			in = new Scanner (new File("settings.ini"));
			height = Integer.parseInt(in.next());
	        width = Integer.parseInt(in.next());
	        FPSmeter = Boolean.parseBoolean(in.next());
	        javagame.Player.FPS = FPSmeter;
	        FPS = Integer.parseInt(in.next());
	        if(FPS == 1){
	        	javagame.Player.FPScounter = 30;
	        	FrameRate = 30;
	        }else if(FPS == 2){
	        	javagame.Player.FPScounter = 60;
	        	FrameRate = 60;
	        }else if(FPS == 3){
	        	javagame.Player.FPScounter = 120;
	        	FrameRate = 120;
	        }else if(FPS == 4){
	        	javagame.Player.FPScounter = 240;
	        	FrameRate = 240;
	        }
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try{
			appgc = new AppGameContainer(new Game(gamename));
			appgc.setDisplayMode(width, height, false);
			appgc.setIcon("res/Map/portal.png");
			appgc.setTargetFrameRate(FrameRate);
			appgc.setShowFPS(FPSmeter);
			height = Display.getHeight();
			width = Display.getWidth();
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();
		}
	}

}
