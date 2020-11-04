import java.util.ArrayList;

public class Doctor {

	private int doctorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String specialty;
	private ArrayList<Appointment> Appointment;
	//Array List of Appointments
	
	//constructor 
	
	public Doctor(int doctorId, String firstName, String lastName, String phoneNumber, String email, String specialty) {
		setDoctorId(doctorId);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		setSpecialty(specialty);
		this.Appointment = new ArrayList<>();
		
	}
	
	public void addAppontment(Appointment appointment) {
		this.Appointment.add(appointment);
	}
	
	
	//getter
	public int getDoctorId() {
		return doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getSpecialty() {
		return specialty;
	}
	public ArrayList<Appointment> getAppointments() {
		return Appointment;
	}
	
	//setter
	public void setDoctorId(int doctorId) {
		if(doctorId > 1000 && doctorId <= 100000 ) {
			this.doctorId = doctorId;
		} else {
			this.doctorId = 1001;
		}
	}
	public void setFirstName(String firstName) {
		if(!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "unknown";
		}
	}
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} else {
			this.email = "Unknown";
		}
	}
	public void setSpecialty(String specialty) {
		if (!specialty.isEmpty() && !specialty.equalsIgnoreCase(null)) {
			this.specialty = specialty;
		} else {
			this.specialty = "Unknown";
		}
	}
	
	//appointments list
	public ArrayList<Appointment> getAppointment(){
		return Appointment;
	}
	
	@Override
	public String toString() {
		return  "\nDoctor ID: " + doctorId + 
				"\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +  
				"\nEmail: " + email + 
				"\nPhone Number: " + phoneNumber +
				"\nSpecialty: " + specialty +
				"\nList of Appointments: " + Appointment;
	}
	
	
	
}
