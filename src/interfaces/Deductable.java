package interfaces;

import misc.Price;
import treatment.Treatment;

public interface Deductable {
    Price deductTreatment(Deductable treatment, int date);
}
