public interface HomeService {
	
	default Doctor reserveDoctorForHomeVisit(Patient patient){
		return doctorPhil;
	}
	
	default Doctor emergencyContactDoctor(Patient patient){
		return doctorPhil;
	}
	
	default MedicalRecord determineHomeServices(Patient patient){
		return patient.medicalRecord;
	}

	default MedicalRecord collectErgonomicAppliances(Patient patient){
		return patient.medicalRecord;
	}
	
	default MedicalRecord fileComplaintAboutService(Patient patient, String complaint) {
		return patient.medicalRecord;
	}
	
}