package mainPackage;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;

public abstract class BasicUi {

	
	int x,y;
	int width,height;
	boolean hovering= false;
	Rectangle bounds;
	
	
	public BasicUi(int x,int y, int width, int height) {
		 this.height=height;
		 this.width=width;
		 this.x=x;
		 this.y=y;
		 bounds= new Rectangle(x, y, width, height);
	
}

	
	public abstract void update();
	public abstract void render(Graphics g);
	public abstract void onClick();
	
	
	public void onMouseMove(MouseEvent e)
	{
		if(bounds.contains(e.getX(),e.getY()))
			hovering=true;
				
		
		else
			hovering=false;
	}
	
	public void onMouseRelease(MouseEvent e)
	{
		if(hovering)
			onClick();
	}
	

	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public boolean isHovering() {
		return hovering;
	}


	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}
	
	
	
	
	
	
}