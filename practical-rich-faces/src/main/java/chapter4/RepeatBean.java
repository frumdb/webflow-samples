package chapter4;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

public class RepeatBean {

	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public RepeatBean() {
	}

	private List<MagicNumber> numbers;
	private Set<Integer> rowsToUpdate;
	private Integer updatedRow;

	public void increase(ActionEvent event) {
		rowsToUpdate.clear();
		// increase selected number
		numbers.get(updatedRow).increase();
		// insert row to be updated
		rowsToUpdate.add(updatedRow);
	}

	public void decrease(ActionEvent event) {
		rowsToUpdate.clear();
		// decrease selected number
		numbers.get(updatedRow).decrease();
		// insert row to be updated
		rowsToUpdate.add(updatedRow);
	}

	// init method
	@PostConstruct
	public void init() {
		
		list = new ArrayList<String>();
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		
		
		// list of numbers
		numbers = new ArrayList<MagicNumber>();
		// Set to hold rows to be updated
		rowsToUpdate = new HashSet<Integer>();
		numbers.add(new MagicNumber());
		numbers.add(new MagicNumber());
		numbers.add(new MagicNumber());
		numbers.add(new MagicNumber());
		numbers.add(new MagicNumber());
	}

	public List<MagicNumber> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<MagicNumber> numbers) {
		this.numbers = numbers;
	}

	public Set<Integer> getRowsToUpdate() {
		return rowsToUpdate;
	}

	public Integer getUpdatedRow() {
		return updatedRow;
	}

	public void setUpdatedRow(Integer updatedRow) {
		this.updatedRow = updatedRow;
	}

}
