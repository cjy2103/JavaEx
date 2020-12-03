import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10]; // 42로 나눈 나머지를 저장할 배열
        int compareNumber = -1;  // 나머지와 비교할 값 42로 나눈 나머지는 0부터 시작하므로 -1로 초기화
        int count = 0;  // 다른값이 있을때 마다 1씩증가


        for(int i=0;i<array.length;i++){
            int num = sc.nextInt();
            array[i] = num%42;
        }

        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        for(int i=0;i<array.length;i++){
            if(compareNumber != array[i]){   // temp와 array[i] 값이 다르면 temp에 array[i] 값을 넣어주고 count 증가
                compareNumber = array[i];
                count++;
            }
        }

        System.out.println(count);

        // 시간복잡도 : O(nlogn)
    }

}
