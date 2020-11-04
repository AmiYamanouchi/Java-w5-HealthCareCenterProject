//import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;


public class Appointment {
	private LocalDateTime appointmentDate;
	private Patient patient;
	//CONSTRUCTOR
	public  Appointment(Patient patient, int year, int month, int day, int hour, int minute) {
		setPatient(patient);
		setAppointmentDate(year, month, day, hour, minute);
	}
	//GETTER
	/*
	 * @return appointmentDate
	 */
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	
	public Patient getPatient() {
		return patient;
	}
	// SETTER
	/*
	 * @param appointmentDate
	 */
//	public void setAppointmentDate(LocalDate appointmentDate) {
//		if (Objects.nonNull(appointmentDate)) {
//			this.appointmentDate = appointmentDate;
//		} else {
//			this.appointmentDate = LocalDate.now();
//		}		
//	}
	
	public void setAppointmentDate(int year, int month, int day, int hour, int minute) {
		this.appointmentDate = LocalDateTime.of(year, month, day, hour, minute);
	}
	
	public void setPatient(Patient patient) {
		if(Objects.nonNull(patient)) {
			this.patient = patient;
		}
	}
	
	
	@Override
	public String toString() {
		return "\n*** Patient Appointment Date ***" + 
				"\nPatient Name: " + patient.getFirstName() + " " + patient.getLastName() +
				"\nAppointment date is " + appointmentDate  + ".";
	}
}






