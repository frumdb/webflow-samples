package chapter8;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class WonderConverter implements javax.faces.convert.Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		String[] words = value.split(":");
		String name = words[0];
		String location = words[1];
		
		Wonder wonder = new Wonder(name, location);
		
		return wonder;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		
		return value.toString();
	}

}
