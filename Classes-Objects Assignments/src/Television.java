//Class to implement Television Properties
class Television {
	boolean state; // initially TV is turned off
	int volume;
	int channel;

//to increase volume by one unit
	public int changeVolumeIncrease(int volume) {
		this.volume += volume;
		return this.volume;
	}

//to decrease volume by one unit
	public int changeVolumeDecrease(int volume) {
		this.volume -= volume;
		return this.volume;
	}

//changing the channel by 1 or jump to a channel no
	public int changeChannel(int channel) {
		if (channel == 1) {
			this.channel += channel;
		} else {
			this.channel = channel;
		}
		return this.channel;

	}

	// state=true->TV is on & false->TV is off
	public boolean tvState(boolean state) {
		this.state = state;
		return this.state;

	}

	public boolean getState() {
		return state;
	}

	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}

}