package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Price;

public class Surgery extends Treatment implements Reservable, Deductable{

    private Price surgeryprice;
    private Equipment equipment;

    public Surgery(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        surgeryprice = Price.createPrice(3999.99,100918);
        System.out.println("Surgery default price = " + surgeryprice.getValue());
        return surgeryprice;
    }

    @Override
    public Price deductTreatment(Deductable treatment, int date) {
        surgeryprice.setValue(1999.99);
        System.out.println("Deductable surgery price = " + surgeryprice.getValue());
        System.out.println(date);
        return surgeryprice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) {
        equipment = Equipment.createEquipment(Equipment.TABLE, date);
        System.out.println(date);
        return equipment;
    }
}
