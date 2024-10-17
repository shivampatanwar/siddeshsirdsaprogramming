package movieticket2darray;

public class Booking {

	UserDetails[][] user;

	public Booking(int row, int col) {
		user = new UserDetails[row][col];
		System.out.println("\n2D Array Creation Success");
	}

	public void bookSeats(int row, int col, String passengerName, String email, int age, String phone,
			String movieName) {
		try {

			if (user[row][col] != null) {
				System.out.println("The seat number is already booked");
			} else {
				UserDetails usd = new UserDetails(passengerName, email, age, phone, movieName, seatNumber(row, col));
				user[row][col] = usd;
				System.out.println(
						"Seat Booked Successfully for " + passengerName + " with seatNumber " + usd.getSeatNumber());
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid Location");
		}

	}

	private String seatNumber(int row, int col) {
		String str = (char) (65 + row) + "" + (col + 1);
		return str;
	}

	public void displayConfirmed() {
		for (int row = 0; row < user.length; row++) {
			for (int col = 0; col < user[row].length; col++) {
				if (user[row][col] != null) {
					System.out.println(user[row][col]);
				}
			}
		}
	}

	public void displayAllAudienceData() {

		for (int row = 0; row < user.length; row++) {
			for (int col = 0; col < user[row].length; col++) {
				if (user[row][col] != null) {
					System.out.println(user[row][col]);
				}
			}
		}

	}

	public void search(String audienceName) {

		try {
			for (int row = 0; row < user.length; row++) {
				for (int col = 0; col < user[row].length; col++) {
					if (user[row][col] != null && user[row][col].getName().equalsIgnoreCase(audienceName)) {
						System.out.println(
								audienceName + " is seated in: " + user[row][col].getSeatNumber() + " seat number");
						return;
					}

				}

			}
			System.out.println("That person is not present");
		} catch (Exception e) {
			System.out.println("Invalid Audience Name " + e);
		}

	}

	public void showAvailableSeats() {

		boolean flag = true;

		for (int row = 0; row < user.length; row++) {
			for (int col = 0; col < user[row].length; col++) {
				if (user[row][col] == null) {
					System.out.print(seatNumber(row, col) + " ");
					flag = false;
				}

			}

		}
		if (flag) {
			System.out.println("no seats available ");
		}

	}

	public void cancelBooking(String seatNumber) {

		try {

			int row = seatNumber.charAt(0) - 65;
			int col = Integer.parseInt(seatNumber.substring(1));

			if (user[row][col] == null) {
				System.out.println("Seat is already Empty ");
			} else {

				System.out.println(" Ticket cancel Successfully for " + user[row][col].getName());
			}

		} catch (Exception e) {

			System.out.println(e);

		}

	}

	public void searchBySeatNumber(String seatNumber) {
		try {
			int row = seatNumber.charAt(0) - 65;
			int col = Integer.parseInt(seatNumber.substring(1));

			if (user[row][col] == null) {
				System.out.println("Invalid SeatNumber ");
			} else {
				System.out.println(" Ticket cancel Successfully for " + user[row][col].getName());
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
