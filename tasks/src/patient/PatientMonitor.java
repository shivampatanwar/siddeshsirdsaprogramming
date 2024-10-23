package patient;

import java.util.LinkedList;
import java.util.Queue;

public class PatientMonitor {

	Queue<PatientData> patients;
	int queueCapacity = 10;

	public PatientMonitor() {
		patients = new LinkedList<PatientData>();
	}

	public void addPatient(String name, int age, String gender, String disease, String bloodGroup, int heartRate,
			int gluecose) {

		PatientData patientData = new PatientData(name, age, gender, disease, bloodGroup, heartRate, gluecose);

		if (patients.size() == queueCapacity) {
			patients.poll();
		}

		patients.add(patientData);
		System.out.println("Patient " + name + " added for Consulting");

	}

	public void analyzeHeartRate() {

		if (patients.isEmpty()) {
			System.out.println("No Patients Exists");
		} else {
			for (PatientData patient : patients) {

				if (patient.getHeartRate() < 60 || patient.getHeartRate() > 100) {
					System.out.println(patient.getName() + " HeartRate is Abnormal with " + patient.getHeartRate());
				} else {
					System.out.println(patient.getName() + " HartRate is Normal with " + patient.getHeartRate());
				}

			}
		}
//		patients.poll();
	}

	public void analyzeGluecoseLevel() {
		
		if (patients.isEmpty()) {
			System.out.println("No Patients Exists");
		} else {
			for (PatientData patient : patients) {

				if (patient.getGluecose() < 70 && patient.getGluecose() > 100) {
					System.out.println(patient.getName() + " GluecoseLevel is Abnormal with " + patient.getGluecose());
				} else {
					System.out.println(patient.getName() + " GluecoseLevel is Normal with " + patient.getGluecose());
				}

			}
//			patients.poll();
		}

	}

}
