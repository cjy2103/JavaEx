import java.util.Arrays;

public class TwoArrayMerge {
    public static void main(String[] args){
        //문제 : 사이즈가 m 인 배열 X와 사이즈가 n인 배열 Y가 주어짐
        // 두 배열은 모두 정렬된 상태
        // 배열 X에는 정확히 n개의 비어있는 셀이 있다고 할 때,
        // 배열 Y의 원소들을 X배열로 합치며 원소들을 정렬시키시오

        //목표 : 시간복잡도 최소화
        int [] X = {0,2,0,3,0,5,6,0,0};
        int [] Y = {1,8,9,10,15};
        int n = 0;    // 비어있는 셀의 개수
        Arrays.sort(X); // 재정렬 nlogn 시간 {0,0,0,0,0,2,3,5,6}
        for(int i=0;i<X.length;i++){
            if(X[i]==0){
                n++;
            }
        }
        // n = 5
        for(int i=0;i<n;i++){   // 0번부터 n번까지의 비어있는 셀이 정렬되어있으므로 값 삽입
            X[i] = Y[i];    // X = {1,8,9,10,15,2,3,5,6}
        }

        Arrays.sort(X); //nlon 시간 재정렬  // {1,2,3,5,6,8,9,10,15}

        System.out.println(Arrays.toString(X));
    }
}
