import java.time.LocalDate;
import java.util.Objects;

public abstract class Patient {

	private int patientId;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate startDate;
	private String phoneNumber;
	private String gender;
	
	//CONSTRUCTOR
	
	public Patient(int patientId, String firstName, String lastName, String email, LocalDate startDate, String phoneNumber, String gender) {
		setPatientId(patientId);
		setFirstName(firstName);
		setLastName(lastName);
		setEmail(email);
		setStartDate(startDate);
		setPhoneNumber(phoneNumber);
		setGender(gender);
	}
	
	//GETTER
	
	/*
	 * @return patiendtId
	 */
	public int getPatientId() {
		return patientId;
	}
	/*
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/*
	 * @return startDate
	 */
	public LocalDate getStartDate() {
		return startDate;
	}
	/*
	 * @return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/*
	 * @return phoneNumber
	 */
	public String getGender() {
		return gender;
	}
	
	
	// SETTER
	
	/*
	 * @param patientId
	 */
	public void setPatientId(int patientId) {
		if (patientId >= 1000 && 100000 >= patientId) {
			this.patientId = patientId;
		}
	}
	/*
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		}
	}
	/*
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} 
	}
	/*
	 * @param email
	 */
	public void setEmail(String email) {
		if (!email.isEmpty() && !email.equalsIgnoreCase(null)) {
			this.email = email;
		} 
	}
	/*
	 * @param startDate
	 */
	public void setStartDate(LocalDate startDate) {
		if (Objects.nonNull(startDate)) {
			this.startDate = startDate;
		}
	}
	/*
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} 
	}
	/*
	 * @param gender
	 */
	public void setGender(String gender) {
		if (!gender.isEmpty() && !gender.equalsIgnoreCase(null)) {
			this.gender = gender;
		} 
	}
	
	@Override
	public String toString() {
		return  "\nPatient ID: " + patientId + 
				"\nFirst Name: " + firstName + 
				"\nLast Name: " + lastName +  
				"\nEmail: " + email + 
				"\nStart Date: " + startDate + 
				"\nPhone Number: " + phoneNumber +
				"\nGender: " + gender;
	}
}