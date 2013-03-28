package chapter5;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.model.SelectItem;

public class Bean implements Serializable {
	private String drink;
	private List<String> drinksList;
	private int numberOfItems;
	private Date today;

	public Date getToday() {
		return today;
	}

	public void setToday(Date today) {
		this.today = today;
	}

	public int getNumberOfItems() {
		return numberOfItems;
	}

	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}

	public List<String> getDrinksList() {
		return drinksList;
	}

	public void setDrinksList(List<String> drinksList) {
		this.drinksList = drinksList;
	}

	public String getDrink() {
		return drink;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}

	private SelectItem[] states = new SelectItem[] { 
			new SelectItem("Alabama"),
			new SelectItem("Alaska"), new SelectItem("Arizona"),
			new SelectItem("Arkansas"), new SelectItem("California"),
			new SelectItem("Colorado"), new SelectItem("Connecticut"),
	// rest of states omitted for clarity
	};

	public SelectItem[] getStates() {
		return states;
	}

}
