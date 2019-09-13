package tilesPack;

import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class TreeTile extends Tiles{

	public TreeTile(  int id) {
		super(Elements.tree, id);
	 
	}
	

	
	
	public boolean isSolid()
	{
		return false;
	}
	
	
	
	
}
