import java.util.Scanner;

public class Ex2908 {
    public static void main(String[] args){
        // ����: ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�.
        // �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���.
        // ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
        //����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
        // ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
        //�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();    // ù��° ��
        int secondNum = sc.nextInt();   // �ι�° ��

        firstNum  = Integer.parseInt(new StringBuilder().append(firstNum).reverse().toString());    // ù��° ���� �������� �ٲ�
        secondNum = Integer.parseInt(new StringBuilder().append(secondNum).reverse().toString());   // �ι�° ���� �������� �ٲ�

        System.out.println(firstNum > secondNum ? firstNum : secondNum);    // ���׿����� �������� �ٲ۰��� firstNum�� SecondNum���� ũ��?
                                                                            // firstNum�� �����̸� secondNum�� return


    }
}
