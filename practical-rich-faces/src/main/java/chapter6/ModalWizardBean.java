package chapter6;

import java.io.Serializable;

public class ModalWizardBean implements Serializable {

	private String name;
	private String email;
	private int view = 1;
	
	public String getView() {
		return "page" + view + ".xhtml";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String next(){
		view ++;
		return null;
	}
	public void reset(){
		this.view=1;
	}
}
