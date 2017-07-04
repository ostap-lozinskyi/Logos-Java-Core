package work10;

import work10.enumPack.Covering;

public class SteeringWheel {
	private Covering covering;

	public SteeringWheel(Covering covering) {
		this.covering = covering;
	}

	public Covering getCovering() {
		return covering;
	}

	public void setCovering(Covering covering) {
		this.covering = covering;
	}

	@Override
	public String toString() {
		return "SteeringWheel covering= " + covering;
	}

}
