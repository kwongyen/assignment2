package main;

import treatment.TreatmentsConstant;

public class StartAdministration {

  public static void main(String args[]) {
    Administration administration = Administration.Run();

    administration.registerCurrentPatients();
    administration.registerNewPatient("Daan", "Bovenbeen", 23, 190, 100, "Male");

    administration.registerTreatment(1, TreatmentsConstant.PSYCHOTREATMENT);

    administration.registerTreatment(1, "MRI");

    administration.reserveTreatment(1, "MRI");

    administration.reserveTreatment(1, TreatmentsConstant.PSYCHOTREATMENT);
  }
}

