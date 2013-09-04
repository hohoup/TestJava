

import java.io.*;

class PhoneBookMain
{
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


