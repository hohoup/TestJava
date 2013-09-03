package phonebook;


import java.io.*;

class PhoneBook
{
	public static void main(String[] args) throws IOException
	{
		String str = "";
		int i = -1;
		DataBook data = new DataBook();
		MyConsole con = new MyConsole();
		con.clearConsole();
	while(true)
	{
		System.out.println("==========================================");
		System.out.println("   1. input						");
		System.out.println("   2. search					");
		System.out.println("   3. show list					");
		System.out.println("   4. exit						");
		System.out.println("==========================================");

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
				System.out.println("input name");	
				data.setFields(data.getKey(),"NAME", in.scanInput());
				System.out.println("input number");	
				data.setFields(data.getKey(),"NUMBER", in.scanInput());
				System.out.println("input memo");	
				data.setFields(data.getKey(),"MEMO", in.scanInput());
				
				if( 10000 == data.setKey())
				{
					System.out.println("No Space to fill out");	
				}					

			break;

			case 2:
				con.clearConsole();
				System.out.println("--------------------------------");
				System.out.println("   1. name						");
				System.out.println("   2. number					");
				System.out.println("   3. memo   					");
				System.out.println("--------------------------------");
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
						System.out.println("input name for search");
						data.getFields(data.lookupFields(in.scanInput()));
					break;
					case 2:
					break;
					case 3:
					break;
					default:
					break;
				}
				
			break;

			case 3:
				for(int cnt=0; cnt < data.getKey(); cnt++)
					data.getFields(cnt);
			break;

			case 4:
				System.exit(1);
			break;

			default:
			break;
		}

	}
	}

}

class MyConsole
{
	static {
		System.loadLibrary("ClearConsole");
	}

	public native static void clearConsole();
		
}























