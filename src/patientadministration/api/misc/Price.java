package patientadministration.api.misc;

public class Price {

    int date;
    private double value;

    private Price(double value){
        this.value=value;
    }

    public static Price createPrice(double value){
        return new Price(value);
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}
