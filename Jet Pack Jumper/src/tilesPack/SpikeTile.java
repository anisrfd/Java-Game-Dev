package tilesPack;

import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class SpikeTile extends Tiles {

	public SpikeTile( int id) {
		super(Elements.spikes, id);
		 
	}
	
	
	public boolean isSolid()
	{
		return true;
	}
	

	public boolean drainsLife() {
		return true;
		
	}
	
	
	
	
}
