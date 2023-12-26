
package busresv;

import java.sql.*;
public class BusDAO {
	public void displayBusInfo() throws SQLException
	{
		String query="select * from bus";
		Connection con=dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rst=st.executeQuery(query);
		while(rst.next())
		{
			System.out.println("Bus no : "+rst.getInt(1));
			if(rst.getInt(2)==1) System.out.println("Ac : Yes");
			else System.out.println("Ac : No");
		}
		System.out.println("********************");
	}
	public int getCapacity(int busno) throws SQLException
	{
		String query="select capacity from bus where busno="+busno;
		Connection con=dbconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
	}
}
