package chapter4.channels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class ChannelViewBean implements Serializable {

	private List <ChannelBean> channels;

	private ChannelBean selectedChannel;
	
	
	
	public ChannelViewBean(){
		create();
	}
	
//	@PostConstruct
	public void create (){
		channels = new ArrayList <ChannelBean> ();
		channels.add (new ChannelBean("History ChannelBean"));
		channels.add (new ChannelBean("CNN"));
		channels.add (new ChannelBean("ESPN"));
		channels.add (new ChannelBean("Discovery ChannelBean"));
		channels.add (new ChannelBean("Food Network"));
	}
	
	public ChannelBean getSelectedChannel() {
		return selectedChannel;
	}

	public void setSelectedChannel(ChannelBean selectedChannel) {
		this.selectedChannel = selectedChannel;
	}

	public List<ChannelBean> getChannels() {
		return channels;
	}
	
}
