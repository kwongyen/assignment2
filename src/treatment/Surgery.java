package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Price;

public class Surgery extends Treatment implements Reservable, Deductable{

    private Price surgeryPrice;

    public Price setTreatmentPrice(){
        surgeryPrice = Price.createPrice(3999.99);
        return surgeryPrice;
    }

    @Override
    public Price deductTreatment() {
        surgeryPrice.setValue(1999.99);
        System.out.println(surgeryPrice.getValue());
        return surgeryPrice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) {
        System.out.print("Equipment will be reserved for: ");
        System.out.println(date);
        return new Equipment(treatment);
    }
}
