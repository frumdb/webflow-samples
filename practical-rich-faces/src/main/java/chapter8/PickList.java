package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class PickList implements Serializable {
	
	List<String> fruitsList;

	public List<String> getFruitsList() {
		return fruitsList;
	}

	public void setFruitsList(List<String> fruitsList) {
		this.fruitsList = fruitsList;
	}

	@PostConstruct
	public void init(){
		fruitsList = new ArrayList<String>();
		fruitsList.add("apple");
		fruitsList.add("grapes");
	}
	
}
