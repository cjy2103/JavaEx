import java.util.Scanner;

public class Ex11654 {
    public static void main(String[] args){
        // ���� : ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

        Scanner sc = new Scanner(System.in);

        char alpha = sc.next().charAt(0);   // ���� �Է¹ޱ�
        int ascii = (int)alpha; // �Է¹��� ���ڸ� �ƽ�Ű �ڵ尪���� ����

        System.out.println(ascii);
    }
}
