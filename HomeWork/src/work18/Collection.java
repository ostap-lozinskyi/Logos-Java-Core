package work18;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	private static Object[] objects;

	public Collection(Object[] objects) {
		Collection.objects = objects;
	}

	Iterator checkThird(Object[] objects) {
		return new Iterator() {
			private int nextIndex = objects.length - 1;

			@Override
			public boolean hasNext() {
				return (nextIndex >= 0);
			}

			@Override
			public List<Object> next() {
				List<Object> newObjects = new ArrayList<>();
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 != 0) {
						newObjects.add(objects[nextIndex]);
					}
					nextIndex -= 3;
				}
				return newObjects;
			}
		};
	}

	List<Object> checkFifth(Object[] objects) {
		class Check implements Iterator {
			private int nextIndex = 0;

			@Override
			public boolean hasNext() {
				return (nextIndex <= objects.length);
			}

			@Override
			public List<Object> next() {
				List<Object> newObjects = new ArrayList<>();
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 == 0) {
						newObjects.add((int) objects[nextIndex] - 100);
					}
					nextIndex += 5;
				}
				return newObjects;
			}
		}
		Check check = new Check();
		return check.next();
	}

	public class FirstEnd implements Iterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex < objects.length);
		}

		@Override
		public Object[] next() {
			Object[] newObjects = new Object[objects.length];
			while (hasNext()) {
				if ((int) objects[nextIndex] % 2 != 0) {
					newObjects[nextIndex] = 0;
				} else {
					newObjects[nextIndex] = objects[nextIndex];
				}
				nextIndex++;
			}
			return newObjects;
		}
	}

	public class EndFirst implements Iterator {
		private int nextIndex = objects.length - 1;
		int newObjectsIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex >= 0);
		}

		@Override
		public Object[] next() {
			Object[] newObjects = new Object[objects.length / 2];
			while (hasNext()) {
				newObjects[newObjectsIndex] = objects[nextIndex];
				newObjectsIndex++;
				nextIndex -= 2;
			}
			return newObjects;
		}
	}

	public static class CheckSecond implements Iterator {
		private int nextIndex = 0;
		int newObjectsIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex < objects.length);
		}

		@Override
		public Object[] next() {
			Object[] newObjects = new Object[objects.length / 2];
			while (hasNext()) {
				if ((int) objects[nextIndex] % 2 == 0) {
					newObjects[newObjectsIndex] = (int) objects[nextIndex] + 1;
				}
				newObjectsIndex++;
				nextIndex += 2;
			}
			return newObjects;
		}
	}

	public void print(Object[] objects) {
		for (Object object : objects) {
			System.out.print(object + " ");
		}
		System.out.println();
	}

}
