package patientadministration.api.main;

import patientadministration.api.misc.Patient;
import patientadministration.api.treatment.TreatmentsConstant;

import java.util.ArrayList;

public class Administration {

    private ArrayList<Patient> patientList = new ArrayList<>();

    public void registerCurrentPatients(){
        patientList.add(new Patient("Jan", "pieter", 22,184,83,"Male"));
        patientList.add(new Patient("Bob", "Hogendijk", 64, 178, 90, "Male"));
    }

    public void registerNewPatient(String firstName, String lastName, int age, int height, float weight, String gender){
        patientList.add(new Patient(firstName, lastName, age, height, weight, gender));
    }

    public void registerTreatment(int patientId, String treatment) {

        Patient currentPatient;

        for (Patient patient : patientList) {
            if (patientId == (patient.getPatientId())){
                currentPatient = patient;

                for (String treatmentOption : TreatmentsConstant.TREATMENTS) {
                    if (treatment.equals(treatmentOption)){
                        currentPatient.setRequiredTreatments();
                    }
                }
            }
        }
    }

    public void reserveTreatment(){

    }

//    MRI mri = new MRI();
//    Equipment mriEquipment = mri.reserveEquipment(mri, 100918);
//
//    Surgery surgery = new Surgery();
//    Price insuredSurgeryPrice = surgery.deductTreatment();
//
//    Chemotherapy chemo = new Chemotherapy();
//
//    Psychotreatment psycho = new Psychotreatment();

    public static Administration Run(){
        return new Administration();
    }

}
