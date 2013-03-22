package chapter6;

import java.io.Serializable;
import java.util.Date;

public class ToolTipBean implements Serializable {
	
	String message = "New York City is the most populous city in the United States,"+
	"\nwith its metropolitan area ranking among the"+
	"\nlargest urban areas in the world."+
	"\nFor more than a century, it has been one of the world's major centers of"+
	"\ncommerce and finance.";
	
	public String getMessage(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return message;
	}
	
	public Date getNow(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Date();
	}
	
}
