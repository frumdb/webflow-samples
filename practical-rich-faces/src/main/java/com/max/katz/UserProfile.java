package com.max.katz;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class UserProfile implements Serializable {

	private int id1;
	private int id2;
	private int id3;
	private int result;
	
	
	
	public int getId1() {
		return id1;
	}



	public void setId1(int id1) {
		this.id1 = id1;
	}



	public int getId2() {
		return id2;
	}



	public void setId2(int id2) {
		this.id2 = id2;
	}



	public int getId3() {
		return id3;
	}



	public void setId3(int id3) {
		this.id3 = id3;
	}



	public int getResult() {
		return result;
	}



	public void setResult(int result) {
		this.result = result;
	}



	public String action(){
		result = id1 + id2 + id3;
		return null;
	}

	public void actionListener(ActionEvent event){
		action();
	}
	
}
