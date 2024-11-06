package airways;

public class AirwaysData {
	
	private String flightNumber;
	private String flightStatus;
	private String economy;
	private String qr;
	private String operatedBy;
	
	public AirwaysData(String flightNumber, String flightStatus, String economy, String qr, String operatedBy) {
		super();
		this.flightNumber = flightNumber;
		this.flightStatus = flightStatus;
		this.economy = economy;
		this.qr = qr;
		this.operatedBy = operatedBy;
	}
	

	public String getFlightNumber() {
		return flightNumber;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public String getEconomy() {
		return economy;
	}

	public String getQr() {
		return qr;
	}

	public String getOperatedBy() {
		return operatedBy;
	}
	
	
	
	
	
	
	
	

}
