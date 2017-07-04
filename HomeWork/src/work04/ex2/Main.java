package work04.ex2;

/* Написати власний метод int compateTo(String str1, String str2),  який  буде працювати точно так само, як і 
 * сompareTo в класі String.  Врахувати  те, що стрічки можуть бути різної довжини. Зробити код  максимально  
 * оптимальним (вчасно припиняти роботу циклів і т.д.). 
 */

public class Main {

	static int compareTo(String str1, String str2) {
		int count = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					count = str1.charAt(i) - str2.charAt(i);
					break;
				}
			}
		} else {
			int length = 0;
			if (str1.length() < str2.length()) {
				length = str1.length();
			} else {
				length = str2.length();
			}
			for (int i = 0; i < length; i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					count = str1.charAt(i) - str2.charAt(i);
					break;
				} else {
					count = str1.length() - str2.length();
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str1 = "aaaa";
		String str2 = "1aaaabb";
		System.out.println("my compare " + compareTo(str1, str2));
		System.out.println("Control   " + str1.compareTo(str2));
	}

}
