import com.sun.security.auth.NTSidUserPrincipal;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String [] args){
        //  문제 배열 한개의 0 을 1로 바꾸었을때 연속된 1의 수가 가장 많아지도록 하는 0의 인덱스를 찾아라
        // 생각나는대로 코딩
        int [] Input = {0,0,1,0,1,1,1,0,1,1};
        int [] copyInput = new int[Input.length];
        int [] savemax = new int[Input.length];
        int count = 0;  // 연속된 1의 개수를 세는 숫자
        int max = 0;    // count가 0으로 초기화 되기전 가장많은 1의 숫자를 저장
        int position =0; // 가장 많은 1의 숫자를 가지는 위치

        for(int i=0;i<copyInput.length;i++){
            copyInput[i] = Input[i];
        }



        for(int i=0;i<Input.length;i++){
            copyInput[i] = 1;   // 0번째부터 1씩 대입해서 가장 1이 연속적으로 많이 나타나는곳 찾기
            for(int j=0;j<Input.length;j++){

                if(copyInput[j]!=0) {    // 0을 만나기 전까지 count를 ++
                    count++;
                }else if(copyInput[j]==0 && max<count) {    // 0을 만났을때 max값이 count보다 작다면 max에 값대입하고 count 초기화
                    max = count;
                    count = 0;
                }else{  // 나머지 경우 count 초기화
                    count = 0;
                }
            }

            if(max<count){  // 위의 조건문에 일치하지 않아 max에 값이 들어가지 않았을경우 최종 저장된 max 값이 count보다 작으면 max값에 대입
                max = count;
            }
            savemax[i] = max;
            max =0;
            copyInput[i] = Input[i];
            count=0;

        }

        System.out.println(Arrays.toString(savemax));
        // max 값 저장
        for(int i=0;i<savemax.length;i++){
            if(max < savemax[i]){
                max = savemax[i];
            }
        }

        System.out.println(max);
        // max 값이 최초로 나타나는 위치 찾기
        for(int i=0;i<savemax.length;i++){
            if(max==savemax[i]){
                position=i;
            }
        }

        System.out.println("가장 큰 1의 수를 가지는 위치 : " +position + "번째");

        // 최종 시간복잡도 : O(n＾2) + 너무 생각나는대로 작성해서 최적화되지 않은 코드인것같음... 최적화가 필요함
    }
}
