package Jdbcpgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class pgm1
{
	@Test
	public void test() throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/demodb";
		String un = "root";
		String pw = "root";
		
		//to establish connection to DB{driver manager is a class and get connection is a method}
		Connection con = DriverManager.getConnection(url, un, pw);
		 
		//to send the query to db(path)
		Statement stmt = con.createStatement();
		
		
		//send the query to db and get the record
		ResultSet res = stmt.executeQuery("select * from empInfo where name = 'taj'");
		
		while(res.next())
		{
			//using column label
			String name = res.getString("Name");
			Reporter.log("Name is :"+name,true);			
			String id = res.getString("Id");
			Reporter.log("ID is :"+id,true);
			String dept = res.getString("Dept");
			Reporter.log("DEPT is :"+dept,true);
			String gender = res.getString("Gender");
			Reporter.log("Gender is :"+gender,true);
			// using column index
			String name1 = res.getString(1);
			Reporter.log("Name is :"+name,true);
		}
		//to disconnect the connection
		con.close();
		Assert.fail();
		
	}

}
