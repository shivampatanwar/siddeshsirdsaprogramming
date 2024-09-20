package area;

public class MainClass {

	public static void main(String[] args) {
		
		Area[] arr = createObject();

		Area[] area = InsertionSort.sortByStno(arr);
//		Area[] area = InsertionSort.sortByStationname(arr);
//		Area[] area = InsertionSort.sortByTemperature(arr);
//		Area[] area = InsertionSort.sortByColor(arr);
//		Area[] area = InsertionSort.sortByPh(arr);
//		Area[] area = InsertionSort.sortByChloride(arr);
//		Area[] area = InsertionSort.sortByFlouride(arr);
		
		
		System.out.println(
				"ST.NO" + "\t STATION NAME" + "\t TEMPARATURE" + "\t COLOR" + "\t PH" + "\t CHLORIDE" + "\t FLOURIDE");
		System.out.println();

		for (int i = 0; i < area.length; i++) {
			// System.out.println(area[i]);
			System.out.println(area[i].getStno() + "\t " + area[i].getStationname() + "\t " + area[i].getTemperature()
					+ "\t " + area[i].getColor() + "\t " + area[i].getPh() + "\t " + area[i].getChloride() + "\t "
					+ area[i].getFlouride());
		}
		
	}
	
	
	
	
	
	public static Area[] binarySearch(Area[] area, String stationname) {
		
		Area[] arr = new Area[5];
		int j = 0;
		
			for (int i = 0; i < area.length; i++) {
				
				if(area[i].getStationname().equals(stationname)) {
					arr[j++]=area[i];
					
				}
				
				
			}
			
		return arr;
			
	}
	

	public static Area[] createObject() {
		
		Area a1 = new Area("S1", "RAMPALLI", 27.05, "COLORLESS", 7.20, 289.11, 1.22);
		Area a2 = new Area("S2", "ETHUR...", 27.62, "COLORLESS", 7.70, 286.35, 1.23);
		Area a3 = new Area("S3", "EDAGAPLLI", 28.97, "AOLORLESS", 7.89, 348.62, 0.81);
		Area a4 = new Area("S4", "SUGALMITTA", 28.91, "COLORLESS", 8.02, 45.91, 0.82);
		Area a5 = new Area("S5", "DANDUPALYAM", 28.75, "COLORLESS", 8.10, 40.64, 0.55);
		Area a6 = new Area("S6", "MELAPATULA", 29.50, "BOLORLESS", 7.40, 75.20, 1.71);
		Area a7 = new Area("S7", "ARADIGUNTA", 29.82, "COLORLESS", 7.57, 80.50, 1.22);
		Area a8 = new Area("S8", "RAMPALLI", 27.05, "COLORLESS", 7.20, 289.11, 2.00);

		Area[] area = { a1, a2, a3, a4, a5, a6, a7, a8 };
			
		return area;
		
	}

}
