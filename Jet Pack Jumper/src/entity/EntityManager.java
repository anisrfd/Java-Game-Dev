package entity;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.ListIterator;

import inGameobjects.Jems;
import inGameobjects.MovingMines;
import mainPackage.Handler;
import mainPackage.State;

public class EntityManager {

	public static int jemsCount=0;
	Handler handler;
	public Player player;
	ArrayList<Entity>entities;
	//public ListIterator listIterator  ;
	
	
	public EntityManager(Handler handler,Player player) {
		this.handler=handler;
		this.player=player;
		entities= new ArrayList<Entity>();
		//listIterator=entities.listIterator();
	}
	
	
	public void addEntity (Entity e) {
		
		
		entities.add(e);
	}
	
	
	
	public void  update() {
		
		for(int i=0;i<entities.size();i++)
		{
			Entity e=entities.get(i); 
			e.update();
		 
		    
			if(player.checkEntityCollision(player.xMove,player.yMove) && e instanceof Jems )
			{  
				entities.remove(e);
				jemsCount++;
				 	
				
				 	
				 	
				 	
			}
				
			
			if(player.checkEntityCollision(player.xMove,player.yMove) && e instanceof MovingMines )	
			   {
				 
					player.Playerhealth=0;
			
			
			
			}
			
			 
				
			
		}
		player.update();
	
	}
	
	public void render(Graphics g) {
	
		for(Entity e: entities)
			
		e.render(g);
		
		
		player.render(g);
	}

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
	
	
	
	
	
	
}
