import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GridEx1931 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] time = new int[N][2];   // 시작시간, 종료시간

        for(int i = 0; i<N;i++){
            time[i][0] = sc.nextInt(); // 시작시간
            time[i][1] = sc.nextInt(); // 종료시간
        }

        Arrays.sort(time, new Comparator<int[]>() { // 끝나는 시간을 기준으로 정렬 하기위해 compare Override
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1]){ // 종료시간이 같을경우 시작시간이 빠른순으로 정렬
                    return o1[0] - o2[1];
                }
                return o1[1] - o2[1];   // 그 외는 종료시간이 빠른시간대로 정렬
            }
        });

        int count = 0;
        int preEndTime = 0;

        for(int i=0;i<N;i++){

            if(preEndTime <= time[i][0]){   // 직전 종료시간이 다음 회의 시작 시간보다 작거나 같다면 갱신
                preEndTime = time[i][1];
                count++;
            }
            // 입력이 1 4 / 3 5 / 0 6 / 5 7 / 3 8 / 5 9 / 6 10 / 8 11 / 8 12 / 2 13 / 12 14
            // preEndTime = 0 -> 4 로 갱신 4 <= 5 -> 7로 갱신 7 <= 8 7 -> 11로 갱신 11 <= 12 11 -> 14로 갱신
            // 갱신된 횟수 : 4 -> 이용 가능한 회의의 개수
        }
        System.out.println(count);
    }
}
