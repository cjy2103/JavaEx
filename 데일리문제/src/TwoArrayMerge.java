import java.util.Arrays;

public class TwoArrayMerge {
    public static void main(String[] args){
        //���� : ����� m �� �迭 X�� ����� n�� �迭 Y�� �־���
        // �� �迭�� ��� ���ĵ� ����
        // �迭 X���� ��Ȯ�� n���� ����ִ� ���� �ִٰ� �� ��,
        // �迭 Y�� ���ҵ��� X�迭�� ��ġ�� ���ҵ��� ���Ľ�Ű�ÿ�

        //��ǥ : �ð����⵵ �ּ�ȭ
        int [] X = {0,2,0,3,0,5,6,0,0};
        int [] Y = {1,8,9,10,15};
        int n = 0;    // ����ִ� ���� ����
        Arrays.sort(X); // ������ nlogn �ð� {0,0,0,0,0,2,3,5,6}
        for(int i=0;i<X.length;i++){
            if(X[i]==0){
                n++;
            }
        }
        // n = 5
        for(int i=0;i<n;i++){   // 0������ n�������� ����ִ� ���� ���ĵǾ������Ƿ� �� ����
            X[i] = Y[i];    // X = {1,8,9,10,15,2,3,5,6}
        }

        Arrays.sort(X); //nlon �ð� ������  // {1,2,3,5,6,8,9,10,15}

        System.out.println(Arrays.toString(X));
    }
}
