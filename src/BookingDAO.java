package busresv;
import java.util.*;
import java.sql.*;
import java.util.Date;
public class BookingDAO {
	public int getBookedCount(int busno,Date date) throws SQLException
	{
		String query="select count(passenger_name) from booking where bus_no=? and travel_date=?";
		Connection con=dbconnection.getConnection();
		PreparedStatement pst=con. prepareStatement(query);
		java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, busno);
		pst.setDate(2, sqldate);
		ResultSet rs=pst.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addBooking(passenger p1) throws SQLException
	{
		String query="insert into booking values(?,?,?)";
		Connection con=dbconnection.getConnection();
		java.sql.Date sqldate=new java.sql.Date(p1.date.getTime());
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,p1.passengername);
		pst.setInt(2,p1.busno);
		pst.setDate(3, sqldate);
		pst.executeUpdate();
		//System.out.println("Booking is confirmed..! ");
		//System.out.println("Enter 1 to book");
	}
}
