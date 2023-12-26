package busresv;
import java.util.*;
import java.sql.*;
//import java.util.ArrayList;
public class Busdemo {

	public static void main(String[] args) throws Exception{
		BusDAO busdao=new BusDAO();
		busdao.displayBusInfo();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1 to book and 2 to Exit : ");
		int useropt=sc.nextInt();
		if(useropt==1)
		{
			passenger p1=new passenger();
			if(p1.isAvailable())
			{
				BookingDAO bookingdao=new BookingDAO();
				bookingdao.addBooking(p1);
				System.out.println("Booking is confirmed: ");
				//System.out.print("Enter 1 to book and 2 to Exit : ");
			}
			else
			{
				System.out.println("Sorry bus is full try another bus");
			}
		}
		sc.close();
		
	}

}
