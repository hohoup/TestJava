package phonebook;


import java.io.*;

class PhoneBook
{

	public static void main(String[] args) throws IOException
	{
		String[] strArrName = new String[10000];
		KeyboardInput inputKey = new KeyboardInput();

		int intIndex; 
		for(intIndex = 0; intIndex < 10000; intIndex++){
			String str = "";
			str = inputKey.systemInput();
			System.out.println(intIndex + "  " + str);

			if(str.length() == 0)
				break;
			else
				strArrName[intIndex] = str; 
		}

		for(intIndex = 0; intIndex < 10000; intIndex++){

			if(strArrName[intIndex] == null)
				break;
			else 
				System.out.println(strArrName[intIndex]);
		}

		int $test;
		$test = 123;
		System.out.println("$test"+"  "+$test);
	}
}





















