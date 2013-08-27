package phonebook;


import phonebook.PhoneBook;

class PhoneBook
{
	public static void main(String[] args)
	{
		String[] strArrName = new String[10000];
		KeyboardInput inputKey = new KeyboardInput();
		strArrName[0] = inputKey.scanInput(); 
		System.out.println(strArrName[0]);
	}
}





















