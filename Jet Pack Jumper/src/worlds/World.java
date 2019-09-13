package worlds;

import java.awt.Graphics;
import java.security.PublicKey;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

import javax.security.auth.x500.X500Principal;

import entity.Entity;
import entity.EntityManager;
import entity.Player;
import gfxpacks.Elements;
import inGameobjects.Jems;
import inGameobjects.MovingMines;
import mainPackage.Gameplay;
import mainPackage.Handler;
import tilesPack.SurfaceTile;
import tilesPack.Tiles;
import utilityFunctions.Util;

public class World {

 int width, height,spawnX,spawnY;
	public static int [][] tiles2D;
	Handler handler;
	EntityManager entityManager;
	boolean stop=true;
 int count=0;
 Jems jems ;
 
Random rand = new Random();


	
	public World(Handler handler,String path)
	{this.handler=handler;
	
	//entityManager=new EntityManager(handler,new Player(handler, 100,100));
	 
 //adding jems
	//addJemsInTheworld();
	//entityManager.addEntity(new Jems(handler, 5000, 100));
	
	loadWorld(path);	
	
	addJemsInTheworld();
	
	//entityManager.getPlayer().setX(spawnX);
	//entityManager.getPlayer().setY(spawnY);
	
	
	
	
	}
	
	
	
	
	
	void loadWorld(String path)
	{
		String file= Util.loadFileAsString(path);
		String[] token=file.split("\\s+"); // splits on spcace or newline
		width=Util.toIntegar(token[0]);
		height=Util.toIntegar(token[1]);
		spawnX=Util.toIntegar(token[2]);
		spawnY=Util.toIntegar(token[3]);
		
		  tiles2D=new int[width][height];
		
		for(int y=0;y<height;y++)
			{
			for(int x=0;x<width;x++)
			{
				
				tiles2D[x][y]=Util.toIntegar(token[(x+y*width)+4]); //coverting 2d int 1d array and add 4 as the frst 4 data is fixed before
				
			}
		
			}
	}
	
	
	//adding jems
	
	public void addJemsInTheworld()
	{
		entityManager.addEntity(new Jems(handler, 100, 100));
		entityManager.addEntity(new Jems(handler, 3154, 454 ));
		entityManager.addEntity(new Jems(handler, 2242, 767 ));
		entityManager.addEntity(new Jems(handler,1119,2726  ));
		entityManager.addEntity(new Jems(handler,185,1222  ));
		entityManager.addEntity(new Jems(handler,4558,70  ));
		entityManager.addEntity(new Jems(handler,4702,1140  ));
		entityManager.addEntity(new Jems(handler,6106,100  ));
		entityManager.addEntity(new Jems(handler,6100,1300  ));
		entityManager.addEntity(new Jems(handler,5066,1385  ));
		entityManager.addEntity(new Jems(handler,1530,1420  ));
		entityManager.addEntity(new Jems(handler,567,2630  ));
		entityManager.addEntity(new Jems(handler,55,2630  ));
		entityManager.addEntity(new Jems(handler,2536,2000  ));
		entityManager.addEntity(new Jems(handler,3374,2239  ));
		entityManager.addEntity(new Jems(handler,3637,3014  ));
		entityManager.addEntity(new Jems(handler,1459,2800  ));
		entityManager.addEntity(new Jems(handler,867,2900  ));
		entityManager.addEntity(new Jems(handler,48,2600  ));
		entityManager.addEntity(new Jems(handler, 4237,3078 ));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 
	
	
	public Tiles getTile(int x,int y) {
		
		
		if (x<0 || y<0 || y>height|| x>width)
			return Tiles.skyTile;
		
		
		
Tiles t=Tiles.tiles[tiles2D[x][y]];		
		if (t==null)
			return Tiles.skyTile; // if there is no tile in that index we return a default tile
		
		
		return t;
	
	}
	
	
	
	
	
	
	
	public void update()
	{
		entityManager.update();
		
		
		//random mines
		//stop=true;
		//if(count%100==0) 
		//{  
			//int n= rand.nextInt(7000)+64;
		
			//entityManager.addEntity(new MovingMines(handler, n, -6));
			 
			
			
		//}	
		//count++; 
		
	 
		
		 
		
		
		 
	}
	
	// ----------
	public void render(Graphics g )
	{//only loads the gfx upto the camera screen
		
		int xStart= (int) Math.max(0, handler.getGameCamera().getxOffset()/Tiles.TILE_WIDTH);
		 int xEnd=(int)Math.min(width, (handler.getGameCamera().getxOffset()+handler.getWidth())/Tiles.TILE_WIDTH +1);
		 int yStart=(int)Math.max(0, handler.getGameCamera().getyOffset()/Tiles.TILE_HEIGHT);
		int yEnd=  (int)Math.min(height, (handler.getGameCamera().getyOffset()+handler.getHeight())/Tiles.TILE_HEIGHT +1);
		
		
		
		for(int y= yStart;y<yEnd;y++)
			{
			for(int x=xStart;x<xEnd;x++)
			{
				
				getTile(x, y).render(g, (int)(x*Tiles.TILE_WIDTH - handler.getGameCamera().getxOffset() ), (int)(y*Tiles.TILE_HEIGHT - handler.getGameCamera().getyOffset()));
				
				
				
			}
			
			
			}
		
		//entities
		//entityManager.render(g);
		
		
	}
	
	public int getWidth() {
		return width;
		
	}
	public int getHeight()
	
	{
		return height;
	}
	
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	
	
	
	
	
}
