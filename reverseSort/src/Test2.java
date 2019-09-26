import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int n[] = {5,7,9,1,3,5,8,2,4,9};
        Arrays.sort(n);
        for(int i=0;i<(n.length-1)/2;i++){
            int tmp =0;
            tmp = n[i];
            n[i] = n[n.length-1-i];
            n[n.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(n));
    }
}
