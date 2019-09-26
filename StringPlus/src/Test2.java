
public class Test2 {

	public static void main(String[] args) {
		String s1="99999999999999999";
		String s2="08888888888888888";
		System.out.println(add(s1,s2));
	}

	private static String add(String s1, String s2) {
		String result ="";
		int carry=0;
		for(int i = s1.length()-1;i>=0;i--) {
			int v = s1.charAt(i)-'0' + s2.charAt(i)-'0'+carry;
			carry=v/10;
			result=v%10+result;
		}
		if(carry>0) {
			result=carry+result;
		}
		return result;
	}
}