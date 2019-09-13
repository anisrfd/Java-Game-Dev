package entity;

import gfxpacks.Elements;
import mainPackage.Gameplay;
import mainPackage.Handler;
import tilesPack.Tiles;

public abstract class Creature extends Entity{
      
	
	int health;
	float speed;
	public float xMove,yMove;
	float gravity=(float) 3.8;
	
	public static final int DEF_HEALTH=200;
	public static final float DEF_SPEED=3.0f;
	public static final int DEF_CREATURE_WIDTH=64, DEF_CREATURE_HEIGHT=64;
	
	
	
	public Creature(Handler handler,float x, float y,int width, int height) {
		super(handler,x, y,width,height);
		// TODO Auto-generated constructor stub
		health=DEF_HEALTH;
		speed=DEF_SPEED;
		xMove=0;
		yMove=0;
	}

	
	
	public void move()
	{
		
		if(!checkEntityCollision(xMove, 0f))
		moveX();
		
		if(!checkEntityCollision(0f, yMove))
		moveY();
		
	}
	//collision
	
	public void moveX()
	
	{ 
		if (xMove>0) //moving right
	{
		int tx=  (int) (x+xMove+bounds.x+bounds.width)/Tiles.TILE_WIDTH;
		
		//life calculations
		if(handler.getWorld().getTile(tx,(int)(y+bounds.y)/Tiles.TILE_HEIGHT ).drainsLife() || handler.getWorld().getTile(tx, (int)(y+bounds.y+bounds.height)/Tiles.TILE_HEIGHT ).drainsLife())
			Player.Playerhealth=Player.Playerhealth-.5;
		
		
		
		
		if(!collisionWithTile(tx, (int)(y+bounds.y)/Tiles.TILE_HEIGHT )&& !collisionWithTile(tx, (int)(y+bounds.y+bounds.height)/Tiles.TILE_HEIGHT ))
		{
			x+=xMove;
		}
		
		else 
			x=tx*Tiles.TILE_WIDTH-bounds.x-bounds.width-1;
		
		
	}
		else if(xMove<0)
		{//moving left
			
			
			int tx=  (int) (x+xMove+bounds.x)/Tiles.TILE_WIDTH;
			
			if(handler.getWorld().getTile(tx,(int)(y+bounds.y)/Tiles.TILE_HEIGHT ).drainsLife() || handler.getWorld().getTile(tx, (int)(y+bounds.y+bounds.height)/Tiles.TILE_HEIGHT ).drainsLife())
				Player.Playerhealth=Player.Playerhealth-.5;
			
			
			
			if(!collisionWithTile(tx, (int)(y+bounds.y)/Tiles.TILE_HEIGHT )&& !collisionWithTile(tx, (int)(y+bounds.y+bounds.height)/Tiles.TILE_HEIGHT ))
			{
				x+=xMove;
			}
			else
				x=tx*Tiles.TILE_WIDTH+Tiles.TILE_WIDTH-bounds.x;

		}
 

	}
	
	public void moveY() {
		
		if(yMove<0){
			//up
			
			int ty=(int) (y+bounds.y+yMove)/Tiles.TILE_HEIGHT;
			
			//life check
			
			if(handler.getWorld().getTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty)==Tiles.spikes || handler.getWorld().getTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty)==Tiles.fireTile || handler.getWorld().getTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH, ty)==Tiles.spikes || handler.getWorld().getTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH, ty)==Tiles.fireTile)
				Player.Playerhealth=Player.Playerhealth-.5;
			
			
			
			if(!collisionWithTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty) && !collisionWithTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH,ty))
			{
				y-=gravity;
				
					 
			}
			else
			{
				y=ty*Tiles.TILE_HEIGHT+Tiles.TILE_HEIGHT-bounds.y;
			
			
				
			
			}
		}
		
		else if (yMove>0) {
			//move down
			
			 
			
			
			
			
			int ty=(int) (y+bounds.y+yMove+bounds.height)/Tiles.TILE_HEIGHT;
			
			//life check
			
			if(handler.getWorld().getTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty)==Tiles.spikes || handler.getWorld().getTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty)==Tiles.fireTile || handler.getWorld().getTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH, ty)==Tiles.spikes || handler.getWorld().getTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH, ty)==Tiles.fireTile)
				Player.Playerhealth=Player.Playerhealth-.5;
			
			
			
			
			
			if(!collisionWithTile((int)(x+bounds.x)/Tiles.TILE_WIDTH, ty) && !collisionWithTile((int)(x+bounds.x+bounds.width)/Tiles.TILE_WIDTH,ty))
			{
				y+=gravity;
				
				
				 
			 
				
				
			}
			
			else
				
				{
				y=ty* Tiles.TILE_HEIGHT-bounds.y-bounds.height-2;
				
				 
				
				}
			
		}
		//System.out.println("YMove = "+y);
		
	}
	
	public boolean collisionWithTile(int x,int y) {
		return handler.getWorld().getTile(x, y).isSolid();
		
	}
	
	
	
	
	public int getHealth() {
		return health;
	}





	public void setHealth(int health) {
		this.health = health;
	}





	public float getSpeed() {
		return speed;
	}





	public void setSpeed(float speed) {
		this.speed = speed;
	}





	
}
