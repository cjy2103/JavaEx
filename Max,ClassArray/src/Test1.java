
public class Test1 {
    public static void main(String[] args) {
        int n[] = {1,5,8,9,9};
        int max = n[0];
        int max2 =n[0];
        int tmp = 0;
        for(int i=0;i<n.length-1;i++){
            if(max<n[i]){
                max = n[i];
            }
            if(max2<n[i]&&max2<max){
                tmp = max2;
                max2 =n[i];
            }
        }
        if(max == max2){
            max2 =tmp;
        }
        System.out.println("Ãâ·Â: "+max2);
    }
}
