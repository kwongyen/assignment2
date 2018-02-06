import java.util.ArrayList;

public class Doctor {

    private int doctorID;
    private ArrayList<Patient> patients;

    Doctor(int doctorID, ArrayList<Patient> patients){
        this.doctorID = doctorID;
        this.patients = patients;
    }

    public int getDoctorID(){
        return this.doctorID;
    }

    public ArrayList<Patient> addPatient(Patient patient){
        patients.add(patient);
        return patients;
    }

    public ArrayList<Patient> removePatient(Patient patient){
        for (Patient p : patients){
            if(p.getPatientID() == patient.getPatientID()){
                patients.remove(p);
            }
        }
        return patients;
    }

}
