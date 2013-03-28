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
import javax.faces.model.SelectItem;

public class WorldWondersBean2 implements Serializable {
	private List<SelectItem> ancientWonders;
	private Set<SelectItem> selected;
	private Map<String, Wonder2> wonderMap;
	


	@PostConstruct
	public void init() {
		wonderMap = new HashMap<String, Wonder2>();

		wonderMap.put("0", new Wonder2("Great Pyramid of Giza", "Egypt"));
		wonderMap.put("1", new Wonder2("Hanging Gardens of Babylon", "Iraq"));
		wonderMap.put("2", new Wonder2("Statue of Zeus at Olympia", "Greece"));
		wonderMap.put("3", new Wonder2("Temple of Artemis at Ephesus", "Turkey"));
		wonderMap.put("4", new Wonder2(
				"Mausoleum of Maussollos at Halicarnassus", "Turkey"));
		wonderMap.put("5", new Wonder2("Colossus of Rhodes",
				"Greek island of Rhodes"));
		wonderMap.put("6",new Wonder2("Lighthouse of Alexandria", "Egypt"));
		
		
		ancientWonders = new ArrayList<SelectItem>();
		for(Entry<String, Wonder2> entry: wonderMap.entrySet()){
			ancientWonders.add(new SelectItem(entry.getValue(), entry.getKey()));
		}
		
		selected = new HashSet<SelectItem>();
		selected.add(ancientWonders.get(0));
		selected.add(ancientWonders.get(1));
		
		
	}

	public Set<SelectItem> getSelected() {
		return selected;
	}

	public void setSelected(Set<SelectItem> selected) {
		this.selected = selected;
	}

	public List<SelectItem> getAncientWonders() {
		return ancientWonders;
	}

	public void setAncientWonders(List<SelectItem> ancientWonders) {
		this.ancientWonders = ancientWonders;
	}

}