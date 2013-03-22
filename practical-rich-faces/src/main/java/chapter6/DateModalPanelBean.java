package chapter6;

import java.io.Serializable;


public class DateModalPanelBean implements Serializable {

	private static final long serialVersionUID = 1939987585834273293L;

	public DateModalPanelBean() {
		
	}
	
	public java.util.Date getNow(){
		return new java.util.Date();
	}
	

}
