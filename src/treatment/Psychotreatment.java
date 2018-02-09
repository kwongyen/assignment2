package treatment;

import misc.Price;

public class Psychotreatment extends Treatment {
    private Price psychotreatmentprice;
    public Psychotreatment(){
        setTreatmentPrice();
    }

    public Price setTreatmentPrice(){
        psychotreatmentprice = Price.createPrice(100);
        System.out.println("Psychotreatment default price = "+psychotreatmentprice.getValue());
        return psychotreatmentprice;
    }
}
