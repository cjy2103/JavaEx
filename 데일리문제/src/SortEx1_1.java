import java.util.Arrays;

public class SortEx1_1 {
    public static void main(String [] args){
        // 문제 : 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을때, k번째에 있는 수를 구하라
        int [] array = {1,5,2,6,3,7,4}; // 입력값 array
        int commands [][] = {{2,5,3},{4,4,1},{1,7,3}};  //  i,j,k 값이 담긴 2차원 배열
        int answer [] = new int[commands.length]; // 반환받는 결과값은 총 3개

        for(int i=0; i<commands.length;i++){
            int [] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);   // 배열은 0번부터 시작하기 때문에 -1 temp 배열에 array i부터 j까지의 값이 담긴다.
            Arrays.sort(temp);  //정렬
            answer[i] = temp[commands[i][2]-1]; // 배열은 0번부터 시작하므로 0번 k번째 -1 한값이 가르키는 값
        }
        System.out.println(Arrays.toString(answer));
        
    }
}
