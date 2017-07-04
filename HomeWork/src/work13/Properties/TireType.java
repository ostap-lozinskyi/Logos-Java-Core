package work13.Properties;

public enum TireType {
	W {
		public String toString() {
			return "WINTER";
		}
	},
	S {
		public String toString() {
			return "SUMMER";
		}
	},
	A {
		public String toString() {
			return "ALLSEASON";
		}
	};
}
