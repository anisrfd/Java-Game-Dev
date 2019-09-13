package inGameobjects;

import java.awt.Graphics;

import entity.StaticObjects;
import gfxpacks.Elements;
import mainPackage.Handler;
import mainPackage.State;
import tilesPack.Tiles;

public class Jems extends StaticObjects{

	public Jems(Handler handler, float x, float y ) {
		super(handler, x, y, Tiles.TILE_WIDTH/4,Tiles.TILE_HEIGHT/4);
		
		bounds.x=25;
		bounds.y=30;
		bounds.width=90;
		bounds.height=90;
		
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		 g.drawImage(Elements.jems, (int) (x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), null);
		
	}

	
	
	public boolean isJem()
	{
		
		return true;
	}
	
	
	
}
