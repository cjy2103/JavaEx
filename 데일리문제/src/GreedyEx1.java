
public class GreedyEx1 {
    public static void main(String[] args){
        //문제 체육복 빌려주기 체육복은 바로 앞번호, 뒷번호만 빌려줄수 있음 Ex 2번이 분실시 1번, 3번이 빌려주기 가능
        // 여벌 체육복은 두벌 한벌 도난당하면 빌려줄수 없음

        int n = 5;      // 총 학생수
        int lost [] = {2,4};    // 체육복 잃어버린 학생
        int reserve [] = {1,3,5};   // 여유분

        int answer = 0;
        int noReserve = 0;  // 여유분있는 학생중 도난당해 빌려줄수 없는 학생
        int borrow = 0;  // 체육복 빌린학생

        for(int i=0;i<lost.length;i++){ // 여벌 체육복 가진학생이 체육복을 도난당했는지 먼저 확인
            for(int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){      // 체육복을 잃어버린 학생이 여벌 체육복 가져온 학생일시 남은 체육복은 하나 이므로 빌려주기 x
                    noReserve ++;      // 빌려줄수 없는 학생 증가
                    lost[i] =-1;     // 학생은 1명이상 즉 1번부터 시작이므로 -1번으로 초기화 0번은 1번 학생때문에 바로 앞번호로 인식될수 있음.
                    reserve[j] =-1;
                    break;      // 초기화 완료후 두번째 for문을 break 하여 빠져나간다.
                }
            }
        }

        for(int i=0;i<lost.length;i++){     // 체육복을 잃어버린 학생이 빌리는 부분
            for(int j=0;j<reserve.length;j++){
                if(lost[i]==reserve[j]-1 || lost[i] == reserve[j] + 1){ // 바로 앞번호, 뒷번호만 빌려줄수 있다고 했으므로 if문 추가
                    borrow++;       // 빌린 학생 증가
                    reserve[j] = -1;    // -1로 초기화 시켜 빌려줄수 없도록 만듬
                    break;  // 초기화 완료후 두번째 for문을 break 하여 빠져나간다.
                }
            }
        }

        answer = n-lost.length + noReserve + borrow;    // 체육수업을 들을수 있는 학생 : 총인원 - 체육복 잃어버린 학생수 + 체육복 여벌이지만 도난당해 빌려줄수 없는 학생
                                                        //                            + 체육복 빌린학생;

        System.out.println(answer);
    }
}
