package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

public class WorldWondersBean3 implements Serializable {
	private List<Wonder3> ancientWonders;
	private Set<Wonder3> selected;
	private Map<Integer, Wonder3> wonderMap;
	
	public List<Wonder3> getAncientWonders() {
		return ancientWonders;
	}

	public void setAncientWonders(List<Wonder3> ancientWonders) {
		this.ancientWonders = ancientWonders;
	}

	@PostConstruct
	public void init() {
		ancientWonders = new ArrayList<Wonder3>();

		ancientWonders.add(new Wonder3(0, "Great Pyramid of Giza", "Egypt"));
		ancientWonders.add(new Wonder3(1, "Hanging Gardens of Babylon", "Iraq"));
		ancientWonders.add(new Wonder3(2, "Statue of Zeus at Olympia", "Greece"));
		ancientWonders.add(new Wonder3(3, "Temple of Artemis at Ephesus", "Turkey"));
		ancientWonders.add(new Wonder3(4,
				"Mausoleum of Maussollos at Halicarnassus", "Turkey"));
		ancientWonders.add(new Wonder3(5, "Colossus of Rhodes",
				"Greek island of Rhodes"));
		ancientWonders.add(new Wonder3(6, "Lighthouse of Alexandria", "Egypt"));

		
		wonderMap = new HashMap<Integer, Wonder3>();
		for(Wonder3 wonder: ancientWonders){
			wonderMap.put(wonder.getId(), wonder);
		}
		
		
		
		selected = new HashSet<Wonder3>();
		selected.add(wonderMap.get(0));
		selected.add(wonderMap.get(1));
		
		
	}

	public Set<Wonder3> getSelected() {
		return selected;
	}

	public void setSelected(Set<Wonder3> selected) {
		this.selected = selected;
	}

	public Integer outerState;
	
	public class WonderConverter3 implements javax.faces.convert.Converter
		, Serializable {

		public Integer state;
		
		public void changeOuterState(Integer newValue){
			outerState = newValue;
		}
		
		
		@Override
		public Object getAsObject(FacesContext context, UIComponent component,
				String value) {
			Integer id = Integer.decode(value);
			return wonderMap.get(id);
		}

		@Override
		public String getAsString(FacesContext context, UIComponent component,
				Object value) {
			return ((Wonder3)value).getId().toString();
		}
		
	}
	
	private WonderConverter3 converter = new WonderConverter3();
	
	public WonderConverter3 getConverter(){
		return converter;
	}
	

	
	
	

}