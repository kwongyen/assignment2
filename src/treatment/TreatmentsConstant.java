package treatment;

import java.util.Arrays;
import java.util.List;

public class TreatmentsConstant {

    public static final String CHEMOTHERAPY = "chemotherapy";
    public static final String MRI = "MRI";
    public static final String PSYCHOTREATMENT = "psychotreatment";
    public static final String SURGERY = "surgery";

    public static final List<String> TREATMENTS = Arrays.asList(new String[] {CHEMOTHERAPY, MRI, PSYCHOTREATMENT, SURGERY});

    public static final List<Treatment> TREATMENT_LIST = Arrays.asList(new Treatment[] {new Chemotherapy(), new MRI(), new Psychotreatment(), new Surgery()});

}

