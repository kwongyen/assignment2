package interfaces;

import misc.Equipment;

public interface Reservable {
    Equipment reserveEquipment(Reservable treatment, int date);
}
