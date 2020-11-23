import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GridEx1931 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] time = new int[N][2];   // ���۽ð�, ����ð�

        for(int i = 0; i<N;i++){
            time[i][0] = sc.nextInt(); // ���۽ð�
            time[i][1] = sc.nextInt(); // ����ð�
        }

        Arrays.sort(time, new Comparator<int[]>() { // ������ �ð��� �������� ���� �ϱ����� compare Override
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){ // ����ð��� ������� ���۽ð��� ���������� ����
                    return o1[0] - o2[1];
                }
                return o1[1] - o2[1];   // �� �ܴ� ����ð��� �����ð���� ����
            }
        });

        int count = 0;
        int preEndTime = 0;

        for(int i=0;i<N;i++){

            if(preEndTime <= time[i][0]){   // ���� ����ð��� ���� ȸ�� ���� �ð����� �۰ų� ���ٸ� ����
                preEndTime = time[i][1];
                count++;
            }
            // �Է��� 1 4 / 3 5 / 0 6 / 5 7 / 3 8 / 5 9 / 6 10 / 8 11 / 8 12 / 2 13 / 12 14
            // preEndTime = 0 -> 4 �� ���� 4 <= 5 -> 7�� ���� 7 <= 8 7 -> 11�� ���� 11 <= 12 11 -> 14�� ����
            // ���ŵ� Ƚ�� : 4 -> �̿� ������ ȸ���� ����
        }
        System.out.println(count);
    }
}
