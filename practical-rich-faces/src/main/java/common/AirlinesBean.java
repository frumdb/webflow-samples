/**
 * 
 */
package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

/**
 * @author max
 * 
 */
public class AirlinesBean implements Serializable {
	
	private List<Airline> airlines;

	private Airline selected;
	
	public Airline getSelected() {
		return selected;
	}

	public void setSelected(Airline selected) {
		this.selected = selected;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}
	
	public AirlinesBean() {
//		init();
	}

	@PostConstruct
	public void init() {
		airlines = new ArrayList<Airline>();
		airlines.add(new Airline("American Airlines", "AA"));
		airlines.add(new Airline("United Airlines", "UA"));
		airlines.add(new Airline("Delta", "DL"));
		airlines.add(new Airline("Northwest Airlines", "NW"));
		airlines.add(new Airline("US Airways", "US"));
		airlines.add(new Airline("Continental", "CO"));
	}
	
	public int getSize () {
		return airlines.size();
		//
	}
}
