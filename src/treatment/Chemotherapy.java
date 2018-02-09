package treatment;

import interfaces.Deductable;
import misc.Price;

public class Chemotherapy extends Treatment implements Deductable{
    private Price chemotherapyprice;
    public Chemotherapy(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        chemotherapyprice = Price.createPrice(600);
        System.out.println("Chemotherapy default price = "+chemotherapyprice.getValue());
        return chemotherapyprice;
    }
    @Override
    public Price deductTreatment() {
        return null;
    }
}
