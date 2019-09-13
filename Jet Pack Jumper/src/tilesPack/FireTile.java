package tilesPack;

import gfxpacks.Elements;
import java.awt.image.BufferedImage;


public class FireTile extends Tiles {
	//FireAnimation fire;

	public FireTile( int id) {
		

		super(Elements.fire[0], id);
		
		 //fire=new FireAnimation(500, Elements.fire);
		 
	}


//public void render(Graphics g) {
	
	
	
	 //g.drawImage(getCurrentAnimationFrame(),(int) (x-handler.getGameCamera().getxOffset()),(int) (y-handler.getGameCamera().getyOffset()),width,height ,null); // we took x y float for smoother movement
	// g.drawImage(getCurrentAnimationFrame(), 0, 0, null);
	 //hghghghghghghghg collosion
	
	 
	 
//}
/*public BufferedImage getCurrentAnimationFrame()
{
	
	 
	 
	  
		  
		 
		 return fire.getCurrentFrame();
	 
	 
	  
	 
	  if(yMove>0)
	 {
		//return aniRightDown.getCurrentFrame();
		
	 } */
	 
	 
	  
		  
	  
		  
	public boolean isSolid()
	{
		return false;
	}
	
	
	
	
	public boolean drainsLife() {
		return true;
		
	}
	
}
