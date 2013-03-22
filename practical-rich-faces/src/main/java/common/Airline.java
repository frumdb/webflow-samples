package common;

import java.io.Serializable;

public class Airline implements Serializable {

	private String name;
	
	private String code;
	
	private String image;
	
	

	public Airline(String name, String code) {
		this (name, code, "");
	}

	public Airline(String name, String code, String image) {
		super();
		this.name = name;
		this.code = code;
		this.image = image;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}
