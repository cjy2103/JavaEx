import java.util.Arrays;

public class ArraySortEx1 {
    public static void main(String[] args){
        // 문제 : 두 배열의 크기를 유지하면서 두 배열 전체를 정렬
        // 단 정렬시 다른 자료구조 사용 x 주어진 배열만을 사용
        int X [] = {1,4,7,8,10};
        int Y [] = {2,3,9};

        // 정렬 시작
        for(int i = 0 ; i < Y.length; i++){
            for(int j = 0; j <X.length; j++){
                // 정렬을 위한 임시 변수 생성
                int temp = 0;
                if(X[j] > Y[i]){    // X[j]가 Y[i]값 보다 클시 값 변경
                    temp = X[j];
                    X[j] = Y[i];
                    Y[i] = temp;
                }
            }
        }
        // 현시점 Output
        //     X = [1,2,3,4,7]
        //     Y = [10,8,9]
        Arrays.sort(Y); // nlogn 시간복잡도를 가지는 정렬함수 사용해 Y 배열 재정렬


        System.out.print("X = " + Arrays.toString(X)+"\n");
        System.out.print("Y = " + Arrays.toString(Y));

//        Output
//        X = [1,2,3,4,7]
//        Y = [8,9,10]

//        시간복잡도 : O(n)^2

    }
}
