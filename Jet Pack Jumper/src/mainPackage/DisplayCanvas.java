package mainPackage;

import java.awt.Canvas;

import javax.swing.JFrame;

import java.awt.*;

public class DisplayCanvas extends Canvas{
	
	
	private JFrame frame;
	 int width=900, height= 512;
	Dimension size= new Dimension(width, height);
	
	
	
	
	public DisplayCanvas() {
		
		
		loadFrame();
		 
	}
	
	
	
	
	
	
	

	  public void loadFrame()
	  {
		  
		  setMaximumSize(size); 
		   setPreferredSize(size);
		   JFrame frame=new JFrame("DemoGame");
		   frame.setResizable(false);
		   frame.add(this);
		   frame.setFocusable(true); //hgsjhagshjkahjahsjkdxh
		   frame.requestFocus();
		   frame.setVisible(true);
		   frame.setLocationRelativeTo(null);
		   frame.pack();
		   
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		 
		    
		  
		   
		   
		   
		  
	  }
	  
	  
	  public JFrame getJframe()
	  {
		return frame;
 	  }
	  
	  
	  
	  
	

}
