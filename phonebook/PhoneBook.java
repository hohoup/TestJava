

import java.io.*;

class PhoneBook
{
	private DataBook databook;
    private	String strscanConsoleInput;

	public void showMainMenu()
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

	public void inputData()
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

	public void searchData()
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

	public void showDataList()
	{
		for(int cnt=0; cnt < databook.getKey(); cnt++)
			databook.getFields(cnt);
	}

	/*
	private int deleteData(String str)
	{

	}
	*/

	public String scanConsoleInput()
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

}

