import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx8958 {
    public static void main(String[] args){
        //문제 : "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
        // 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
        //"OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
        //OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 횟수
        int [] result = new int[num];


        for(int i=0;i<num;i++){ // 배열에 문자열 담기
            String strArg = sc.next();
            int count =0;
            for(int j=0 ; j<strArg.length();j++){
                if(strArg.charAt(j) == 'O'){
                    count++;
                    result[i] += count;
                }else {
                    count = 0;
                }
            }
        }

        System.out.println(Arrays.toString(result));

        for(int i=0;i<num;i++){
            System.out.println(result[i]);
        }

    }
}
