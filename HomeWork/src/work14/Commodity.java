package work14;

public class Commodity implements Comparable<Commodity> {
	private final String name;
	private final double weight;
	private final double volume;

	public Commodity(String name, double weight, double volume) {
		super();
		this.name = name;
		this.weight = weight;
		this.volume = volume;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", weight=" + weight + ", volume=" + volume + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(volume);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Commodity other = (Commodity) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(volume) != Double.doubleToLongBits(other.volume))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

	@Override
	public int compareTo(Commodity o) {
		return name.compareTo(o.name);
	}
}
