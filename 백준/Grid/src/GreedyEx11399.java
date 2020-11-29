import java.util.Arrays;
import java.util.Scanner;

public class GreedyEx11399 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();      // 5명의 사람이 있다고 가정
        int time [] = new int[people];
        int totalTime [] = new int[people];
        int sum = 0;
        int preTime = 0;
        for(int i=0;i<time.length;i++) {
            int Input = sc.nextInt();       // 각각 3, 1, 4, 3, 2 분이 걸린다고 가정
            time[i] = Input;
        }
        // 돈을 뽑는 시간이 가장 최소 -> 빨리뽑는사람이 맨앞으로... 정렬 시키면 된다.

        Arrays.sort(time);      // 1 2 3 3 4   

        for(int i=0;i<time.length;i++){
            sum += time[i];
            totalTime[i] = sum;  // 1, 3 , 6 ,9 ,13 이 담김
        }
        sum =0;     // 초기화
        for(int i=0;i<totalTime.length;i++){
            sum += totalTime[i];
        }
        System.out.println(sum);       // 32 출력

        // 총 시간복잡도 : O(nlogn)
    }
}
