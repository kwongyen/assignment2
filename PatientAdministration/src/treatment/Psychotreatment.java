package treatment;

import misc.Price;

public class Psychotreatment extends Treatment {
    public Price setTreatmentPrice(){
        return Price.createPrice(100);
    }
}
