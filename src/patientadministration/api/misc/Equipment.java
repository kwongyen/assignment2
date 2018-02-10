package patientadministration.api.misc;

import patientadministration.api.interfaces.Reservable;

public class Equipment {
    private boolean reserveTable = false;
    private boolean reserveScalp = false;
    private boolean reserveRoom = false;

    public Equipment(Reservable reservable){
        reserveTable = true;
        reserveScalp = true;
        reserveRoom = true;
    }

}
