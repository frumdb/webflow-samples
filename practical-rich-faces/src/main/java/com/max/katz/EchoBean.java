package com.max.katz;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class EchoBean implements Serializable {

	private static final long serialVersionUID = 437689939580400173L;
	private String name;
	private Integer count;
	
	public EchoBean(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public void countListener(ActionEvent event){
		count = name.length();
	}
}
