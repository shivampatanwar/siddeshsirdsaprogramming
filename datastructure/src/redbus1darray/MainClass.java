package redbus1darray;

import java.util.Scanner;

public class MainClass {

	static RedBus redbus;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		RedBus redbus = new RedBus(5);
//
//		System.out.println("=========================\nBook Seat\n=========================\n");
//
//		redbus.bookSeats("Shivam", 'M', "9685430664", 1, "Bengaluru", "Mysore");
//		redbus.bookSeats("Satyam", 'M', "9644708454", 2, "Bengaluru", "Kolkata");
//		redbus.bookSeats("Gauri", 'M', "9065495405", 3, "Bengaluru", "Chennai");
//
//		System.out.println("\n\n\n=========================\nDisplay Confirmed\n=========================\n");
//
//		redbus.displayConfirmed();
//
//		
//		System.out.println("\n\n\n=========================\nDisplay All Passengers Data\n=========================\n");
//
//		redbus.displayAllPassengersData();
//
//
//		System.out.println("\n\n\n=========================\nSearch by Passenger Name\n=========================\n");
//
//		redbus.search("Shivam");
//
//		System.out.println("\n\n\n=========================\nSearch by Seat Number\n=========================\n");
//
//		redbus.search(1);
//		
//		System.out.println("\n\n\n=========================\nShow Available Seats\n=========================\n");
//
//		redbus.showAvailableSeats();
//
//		System.out.println("\n\n\n=========================\nCancel Booking\n=========================\n");
//
//		redbus.cancelBooking(1);
//		
//		System.out.println("\n\n\n=========================\nShow Available Seats\n=========================\n");
//
//		redbus.showAvailableSeats();
//		
//		System.out.println("\n\n\n");

		boolean flag = true;

		while (flag) {

			System.out.println("\n\nRedBus Booking Instructions");
			System.out.println("1. Creation");
			System.out.println("2. Book Ticket");
			System.out.println("3. Display Confirmed");
			System.out.println("4. Display All Passengers Data");
			System.out.println("5. Search by Passenger Name");
			System.out.println("6. Search by Seat Number");
			System.out.println("7. Show Available Seats");
			System.out.println("8. Cancel Booking");
			System.out.println("9. Show Available Seats");
			System.out.println("10. Exit\n");

			System.out.print("selected option :  ");
			int choice = sc.nextInt();
			sc.nextLine();


			switch (choice) {

			case 1: {

				System.out.print("\nEnter No of Seat : ");
				int seat = sc.nextInt();

				redbus = new RedBus(seat);

				break;
			}

			case 2: {
				System.out.print("\nEnter PassengerName : ");
				String passengerName = sc.nextLine();

				System.out.print("Enter Gender : ");
				char gender = sc.next().charAt(0);

				System.out.print("Enter Phone : ");
				String phone = sc.next();

				sc.nextLine();

				System.out.print("Enter Seat Number : ");
				int seatNumber = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter From : ");
				String from = sc.nextLine();

				System.out.print("Enter To : ");
				String to = sc.nextLine();
				

				redbus.bookSeats(passengerName, gender, phone, seatNumber, from, to);
				break;
			}	

			case 3: {
				System.out.println("Display Confirmed");
				redbus.displayConfirmed();
				break;
			}

			case 4: {
				System.out.println("Display All Passengers Data");
				redbus.displayAllPassengersData();
				

				break;
			}

			case 5: {
				System.out.println("Search by Passenger Name\n");
				
				System.out.print("Enter PassengerName : ");
				String passengerName = sc.nextLine();
				
				redbus.search(passengerName);

				break;
			}

			case 6: {
				System.out.println("Search by Seat Number\n");
				
				System.out.print("Enter Seat Number : ");
				int seatNumber = sc.nextInt();
				
				redbus.search(seatNumber);

				break;
			}

			case 7: {
				System.out.println("Show Available Seats");
				redbus.showAvailableSeats();

				break;
			}

			case 8: {
				System.out.println("Cancel Booking by Seat Number\n");
				
				System.out.print("Enter Seat Number : ");
				int seatNumber = sc.nextInt();
				
				redbus.cancelBooking(seatNumber);

				break;
			}

			case 9: {
				System.out.println("Show Available Seats");
				redbus.showAvailableSeats();

				break;
			}

			case 10: {
				flag = false;
				System.out.println("Program Terminate Successfully.....");

				break;
			}

			}

		}

	}

}
