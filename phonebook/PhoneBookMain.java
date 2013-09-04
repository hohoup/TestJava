

import java.io.*;

class PhoneBook
{
	private DataBook databook;
    private	String strscanConsoleInput;

	private void showMainMenu()
	{
		System.out.println("==========================================");
		System.out.println("   PhoneBook");
		System.out.println("   1. input");
		System.out.println("   2. search");
		System.out.println("   3. show list");
		System.out.println("   4. delete");
		System.out.println("   5. exit");
		System.out.println("==========================================");
	}

	private void inputData()
	{	
		String strinputData = "";
		databook = new DataBook();

		System.out.println("input name");	
		strinputData = scanConsoleInput();
		databook.setFields(databook.getKey(),"NAME", strinputData);
		System.out.println("input number");	
		strinputData = scanConsoleInput();
		databook.setFields(databook.getKey(),"NUMBER", strinputData);
		System.out.println("input memo");	
		strinputData = scanConsoleInput();
		databook.setFields(databook.getKey(),"MEMO", strinputData);
				
		if( 10000 == databook.setKey())
		{
			System.out.println("No Space to fill out");	
		}					
	}

	private void searchData()
	{
		String strsearchData = "";
		int caseI;
		System.out.println("--------------------------------");
		System.out.println(" search for 					");
		System.out.println("   1. name						");
		System.out.println("   2. number					");
		System.out.println("   3. memo   					");
		System.out.println("--------------------------------");

		strsearchData = scanConsoleInput();
		caseI = Integer.parseInt(strsearchData);

		switch(caseI)
		{
			case 1:
				System.out.println("input name for search");
				strsearchData = scanConsoleInput();
				databook.getFields(databook.lookupFields(strsearchData));
			break;
			case 2:
			break;
			case 3:
			break;
			default:
			break;
		}
	}

	private void showDataList()
	{
		for(int cnt=0; cnt < databook.getKey(); cnt++)
			databook.getFields(cnt);
	}

	/*
	private int deleteData(String str)
	{

	}
	*/

	private String scanConsoleInput()
	{
		KeyboardInput in = new KeyboardInput();
		try{
		strscanConsoleInput = in.scanInput();
		}
		catch(IOException e)
		{
		}

		return strscanConsoleInput;
	}


	public static void main(String[] args) throws IOException
	{
		String strmain = "";
		int strmainI;
		MyConsole myconsole = new MyConsole();
		myconsole.clearConsole();

		PhoneBook mainbook = new PhoneBook();
		while(true)
		{
			mainbook.showMainMenu();
			strmain = mainbook.scanConsoleInput();
			strmainI = Integer.parseInt(strmain);
	
			switch(strmainI)
			{
				case 1:
					mainbook.inputData();
				break;
	
				case 2:
					mainbook.searchData();
				break;
	
				case 3:
					mainbook.showDataList();
				break;
	
				case 4:
					System.out.println("this function Not yet imp.");
					//mainbook.deleteData();
				break;

				case 5:
					System.exit(1);
				break;
	
				default:
				break;
			}
	
		}
	}

}


