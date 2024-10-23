package patient;

public class PatientData {
	
	private String name;
	private int age;
	private String gender;
	private String disease;
	private String bloodGroup;
	private int heartRate;
	private int gluecose;
	
	
	public PatientData(String name, int age, String gender, String disease, String bloodGroup, int heartRate,
			int gluecose) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.disease = disease;
		this.bloodGroup = bloodGroup;
		this.heartRate = heartRate;
		this.gluecose = gluecose;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public String getDisease() {
		return disease;
	}


	public String getBloodGroup() {
		return bloodGroup;
	}


	public int getHeartRate() {
		return heartRate;
	}


	public int getGluecose() {
		return gluecose;
	}


	@Override
	public String toString() {
		return "Patientname=" + name + ", age=" + age + ", gender=" + gender + ", disease=" + disease
				+ ", bloodGroup=" + bloodGroup + ", heartRate=" + heartRate + ", gluecose=" + gluecose;
	}
	
	
	
	
	
	
	
	
	
	
	

}
