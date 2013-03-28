package com.max.katz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ActionEvent;

public class UserBean implements Serializable {

	private static final long serialVersionUID = 437689939580400173L;
	private String age;
	private String color;
	private String name;
	private String text = "data from server";
	private List<String> stuff;
	
	
	public String getText(){
		return text;
	}
	
	public List<String> getStuff(){
		stuff =  new ArrayList<String>();
		stuff.add("arg 1");
		stuff.add("arg 2");
		stuff.add("arg 3");
		return stuff;
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer numOfSelections = 0;

	public void countAction(){
		this.numOfSelections++;
//		return "abc";
	}

	public void count(ActionEvent event) {
		this.numOfSelections++;
	}

	public Integer getNumOfSelections() {
		return numOfSelections;
	}

	public void setNumOfSelections(Integer numOfSelections) {
		this.numOfSelections = numOfSelections;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public UserBean() {
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String save() {
//		age += color;
//		return "abc";
		return null;
	}

	public void voidSave(ActionEvent event) {
		age += "saved ";
	}

}
