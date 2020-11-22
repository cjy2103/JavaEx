import java.util.Scanner;

public class GridEx11047 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int i, m = 0, n = sc.nextInt() , k = sc.nextInt();  // n : 돈의 가치 (수 : 10종류 )  k : 보유중인 돈 4200
        int a[] = new int[n];   // 돈의 가치를 담을 배열을 선언 ( 배열의 크기는 돈의 가치 수 )
        for (i = 0; i < n; i++){
            a[i] = sc.nextInt(); // 돈의 가치 // 50000,10000,5000,1000,500,100,50,10,5,1
        }
        for(i=n-1;i>=0;i--){ // 9 8 7 6 5 4 3 2 1 0 ( 50000,10000,5000,1000,500,100,50,10,5,1)
            m+=k/a[i];  // 4200/50000 .......  4200/1000 -> m=4 .... 200/100 -> m+=2 = 6
            k%=a[i];    // 4200%50000 ....... 4200%1000 -> k=200 ..... 200%100 -> k = 0
        }
        System.out.println(m);  // m = 6
        sc.close();
    }
}
