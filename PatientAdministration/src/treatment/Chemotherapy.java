package treatment;

import interfaces.Deductable;
import misc.Price;

public class Chemotherapy extends Treatment implements Deductable{
    public Price setTreatmentPrice(){
        return Price.createPrice(600);
    }

    @Override
    public Price deductTreatment() {
        return null;
    }
}
