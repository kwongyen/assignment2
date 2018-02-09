package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import misc.Equipment;
import misc.Price;

public class MRI extends Treatment implements Reservable, Deductable{

    public Price setTreatmentPrice(){
        System.out.println("MRI IS 999.99");
        return Price.createPrice(999.99);
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
