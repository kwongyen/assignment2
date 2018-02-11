package main;

import misc.Equipment;
import misc.Patient;
import misc.Price;
import treatment.*;

import java.util.ArrayList;

public class Administration {
/*
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
                        currentPatient.setRequiredTreatments(treatment);
                    }
                }
            }
        }
    }

    public void reserveTreatment(){

    }*/
    public Administration(){
        try {
            MRI mri = new MRI();
            Equipment mriEquipment = mri.reserveEquipment(mri, 100918);

            Surgery surgery = new Surgery();
            Equipment surgeryEquipment = surgery.reserveEquipment(surgery, 9100918);
            Price insuredSurgeryPrice = surgery.deductTreatment(surgery, 110918);

            Chemotherapy chemo = new Chemotherapy();

            Psychotreatment psycho = new Psychotreatment();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static Administration run(){
            return new Administration();

    }

}
