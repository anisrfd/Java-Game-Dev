package mainPackage;

import java.awt.Graphics;

import entity.Player;
import gfxpacks.Elements;
import gfxpacks.GameCamera;
import tilesPack.Tiles;
import worlds.World;
//ekhan theke stage1/stage2 state methods call kora hobe 


public class GameState extends State {
	
	Gameplay game;
	Player player;
	World world;
	
	long startTime = System.currentTimeMillis();
	long endTime = 0;
	public static long min;
	public static long timecount;

	
	
	public GameState(Handler handler) 
	{   
		super(handler);
		
		world=new World(handler,"res/images/worldmap1.txt");
		
		handler.setWorld(world);
		
		// player= new Player(handler,200, 299);
		
	// game.getGameCamera().move(130, 0);
	 
	}

	
	@Override
	public void update()
	{   world.update();
		// player.update();
		//game.getGameCamera().move(1, 1);
	endTime=System.currentTimeMillis();
	timecount=(endTime-startTime)/1000;
	if(timecount==60){
		min++;
		startTime=System.currentTimeMillis();
	}
	System.out.println(timecount);
	
		
	}

	
	
	@Override
	public void render(Graphics g)
	{   
		//g.drawImage(Elements.under, 0, 0, null);
      // g.drawImage(Elements.background, 0, 0, null);
        //g.drawImage(Elements.under, 0, 500, null);
		
		//world.render(g);
		//g.drawImage(Elements.player_right[0], 0, 0, null);
 		//player.render(g); 
		//Tiles.tiles[0].render(g, 100, 100);
		
}
	
	
	
	
	
	
	
}