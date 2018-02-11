package interfaces;

import main.UnvalidDateException;
import misc.Equipment;

public interface Reservable {
    Equipment reserveEquipment(Reservable treatment, int date) throws UnvalidDateException;
}
