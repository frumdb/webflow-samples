package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class AirlinesBean implements Serializable {
	private List<Airline> airlines;
	private List<Airline> target;

	public List<Airline> getTarget() {
		return target;
	}

	public void setTarget(List<Airline> target) {
		this.target = target;
	}

	public List<Airline> getAirlines() {
		return airlines;
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
		airlines.add(new Airline("JetBlue", "B9"));
		airlines.add(new Airline("Alaska Airlines", "AS"));
		airlines.add(new Airline("SouthWest Airlines", "SWA"));
	}

	public int getSize() {
		return this.airlines.size();
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}
}
