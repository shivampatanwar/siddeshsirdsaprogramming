package redbus1darray;

public class Booking {
	
	private String passengerName;
	private char gender;
	private int seatnumber;
	private String trackId;
	private String from;
	private String to;
	
	public Booking(String passengerName, char gender, int seatnumber, String trackId, String from, String to) {
		super();
		this.passengerName = passengerName;
		this.gender = gender;
		this.seatnumber = seatnumber;
		this.trackId = trackId;
		this.from = from;
		this.to = to;
	}

	
	public String getPassengerName() {
		return passengerName;
	}

	public char getGender() {
		return gender;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public String getTrackId() {
		return trackId;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}
	
	
	@Override
	public String toString() {
		return "\npassengerName : " + passengerName + ", \ngender : " + gender + ", \nseatnumber : " + seatnumber + ", \ntrackId : " + trackId + ", \nfrom : " + from + ", to : " + to;
	}


	
	
	
	
	
	
	
	

}
