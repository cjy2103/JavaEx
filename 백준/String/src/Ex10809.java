import java.util.Scanner;

public class Ex10809 {
    public static void main(String[] args){
        // 문제 알파벳 소문자로만 이루어진 단어 S가 주어진다.
        // 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를,
        // 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int [] array = new int[26]; // 알파벳 a~z

        for(int i=0;i<array.length;i++){
            array[i] = -1;      // 초기 값 = -1로 초기화
        }

        String word = sc.nextLine();

        for(int i=0;i<word.length();i++){
            char alpha = word.charAt(i);
            if(array[alpha-'a'] == -1){ // 처음등장하는 위치 찾기이기 때문에 처음 위치 값이 -1일때만 초기화
                array[alpha-'a'] = i;
            }
        }

        for(int value : array){ //향상된 for문 배열일때 사용
            System.out.print(value + " ");
        }
    }
}
