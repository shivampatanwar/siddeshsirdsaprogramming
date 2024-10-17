package movieticket2darray;

public class UserDetails {

	private String name;
	private String email;
	private int age;
	private String phone;
	private String movieName;
	private String seatNumber;

	public UserDetails(String name, String email, int age, String phone, String movieName, String seatNumber) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getMovieName() {
		return movieName;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	@Override
	public String toString() {
		return "UserDetails [name=" + name + ", email=" + email + ", age=" + age + ", phone=" + phone + ", movieName="
				+ movieName + ", seatNumber=" + seatNumber + "]";
	}

}
