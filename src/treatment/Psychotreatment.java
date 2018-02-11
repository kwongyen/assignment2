package treatment;

import main.UnvalidDateException;
import misc.Price;

public class Psychotreatment extends Treatment {

    private Price psychotreatmentprice;
    private int priceValue;

    public Psychotreatment(int value){
        try {
            this.priceValue = value;
            setTreatmentPrice();
        } catch (Exception e){
        throw new RuntimeException(e);
        }
    }

    public Psychotreatment(){
            this.priceValue = 100;
    }

    public Price setTreatmentPrice() throws UnvalidDateException {
        psychotreatmentprice = Price.createPrice(priceValue,100918);
        System.out.println("Psychotreatment default price = " + psychotreatmentprice.getValue());
        return psychotreatmentprice;
    }
}
