package mainPackage;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class BasicUiManager {
	
	
	private Handler handler;
	ArrayList<BasicUi>basicUi;
	
	public BasicUiManager(Handler handler) {
		 this.handler=handler;
		 basicUi=new ArrayList<BasicUi>();
	}
	
	
	
	
	public void onMouseMove(MouseEvent e)
	{
		for(BasicUi o:basicUi)
			o.onMouseMove(e);
		 
	}
	
	public void onMouseRelease(MouseEvent e)
	{
		for(BasicUi o:basicUi)
			o.onMouseRelease(e);
	}
	
	
	
	public void addBasicUiObjects(BasicUi o)
	{
		basicUi.add(o);
	}
	
	public void removeBasicUiObjects(BasicUi o)
	{
		basicUi.remove(o);
	}
	
	
	
	
	public void update()
	{
		for(BasicUi o: basicUi)
			o.update();
	}
	
	public void render(Graphics g)
	{
		for(BasicUi o:basicUi)
			o.render(g);
	}
	
	
	
	
	

}
