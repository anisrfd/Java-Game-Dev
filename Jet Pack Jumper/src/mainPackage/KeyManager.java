package mainPackage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener  {

	public boolean up,down,right,left,jump,hold;
	
	boolean [] keys;
	
	
	public  KeyManager() {
		 
 keys=new boolean[300];
		
		
	}
	
	
	public void update()
	{  //updating the keys weather true or false;
		
		up=keys[KeyEvent.VK_UP];
		down=keys[KeyEvent.VK_DOWN];
		left=keys[KeyEvent.VK_LEFT];
		right=keys[KeyEvent.VK_RIGHT];
		jump=keys[KeyEvent.VK_SPACE];
		hold=keys[KeyEvent.VK_F2];
		
		
	}
	
	
	
	
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		 
		keys[e.getKeyCode()]=true;
		System.out.println("pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		 keys[e.getKeyCode()]=false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	

}
