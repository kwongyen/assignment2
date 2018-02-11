package patientadministration.api.treatment;

import patientadministration.api.interfaces.Deductable;
import patientadministration.api.interfaces.Reservable;
import patientadministration.api.misc.Equipment;
import patientadministration.api.misc.Price;

public class MRI extends Treatment implements Reservable, Deductable{
    private Price mriprice;
    public MRI(){
        setTreatmentPrice();
    }
    private double deductionPercentage = 0.5;

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
        mriprice.setValue(mriprice.getValue()*deductionPercentage);
        System.out.println("Treatment has been deducted. New price is: " + mriprice.getValue());
        return  mriprice;
    }
}
