package treatment;

import interfaces.Deductable;
import main.UnvalidDateException;
import misc.Price;

public class Chemotherapy extends Treatment implements Deductable{

    private Price chemotherapyprice;

    public Chemotherapy() {
        try {
            setTreatmentPrice();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Price setTreatmentPrice() throws UnvalidDateException {
        chemotherapyprice = Price.createPrice(600,100918);
        System.out.println("Chemotherapy default price = " + chemotherapyprice.getValue());
        return chemotherapyprice;
    }

    @Override
    public Price deductTreatment(Deductable treatment, int date) {
        chemotherapyprice.setValue(1999.99);
        System.out.println("Deductable chemotherapy price = " + chemotherapyprice.getValue());
        System.out.println(date);
        return chemotherapyprice;
    }
}
