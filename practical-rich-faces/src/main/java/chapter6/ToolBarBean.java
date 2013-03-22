package chapter6;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import org.richfaces.component.html.HtmlTabPanel;

public class ToolBarBean implements Serializable {
	
	private boolean nyc;
	private boolean sf;
	private boolean la;
	
	
	public void cityListener(ActionEvent event) {
		String id = event.getComponent().getId();
		nyc = false;
		sf = false;
		la = false;
		if(id.equals("nyc")) {
			nyc = true;
		}
		if(id.equals("sf")) {
			sf = true;
		}
		if(id.equals("la")) {
			la = true;
		}
	}

	public boolean isNyc() {
		return nyc;
	}

	public boolean isSf() {
		return sf;
	}

	public boolean isLa() {
		return la;
	}

}
