package patientadministration.api.interfaces;

import patientadministration.api.misc.Price;

public interface Deductable {
    Price deductTreatment();
}
