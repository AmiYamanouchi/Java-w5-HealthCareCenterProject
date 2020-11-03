import java.time.LocalDate;
import java.util.Objects;


public class Appointment extends Patient {
	private LocalDate appointmentDate;
	//CONSTRUCTOR
	public Appointment(int patientId, String firstName, String lastName, String email, LocalDate startDate, String phoneNumber, String gender, LocalDate appointmentDate) {
		super(patientId, firstName, lastName, email, startDate, phoneNumber, gender);
		setAppointmentDate(appointmentDate);
	}
	//GETTER
	/*
	 * @return appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	// SETTER
	/*
	 * @param appointmentDate
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		if (Objects.nonNull(appointmentDate)) {
			this.appointmentDate = appointmentDate;
		} else {
			this.appointmentDate = LocalDate.now();
		}		
	}
	@Override
	public String toString() {
		return "\n*** Patient Appointment Date ***" + 
				super.toString() +
				"\nYour appoint date is " + appointmentDate  + ".";
	}
}






