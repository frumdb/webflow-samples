package com.max.katz;

import java.io.Serializable;

public class DateBean implements Serializable {

	private static final long serialVersionUID = 6410773392634933445L;

	public DateBean() {
	}

	public java.util.Date getNow1() {
		return new java.util.Date();
	}

	public java.util.Date getNow2() {
		return new java.util.Date();
	}
}
