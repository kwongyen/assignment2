package patientadministration;

import patientadministration.api.main.Administration;

public class StartAdministration {
    public static void main(String args[]) {
        Administration administration = patientadministration.api.main.Administration.Run();

        administration.registerCurrentPatients();
        administration.registerNewPatient("Daan", "Bovenbeen", 23, 190, 100, "Male");
    }
}
