package tilesPack;

import gfxpacks.Elements;

public class RightSpike extends Tiles{

	public RightSpike(int id) {
		super(Elements.rspike,id);
		 
	}
	
	
	
	
	@Override
	public boolean isSolid() {
		 return true;
		 
	}

	public boolean drainsLife() {
		return true;
		
	}
	
	
	
	
	
}
