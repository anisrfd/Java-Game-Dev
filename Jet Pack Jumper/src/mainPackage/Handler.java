package mainPackage;

import java.awt.Graphics;

import gfxpacks.GameCamera;
import worlds.World;

public class Handler {

	private Gameplay game;
	private World world;
	
	
public Handler(Gameplay game) {
		 
		this.game=game;
		
		
	}
	

	
public int getWidth() {
	return game.getWidth();
	
}	

	public int getHeight() {
		
		return game.getHeight();
	}
	
	
	public KeyManager  getKeyManager() {
		return game.getKeyManager();
	}
	
	public MouseManager getMouseManager()
	{
		return game.getMouseManager();
	}
	
	
	
	public GameCamera getGameCamera() {
		return game.getGameCamera();
	}
	
	
	public Gameplay getGame() {
		return game;
	}

	public void setGame(Gameplay game) {
		this.game = game;
	}

	public World getWorld() {
		return world;
	}

	public void setWorld(World world) {
		this.world = world;
	}

	public Graphics getGameGraphics() {
		return game.getGraphics();
		
	}
	
}
