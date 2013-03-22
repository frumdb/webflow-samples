package chapter4.channels;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class ChannelView {

	private List <Channel> channels;

	private Channel selectedChannel;
	
	@PostConstruct
	public void create (){
		channels = new ArrayList <Channel> ();
		channels.add (new Channel("History Channel"));
		channels.add (new Channel("CNN"));
		channels.add (new Channel("ESPN"));
		channels.add (new Channel("Discovery Channel"));
		channels.add (new Channel("Food Network"));
	}
	
	public Channel getSelectedChannel() {
		return selectedChannel;
	}

	public void setSelectedChannel(Channel selectedChannel) {
		this.selectedChannel = selectedChannel;
	}

	public List<Channel> getChannels() {
		return channels;
	}
	
}
