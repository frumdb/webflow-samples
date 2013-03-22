package chapter4;

import java.io.Serializable;

public class JSFunctionBean implements Serializable {

	private String size;
	private String name;
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
