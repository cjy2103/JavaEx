import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TwoNumberSum {
    public static void main (String [] args){
        //���α׷��ӽ� �μ��� �չ��� : �ϳ��� �迭���� �� ���� �̾� �������� ���ü� �ִ� ��� ����� ��
        // ex. number �迭�� {2,1,3,4,1} ���� ������ ������δ� {2,3,4,5,6,7} �� ��µǾ����
        // �Ѱܹ��� �迭 ����
        int [] number = {2,1,3,4,1};

        //�������� �迭�� �Ҵ����ֱ� ���� ArrayList�� ����
        ArrayList<Integer> answer = new ArrayList<Integer>();

        //legnth-1�� ���� ������ i���� 4�� �Ǹ鼭 Arrayindexoutofboundsexception �߻�
        for(int i =0;i<number.length-1;i++){
            for(int j =i+1;j<number.length;j++){
                int sum = number[i] + number[j];
                if(answer.indexOf(sum)==-1){
                    answer.add(sum);
                }
            }

        }
        //ArrayList�� ���Ľ�Ű�� ���� ��ɾ�
        Collections.sort(answer);

        //���α׷��ӽ����� return�� int �迭�� �ޱ� ������ Integer ArrayList�� int �迭�� ��ȯ�ϴ� �۾� ����
        int [] answer2 = new int[answer.size()];
        for(int i=0;i<answer2.length;i++){
            answer2[i] = answer.get(i).intValue();
        }
        System.out.println(Arrays.toString(answer2));
    }
}
