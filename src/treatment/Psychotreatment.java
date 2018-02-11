package treatment;

import main.UnvalidDateException;
import misc.Price;

public class Psychotreatment extends Treatment {

    private Price psychotreatmentprice;
    private int priceValue;

    public Psychotreatment(int value) throws UnvalidDateException{
        this.priceValue = value;
        setTreatmentPrice();
    }

    public Psychotreatment() throws UnvalidDateException{
        this(100);
    }

    public Price setTreatmentPrice() throws UnvalidDateException {
        psychotreatmentprice = Price.createPrice(priceValue,100918);
        System.out.println("Psychotreatment default price = " + psychotreatmentprice.getValue());
        return psychotreatmentprice;
    }
}
