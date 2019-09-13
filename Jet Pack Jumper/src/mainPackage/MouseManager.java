package mainPackage;

import java.awt.Transparency;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import tilesPack.LeftSpike;

public class MouseManager implements MouseListener, MouseMotionListener{
	
	
	private boolean pressedLeft,pressedRight;
	 int mouseX,mouseY;
	 BasicUiManager basicUiManager;
	 
	 public void setUimanager(BasicUiManager basicUiManager)
	 {
		 this.basicUiManager=basicUiManager;
	 }
	
	
	public MouseManager() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	//getters
	
	public boolean isPressedLeft() {
		
		return pressedLeft;
		
	}
	public boolean isPressedRight() {
		return pressedRight;
	}
	
	
	
	
	
	
	
	
	public int getMouseX() {
		return mouseX;
	}





	 





	public int getMouseY() {
		return mouseY;
	}




 




	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		 mouseX=e.getX();
		 mouseY=e.getY();
		 
		 if(basicUiManager!=null)
				basicUiManager.onMouseMove(e);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		 if(e.getButton()==MouseEvent.BUTTON1)
			 pressedLeft=true;
		 else if (e.getButton()==MouseEvent.BUTTON3)
pressedRight=true;
	}

	
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getButton()==MouseEvent.BUTTON1)
			 pressedLeft=false;
		 else if (e.getButton()==MouseEvent.BUTTON3)
        pressedRight=false;
		
		
		if(basicUiManager!=null)
			basicUiManager.onMouseRelease(e);
		
	}

}
