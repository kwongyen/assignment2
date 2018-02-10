package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Price;

public class MRI extends Treatment implements Reservable, Deductable{

    private Price mriprice;
    private Equipment equipment;

    public MRI(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        mriprice = Price.createPrice(999.99,100918);
        System.out.println("MRI default price = "+mriprice.getValue());
        return mriprice;
    }

    @Override
    public Price deductTreatment(Deductable treatment, int date) {
        mriprice.setValue(1999.99);
        System.out.println("Deductable mri price = "+ mriprice.getValue());
        System.out.println(date);
        return mriprice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) {
        equipment = Equipment.createEquipment(Equipment.ROOM, date);
        System.out.println(date);
        return equipment;
    }
}
