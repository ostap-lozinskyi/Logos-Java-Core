package work15;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
	private Map<Person, List<Pet>> map;

	public ZooClub() {
		this.map = new HashMap<>();
	}

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}
}
