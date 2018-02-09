class CancerPatient extends Patient implements HomeService {
	
	default Doctor reserveDoctorForHomeVisit(CancerPatient cancerpatient){
			
		return cancerpatient.doctor;
	}
	
	default Doctor emergencyContactDoctor(CancerPatient cancerpatient){
			
		return cancerpatient.doctor;
	}
	
	default MedicalRecord requestHomeServices(CancerPatient cancerpatient){

		return cancerpatient.medicalRecord;
	}

	default MedicalRecord requestErgonomicAppliances(CancerPatient cancerpatient){
		
		return cancerpatient.medicalRecord;
	}
	
	default MedicalRecord fileComplaintAboutService(CancerPatient cancerpatient, String complaint) {
			
		return cancerpatient.medicalRecord;
	}
	
	
}