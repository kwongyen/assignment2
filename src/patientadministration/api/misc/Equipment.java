package patientadministration.api.misc;

import patientadministration.api.interfaces.Reservable;

public class Equipment {
    private boolean reserveTable;
    private boolean reserveScalp;
    private boolean reserveRoom;

    public Equipment(Reservable reservable){
        reserveTable = true;
        reserveScalp = true;
        reserveRoom = true;
    }

}
