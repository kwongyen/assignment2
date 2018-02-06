import java.util.*;

public class MedicalRecord {

    private ArrayList<String> record;

    MedicalRecord(){
        this.record = new ArrayList<String>();
    }

    public MedicalRecord addRecord(String s){
        record.add(s);
        return this;
    }

    public MedicalRecord deleteRecord(String s){
        record.remove(s);
        return this;
    }

}
