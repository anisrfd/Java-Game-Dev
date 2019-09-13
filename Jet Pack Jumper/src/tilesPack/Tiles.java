package tilesPack;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import gfxpacks.Elements;
import mainPackage.BasicUiManager;
import mainPackage.ClickListener;
import mainPackage.Handler;
import mainPackage.State;
import mainPackage.UiImageButtons;
import worlds.World;

 

public class Tiles {
	BasicUiManager basicUiManager;
	Handler handler;

	BufferedImage texture;
	public static final int TILE_WIDTH=64,TILE_HEIGHT=64;
	protected final int id;// each tile has unique id
	
	
	public static Tiles[] tiles= new Tiles[500];
	
	public static Tiles surfacetile= new SurfaceTile(1);
	
	public static Tiles skyTile= new SkyTile(99);
	public static Tiles dirtTile= new DirtTile(3);
	public static Tiles fireTile= new FireTile(7);
	public static Tiles underground= new UndergroundTile(5);
	public static Tiles spikes = new SpikeTile(6);
	public static Tiles rock= new RockTile(2);
	public static Tiles rspikes= new RightSpike(10);
	public static Tiles lspikes=new LeftSpike(9);
	
	
	
	
	
	
	
	
	
	public Tiles(BufferedImage texture,int id) 
	{
    this.texture=texture;
    this.id=id;
	 tiles[id]=this;
		
		
	}
	
	public int getID()
	{
		return id;
	}
	
	
	
	
	
	
	public void update()
	{
		
	}
	
	
	
	public void render(Graphics g,int x,int y)
	{
		//g.drawImage(texture, x, y, TILE_WIDTH,TILE_HEIGHT,null);
		 
		 basicUiManager.addBasicUiObjects(new UiImageButtons(x, y, TILE_WIDTH, TILE_HEIGHT, texture, new ClickListener() {
				
				@Override
				public void onClick() {
				
				World.tiles2D[x][y]=99;
					
				}
			}));
		
		
	}
	
	public boolean isSolid()
	{
		return true;
	}
	
	public boolean drainsLife() {
		return false;
		
	}
	
	
}
