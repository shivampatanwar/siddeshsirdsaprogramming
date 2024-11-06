package airways;

public class PassengerData {
	
	private String PassengerName;
	private String phone;
	private String email;
	private int age;
	private String fromPlace;
	private String toPlace;
	
	
	public PassengerData(String passengerName, String phone, String email, int age, String fromPlace, String toPlace) {
		super();
		PassengerName = passengerName;
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
	}


	public String getPassengerName() {
		return PassengerName;
	}


	public String getPhone() {
		return phone;
	}


	public String getEmail() {
		return email;
	}


	public int getAge() {
		return age;
	}


	public String getFromPlace() {
		return fromPlace;
	}


	public String getToPlace() {
		return toPlace;
	}


	@Override
	public String toString() {
		return "PassengerName=" + PassengerName + ", phone=" + phone + ", email=" + email + ", age="
				+ age + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace;
	}
	
	
	
	
	
	
	
	
	
	

}
