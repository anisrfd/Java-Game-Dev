package gfxpacks;

import java.awt.image.BufferedImage;

public class SpriteSheet {
	
	private BufferedImage sheet;
	
	public SpriteSheet(BufferedImage sheet)
	{
	this.sheet=sheet;	 
	}
	
	
	//crops the required sprites from the sheet
	public BufferedImage crop(int x,int y , int width, int height)
	
	{
		
		return sheet.getSubimage(x, y, width, height);
		
		
		
		
	}
	

}
