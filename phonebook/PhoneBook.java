package phonebook;


import java.io.*;

class PhoneBook
{
	public static void main(String[] args) throws IOException
	{
		String str = "";
		int i = -1;

		System.out.println("================================");
		System.out.println("   1. input						");
		System.out.println("   2. search					");
		System.out.println("   3. show list					");
		System.out.println("   4. exit						");
		System.out.println("================================");

		KeyboardInput in = new KeyboardInput();
		try {
		str = in.scanInput();
		i = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			System.err.println(nfe);
			System.exit(1);
		}

		switch(i)
		{
			case 1:
				System.out.println(i + " : case 1");	
			break;

			case 2:
				System.out.println(i + " : case 2");	
			break;

			case 3:
				System.out.println(i + " : case 3");	
			break;

			case 4:
				System.out.println(i + " : case 4");	
			break;

			default:
				System.out.println(i + " : case default");	
			break;
		}

	}
}





















