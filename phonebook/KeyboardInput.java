package phonebook;


import phonebook.KeyboardInput;
import java.util.Scanner;

public class KeyboardInput
{
	public String scanInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key : ");
		return sc.next(); 
	}
}

