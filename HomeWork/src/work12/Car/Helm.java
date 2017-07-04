package work12.Car;

import work12.Properties.*;

public class Helm {
	private Covering covering;
	private HelmButtons helmButtons;
	private HelmDiameter helmDiameter;

	public Helm(HelmDiameter helmDiameter, Covering covering, HelmButtons helmButtons) {
		this.covering = covering;
		this.helmButtons = helmButtons;
		this.helmDiameter = helmDiameter;
	}

	public Covering getCovering() {
		return covering;
	}

	public void setCovering(Covering covering) {
		this.covering = covering;
	}

	public HelmButtons getHelmButtons() {
		return helmButtons;
	}

	public void setHelmButtons(HelmButtons helmButtons) {
		this.helmButtons = helmButtons;
	}

	public HelmDiameter getHelmDiameter() {
		return helmDiameter;
	}

	public void setHelmDiameter(HelmDiameter helmDiameter) {
		this.helmDiameter = helmDiameter;
	}

	@Override
	public String toString() {
		return "Helm diameter= " + helmDiameter + ", covering= " + covering + ", Helm Buttons= " + helmButtons;
	}

}
