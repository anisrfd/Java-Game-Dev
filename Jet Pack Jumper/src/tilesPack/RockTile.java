package tilesPack;

 
import java.awt.image.BufferedImage;

import gfxpacks.Elements;

public class RockTile extends Tiles{
	
	 

		public RockTile( int id) {
			super( Elements.rock, id);
			 
		}

		
		
		
		
		
		public boolean isSolid()
		{
			return true;
		}
		
		
		
	
	
	
	
	
	
	

}
