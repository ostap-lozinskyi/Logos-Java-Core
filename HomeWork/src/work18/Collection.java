package work18;

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
			public Object next() {
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 != 0) {
						System.out.print(objects[nextIndex] + " ");
					}
					nextIndex -= 3;
				}
				return objects;
			}
		};
	}

	void checkFifth(Object[] objects) {
		class Check implements Iterator {
			private int nextIndex = 0;

			@Override
			public boolean hasNext() {
				return (nextIndex <= objects.length);
			}

			@Override
			public Object next() {
				while (hasNext()) {
					if ((int) objects[nextIndex] % 2 == 0) {
						System.out.print(((int) objects[nextIndex] - 100) + " ");
					}
					nextIndex += 5;
				}
				return objects;
			}
		}
		Check check = new Check();
		check.next();
	}

	public class FirstEnd implements Iterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex < objects.length);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				if ((int) objects[nextIndex] % 2 != 0) {
					System.out.print(0 + " ");
				} else {
					System.out.print(objects[nextIndex] + " ");
				}
				nextIndex++;
			}
			return objects;
		}
	}

	public class EndFirst implements Iterator {
		private int nextIndex = objects.length - 1;

		@Override
		public boolean hasNext() {
			return (nextIndex >= 0);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				System.out.print(objects[nextIndex] + " ");
				nextIndex -= 2;
			}
			return objects;
		}
	}

	public static class CheckSecond implements Iterator {
		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex < objects.length);
		}

		@Override
		public Object next() {
			while (hasNext()) {
				if ((int) objects[nextIndex] % 2 == 0) {
					System.out.print(((int) objects[nextIndex] + 1) + " ");
				}
				nextIndex += 2;
			}
			return objects;
		}
	}

}
