package movieticket2darray;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {

		Booking book = new Booking(3, 3);
//		Booking book=null;
		Scanner sc = new Scanner(System.in);

		boolean flag = true;

		while (flag) {

			System.out.println("\n\nMovie Booking Instructions");
			System.out.println("1. Creation");
			System.out.println("2. Book Ticket");
			System.out.println("3. Display Confirmed");
			System.out.println("4. Display All Audience Data");
			System.out.println("5. Search by Audience Name");
			System.out.println("6. Search by Seat Number");
			System.out.println("7. Show Available Seats");
			System.out.println("8. Cancel Booking");
			System.out.println("9. Exit\n");

			System.out.print("selected option :  ");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {

			case 1: {

				System.out.print("\nEnter No of Row : ");
				int row = sc.nextInt();

				System.out.print("Enter No of Column : ");
				int col = sc.nextInt();

				book = new Booking(row, col);

				break;
			}

			case 2: {
				System.out.print("\nEnter PassengerName : ");
				String passengerName = sc.nextLine();

				System.out.print("Enter email : ");
				String email = sc.nextLine();

				System.out.print("Enter Age : ");
				int age = sc.nextInt();

				System.out.print("Enter Phone : ");
				String phone = sc.next();

				System.out.print("Enter Movie Name : ");
				String movieName = sc.nextLine();

				sc.nextLine();

				System.out.print("Enter Seat Row : ");
				int row = sc.nextInt();

				System.out.print("Enter Seat Column : ");
				int column = sc.nextInt();

				sc.nextLine();

				book.bookSeats(row, column, passengerName, email, age, phone, movieName);
				break;
			}

			case 3: {
				System.out.println("Display Confirmed");
				book.displayConfirmed();
				break;
			}
//
			case 4: {
				System.out.println("Display All Audience Data");
				book.displayAllAudienceData();
				

				break;
			}
//
			case 5: {
				System.out.println("Search by Audience By  Name\n");
				
				System.out.print("Enter Audience Name : ");
				String audienceName = sc.nextLine();
				
				book.search(audienceName);

				break;
			}

			case 6: {
				
				System.out.println("Search by Seat Number\n");
				
				System.out.print("Enter Seat Number : ");
				String seatNumber = sc.next();
				
				book.searchBySeatNumber(seatNumber);

				break;
			}

			case 7: {
				System.out.println("Show Available Seats");
				book.showAvailableSeats();

				break;
			}

			case 8: {
				System.out.println("Cancel Booking by Seat Number\n");
				
				System.out.print("Enter Seat Number : ");
				String seatNumber = sc.next();
				
				book.cancelBooking(seatNumber);

				break;
			}
			
			case 9: {
				flag = false;
				System.out.println("Program Terminate Successfully.....");

				break;
			}

			}

		}
		
		sc.close();

	}

}
