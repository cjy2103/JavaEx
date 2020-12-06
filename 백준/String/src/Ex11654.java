import java.util.Scanner;

public class Ex11654 {
    public static void main(String[] args){
        // 문제 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        char alpha = sc.next().charAt(0);   // 문자 입력받기
        int ascii = (int)alpha; // 입력받은 문자를 아스키 코드값으로 변경

        System.out.println(ascii);
    }
}
