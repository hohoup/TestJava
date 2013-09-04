

import java.util.Scanner;
import java.io.*;

class KeyboardInput
{
	String scanInput() throws IOException
	{
		System.out.print("Enter key : ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		   
		String r= br.readLine();

	 	return r;	
	}
}

