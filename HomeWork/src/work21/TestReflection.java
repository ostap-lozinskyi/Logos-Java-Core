package work21;

import java.io.Serializable;

public class TestReflection implements Serializable {
	public boolean isEmpty = false;
	private int i = 5;

	public TestReflection(boolean isEmpty, int i) {
		super();
		this.isEmpty = isEmpty;
		this.i = i;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "TestReflection [isEmpty=" + isEmpty + ", i=" + i + "]";
	}

}
