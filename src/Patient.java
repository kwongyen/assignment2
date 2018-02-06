public abstract class Patient {

    private int patientID;
    private Doctor doctor;
    private MedicalRecord medicalrecord;

    Patient(int patientID, Doctor doctor, MedicalRecord medicalrecord){
        this.patientID = patientID;
        this.doctor = doctor;
        this.medicalrecord = medicalrecord;
    }

    /*abstract Doctor reserveDoctorForHomeVisit(Patient patient);
    abstract Doctor emergencyContactDoctor(Patient patient);
    abstract MedicalRecord requestErgomicAppliances(Patient patient);
    abstract MedicalRecord requestHomeServices(Patient patient);
    abstract MedicalRecord fileComplaintAboutService(Patient patient, String complaint);*/

    public int getPatientID(){
        return this.patientID;
    }

    public Doctor getDoctor(){
        return this.doctor;
    }

    public MedicalRecord getMedicalrecord(){
        return this.medicalrecord;
    }
}
