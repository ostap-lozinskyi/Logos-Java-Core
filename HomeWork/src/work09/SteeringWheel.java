package work09;

public class SteeringWheel {
	private String covering;

	public SteeringWheel(String covering) {
		this.covering = covering;
	}

	public String getCovering() {
		return covering;
	}

	public void setCovering(String covering) {
		this.covering = covering;
	}

	@Override
	public String toString() {
		return "SteeringWheel covering= " + covering;
	}

}
