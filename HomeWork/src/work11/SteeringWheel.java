package work11;

import work11.enumPack.Covering;
import work11.enumPack.SteeringWheelButtons;

public class SteeringWheel {
	private Covering covering;
	private SteeringWheelButtons steeringWheelButtons;

	public SteeringWheel(Covering covering, SteeringWheelButtons steeringWheelButtons) {
		this.covering = covering;
		this.steeringWheelButtons = steeringWheelButtons;
	}

	public Covering getCovering() {
		return covering;
	}

	public void setCovering(Covering covering) {
		this.covering = covering;
	}

	public SteeringWheelButtons getSteeringWheelButtons() {
		return steeringWheelButtons;
	}

	public void setSteeringWheelButtons(SteeringWheelButtons steeringWheelButtons) {
		this.steeringWheelButtons = steeringWheelButtons;
	}

	@Override
	public String toString() {
		return "SteeringWheel covering= " + covering + ", SteeringWheelButtons= " + steeringWheelButtons;
	}

}
