package redbus1darray;

public class MainClass {

	public static void main(String[] args) {

		RedBus redbus = new RedBus(5);

		System.out.println("=========================\nBook Seat\n=========================\n");

		redbus.bookSeats("Shivam", 'M', "9685430664", 1, "Bengaluru", "Mysore");
		redbus.bookSeats("Satyam", 'M', "9644708454", 2, "Bengaluru", "Kolkata");
		redbus.bookSeats("Gauri", 'M', "9065495405", 3, "Bengaluru", "Chennai");

		System.out.println("\n\n\n=========================\nDisplay Confirmed\n=========================\n");

		redbus.displayConfirmed();

		
		System.out.println("\n\n\n=========================\nDisplay All Passengers Data\n=========================\n");

		redbus.displayAllPassengersData();


		System.out.println("\n\n\n=========================\nSearch by Passenger Name\n=========================\n");

		redbus.search("Shivam");

		System.out.println("\n\n\n=========================\nSearch by Seat Number\n=========================\n");

		redbus.search(1);
		
		System.out.println("\n\n\n=========================\nShow Available Seats\n=========================\n");

		redbus.showAvailableSeats();

		System.out.println("\n\n\n=========================\nCancel Booking\n=========================\n");

		redbus.cancelBooking(1);
		
		System.out.println("\n\n\n=========================\nShow Available Seats\n=========================\n");

		redbus.showAvailableSeats();
		
		System.out.println("\n\n\n");

	}

}
