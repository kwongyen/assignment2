package misc;

import interfaces.Reservable;
import treatment.MRI;
import treatment.Surgery;

public class Equipment {
    private boolean reserveTable = false;
    private boolean reserveScalp = false;
    private boolean reserveRoom = false;

    public static final int TABLE = 1;
    public static final int SCALP = 2;
    public static final int ROOM = 3;

    private int date;

    private Equipment(int equip, int date){
        switch (equip){
            case TABLE: reserveTable = true;
                System.out.print("Table will be reserved for: ");
                break;
            case SCALP: reserveScalp = true;
                System.out.print("Scalp will be reserved for: ");
                break;
            case ROOM: reserveRoom = true;
                System.out.print("Room will be reserved for: ");
        }

        this.date = date;
    }

    public static Equipment createEquipment(int equip, int date){
        return new Equipment(equip, date);
    }

    public int getDate() {
        return date;
    }

}
