package tilesPack;

import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class LeftSpike extends Tiles{

	public LeftSpike( int id) {
		 super(Elements.lspike,id);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean isSolid() {
		 
		return  true;
	}

	public boolean drainsLife() {
		return true;
		
	}
	
	
	
}
