package redbus1darray;

import java.util.Random;

public class RedBus {

	private Booking[] bookings;

	public RedBus(int size) {
		bookings = new Booking[size];
	}

	public String trackerId(String name, String phNo) {
		Random random = new Random();
		int no = 10000 + random.nextInt(90000);
		return name.substring(0, 4) + no + phNo.substring(phNo.length() - 4);
	}

	public void bookSeats(String passengerName, char gender, String phone, int seatNumber, String from, String to) {

		try {
			if (bookings[seatNumber - 1] != null) {
				System.out.println("Seat is already booked for Seat Number : " + seatNumber);
			} else {
				Booking booking = new Booking(passengerName, gender, seatNumber, trackerId(passengerName, phone), from,
						to);
				bookings[seatNumber - 1] = booking;
				System.out.println("Ticket booked successfully for " + booking + "\n\n");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void displayConfirmed() {
		for (Booking booking : bookings) {
			if (booking != null) {
				System.out.println(booking);
			}
		}

	}

	public void displayAllPassengersData() {

		for (Booking booking : bookings) {
			if(booking!=null) {
				System.out.println(booking);
			}
		}

	}

	public void search(String passengerName) {
		
		try {
			for (Booking booking: bookings) {
				if(booking.getPassengerName().equals(passengerName)) {
					System.out.println("Ticket booked for "+ booking);
					return;
					
				}
			}
			
			System.out.println("No Ticket found for " + passengerName);
			
		}catch (Exception e) {
			System.out.println(e);
			
		}

	}

	public void search(int seatNumber) {
		
		try {
			for (int i = 0; i < bookings.length; i++) {
				if(bookings[i].getSeatnumber()==seatNumber) {
					System.out.println("Ticket Booked for " + bookings[i]);
					return;
				}
			}
			
			System.out.println("Seat Number is Available for Booking");
			
		}catch (Exception e) {
			System.out.println(e);
		}
		
		

	}

	public void cancelBooking(int seatNumber) {
		
		try {
			if(bookings[seatNumber-1]==null) {
				System.out.println("No ticket exist with seatNumber : " + seatNumber);
			}else {
				bookings[seatNumber-1]=null;
				System.out.println("Ticket Cancelled Successfully for Seat Number : "  + seatNumber);
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

	public void showAvailableSeats() {
		
		boolean flag = false;
		
		for (int i = 0; i < bookings.length; i++) {
			if (bookings[i]==null) {
				System.out.print((i+1) + " ");
				flag= true;
			}
		}
		
		if(!flag) {
			System.out.println("No seats Available");
		}

	}

}
