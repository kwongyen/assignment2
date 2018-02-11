package treatment;

import interfaces.Deductable;
import interfaces.Reservable;
import main.UnvalidDateException;
import misc.Equipment;
import misc.Price;

public class Surgery extends Treatment implements Reservable, Deductable{

    private Price surgeryprice;
    private Equipment equipment;

    public Surgery(){
        try {
            setTreatmentPrice();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Price setTreatmentPrice() throws UnvalidDateException{
        surgeryprice = Price.createPrice(3999.99,100918);
        System.out.println("Surgery default price = " + surgeryprice.getValue());
        return surgeryprice;
    }

    @Override
    public Price deductTreatment(Deductable treatment, int date) {
        surgeryprice.setValue(1999.99);
        System.out.println("Deductable surgery price = " + surgeryprice.getValue());
        System.out.println(date);
        return surgeryprice;
    }

    @Override
    public Equipment reserveEquipment(Reservable treatment, int date) throws UnvalidDateException {
        if (date < 0 || date > 999999){
            throw new UnvalidDateException("Unvalid date in reserveEquipment");
        }
        equipment = Equipment.createEquipment(Equipment.TABLE, date);
        System.out.println(date);
        return equipment;
    }
}
