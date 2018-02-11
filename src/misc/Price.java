package misc;

import main.UnvalidDateException;

public class Price {

    private double value;
    private int date;

    private Price(double value, int date) throws UnvalidDateException{
        this.value = value;
        if (date < 0 || date > 999999){
            throw new UnvalidDateException("Unvalid date in Price");
        }
        this.date = date;
    }

    public static Price createPrice(double value, int date) throws UnvalidDateException{
        return new Price(value, date);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getDate() {
        return date;
    }
}
