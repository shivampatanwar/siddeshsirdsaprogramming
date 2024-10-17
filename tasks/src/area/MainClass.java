package area;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Area[] arr = createObject();

		Area[] area = arr;

//		Area[] area = InsertionSort.sortByStno(arr);
//		Area[] area = InsertionSort.sortByStationname(arr);
//		Area[] area = InsertionSort.sortByTemperature(arr);
//		Area[] area = InsertionSort.sortByColor(arr);
//		Area[] area = InsertionSort.sortByPh(arr);
//		Area[] area = InsertionSort.sortByChloride(arr);
//		Area[] area = InsertionSort.sortByFlouride(arr);

//		Area[] area = MergeSort.sortByStno(arr);
//		Area[] area = MergeSort.sortByStationname(arr);
//		Area[] area = MergeSort.sortByTemperature(arr);
//		Area[] area = MergeSort.sortByColor(arr);
//		Area[] area = MergeSort.sortByPh(arr);
//		Area[] area = MergeSort.sortByChloride(arr);
//		Area[] area = MergeSort.sortByFlouride(arr);

//		Area[] area = SelectionSort.sortByStno(arr);
//		Area[] area = SelectionSort.sortByStationname(arr);
//		Area[] area = SelectionSort.sortByTemperature(arr);
//		Area[] area = SelectionSort.sortByColor(arr);
//		Area[] area = SelectionSort.sortByPh(arr);
//		Area[] area = SelectionSort.sortByChloride(arr);
//		Area[] area = SelectionSort.sortByFlouride(arr);

//		Area[] area = QuickSort.sortByStno(arr);
//		Area[] area = QuickSort.sortByStationname(arr);
//		Area[] area = QuickSort.sortByTemperature(arr);
//		Area[] area = QuickSort.sortByColor(arr);
//		Area[] area = QuickSort.sortByPh(arr);
//		Area[] area = QuickSort.sortByChloride(arr);
//		Area[] area = QuickSort.sortByFlouride(arr);

		boolean flag = true;
		
		
		while (flag) {

			System.out.println("\n\n***************************************************************************************");

			
			System.out.print(
					"\n1. ST.NO  \n2. STATION NAME  \n3. TEMPARATURE \n4. COLOR \n5. PH \n6. CHLORIDE \n7. FLOURIDE \n8. EXIT \n\nEnter Your Choice : ");
			int choice = sc.nextInt();

			System.out.println("\n\n");
			

			switch (choice) {

			case 1: {
				System.out.println("SORT BY STATION NUMBER");
				area = QuickSort.sortByStno(arr);
				break;
			}

			case 2: {
				System.out.println("SORT BY STATION NAME");
				area = QuickSort.sortByStationname(arr);
				break;
			}
			case 3: {
				System.out.println("SORT BY TEMPARATURE");
				area = QuickSort.sortByTemperature(arr);
				break;
			}
			case 4: {
				System.out.println("SORT BY COLOR");
				area = QuickSort.sortByColor(arr);
				break;
			}
			case 5: {
				System.out.println("SORT BY PH");
				area = QuickSort.sortByPh(arr);
				break;
			}
			case 6: {
				System.out.println("SORT BY CHLORIDE");
				area = QuickSort.sortByChloride(arr);
				break;
			}
			case 7: {
				System.out.println("SORT BY FLOURIDE ");
				area = QuickSort.sortByFlouride(arr);
				break;
			}
			case 8: {
				System.out.println("EXIT................");
				flag = false;
				break;
			}

			}
			
			System.out.println("\n");

			if (flag) {
				System.out.println("ST.NO" + "\t STATION NAME" + "\t TEMPARATURE" + "\t COLOR" + "\t\t PH"
						+ "\t CHLORIDE" + "\t FLOURIDE");
				System.out.println();

				for (int i = 0; i < area.length; i++) {
					// System.out.println(area[i]);
					System.out.println(area[i].getStno() + "\t " + area[i].getStationname() + "\t "
							+ area[i].getTemperature() + "\t\t " + area[i].getColor() + "\t " + area[i].getPh() + "\t "
							+ area[i].getChloride() + "\t\t " + area[i].getFlouride());
				}

				System.out.println("\n");
				
			}

		}

		sc.close();

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

		Area[] area = { a1, a2, a3, a4, a5, a6, a8, a7 };

		return area;

	}

}
