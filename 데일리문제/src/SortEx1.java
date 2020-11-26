import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEx1 {
    public static void main(String[] args){
        // 문제 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때, k번째에 있는 수를 구하라
        int array [] = {1,5,2,6,3,7,4};             // 입력값 array
        int commands [][] = {{2,5,3},{4,4,1},{1,7,3}};   //  i,j,k 값이 담긴 2차원 배열

        ArrayList<Integer> arrayList = new ArrayList<>();   // i부터 j까지 자른 배열을 담을 ArrayList
        ArrayList<Integer> arrayList2 = new ArrayList<>();  // 자른 arrayList에서 k번째 위치를 넣을 arrayList

        for(int i =0;i<commands.length;i++){
            int start = commands[i][0]-1;    // 배열은 0번째부터 시작하기 때문
            int end = commands[i][1];    // <= 로 하려면 -1 해야함 <로 할것이기 때문에 -1 안함
            int k = commands[i][2]-1;    // 배열은 0부터 시작하므로..

            for(int j=start;j<end;j++){
                arrayList.add(array[j]);    //arrayList에 결과값을 담아준다
            }

            Collections.sort(arrayList);    //정렬
            System.out.println(Arrays.toString(new ArrayList[]{arrayList}));
            arrayList2.add(arrayList.get(k));   //k번째 위치값을 arrayList2에 담아준다
            arrayList.clear();      // arrayList 초기화후 반복

        }

        System.out.println(Arrays.toString(new ArrayList[]{arrayList2}));

        int[] answer = new int[arrayList2.size()];  // return 타입이 int 배열이기 때문에 arrayList -> 배열로 변환하는 작업

        for(int i=0;i<answer.length;i++){
            answer[i] = arrayList2.get(i).intValue();
        }

        System.out.println(Arrays.toString(answer));

        // 위 코드는 시간복잡도가 O(n＾2) 최적화된 코드 X
        // 개선할 필요가 있음
    }
}
