package work13.Car;

import work13.Properties.*;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((covering == null) ? 0 : covering.hashCode());
		result = prime * result + ((helmButtons == null) ? 0 : helmButtons.hashCode());
		result = prime * result + ((helmDiameter == null) ? 0 : helmDiameter.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Helm other = (Helm) obj;
		if (covering != other.covering)
			return false;
		if (helmButtons != other.helmButtons)
			return false;
		if (helmDiameter != other.helmDiameter)
			return false;
		return true;
	}
}
