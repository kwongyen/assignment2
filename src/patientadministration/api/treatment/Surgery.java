package patientadministration.api.treatment;

import patientadministration.api.interfaces.Deductable;
import patientadministration.api.interfaces.Reservable;
import patientadministration.api.misc.Equipment;
import patientadministration.api.misc.Price;

public class Surgery extends Treatment implements Reservable, Deductable{
    private Price surgeryprice;
    public Surgery(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        surgeryprice = Price.createPrice(3999.99);
        System.out.println("Surgery default price = "+surgeryprice.getValue());
        return surgeryprice;
    }

    @Override
    public Price deductTreatment() {
        surgeryprice.setValue(1999.99);
        System.out.println("Deductable surgery price = "+surgeryprice.getValue());
        return surgeryprice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) {
        System.out.print("Equipment will be reserved for: ");
        System.out.println(date);
        return new Equipment(treatment);
    }
}
