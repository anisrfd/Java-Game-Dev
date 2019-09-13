package entity;

import java.awt.Graphics;
import java.awt.Rectangle;

import inGameobjects.Jems;
import inGameobjects.MovingMines;
import mainPackage.Gameplay;
import mainPackage.Handler;

public abstract class Entity {
    
	
	public float x; // position
	public float y;
	protected int height ,width;
	
	public Handler handler;
	public Rectangle bounds;
	EntityManager entityManager;
	
	public Entity(Handler handler,float x, float y,int width,int height) {
		 
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.handler=handler;
		
	 	bounds=new Rectangle(0, 0, 0, 0);
		
		
	}
	
	public abstract void update();
	public abstract void render(Graphics g);
	
	
	
	
	
	public boolean checkEntityCollision(float xOffset, float yOffset) {
		
		for(Entity e: handler.getWorld().getEntityManager().getEntities())
		{  if (e.equals(this)) 
			 
		{
			continue;
		}
		
			if(e.getCollisionBounds(0f, 0f).intersects(getCollisionBounds(xOffset, yOffset)))
				return true;
		}
			
		return false;
	}
	
	
	
	
	
	
	
	
	public Rectangle getCollisionBounds (float xOffset,float yOffset) {
		return new Rectangle((int)(x+bounds.x+xOffset), (int)(y+bounds.x+yOffset), width, height);
		
		
		
		
	}
	
	
	

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
	
	
	
	
	
	
}
