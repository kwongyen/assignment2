class LeukemiaPatient extends CancerPatient {
	
	default Doctor reserveDoctorForHomeVisit(LeukemiaPatient leukemiapatient){
			
		return leukemiapatient.doctor;
	}
	
	default Doctor emergencyContactDoctor(LeukemiaPatient leukemiapatient){
			
		return leukemiapatient.doctor;
	}
	
	default MedicalRecord requestHomeServices(LeukemiaPatient leukemiapatient){

		return leukemiapatient.medicalRecord;
	}

	default MedicalRecord requestErgonomicAppliances(LeukemiaPatient leukemiapatient){
		
		return leukemiapatient.medicalRecord;
	}
	
	default MedicalRecord fileComplaintAboutService(LeukemiaPatient leukemiapatient, String complaint) {
			
		return leukemiapatient.medicalRecord;
	}
	
	
}