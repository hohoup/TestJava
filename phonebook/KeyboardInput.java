package phonebook;


import java.util.Scanner;
import java.io.*;

class KeyboardInput
{
	public String scanInput() throws IOException
	{
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key : ");

		str = sc.next();
		System.out.println(str);
		return str; 
	}

	public String systemInput() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter key : ");
		   
		String r= br.readLine();

	 	return r;	
	}
}

