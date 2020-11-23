import java.util.Arrays;

public class TwoArrayMerge2 {
    public static void main(String[] args){
        //문제 : 사이즈가 m 인 배열 X와 사이즈가 n인 배열 Y가 주어짐
        // 두 배열은 모두 정렬된 상태
        // 배열 X에는 정확히 n개의 비어있는 셀이 있다고 할 때,
        // 배열 Y의 원소들을 X배열로 합치며 원소들을 정렬시키시오

        //목표 : 시간복잡도 최소화
        int [] X = {0,2,0,3,0,5,6,0,0};
        int [] Y = {1,8,9,10,15};
        int n = 0;  // 값 대입할 Y array 의 시작 인덱스
        for(int i = 0; i<X.length;i++){
            if(X[i] == 0){  // 배열 X의 비어있는 셀 n의 개수가 Y 배열의 길이와 같으므로 비어있는셀에 Y[n]값 대입
                X[i] = Y[n];
                n++;
            }
        }

        Arrays.sort(X);

        System.out.println(Arrays.toString(X));





    }
}
