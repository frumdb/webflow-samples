package chapter8;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class AirlineConverter implements javax.faces.convert.Converter {
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		String[] words = value.split(":");
		String name = words[0];
		String code = words[1];
		Airline airline = new Airline(name, code);
		return airline;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		return value.toString();
	}
}
