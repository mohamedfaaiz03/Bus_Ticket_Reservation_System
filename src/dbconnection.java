package busresv;

import java.sql.*;

public class dbconnection {
	private static final String url="jdbc:mysql://localhost:3306/Busresv";
	private static final String username="root";
	private static final String password="1234";
	public static Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
	}
}
