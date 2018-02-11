package treatment;

import misc.Price;

public class Psychotreatment extends Treatment {

    private Price psychotreatmentprice;
    private int priceValue;

    public Psychotreatment(int value){
        this.priceValue = value;
        setTreatmentPrice();
    }

    public Psychotreatment(){
        this(100);
    }

    public Price setTreatmentPrice(){
        psychotreatmentprice = Price.createPrice(priceValue,100918);
        System.out.println("Psychotreatment default price = " + psychotreatmentprice.getValue());
        return psychotreatmentprice;
    }
}
