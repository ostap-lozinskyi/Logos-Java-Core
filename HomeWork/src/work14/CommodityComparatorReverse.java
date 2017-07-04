package work14;

import java.util.Comparator;

public class CommodityComparatorReverse implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
