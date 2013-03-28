		package common;

import java.io.Serializable;

public class State implements Serializable {

	//hello
	
		private String name;
		private String capital;
		private String flagImage;
		
		
		public String getFlagImage() {
			return flagImage;
		}

		public void setFlagImage(String flagImage) {
			this.flagImage = flagImage;
		}

		public State (String name, String capital){
			this.name = name;
			this.capital = capital;
			this.flagImage = "/images/states/flag_"+(name.toLowerCase()).replace(" ", "")+".gif";
		}
		
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
}
