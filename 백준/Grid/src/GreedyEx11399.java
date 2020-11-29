import java.util.Arrays;
import java.util.Scanner;

public class GreedyEx11399 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();      // 5���� ����� �ִٰ� ����
        int time [] = new int[people];
        int totalTime [] = new int[people];
        int sum = 0;
        int preTime = 0;
        for(int i=0;i<time.length;i++) {
            int Input = sc.nextInt();       // ���� 3, 1, 4, 3, 2 ���� �ɸ��ٰ� ����
            time[i] = Input;
        }
        // ���� �̴� �ð��� ���� �ּ� -> �����̴»���� �Ǿ�����... ���� ��Ű�� �ȴ�.

        Arrays.sort(time);      // 1 2 3 3 4    1 -> sum =1 pre =1 2 -> sum : 1 + 2 + 1 = 4 pre =4 3 -> 4+3+

        for(int i=0;i<time.length;i++){
            sum += time[i];
            totalTime[i] = sum;  // 1, 3 , 6 ,9 ,13 �� ���
        }
        sum =0;     // �ʱ�ȭ
        for(int i=0;i<totalTime.length;i++){
            sum += totalTime[i];
        }
        System.out.println(sum);       // 32 ���

        // �� �ð����⵵ : O(nlogn)
    }
}
