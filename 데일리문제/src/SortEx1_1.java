import java.util.Arrays;

public class SortEx1_1 {
    public static void main(String [] args){
        // ���� : �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� ����������, k��°�� �ִ� ���� ���϶�
        int [] array = {1,5,2,6,3,7,4}; // �Է°� array
        int commands [][] = {{2,5,3},{4,4,1},{1,7,3}};  //  i,j,k ���� ��� 2���� �迭
        int answer [] = new int[commands.length]; // ��ȯ�޴� ������� �� 3��

        for(int i=0; i<commands.length;i++){
            int [] temp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);   // �迭�� 0������ �����ϱ� ������ -1 temp �迭�� array i���� j������ ���� ����.
            Arrays.sort(temp);  //����
            answer[i] = temp[commands[i][2]-1]; // �迭�� 0������ �����ϹǷ� 0�� k��° -1 �Ѱ��� ����Ű�� ��
        }
        System.out.println(Arrays.toString(answer));
        
    }
}
