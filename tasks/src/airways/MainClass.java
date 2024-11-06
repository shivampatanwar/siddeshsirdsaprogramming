package airways;

public class MainClass {
	
	public static void main(String[] args) {
		
		OnlineTicketBooking online = new OnlineTicketBooking(1, 6);
		
		
		online.bookTicket(0, 0, "shivam", "9685430664", "abc@gmail.com", 27, "BLR", "DELHI");
		online.bookTicket(0, 1, "vivek", "74514524512", "xyz@gmail.com", 25, "BLR", "MYS");
		online.bookTicket(0, 2, "amit", "6578458965", "pqr@gmail.com", 21, "BLR", "KOLKATA");
		online.bookTicket(0, 3, "prakash", "7845896587", "efg@gmail.com", 30, "BLR", "MUMBAI");
		
		System.out.println("\nDelete-------------------------------------\n");
		
//		online.deleteTicket(0, 2);
		
		System.out.println("\nConfirm-----------------------------------\n");
		
		online.confirmData();
		
		System.out.println("\nAvailable Seat--------------------------------\n");
		
		online.checkSeatAvailability();
		
		System.out.println("\nAvailable Seat--------------------------------\n");
		
		online.displayTicket(0, 0);
	}

}
