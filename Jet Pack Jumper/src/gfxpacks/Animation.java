package gfxpacks;

import java.awt.image.BufferedImage;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Animation {

	long lastTime;
	int speed,index;
	int timer;
	BufferedImage[] frames;
	
	public Animation(int speed, BufferedImage[] frames) {
		
		this.speed=speed;
		this.frames=frames;
		index=0;
		timer=0;
		lastTime=System.currentTimeMillis();
	}
	
	
	public void update() {
		
	    timer+=System.currentTimeMillis()-lastTime;
	    lastTime=System.currentTimeMillis();
	
	if(timer>speed)
	{
		index++;
		timer=0;
		if(index>=frames.length)
		{
			index=0;
		}
		
		
	}
	
	
	
	
	}
	
	
	public BufferedImage getCurrentFrame() {
		
		return frames[index];
		 
	}
	
	
	
}
