package mainPackage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class UiImageButtons extends BasicUi{

	private BufferedImage  btn;
	private ClickListener clicker;
	
	
	
	
	public UiImageButtons(int x, int y, int width, int height,BufferedImage btn,ClickListener clicker) {
		super(x, y, width, height);
		 this.btn=btn;
		 this.clicker=clicker;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		if(hovering)
			g.drawImage(btn, x, y,width,height,null);
		
		//else
			//g.drawImage(btn[0], x, y,width,height,null);
			
	}

	@Override
	public void onClick() {
		clicker.onClick();
		
	}

}
