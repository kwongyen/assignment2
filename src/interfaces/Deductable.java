package interfaces;

import misc.Price;

public interface Deductable {
    Price deductTreatment(Deductable treatment, int date);
}
