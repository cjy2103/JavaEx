public class Calc {
    public static int sum(int i, int j) {
        return i+j;
    }

    public static double sum(double i, double j) {
        return i+j;
    }


    public static int sum(int[] n) {
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum = sum + n[i];
        }
        return sum;
    }

    public static int sum(String[] s) {
        int sum=0;
        String number= "";
        for(int i=0;i<s.length;i++){
         number = number+s[i];
        }
        for(int i=0;i<number.length();i++){
            int num = number.charAt(i) - '0';
            sum = sum + num;
        }
        return sum;
    }
}
