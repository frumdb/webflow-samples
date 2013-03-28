package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

public class WorldWondersBean implements Serializable {
	private List<Wonder> ancientWonders;
	private Set<Wonder> selected;
	
	public List<Wonder> getAncientWonders() {
		return ancientWonders;
	}

	public void setAncientWonders(List<Wonder> ancientWonders) {
		this.ancientWonders = ancientWonders;
	}

	@PostConstruct
	public void init() {
		ancientWonders = new ArrayList<Wonder>();
		ancientWonders.add(new Wonder("Great Pyramid of Giza", "Egypt"));
		ancientWonders.add(new Wonder("Hanging Gardens of Babylon", "Iraq"));
		ancientWonders.add(new Wonder("Statue of Zeus at Olympia", "Greece"));
		ancientWonders
				.add(new Wonder("Temple of Artemis at Ephesus", "Turkey"));
		ancientWonders.add(new Wonder(
				"Mausoleum of Maussollos at Halicarnassus", "Turkey"));
		ancientWonders.add(new Wonder("Colossus of Rhodes",
				"Greek island of Rhodes"));
		ancientWonders.add(new Wonder("Lighthouse of Alexandria", "Egypt"));
		
		selected = new HashSet<Wonder>();
		selected.add(ancientWonders.get(0));
		selected.add(ancientWonders.get(1));
		
		
	}

	public Set<Wonder> getSelected() {
		return selected;
	}

	public void setSelected(Set<Wonder> selected) {
		this.selected = selected;
	}
	
	
	public static void main(String[] args){
		WorldWondersBean3 bean = new WorldWondersBean3();
		WorldWondersBean3.WonderConverter3 converter1 = bean.new WonderConverter3();
		WorldWondersBean3.WonderConverter3 converter2 = bean.new WonderConverter3();
		
		converter1.state = 1;
		converter2.state = 2;
		
		System.out.println(converter1.state);
		
		bean.outerState = 1000;
		converter1.changeOuterState(1);
		converter2.changeOuterState(2);
		
		System.out.println(bean.outerState);
		
		
		
	}
	

}