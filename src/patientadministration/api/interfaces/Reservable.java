package patientadministration.api.interfaces;

import patientadministration.api.misc.Equipment;

public interface Reservable {
    Equipment reserveEquipment(Reservable treatment, int date);
}
