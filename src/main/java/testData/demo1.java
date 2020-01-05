package testData;

public class demo1
{
	public static void main(String[] args) 
	{
		String un=DataUtility.getProperyData("un");
		String pwd = DataUtility.getProperyData("pwd");
		
		System.out.println("username is"+un);
		System.out.println("password is "+pwd);
		
	}

}
