package chapter4.wizard;

import javax.faces.event.ActionEvent;

public class RegistrationBean implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;
	private Integer step = 1;

	public Integer getStep() {
		return step;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void nextStep(ActionEvent event) {
		this.step++;
	}

	public void prevStep(ActionEvent event) {
		this.step--;
	}

	public RegistrationBean() {
	}
}
