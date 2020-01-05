package testData;

public class Data 
{
	public static void main(String[] args) 
	{
		String un = DataUtility.getProperyData("un");
		String pw = DataUtility.getProperyData("pw");
		System.out.println("Username is : "+un);
		System.out.println("Password is : "+pw);
	}

}
