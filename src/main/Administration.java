package main;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Patient;
import misc.Price;
import treatment.*;

import java.util.ArrayList;
import java.util.Optional;

public class Administration {
    private ArrayList<Patient> patientList = new ArrayList<>();

    public void registerCurrentPatients() {
        patientList.add(new Patient("Jan", "Pietersen", 22, 184, 83, "Male"));
        patientList.add(new Patient("Bob", "Hoogendijk", 64, 178, 90, "Male"));
    }

    public void registerNewPatient(String firstName, String lastName, int age, int height, float weight, String gender) {
        patientList.add(new Patient(firstName, lastName, age, height, weight, gender));
    }

    private Optional<Patient> findPatient(int patientId) {
        for (Patient currentPatient : patientList) {
            if (patientId == currentPatient.getPatientId()) {
                return Optional.of(currentPatient);
            }
        }
        return Optional.empty();
    }

    private Optional<Treatment> findTreatment(String treatment) {
        for (Treatment currentTreatment : TreatmentsConstant.TREATMENT_LIST) {
            if (currentTreatment.getClass().getSimpleName().equals(treatment)) {
                try {
                    return Optional.of(currentTreatment.getClass().newInstance());
                } catch (Exception e) {
                    return Optional.empty();
                }
            }
        }
        return Optional.empty();
    }

    public void registerTreatment(int patientId, String treatment) {

        Optional<Patient> patientOptional = findPatient(patientId);
        if (!patientOptional.isPresent()) {
            return;
        }
        Optional<Treatment> currentTreatmentOptional = findTreatment(treatment);
        if (!currentTreatmentOptional.isPresent()) {
            return;
        }
        patientOptional.get().setRequiredTreatments(currentTreatmentOptional.get());
    }

    public void reserveTreatment(int patientId, String treatment) {
        Optional<Patient> patientOptional = findPatient(patientId);

        if (!patientOptional.isPresent()) {
            return;
        }

        Optional<Treatment> currentTreatmentOptional = findTreatment(treatment);
        if (!currentTreatmentOptional.isPresent()){
            return;
        }

        for (Treatment patientTreatment : patientOptional.get().getRequiredTreatments()) {
            if (patientTreatment.getClass().equals(currentTreatmentOptional.get().getClass())){

                try{
                    Reservable.class.cast(patientTreatment).reserveEquipment(Reservable.class.cast(patientTreatment), 10101992);
                    try {

                        Deductable.class.cast(patientTreatment).deductTreatment(Deductable.class.cast(patientTreatment),1010992);
                    } catch (Exception e) {
                        System.out.println("This treatment is not deductable");
                    }
                } catch (Exception e) {
                    System.out.println("This treatment is not reservable");
                    return;
                }


            }
        }
    }

    public static Administration Run() {
        return new Administration();
    }

}
