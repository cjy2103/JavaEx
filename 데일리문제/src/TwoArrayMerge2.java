import java.util.Arrays;

public class TwoArrayMerge2 {
    public static void main(String[] args){
        //���� : ����� m �� �迭 X�� ����� n�� �迭 Y�� �־���
        // �� �迭�� ��� ���ĵ� ����
        // �迭 X���� ��Ȯ�� n���� ����ִ� ���� �ִٰ� �� ��,
        // �迭 Y�� ���ҵ��� X�迭�� ��ġ�� ���ҵ��� ���Ľ�Ű�ÿ�

        //��ǥ : �ð����⵵ �ּ�ȭ
        int [] X = {0,2,0,3,0,5,6,0,0};
        int [] Y = {1,8,9,10,15};
        int n = 0;  // �� ������ Y array �� ���� �ε���
        for(int i = 0; i<X.length;i++){
            if(X[i] == 0){  // �迭 X�� ����ִ� �� n�� ������ Y �迭�� ���̿� �����Ƿ� ����ִ¼��� Y[n]�� ����
                X[i] = Y[n];
                n++;
            }
        }

        Arrays.sort(X);

        System.out.println(Arrays.toString(X));





    }
}
