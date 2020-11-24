import java.util.Arrays;

public class GreedyEx1_1 {
    public static void main(String[] args){
        //문제 체육복 빌려주기 체육복은 바로 앞번호, 뒷번호만 빌려줄수 있음 Ex 2번이 분실시 1번, 3번이 빌려주기 가능
        // 여벌 체육복은 두벌 한벌 도난당하면 빌려줄수 없음

        // O(n) 방식
        int n = 3;      // 총 학생수
        int lost [] = {3};    // 체육복 잃어버린 학생
        int reserve [] = {1};   // 여유분
        int array [] = new int[n+2]; // 배열생성 총학생 +2 만큼 (번호 맨앞과 맨뒤)
        int answer = 0;


        for(int i=0;i<lost.length;i++){ //체육복을 잃어버린 학생
            array[lost[i]] -=1;   // 초기화된 array 배열에 -1을 함 {0,0,0,-1,0} 주의 : 배열에 값넣을때 번호의 값의 위치에 넣어야함 예시의 array[lost[i]] 는 3번째 학생이 잃어버렸으니 인덱스 3번에 -1을 하겠다는 뜻...
        }

        for(int i=0;i<reserve.length;i++){  //여유분 체육복 가지고 있는 학생
            array[reserve[i]] +=1;      // {0,1,0,-1,0}
        }
        System.out.println(Arrays.toString(array));
        for(int i=1;i<array.length-1;i++){
            if(array[i] > 0 && array[i-1] < 0) {    // 만약 기준의 앞 학생이 체육복을 잃어버린 경우
                array[i] -= 1;
                array[i-1] += 1;
            }else if(array[i] > 0 && array[i+1] < 0){   // 기준의 뒷 학생이 체육복을 잃어버린 경우
                array[i] -= 1;                          // {1,0,-1,0,0}
                array[i+1] +=1;
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] >= 0) {
                answer += 1;
            }
        }
            //answer = 7
        System.out.println(answer-2);   // array[0]번째와 array[n+1] 때문  (0번째 학생과 마지막 학생 +1번째)
        System.out.println(Arrays.toString(array));

    }
}
