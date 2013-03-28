package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

public class StringWondersBean implements Serializable {
	private List<String> ancientWonders;
	
	public List<String> getAncientWonders() {
		return ancientWonders;
	}

	public void setAncientWonders(List<String> ancientWonders) {
		this.ancientWonders = ancientWonders;
	}

	@PostConstruct
	public void init() {
		ancientWonders = new ArrayList<String>();
		ancientWonders.add("Great Pyramid of Giza" + "Egypt");
		ancientWonders.add("Hanging Gardens of Babylon" + "Iraq");
		ancientWonders.add("Statue of Zeus at Olympia"+ "Greece");
		ancientWonders
				.add("Temple of Artemis at Ephesus"+ "Turkey");
		ancientWonders.add(
				"Mausoleum of Maussollos at Halicarnassus"+ "Turkey");
		ancientWonders.add("Colossus of Rhodes"+
				"Greek island of Rhodes");
		ancientWonders.add("Lighthouse of Alexandria"+ "Egypt");
		
	}


}