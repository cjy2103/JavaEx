import java.util.Arrays;

public class GreedyEx1_1 {
    public static void main(String[] args){
        //���� ü���� �����ֱ� ü������ �ٷ� �չ�ȣ, �޹�ȣ�� �����ټ� ���� Ex 2���� �нǽ� 1��, 3���� �����ֱ� ����
        // ���� ü������ �ι� �ѹ� �������ϸ� �����ټ� ����

        // O(n) ���
        int n = 3;      // �� �л���
        int lost [] = {3};    // ü���� �Ҿ���� �л�
        int reserve [] = {1};   // ������
        int array [] = new int[n+2]; // �迭���� ���л� +2 ��ŭ (��ȣ �Ǿհ� �ǵ�)
        int answer = 0;


        for(int i=0;i<lost.length;i++){ //ü������ �Ҿ���� �л�
            array[lost[i]] -=1;   // �ʱ�ȭ�� array �迭�� -1�� �� {0,0,0,-1,0} ���� : �迭�� �������� ��ȣ�� ���� ��ġ�� �־���� ������ array[lost[i]] �� 3��° �л��� �Ҿ�������� �ε��� 3���� -1�� �ϰڴٴ� ��...
        }

        for(int i=0;i<reserve.length;i++){  //������ ü���� ������ �ִ� �л�
            array[reserve[i]] +=1;      // {0,1,0,-1,0}
        }
        System.out.println(Arrays.toString(array));
        for(int i=1;i<array.length-1;i++){
            if(array[i] > 0 && array[i-1] < 0) {    // ���� ������ �� �л��� ü������ �Ҿ���� ���
                array[i] -= 1;
                array[i-1] += 1;
            }else if(array[i] > 0 && array[i+1] < 0){   // ������ �� �л��� ü������ �Ҿ���� ���
                array[i] -= 1;                          // {1,0,-1,0,0}
                array[i+1] +=1;
            }
        }

        for(int i=0;i<array.length;i++){
            if(array[i] >= 0) {
                answer += 1;
            }
        }
            //answer = 7
        System.out.println(answer-2);   // array[0]��°�� array[n+1] ����  (0��° �л��� ������ �л� +1��°)
        System.out.println(Arrays.toString(array));

    }
}
