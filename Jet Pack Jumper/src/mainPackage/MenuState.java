package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

import entity.EntityManager;
import entity.Player;
import gfxpacks.Elements;
import gfxpacks.ImageLoader;
import worlds.World;

import java.awt.image.BufferedImage;
public class MenuState extends State{
	World world;	
	
 BasicUiManager basicUiManager;
	
 boolean instruction= false;
 
	
	public MenuState(Handler handler) {
		super(handler);
		  world = new World(handler,"res/images/worldmap1.txt");
		 basicUiManager= new BasicUiManager(handler);
		 handler.getMouseManager().setUimanager(basicUiManager);
		 
		 
		 
	}



	@Override
	public void update()
	{   
		
		if(handler.getMouseManager().isPressedLeft())
		{
			instruction=false;
			
		}
		
	}

	
	
	@Override
	public void render(Graphics g)
	{   
		 
		
		
		
		
		
		 
		world.render(g);
		basicUiManager.render(g);
		 
		 
		 
}
	
	
	
	
	

}
