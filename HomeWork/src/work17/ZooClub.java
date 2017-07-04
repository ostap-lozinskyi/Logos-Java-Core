package work17;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub implements Serializable {
	private static final long serialVersionUID = 1L;

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
