import com.sun.security.auth.NTSidUserPrincipal;

import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;

public class ArrayEx1 {
    public static void main(String [] args){
        //  ���� �迭 �Ѱ��� 0 �� 1�� �ٲپ����� ���ӵ� 1�� ���� ���� ���������� �ϴ� 0�� �ε����� ã�ƶ�
        // �������´�� �ڵ�
        int [] Input = {0,0,1,0,1,1,1,0,1,1};
        int [] copyInput = new int[Input.length];
        int [] savemax = new int[Input.length];
        int count = 0;  // ���ӵ� 1�� ������ ���� ����
        int max = 0;    // count�� 0���� �ʱ�ȭ �Ǳ��� ���帹�� 1�� ���ڸ� ����
        int position =0; // ���� ���� 1�� ���ڸ� ������ ��ġ

        for(int i=0;i<copyInput.length;i++){
            copyInput[i] = Input[i];
        }



        for(int i=0;i<Input.length;i++){
            copyInput[i] = 1;   // 0��°���� 1�� �����ؼ� ���� 1�� ���������� ���� ��Ÿ���°� ã��
            for(int j=0;j<Input.length;j++){

                if(copyInput[j]!=0) {    // 0�� ������ ������ count�� ++
                    count++;
                }else if(copyInput[j]==0 && max<count) {    // 0�� �������� max���� count���� �۴ٸ� max�� �������ϰ� count �ʱ�ȭ
                    max = count;
                    count = 0;
                }else{  // ������ ��� count �ʱ�ȭ
                    count = 0;
                }
            }

            if(max<count){  // ���� ���ǹ��� ��ġ���� �ʾ� max�� ���� ���� �ʾ������ ���� ����� max ���� count���� ������ max���� ����
                max = count;
            }
            savemax[i] = max;
            max =0;
            copyInput[i] = Input[i];
            count=0;

        }

        System.out.println(Arrays.toString(savemax));
        // max �� ����
        for(int i=0;i<savemax.length;i++){
            if(max < savemax[i]){
                max = savemax[i];
            }
        }

        System.out.println(max);
        // max ���� ���ʷ� ��Ÿ���� ��ġ ã��
        for(int i=0;i<savemax.length;i++){
            if(max==savemax[i]){
                position=i;
            }
        }

        System.out.println("���� ū 1�� ���� ������ ��ġ : " +position + "��°");

        // ���� �ð����⵵ : O(n��2) + �ʹ� �������´�� �ۼ��ؼ� ����ȭ���� ���� �ڵ��ΰͰ���... ����ȭ�� �ʿ���
    }
}
