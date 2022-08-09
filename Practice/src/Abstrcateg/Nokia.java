package Abstrcateg;

public abstract class  Nokia {
	
	public Nokia()
	{
		System.out.println("Nokia --- default constructor");
	}
	public void incomingcall()
	{
		System.out.println("Nokia-- incoming call");
	}
	public void message()
	{
		System.out.println("Nokia--- Textmessage");
		
		}
	public abstract void internet();
	
}
