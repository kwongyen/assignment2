package treatment;

import main.UnvalidDateException;
import misc.Price;

public abstract class Treatment {
    public abstract Price setTreatmentPrice() throws UnvalidDateException;
}
