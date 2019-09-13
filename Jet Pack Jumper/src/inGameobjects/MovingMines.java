package inGameobjects;

import java.awt.Graphics;
import java.util.Random;

import entity.*;
import entity.MovingObjects;
import gfxpacks.Elements;
import mainPackage.Handler;
import tilesPack.Tiles;

public class MovingMines extends MovingObjects{

	public MovingMines(Handler handler, float x, float y ) {
		super(handler, x, y, Tiles.TILE_WIDTH/4,Tiles.TILE_HEIGHT/4);
		

		bounds.x=25;
		bounds.y=25;
		bounds.width=80;
		bounds.height=80;
		
		
		 
	}


 
Random rand = new Random();
	@Override
	public void update() {
		move();
		
	}

	@Override
	public void render(Graphics g) {
		 g.drawImage(Elements.mines, (int) (x-handler.getGameCamera().getxOffset()), (int)(y-handler.getGameCamera().getyOffset()), null);
		
	}

	@Override
	public void move() {
		//x=(int) rand.nextInt(50) + 1;;
		y=y+2;
		
	}

}
