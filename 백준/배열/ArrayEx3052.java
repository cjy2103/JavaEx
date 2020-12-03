import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx3052 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10]; // 42�� ���� �������� ������ �迭
        int compareNumber = -1;  // �������� ���� �� 42�� ���� �������� 0���� �����ϹǷ� -1�� �ʱ�ȭ
        int count = 0;  // �ٸ����� ������ ���� 1������


        for(int i=0;i<array.length;i++){
            int num = sc.nextInt();
            array[i] = num%42;
        }

        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));

        for(int i=0;i<array.length;i++){
            if(compareNumber != array[i]){   // temp�� array[i] ���� �ٸ��� temp�� array[i] ���� �־��ְ� count ����
                compareNumber = array[i];
                count++;
            }
        }

        System.out.println(count);

        // �ð����⵵ : O(nlogn)
    }

}
