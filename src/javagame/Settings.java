package javagame;

import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class Settings implements GameState {

	public String mouse = "No input yet!";
	Image playNow;
	Image exitGame;
	Image Button;
	Image Button_Pressed;
	Image delete;
	float lock = 20;
	float clock = 20;
	boolean hover1 = false;
	boolean hover2 = false;
	boolean hover3 = false;
	boolean exit = false;
	private UnicodeFont TEXT;
	int buttonCOUNT = 0;
	boolean hov1 = false;
	boolean hov2 = false;
	boolean hov3 = false;
	boolean hov4 = false;
	boolean hov5 = false;
	boolean hov6 = false;
	
	
	public Settings(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		Image[] walkDown1 = {new Image("res/Sprites/AdvenFront(1).png"), new Image("res/Sprites/AdvenFront(2).png"), new Image("res/Sprites/AdvenFront(3).png"), new Image("res/Sprites/AdvenFront(2).png")};
		Button = new Image("res/GUI/Button.png");
		Button_Pressed = new Image("res/GUI/Button_P.png");
		Font font = new Font("Verdana", Font.PLAIN, 20);
		TEXT = new UnicodeFont(font, 40, false, false);
		TEXT.getEffects().add(new ColorEffect(Color.WHITE));
		TEXT.addAsciiGlyphs();
		TEXT.loadGlyphs();
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)throws SlickException{
		g.drawString(mouse, 0, 0);
		g.drawString(mouse, 0, 0);
		g.drawString("FPS COUNTER:", 20, 330);
		g.drawString("FPS LIMIT:", 20, 430);
		g.drawString("TRUE", 335, 330);
		g.drawString("FALSE", 535, 330);
		g.drawString("30 FPS", 320, 430);
		g.drawString("60 FPS", 520, 430);
		g.drawString("120 FPS", 720, 430);
		g.drawString("240 FPS", 920, 430);
		g.drawString("Save Changes", 500, 630);
		g.drawString("Cancel", 720, 630);
		TEXT.drawString(550,140, "Settings");
		g.drawString("Please restart Client if options have changed", 450, 800);
		Button.draw(0,300);
		Button.draw(0,400);
		Button.draw(250,300);
		Button.draw(250,400);
		Button.draw(450,300);
		Button.draw(450,400);
		Button.draw(650,400);
		Button.draw(850,400);
		Button.draw(450,600);
		Button.draw(650,600);
		g.drawString("" + javagame.Player.FPS, 130, 330);
		if(hov1) {
			Button_Pressed.draw(250,300);
		}
		if(hov2) {
			Button_Pressed.draw(450,300);
		}
		if(hov3) {
			Button_Pressed.draw(250,400);
		}
		if(hov4) {
			Button_Pressed.draw(450,400);
		}
		if(hov5) {
			Button_Pressed.draw(650,400);
		}
		if(hov6) {
			Button_Pressed.draw(850,400);
		}
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		int posX = Mouse.getX();
		int posY = Mouse.getY();
		mouse = "Mouse position x: " + posX + " y: " + posY;
		
		lock -= delta * .1f;
		
		clock -= delta * .1f;
		
		// TRUE
		if((posX<buttons(0,0) && posX>buttons(0,1)) && (posY<buttons(0,2) && posY>buttons(0,3))){
			hov1 = true;
		}else{
			hov1 = false;
		}
		// FALSE
		if((posX<buttons(1,0) && posX>buttons(1,1)) && (posY<buttons(1,2) && posY>buttons(1,3))){
			hov2 = true;
		}else{
			hov2 = false;
		}
		// 30 FPS
		if((posX<buttons(2,0) && posX>buttons(2,1)) && (posY<buttons(2,2) && posY>buttons(2,3))){
			hov3 = true;
		}else{
			hov3 = false;
		}
		// 60 FPS
		if((posX<buttons(3,0) && posX>buttons(3,1)) && (posY<buttons(3,2) && posY>buttons(3,3))){
			hov4 = true;
		}else{
			hov4 = false;
		}
		// 120 FPS
		if((posX<buttons(4,0) && posX>buttons(4,1)) && (posY<buttons(4,2) && posY>buttons(4,3))){
			hov5 = true;
		}else{
			hov5 = false;
		}
		// 240 FPS
		if((posX<buttons(5,0) && posX>buttons(5,1)) && (posY<buttons(5,2) && posY>buttons(5,3))){
			hov6 = true;
		}else{
			hov6 = false;
		}
		// Save Changes
		if((posX<buttons(6,0) && posX>buttons(6,1)) && (posY<buttons(6,2) && posY>buttons(6,3))){
			hov6 = true;
		}else{
			hov6 = false;
		}
		// Cancel
		if((posX<buttons(7,0) && posX>buttons(7,1)) && (posY<buttons(7,2) && posY>buttons(7,3))){
			hov6 = true;
		}else{
			hov6 = false;
		}
	}
	
	public static int buttons(int num,int check){
		int cord[][] = {{450,250,720,645},{650,450,720,645},{450,250,620,545},{650,450,620,545},{850,650,620,545},{1050,850,620,545},{450,250,420,345},{650,450,420,345}};
		int listing[] = {cord[num][0],cord[num][1],cord[num][2],cord[num][3]};
		return listing[check];
	}
	
	public int getID(){
		return 5;
	}

	@Override
	public void mouseClicked(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerButtonPressed(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerButtonReleased(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerDownPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerDownReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerLeftPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerLeftReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerRightPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerRightReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerUpPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void controllerUpReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enter(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void leave(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}
	
}
