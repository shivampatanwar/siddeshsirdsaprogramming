package area;

public class Area {
    
    private String stno;
    private String stationname;
    private double temperature;
    private String color;
    private double ph;
    private double chloride;
    private double flouride;
    
    public Area(String stno, String stationname, double temperature, String color, double ph, double chloride,
	    double flouride) {
	super();
	this.stno = stno;
	this.stationname = stationname;
	this.temperature = temperature;
	this.color = color;
	this.ph = ph;
	this.chloride = chloride;
	this.flouride = flouride;
    }	

    public String getStno() {
        return stno;
    }

    public String getStationname() {
        return stationname;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getColor() {
        return color;
    }

    public double getPh() {
        return ph;
    }

    public double getChloride() {
        return chloride;
    }

    public double getFlouride() {
        return flouride;
    }

  

    
    
    
    
    
    
    
    

}
