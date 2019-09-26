
public class Test {

	public static void main(String[] args) {
		String s1 = "99999999999999999";
		String s2 = "888888888888888";
		System.out.println(add(s1, s2));
	}

	private static String add(String s1, String s2) {
		String result = "", zeros = "";
		for (int i = 0; i < Math.abs(s1.length() - s2.length()); i++) {
			zeros = zeros + '0';
		}
		if (s1.length() < s2.length()) {
			s1 = zeros + s1;
		} else {
			s2 = zeros + s2;
		}
		int carry = 0;
		for (int i = s1.length() - 1; i >= 0; i--) {
			int v = s1.charAt(i) - '0' + s2.charAt(i) - '0' + carry;
			carry = v / 10;
			result = v % 10 + result;
		}
		if (carry > 0) {
			result = carry + result;
		}
		return result;
	}
}
