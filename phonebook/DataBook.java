package phonebook;


class DataBook
{
	private int FIELD_KEY;
	private String[] FIELD_NAME;
	private String[] FIELD_NUMBER;
	private String[] FIELD_MEMO;

	public DataBook()
	{
		FIELD_KEY = 0;
		FIELD_NAME = new String[10000];
		FIELD_NUMBER = new String[10000];
		FIELD_MEMO = new String[10000];
	}

	public void getFields(int KEY)
	{
		System.out.println(" [" + KEY + "] " + " name : " + FIELD_NAME[KEY] 
				+ " number : " + FIELD_NUMBER[KEY]
				+ " memo : " + FIELD_MEMO[KEY] );
	}

	public boolean setFields(int KEY,String KEY_FIELD, String IN_FIELD)
	{

		if(KEY_FIELD.compareTo("NAME") == 0)
			FIELD_NAME[KEY] = IN_FIELD; 
		if(KEY_FIELD.compareTo("NUMBER") == 0)
			FIELD_NUMBER[KEY] = IN_FIELD; 
		if(KEY_FIELD.compareTo("MEMO") == 0)
			FIELD_MEMO[KEY] = IN_FIELD; 

		return true;

	}

	public int lookupFields(String NAME)
	{
		for(int cnt=0; cnt<10000; cnt++)
		{
			if(FIELD_NAME[cnt].contains(NAME))
				return cnt;
		}

		return 0;

	}

	public int getKey()
	{
		return FIELD_KEY;
	}

	public int setKey()
	{
		return FIELD_KEY++;
	}

}
