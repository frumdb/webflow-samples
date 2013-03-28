package chapter4.channels;

import java.io.Serializable;

public class ChannelBean implements Serializable {

	private String name;

	public ChannelBean (String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
