package main;

import misc.Equipment;
import misc.Price;
import treatment.*;

public class Administration {
    MRI mri = new MRI();
    Equipment mriEquipment = mri.reserveEquipment(mri, 100918);

    Surgery surgery = new Surgery();
    Price insuredSurgeryPrice = surgery.deductTreatment(surgery, 110918);

    Chemotherapy chemo = new Chemotherapy();
    Psychotreatment psycho = new Psychotreatment();

    public static Administration run(){
        return new Administration();
    }

}
