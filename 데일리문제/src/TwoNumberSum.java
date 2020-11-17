import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoNumberSum {
    public static void main (String [] args){
        //프로그래머스 두수의 합문제 : 하나의 배열에서 두 수를 뽑아 더했을때 나올수 있는 모든 경우의 수
        // ex. number 배열에 {2,1,3,4,1} 값이 있을시 출력으로는 {2,3,4,5,6,7} 이 출력되어야함
        // 넘겨받을 배열 선언
        int [] number = {2,1,3,4,1};

        //동적으로 배열을 할당해주기 위해 ArrayList로 선언
        ArrayList<Integer> answer = new ArrayList<Integer>();

        //legnth-1을 하지 않으면 i값이 4가 되면서 Arrayindexoutofboundsexception 발생
        for(int i =0;i<number.length-1;i++){
            for(int j =i+1;j<number.length;j++){
                int sum = number[i] + number[j];
                if(answer.indexOf(sum)==-1){
                    answer.add(sum);
                }
            }

        }
        //ArrayList를 정렬시키기 위한 명령어
        Collections.sort(answer);

        //프로그래머스에는 return을 int 배열로 받기 떄문에 Integer ArrayList를 int 배열로 변환하는 작업 시작
        int [] answer2 = new int[answer.size()];
        for(int i=0;i<answer2.length;i++){
            answer2[i] = answer.get(i).intValue();
        }
        System.out.println(Arrays.toString(answer2));
    }
}
