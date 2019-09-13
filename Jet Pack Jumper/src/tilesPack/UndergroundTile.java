package tilesPack;

import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class UndergroundTile extends Tiles {
	
	

	public UndergroundTile(  int id) {
		super(Elements.underground, id);
		 
	}
	
	
	
	public boolean isSolid()
	{
		return false;
	}
	

}
