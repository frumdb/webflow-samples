package chapter6;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import org.richfaces.component.html.HtmlTabPanel;

public class CityTabBean implements Serializable {
	private String city = "sf";
	private String selectedTab = "sf";
	private String nycInput;
	private String sfInput;
//	private HtmlTabPanel tabPanel;

	public void changeCity(ActionEvent event) {
//		selectedTab = city;
//		tabPanel.setSelectedTab(city);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSelectedTab() {
		return selectedTab;
	}

	public void setSelectedTab(String selectedTab) {
		this.selectedTab = selectedTab;
	}

	public String getNycInput() {
		return nycInput;
	}

	public void setNycInput(String nycInput) {
		this.nycInput = nycInput;
	}

	public String getSfInput() {
		return sfInput;
	}

	public void setSfInput(String sfInput) {
		this.sfInput = sfInput;
	}

//	public HtmlTabPanel getTabPanel() {
//		return tabPanel;
//	}
//
//	public void setTabPanel(HtmlTabPanel tabPanel) {
//		this.tabPanel = tabPanel;
//	}
}
