package gfxpacks;

import java.awt.image.BufferedImage;

public class Elements {
     private static final int width=32,height=32;
     
	public static BufferedImage gameover,instruction, menu,jems,under,background,mines,wall,tree,surface,sky,rock,spikes,dirt,underground,rspike,lspike;
	
	public static BufferedImage[] player_downleft,player_downright,player_idleright,player_idleleft,player_upleft,player_upright,player_right,player_left;
	
	public static BufferedImage[] fire;
	public static BufferedImage[] player_hold;
	
	
	public static BufferedImage[] btn_start;
	public static BufferedImage[] btn_instructions;
	public static BufferedImage[] btn_quit;
	
	
	//aaaaaaaaaaaaaaaaa

	public static BufferedImage visit;
	public static BufferedImage visited;
	
	
	public static void loadElements() 
	{
		menu=ImageLoader.loadImage("/images/menu2.png");
		
		background=ImageLoader.loadImage("/Background/city5.png");
		under=ImageLoader.loadImage("/Background/under.png");
		SpriteSheet sheet=new SpriteSheet(ImageLoader.loadImage("/images/spritesheet.png"));
		//background=ImageLoader.loadImage("/Background/i.png");
		 
		
		player_downleft=new BufferedImage[1];
		player_upleft=  new BufferedImage[2];
		
		player_downright=new BufferedImage[1];
		player_upright=  new BufferedImage[2];
		
		 player_idleleft=new BufferedImage[1];
		 player_idleright=new BufferedImage[1];
		player_right=new BufferedImage[6];
		player_left=new BufferedImage[6];
		fire=new BufferedImage[8];
		player_hold=new BufferedImage[3];
		
		//buttons
		btn_start=new BufferedImage[2];
		btn_instructions=new BufferedImage[2];
		btn_quit=new BufferedImage[2];
		
		
		
		
		
		
		player_downright[0]=sheet.crop(width*2, height*5, width, height);
		player_downleft[0]=sheet.crop(width*0, height*6, width, height);
		
		player_upright[0]=sheet.crop(0, height*5, width, height);
		player_upright[1]=sheet.crop(width, height*5, width, height);
		
		player_upleft[0]=sheet.crop(width*2, height*5, width, height);
		player_upleft[1]=sheet.crop(width*1, height*5, width, height);
		
		player_idleright[0]=sheet.crop(width*0, height*3, width, height);
		
		player_right[0]=sheet.crop(width*2, height*3, width, height);
		player_right[1]=sheet.crop(width*3, height*3, width, height);
		player_right[2]=sheet.crop(width*4, height*3, width, height);
		player_right[3]=sheet.crop(width*5, height*3, width, height);
		player_right[4]=sheet.crop(width*6, height*3, width, height);
		player_right[5]=sheet.crop(width*7, height*3, width, height);
		
		 
		 
		player_idleleft[0]=sheet.crop(width*0, height*4, width, height);
		
		player_left[0]=sheet.crop(width*1, height*4, width, height);
		player_left[1]=sheet.crop(width*2, height*4, width, height);
		player_left[2]=sheet.crop(width*3, height*4, width, height);
		player_left[3]=sheet.crop(width*6, height*4, width, height);
		player_left[4]=sheet.crop(width*5, height*4, width, height);
		player_left[5]=sheet.crop(width*4, height*4, width, height);
		
		player_hold[0]=sheet.crop(width*2, height*5, width, height); 
		player_hold[1]=sheet.crop(width*3, height*5, width, height); 
		player_hold[2]=sheet.crop(width*4, height*5, width, height); 
		
		tree= sheet.crop(width*2, 0, width, height);
		
        spikes=sheet.crop(width*11, height*1, width, height);
		
		dirt=sheet.crop(width*8, height*7, width, height);
		
		rock=sheet.crop(width*6, height*7, width, height);
		
		surface=sheet.crop(width*4, height*7, width, height);
		
		
		fire[0]=sheet.crop(width*6, height*1, width, height);
		
		
		//underground=sheet.crop(width*7, 0, width, height);
        lspike=sheet.crop(width*11, height*2, width, height);
		
		rspike=sheet.crop(width*9, height*2, width, height);
		
		// entities
		
		mines=sheet.crop(width*12, 0, width, height);
		jems=sheet.crop(width*13, 0, width, height);
		//background=ImageLoader.loadImage("/Background/i.png");
		underground=sheet.crop(width*3, 0, width, height);
		//buttons
		SpriteSheet sheet2=new SpriteSheet(ImageLoader.loadImage("/Background/spritesheet.png"));
		btn_start[0]=sheet2.crop((width*0), height*0, width*4, height*2);
		btn_start[1]=sheet2.crop((width*4), height*0, width*4, height*2);
		//test code
		//btn_start[2]=sheet.crop((width*10), height*6, width*2, height);
		//btn_start[3]=sheet.crop((width*10), height*1, width*2, height);
		
		
		btn_instructions[0]=sheet2.crop((width*0), height*2, width*8, height*2);
		btn_instructions[1]=sheet2.crop((width*0), height*4, width*8, height*2);
		//btn_instructions[2]=sheet.crop((width*10), height*6, width*2, height);
		
		
		btn_quit[0]=sheet2.crop((width*10), height*1, width*4, height*2);
		btn_quit[1]=sheet2.crop((width*10), height*3, width*4, height*2);
		
		
		

		visit= sheet.crop(0, 0, width, height);
		//visit[1]=sheet.crop(width, 0, width, height);
		
         
		
		
		//instruction= ImageLoader.loadImage("/Background/instruction.png"); //aaaaa
		//gameover= ImageLoader.loadImage("/Background/gameover.png");
		
	}
	
	
	
	
	
}
