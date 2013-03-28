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

public class StringWondersBean2 implements Serializable {
	private List<SelectItem> ancientWonders;
	private Map<String, String> wonderMap;
	
	public List<SelectItem> getAncientWonders() {
		return ancientWonders;
	}

	public void setAncientWonders(List<SelectItem> ancientWonders) {
		this.ancientWonders = ancientWonders;
	}


	@PostConstruct
	public void init() {
		wonderMap = new HashMap<String, String>();

		wonderMap.put("0", "Great Pyramid of Giza"+"Egypt");
		wonderMap.put("1", "Hanging Gardens of Babylon"+ "Iraq");
		wonderMap.put("2", "Statue of Zeus at Olympia"+ "Greece");
		wonderMap.put("3", "Temple of Artemis at Ephesus"+"Turkey");
		wonderMap.put("4", "Mausoleum of Maussollos at Halicarnassus"+ "Turkey");
		wonderMap.put("5", "Colossus of Rhodes"+
				"Greek island of Rhodes");
		wonderMap.put("6","Lighthouse of Alexandria"+"Egypt");
		
		
		ancientWonders = new ArrayList<SelectItem>();
		for(Entry<String, String> entry: wonderMap.entrySet()){
			ancientWonders.add(new SelectItem(entry.getValue(), entry.getKey()));
		}
		
	}
}