package mainPackage;


import gfxpacks.*;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

public class Gameplay implements Runnable {
	
	boolean running =false;
	Thread gameThread;
	BufferStrategy bs;
	Graphics g;
	DisplayCanvas canvas;
	BufferedImage image;
	KeyManager keyManager;
	MouseManager mouseManager;
	public static BufferedImage background;
	public  long  startTime;
	public  long endTime =0;
	public static long timeCount=0;
	
	//game state
	public State gamestate;
	State menuState;
	
	//camera
	GameCamera gameCamera;
	
	//handler
	Handler handler;
	
	
	public Gameplay() {
		
	keyManager=new KeyManager();
	mouseManager = new MouseManager();
     
	
	}
	
	
	//sends the keylistener object to playerClass
	
	public KeyManager getKeyManager() 
	{
		return keyManager;
	}
	public MouseManager getMouseManager()
	{
		return mouseManager;
	}
	
	public int getWidth()
	{
		return canvas.width;
	}
	
	
	public  int getHeight()
	{
		return canvas.height;
		
	}
	
	public GameCamera getGameCamera()
	{
		return gameCamera;
	}
	
	public Graphics getGraphics() {
		return g;
		
	} 
	
	public State getMenustate()
	{
		return menuState;
	}
	
	
	void innitDisplay ()
	{
		 canvas=new DisplayCanvas();
		canvas.addKeyListener(keyManager);
		canvas.addMouseListener(mouseManager);
		canvas.addMouseMotionListener(mouseManager);
		//canvas.getJframe().addMouseListener(mouseManager);
		//canvas.getJframe().addMouseMotionListener(mouseManager);
		
		 
		
		Elements.loadElements();
		 
		handler=new Handler(this);
		gameCamera=new GameCamera(handler, 0, 0);
		 
		//determine game state
		
		gamestate=new GameState(handler); //sends an instance of this class
		menuState= new MenuState(handler);
		State.setState(menuState); //sets the game state now its not null
		
	}
	
	
	
	
  public synchronized void start() 
  {
		
	  if(running) 
		  return;
	
	
	    running=true;
	    gameThread=new Thread(this);
		
		gameThread.start();
	}
	
	
	
	
	
	
	public void run () //game loop
	
	
	
	
{ startTime=System.nanoTime();
		
		
		
		innitDisplay();
		
		
		
		 
		while(running)
		{
			 
			
			
			int count=0;
			
		 
			render();
		 
			
			update();
			
			try {
				gameThread.sleep(9);
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
			
			
		
	}
		 
	 
	}
	
	
	
	
	
	
	
	
	
	public void update() 
	{
		keyManager.update();
		
		
		if(State.getState()!=null)
		{
			State.getState().update(); //gets the current state and updates that example menu state or level1 state of the game
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	public void render() 
	{
		
		
		bs=canvas.getBufferStrategy();
		if(bs==null)
		{
			canvas.createBufferStrategy(3); //triple buffering
			return;
		
		}
		
		g=bs.getDrawGraphics(); //draws on the canvas 
		//clearScreen
		g.clearRect(0, 0, canvas.width, canvas.height);
		
		//drawing the current state
		if(State.getState()!=null)
			State.getState().render(g);// sends the graphics object to render the current state
		
		
		
		
		
		
		
		
		
		
		
		
		
		bs.show();
		g.dispose();
		
		
		
		
		
	}
	
}
