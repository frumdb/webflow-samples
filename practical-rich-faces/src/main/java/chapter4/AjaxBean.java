package chapter4;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.ajax4jsf.event.AjaxEvent;
import org.ajax4jsf.event.AjaxListener;

public class AjaxBean implements Serializable {
	private Set<String> areas = new HashSet<String>();
	private int areaNumber;



	public Date getTime1() {
		return (new Date());
	}

	public Date getTime2() {
		return (new Date());
	}

	public Set<String> getAreas() {
		return areas;
	}

	public void setAreas(Set<String> areas) {
		this.areas = areas;
	}

	public AjaxListener getRenderAreasListener() {
		return new AjaxListener() {
			public void processAjax(AjaxEvent event) {
//				Random r = new Random();
//				// update IDs of components to be rerendered
//				if (r.nextBoolean())
//					areas.add("id1");
//				else
//					areas.add("id2");
				areas.clear();
				areas.add("id"+areaNumber);
			}
		};
	}
	
	public void setAreaNumber(int areaNumber){
		this.areaNumber = areaNumber;
	}
	public int getAreaNumber() {
		return areaNumber;
	}
}
