package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Price;

public class MRI extends Treatment implements Reservable, Deductable{
    private Price mriprice;
    public MRI(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        mriprice = Price.createPrice(999.99);
        System.out.println("MRI default price = "+mriprice.getValue());
        return mriprice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) {
        System.out.print("Equipment will be reserved for: ");
        System.out.println(date);
        return new Equipment(treatment);
    }

    @Override
    public Price deductTreatment() {
        return null;
    }
}
