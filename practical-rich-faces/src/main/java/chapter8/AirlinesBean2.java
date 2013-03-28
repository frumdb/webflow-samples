package chapter8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

public class AirlinesBean2 implements Serializable {
	private Map<String, Airline2> airlinesMap;
	private List<Airline2> airlines;
	private List<Airline2> target;
	private AirlineConverter converter;

	public List<Airline2> getTarget() {
		return target;
	}

	public void setTarget(List<Airline2> target) {
		this.target = target;
	}

	public List<Airline2> getAirlines() {
		return airlines;
	}

	@PostConstruct
	public void init() {
		airlines = new ArrayList<Airline2>();
		airlines.add(new Airline2(1000, "American Airlines", "AA"));
		airlines.add(new Airline2(1010,"United Airlines", "UA"));
		airlines.add(new Airline2(1002,"Delta", "DL"));
		airlines.add(new Airline2(1001, "Northwest Airlines", "NW"));
		airlines.add(new Airline2(1005,"US Airways", "US"));
		airlines.add(new Airline2(1020,"Continental", "CO"));
		airlines.add(new Airline2(2020,"JetBlue", "B9"));
		airlines.add(new Airline2(400,"Alaska Airlines", "AS"));
		airlines.add(new Airline2(30,"SouthWest Airlines", "SWA"));
		
		
		airlinesMap = new HashMap<String, Airline2>();
		for(Airline2 airline:airlines){
			airlinesMap.put(airline.getId().toString(), airline);
		}
		
		converter = new AirlineConverter();
	}

	public int getSize() {
		return this.airlines.size();
	}

	public void setAirlines(List<Airline2> airlines) {
		this.airlines = airlines;
	}
	
	
	public class AirlineConverter implements Converter, Serializable {

		@Override
		public Object getAsObject(FacesContext context, UIComponent component,
				String value) {
			
			return airlinesMap.get(value);
		}

		@Override
		public String getAsString(FacesContext context, UIComponent component,
				Object value) {
			return ((Airline2)value).getId().toString();
		}
		
	}
	
	public AirlineConverter getConverter() {
		return converter;
	}
}
