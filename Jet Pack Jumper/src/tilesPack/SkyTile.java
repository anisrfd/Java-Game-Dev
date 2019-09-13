package tilesPack;

import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class SkyTile extends Tiles{
	
	
	
	 
int width=256;
int height =256;




	public SkyTile( int id) {
		super(Elements.visited, id);
		 
	}

	
	
	
	
	
	public boolean isSolid()
	{
		return false;
	}

}
