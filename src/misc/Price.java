package misc;

public class Price {

    private double value;
    private int date;

    private Price(double value, int date){
        this.value = value;
        this.date = date;
    }

    public static Price createPrice(double value, int date){
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
