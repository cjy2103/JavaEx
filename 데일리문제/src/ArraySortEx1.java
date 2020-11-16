import java.util.Arrays;

public class ArraySortEx1 {
    public static void main(String[] args){
        // ���� : �� �迭�� ũ�⸦ �����ϸ鼭 �� �迭 ��ü�� ����
        // �� ���Ľ� �ٸ� �ڷᱸ�� ��� x �־��� �迭���� ���
        int X [] = {1,4,7,8,10};
        int Y [] = {2,3,9};

        // ���� ����
        for(int i = 0 ; i < Y.length; i++){
            for(int j = 0; j <X.length; j++){
                // ������ ���� �ӽ� ���� ����
                int temp = 0;
                if(X[j] > Y[i]){    // X[j]�� Y[i]�� ���� Ŭ�� �� ����
                    temp = X[j];
                    X[j] = Y[i];
                    Y[i] = temp;
                }
            }
        }
        // ������ Output
        //     X = [1,2,3,4,7]
        //     Y = [10,8,9]
        Arrays.sort(Y); // nlogn �ð����⵵�� ������ �����Լ� ����� Y �迭 ������


        System.out.print("X = " + Arrays.toString(X)+"\n");
        System.out.print("Y = " + Arrays.toString(Y));

//        Output
//        X = [1,2,3,4,7]
//        Y = [8,9,10]

//        �ð����⵵ : O(n)^2

    }
}
