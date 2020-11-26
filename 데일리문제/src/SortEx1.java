import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEx1 {
    public static void main(String[] args){
        // ���� : �迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� ����������, k��°�� �ִ� ���� ���϶�
        int array [] = {1,5,2,6,3,7,4};             // �Է°� array
        int commands [][] = {{2,5,3},{4,4,1},{1,7,3}};   //  i,j,k ���� ��� 2���� �迭

        ArrayList<Integer> arrayList = new ArrayList<>();   // i���� j���� �ڸ� �迭�� ���� ArrayList
        ArrayList<Integer> arrayList2 = new ArrayList<>();  // �ڸ� arrayList���� k��° ��ġ�� ���� arrayList

        for(int i =0;i<commands.length;i++){
            int start = commands[i][0]-1;    // �迭�� 0��°���� �����ϱ� ����
            int end = commands[i][1];    // <= �� �Ϸ��� -1 �ؾ��� <�� �Ұ��̱� ������ -1 ����
            int k = commands[i][2]-1;    // �迭�� 0���� �����ϹǷ�..

            for(int j=start;j<end;j++){
                arrayList.add(array[j]);    //arrayList�� ������� ����ش�
            }

            Collections.sort(arrayList);    //����
            System.out.println(Arrays.toString(new ArrayList[]{arrayList}));
            arrayList2.add(arrayList.get(k));   //k��° ��ġ���� arrayList2�� ����ش�
            arrayList.clear();      // arrayList �ʱ�ȭ�� �ݺ�

        }

        System.out.println(Arrays.toString(new ArrayList[]{arrayList2}));

        int[] answer = new int[arrayList2.size()];  // return Ÿ���� int �迭�̱� ������ arrayList -> �迭�� ��ȯ�ϴ� �۾�

        for(int i=0;i<answer.length;i++){
            answer[i] = arrayList2.get(i).intValue();
        }

        System.out.println(Arrays.toString(answer));

        // �� �ڵ�� �ð����⵵�� O(n��2) ����ȭ�� �ڵ� X
        // ������ �ʿ䰡 ����
    }
}
