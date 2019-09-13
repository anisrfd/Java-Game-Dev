package gfxpacks;

import javax.imageio.spi.RegisterableService;

import entity.Entity;
import mainPackage.Gameplay;
import mainPackage.Handler;
import tilesPack.Tiles;

public class GameCamera {

	float xOffset,yOffset;
	private Handler handler;
	public GameCamera(Handler handler,float x,float y) {
		
		this.handler=handler;
		xOffset=x;
		yOffset=y;
		
	}
	
	
	
	// blank space render stopper
	
	public void checkBlankSpace() {
		
		if(xOffset<0)
			xOffset=0;
		
		else if (xOffset> handler.getWorld().getWidth()*Tiles.TILE_WIDTH-handler.getWidth())
			
		{
			xOffset=handler.getWorld().getWidth()*Tiles.TILE_WIDTH-handler.getWidth();
		}
		
		if (yOffset<0)
			{
			yOffset=0;
			}
			
		else if (yOffset> handler.getWorld().getHeight()*Tiles.TILE_HEIGHT-handler.getHeight())
				{
			yOffset= handler.getWorld().getHeight()*Tiles.TILE_HEIGHT-handler.getHeight();
				}
	 
		
		
	}
	
	
	
	
	public void  move(float x, float y) // m o ve m e n t
	{
		
		xOffset+=x;    
        yOffset+=y;
		checkBlankSpace();
		
		
		
	}
	
	public void cameraOnEntity(Entity e) //position of camera focus
	{
		xOffset=e.getX()- handler.getWidth()/2+e.getWidth()/2;
		yOffset=e.getY()- handler.getHeight()/2 + e.getHeight()/2;
		checkBlankSpace();
		
	}
	
	
	
	
	
	public void setxOffset(float xOffset) {
		this.xOffset = xOffset;
	}
	
	public void setyOffset(float yOffset) {
		this.yOffset = yOffset;
	}
	
	public float getxOffset() {
		return xOffset;
	}
	
	public float getyOffset() {
		return yOffset;
	}
	
	
	
}
