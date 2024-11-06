package airways;

import java.util.Arrays;

public class OnlineTicketBooking {

	private String[][] bookings;

	private PassengerData[][] passengerData;

	public OnlineTicketBooking(int rows, int cols) {
		bookings = new String[rows][cols];
		passengerData = new PassengerData[rows][cols];

		for (String[] booking : bookings) {
			Arrays.fill(booking, "available");
		}

	}

	public void bookTicket(int row, int col, String passengerName, String phone, String email, int age,
			String fromPlace, String toPlace) {

		try {

//			if invalid row column
			if (row < 0 || col < 0 || row > bookings.length || col > bookings[0].length) {
				System.out.println("Invalid seat selected");
			}

//			if seat is available  - book ticket
			else if (bookings[row][col].equals("available")) {

				PassengerData passenger = new PassengerData(passengerName, phone, email, age, fromPlace, toPlace);

				passengerData[row][col] = passenger;

				bookings[row][col] = "booked";

				System.out.println("Ticket Booked Successfully for Passenger " + passenger.getPassengerName() + " with Seat Number : "+ (char)(row+65)+ "" +(col+1));

			}

//			if seat is booked - already booked
			else {
				System.out.println("Seat is Already booked");
			}

		} catch (Exception e) {
			System.out.println("No Seat available for booked");
		}

	}

	public void confirmData() {

		if (passengerData == null) {

			System.out.println("No ticket booked");

		} else {

			for (int i = 0; i < passengerData.length; i++) {

				for (int j = 0; j < passengerData[i].length; j++) {

					if (passengerData[i][j] != null) {
						System.out.println(passengerData[i][j] + ", SeatNumber="+ (char)(i+65)+ "" +(j+1));
					}

				}

			}

		}

	}

	public void deleteTicket(int row, int col) {

		if (bookings[row][col] == "available") {
			System.out.println("No Ticket Found");

		} else {
			bookings[row][col] = "available";
			passengerData[row][col] = null;

			System.out.println("Ticket Deleted with seat Number : " + (char)(row+65)+ "" +(col+1));

		}

	}

	public void checkSeatAvailability() {

		if (bookings == null) {

			System.out.println("No seat alloted");

		} else {
			
			boolean available = true;
			
			for (int i = 0; i < bookings.length; i++) {
				
				for (int j = 0; j < bookings[i].length; j++) {
					
					if(bookings[i][j]=="available") {
						
						System.out.print((char)(i+65)+ "" +(j+1) + " ");
						available=false;
						
					}
					
				}
				
			}
			
			if(available) {
				System.out.println("No seat Available for booking");
			}

			

		}

	}
	
	
	public void displayTicket(int row, int col) {
		
		try {
			
			PassengerData passenger = passengerData[row][col];
			
			System.out.println("Source : " + passenger.getFromPlace());
			System.out.println("Source : " + passenger.getToPlace());
			
			
			System.out.println("Name  \t  flightNumber   \t  SeatNumber   \t  Qr");
			System.out.println(passenger.getPassengerName() + " \t A74574 t" + (char)(row+65)+ "" +(col+1));
			
			
			
			
		} catch (Exception e) {
			System.out.println("Invalid Seat Number");
		}
		
	}

}
