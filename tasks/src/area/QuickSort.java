package area;

public class QuickSort {

	
//	sortByStationname
	
	static void quickSortByStationname(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getStationname().compareTo(area[pivote].getStationname())<=0) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByStationname(area, start, i - 1);
			quickSortByStationname(area, i + 1, end);

		}

	}

	public static Area[] sortByStationname(Area[] area) {

		quickSortByStationname(area, 0, area.length - 1);

		return area;
	}
	
	
	
	
	
	
//	sortByStno
	
	static void quickSortByStno(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getStno().compareTo(area[pivote].getStno())<=0) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByStno(area, start, i - 1);
			quickSortByStno(area, i + 1, end);

		}
		

	}

	public static Area[] sortByStno(Area[] area) {
		
		quickSortByStno(area, 0, area.length - 1);

		return area;
	}

	
	
	
	
	
//	sortByTemperature
	
	static void quickSortByTemperature(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getTemperature()<=area[pivote].getTemperature()) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByTemperature(area, start, i - 1);
			quickSortByTemperature(area, i + 1, end);

		}

	}
	
	public static Area[] sortByTemperature(Area[] area) {
		
		quickSortByTemperature(area, 0, area.length - 1);

		return area;
	}
	
	
	
	
	
	
//	sortByColor
	
	static void quickSortByColor(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getColor().compareTo(area[pivote].getColor())<=0) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByColor(area, start, i - 1);
			quickSortByColor(area, i + 1, end);

		}

	}

	public static Area[] sortByColor(Area[] area) {
		
		quickSortByColor(area, 0, area.length - 1);

		return area;
	}

	
	
	
	
//	sortByPh
	
	static void quickSortByPh(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getPh()<=area[pivote].getPh()) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByPh(area, start, i - 1);
			quickSortByPh(area, i + 1, end);

		}

	}
	
	public static Area[] sortByPh(Area[] area) {
		
		quickSortByPh(area, 0, area.length - 1);

		return area;
	}

	
	
	
//	sortByChloride
	
	static void quickSortByChloride(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getChloride()<=area[pivote].getChloride()) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByChloride(area, start, i - 1);
			quickSortByChloride(area, i + 1, end);

		}

	}
	
	public static Area[] sortByChloride(Area[] area) {
		
		quickSortByChloride(area, 0, area.length - 1);

		return area;
	}
	
	
	
//	sortByFlouride
	
	static void quickSortByFlouride(Area[] area, int start, int end) {

		int pivote = end;
		int i = start - 1;

		for (int j = start; j <= end; j++) {
			

			if (area[j].getFlouride()<=area[pivote].getFlouride()) {
				i++;
				Area temp = area[i];
				area[i] = area[j];
				area[j] = temp;
			}
		}

		if (start < end) {

			quickSortByFlouride(area, start, i - 1);
			quickSortByFlouride(area, i + 1, end);

		}

	}
	
	public static Area[] sortByFlouride(Area[] area) {
		
		quickSortByFlouride(area, 0, area.length - 1);

		return area;
	}

}
