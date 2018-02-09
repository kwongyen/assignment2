package main;

import misc.Equipment;
import misc.Price;
import treatment.MRI;
import treatment.Surgery;
import treatment.Treatment;

public class Administration {
    MRI mri = new MRI();
    Price mriPrice = mri.setTreatmentPrice();
    Equipment mriEquipment = mri.reserveEquipment(mri, 100918);
    Surgery surgery = new Surgery();
    Price uninsuredSurgeryPrice = surgery.setTreatmentPrice();
    Price insuredSurgeryPrice = surgery.deductTreatment();

    public static Administration Run(){
        return new Administration();
    }

}
