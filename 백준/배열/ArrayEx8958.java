import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx8958 {
    public static void main(String[] args){
        //���� : "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�.
        // ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
        //"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
        //OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Ƚ��
        int [] result = new int[num];


        for(int i=0;i<num;i++){ // �迭�� ���ڿ� ���
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
