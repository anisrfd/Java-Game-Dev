package entity;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.print.attribute.standard.RequestingUserName;

import gfxpacks.Animation;
import gfxpacks.Elements;
import mainPackage.Gameplay;
import mainPackage.Handler;
import mainPackage.State;

public class Player extends Creature{
  // if no default constructor then we make explicit call to superClass constructor
	
	 double gravity =7.5;
	public static final double DEFAULT_fuel=200;
	double fuel=DEFAULT_fuel;
	
	
	//animations
	Animation aniHold,aniLeftDown,aniRightDown,aniRight,aniLeft,aniLeftUp,aniRightUp,aniIdleRight,aniIdleLeft;
	
	
	
	
	
	
	public static double Playerhealth=250;
	public Player(Handler handler, float x, float y) {
		super(handler,x, y,DEF_CREATURE_WIDTH,DEF_CREATURE_HEIGHT);// this width and height are assigned to entity then we use that width and height in render of this class
		 
		// have to change acc to different shapes and sizes
		
		bounds.x=16;
		bounds.y=16;
		bounds.width=29;
		bounds.height=40;
		
		//animations
		
		aniRightDown=new Animation(500, Elements.player_downright);
		aniRightUp=new Animation(500, Elements.player_upright);
		aniLeft=new Animation(200, Elements.player_left);
		aniRight=new Animation(200, Elements.player_right);
		aniLeftUp=new Animation(500, Elements.player_upleft);
		aniLeftDown=new Animation(500, Elements.player_downleft);
		//aniRightUp=new Animation(200, Elements.player_upright);
		//aniRightDown=new Animation(200, Elements.player_downright);
		aniIdleLeft=new Animation(500, Elements.player_idleleft);
		aniIdleRight=new Animation(500, Elements.player_idleright);
		aniHold=new Animation(500, Elements.player_hold);
		
		
		
		
		
		
	}

	@Override// we control character with game object added to keylistener
	
	public void update() {
		checkPlayerHealth();
		//animation
		aniRight.update();
		aniIdleLeft.update();
		aniIdleRight.update();
		aniLeft.update();
		aniRightUp.update();
		aniRightDown.update();
		aniLeftDown.update();
		aniLeftUp.update();
		aniHold.update(); 
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		 getInput();
		 move();
		 handler.getGameCamera().cameraOnEntity(this);
		 
		
	}
	//flag
	int f=1;
	
	public void  getInput() {
		xMove=0;
		yMove=(float)gravity;
		if (handler.getKeyManager().up)
			//yMove=-speed;
		//if(handler.getKeyManager().down)
			yMove=speed;
		//System.out.println("XMove = "+xMove+"F = "+f);
		
		
		if(handler.getKeyManager().left){
			f=0;
		 xMove=-speed;
		 //System.out.println("XMove = "+xMove);
		}
		
		if(handler.getKeyManager().right){
			f=1;
		xMove=speed;
		}
		if(handler.getKeyManager().jump && fuel>0)
		{
			//System.out.println("YMove = "+yMove+"F = "+f);
			jump();
			//System.out.println("YMove = "+yMove+"F = "+f);
			
		}
		//Hold
		if(handler.getKeyManager().hold){
			if(handler.getKeyManager().jump && fuel>0){
				yMove=0;
			}
		}
		
	}

	//jump
	boolean j=true;
	  private void jump() {
	 
		  if(j)
		  {
			  yMove=-1;
			  fuel=fuel-1;
			  j=false;
		  }
		  j=true;
		  

	}
	
	
	  public void checkFuel() {
		  
		  
		if (fuel==0 || fuel<120)
			fuel=fuel+.25;
	}
	  
	// player health
	  
	  public void checkPlayerHealth() {
		
		  if (Playerhealth<0)
		  {
			  State.setState(handler.getGame().getMenustate());
		  }
		  
	}
	
	
	@Override
	public void render(Graphics g) {
		
		
		
		 g.drawImage(getCurrentAnimationFrame(),(int) (x-handler.getGameCamera().getxOffset()),(int) (y-handler.getGameCamera().getyOffset()),width,height ,null); // we took x y float for smoother movement
		
		 //hghghghghghghghg collosion
		 checkFuel();
		  g.setColor(Color.red);
		  g.fillRect(0, 0, (int)fuel, 7);
		  
		  
		  //health bar
		  
		  g.setColor(Color.green.darker());
		 g.fillRect(0, 5, (int)Playerhealth, 10);
		  
		 
		 
	}
	
	
	
	
	
	//animation
	
	public BufferedImage getCurrentAnimationFrame()
	{
		
		//if(xMove==0 && f==0){
			//return aniIdleLeft.getCurrentFrame();
		//}
		// if(xMove==0 && f==1){
			//return aniIdleLeft.getCurrentFrame();
		//}
		 if(xMove<0 && f==0 )
		 {
			// if(xMove<=0 && f==0)
				// return aniIdleLeft.getCurrentFrame();
			 
			 //else
				 //return aniIdleLeft.getCurrentFrame();
			 return aniLeft.getCurrentFrame();
			 
		 }
		 //if(f==0 && xMove==0)
			// return aniIdleLeft.getCurrentFrame();
		 if(xMove>0 && f==1)
		 {
			  
			  if(handler.getKeyManager().hold){
					if(handler.getKeyManager().jump && fuel>0){
						return aniHold.getCurrentFrame();
					}
				}
			  
			       return aniRight.getCurrentFrame();
		 }
		 
		  if(yMove<2)
		 {
				 return aniRightUp.getCurrentFrame();
			  
 	 
		 } 
		  else
		  {
			  //if(xMove>0 || xMove==0 && f==1)
				//  return aniIdleRight.getCurrentFrame();
			  
			   if( f==0 )
				  return aniIdleLeft.getCurrentFrame();
			  
			   else
			  return aniIdleRight.getCurrentFrame();
					  
			  
			  
		  }
			  
	}
	
	
	
	
	
	

}
