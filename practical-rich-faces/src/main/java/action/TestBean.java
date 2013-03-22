package action;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import org.springframework.webflow.samples.booking.Hotel;

public class TestBean implements Serializable {
	
	String state;
	List<String> states = new ArrayList<String>(Arrays.asList("FL","GA","NY","CA"));
	List<SelectItem> stateOptions;
	List<Hotel> hotels = new ArrayList<Hotel>();
	
	public TestBean() {
		stateOptions = new ArrayList<SelectItem>();
		for(int i=0;i<states.size();i++){
			stateOptions.add(new SelectItem(states.get(i),states.get(i)));
		}
	}
	
	public List<SelectItem> getHotelOptions(){
		List<SelectItem> hotelOptions = new ArrayList<SelectItem>();
		for(Hotel hotel: hotels) {
			hotelOptions.add(new SelectItem(hotel.getName(),hotel.getName()));
		}
		return hotelOptions;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<SelectItem> getStateOptions() {
		return stateOptions;
	}
	public void populateHotels(ActionEvent event){
		
	}

	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	
	
}
