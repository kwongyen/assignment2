package main;

import misc.Equipment;
import misc.Price;
import treatment.*;

public class Administration {
    MRI mri = new MRI();
    Equipment mriEquipment = mri.reserveEquipment(mri, 100918);

    Surgery surgery = new Surgery();
    Price insuredSurgeryPrice = surgery.deductTreatment();

    Chemotherapy chemo = new Chemotherapy();


    Psychotreatment psycho = new Psychotreatment();

    public static Administration Run(){
        return new Administration();
    }

}
