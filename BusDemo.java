package busresv;
import java.util.*;
public class BusDemo {
	public static void main(String[]args) {
		ArrayList<Bus> buses=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,2));
		buses.add(new Bus(3,true,2));
		int userOpt=1;
		Scanner sc=new Scanner(System.in);
		for(Bus b:buses) {
			 b.displayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Booking booking=new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("your booking is confirmed");
				}
				else
					System.out.println("Try another bus!..");
			}
		}
	}

}
