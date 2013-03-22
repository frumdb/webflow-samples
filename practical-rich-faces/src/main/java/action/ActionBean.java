package action;

import java.io.Serializable;

public class ActionBean implements Serializable {
	private boolean enabled;

	public ActionBean() {
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public java.util.Date getNow() {
		return new java.util.Date();
	}

	public String stopClock() {
		enabled = false;
		return null;
	}

	public String startClock() {
		enabled = true;
		return null;
	}
}
