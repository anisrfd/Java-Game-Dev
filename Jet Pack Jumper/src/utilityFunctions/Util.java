package utilityFunctions;

import java.io.BufferedReader;
import java.io.FileReader;

public class Util {

	
	public static String loadFileAsString(String path)
	{
		StringBuilder builder =new StringBuilder();
		
		
		try {
			
			
			BufferedReader br=new BufferedReader(new FileReader(path)); 
			String line ;
			 
			while((line=br.readLine())!=null)
					{
				builder.append(line+ "\n");// after generating we go to new line
				
				
				
					}
			br.close();
		} catch (Exception e) {
			 e.printStackTrace();
		}
		
		
		return builder.toString();// converts
		
		
	}
	
	public static int toIntegar(String number )
	{
	
		
		try {
			
			return Integer.parseInt(number);
			
			
		} 
		catch (Exception e) {
			 e.printStackTrace();
			 return 0;
		}
	}
	
}
