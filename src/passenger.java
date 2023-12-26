package busresv;
import java.util.*;
import java.sql.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class passenger {
	String passengername;
	int busno;
	Date date;
	passenger()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name: ");
		passengername=sc.next();
		System.out.println("Enter busno: ");
		busno=sc.nextInt();
		System.out.println("Enter date ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
	}
	public boolean isAvailable() throws SQLException
	{
		BusDAO busdao=new BusDAO();
		BookingDAO bookingdao=new BookingDAO();
		int capacity=busdao.getCapacity(busno);
		int booked=bookingdao.getBookedCount(busno,date);
		return booked<capacity;

	}
}
