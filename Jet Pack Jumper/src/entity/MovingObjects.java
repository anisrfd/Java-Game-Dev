package entity;

import mainPackage.Handler;

public abstract class   MovingObjects  extends Entity{

	public MovingObjects(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	
	public abstract void move();
	
	
}
