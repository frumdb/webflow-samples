package chapter4.states;

import java.io.Serializable;
import java.util.ArrayList;

import javax.annotation.PostConstruct;



public class StateView {

	public StateView() {}

	private String input;
	private ArrayList<State> _states;
	private ArrayList<State> statesList;

	@PostConstruct
	public void initStates() {

		statesList = new ArrayList <State>();
		
		_states = new ArrayList <State>();
		_states.add(new State("Alabama", "Montgomery"));
		_states.add(new State("Alaska", "Juneau"));
		_states.add(new State("Arizona", "Phoenix"));
		_states.add(new State("Arkansas", "Little Rock"));
		_states.add(new State("California", "Sacramento"));
		_states.add(new State("Colorado", "Denver"));
		_states.add(new State("Connecticut", "Hartford"));
		_states.add(new State("Delaware", "Dover"));
		_states.add(new State("Florida", "Tallahassee"));
		_states.add(new State("Georgia", "Atlanta"));
		_states.add(new State("Hawaii", "Honolulu"));
		_states.add(new State("Idaho", "Boise"));
		_states.add(new State("Illinois", "Springfield"));
		_states.add(new State("Indiana", "Indianapolis"));
		_states.add(new State("Iowa", "Des Moines"));
		_states.add(new State("Kansas", "Topeka"));
		_states.add(new State("Kentucky", "Frankfort"));
		_states.add(new State("Louisiana", "Baton Rouge"));
		_states.add(new State("Maine", "Augusta"));
		_states.add(new State("Maryland", "Annapolis"));
		_states.add(new State("Massachusetts", "Boston"));
		_states.add(new State("Michigan", "Lansing"));
		_states.add(new State("Minnesota", "St. Paul"));
		_states.add(new State("Mississippi", "Jackson"));
		_states.add(new State("Missouri", "Jefferson City"));
		_states.add(new State("Montana", "Helena"));
		_states.add(new State("Nebraska", "Lincoln"));
		_states.add(new State("Nevada", "Carson City"));
		_states.add(new State("New Hampshire", "Concord"));
		_states.add(new State("New Jersey", "Trenton"));
		_states.add(new State("New Mexico", "Santa Fe"));
		_states.add(new State("New York", "Albany"));
		_states.add(new State("North Carolina", "Raleigh"));
		_states.add(new State("North Dakota", "Bismarck"));
		_states.add(new State("Ohio", "Columbus"));
		_states.add(new State("Oklahoma", "Oklahoma City"));
		_states.add(new State("Oregon", "Salem"));
		_states.add(new State("Pennsylvania", "Harrisburg"));
		_states.add(new State("Rhode Island", "Providence"));
		_states.add(new State("South Carolina", "Columbia"));
		_states.add(new State("South Dakota", "Pierre"));
		_states.add(new State("Tennessee", "Nashville"));
		_states.add(new State("Texas", "Austin"));
		_states.add(new State("Utah", "Salt Lake City"));
		_states.add(new State("Vermont", "Montpelier"));
		_states.add(new State("Virginia", "Richmond"));
		_states.add(new State("Washington", "Olympia"));
		_states.add(new State("West Virginia", "Charleston"));
		_states.add(new State("Wisconsin", "Madison"));
		_states.add(new State("Wyoming", "Cheyenne"));

	}

	public String suggest() {
		
		for (State state : _states) {
			if (input != ""
					&& (state.getName().toLowerCase()).startsWith(input
							.toLowerCase())) {
				statesList.add(state);
			}
		}
		
		/*try {
			Thread.sleep (3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		return null;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public java.util.ArrayList<State> getStatesList() {
		return statesList;
	}

	public void setStatesList(java.util.ArrayList<State> statesList) {
		this.statesList = statesList;
	}
}
