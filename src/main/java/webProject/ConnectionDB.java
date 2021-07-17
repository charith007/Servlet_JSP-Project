package webProject;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionDB {
	public static Connection getMySqlConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","pass@123");
		return conn;
	}

}
