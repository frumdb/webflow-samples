package chapter6;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

public class ModalPanelStatusBean implements Serializable {

	public void calculate(ActionEvent event){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
}
