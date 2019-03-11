package hijava.basic;

import java.util.Comparator;

public class Sorting implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		return o1.getId() - o2.getId();
	}

}
