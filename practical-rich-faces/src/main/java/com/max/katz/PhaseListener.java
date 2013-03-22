package com.max.katz;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;

public class PhaseListener implements javax.faces.event.PhaseListener {

	private static final long serialVersionUID = -8897322142750612681L;

	@Override
	public void afterPhase(PhaseEvent event) {
		event.getFacesContext().getExternalContext().log("AFTER " + event.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent event) {
		event.getFacesContext().getExternalContext().log("BEFORE " + event.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
