import java.util.Scanner;

public class Ex10809 {
    public static void main(String[] args){
        // ���� ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����.
        // ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��,
        // ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

        Scanner sc = new Scanner(System.in);
        int [] array = new int[26]; // ���ĺ� a~z

        for(int i=0;i<array.length;i++){
            array[i] = -1;      // �ʱ� �� = -1�� �ʱ�ȭ
        }

        String word = sc.nextLine();

        for(int i=0;i<word.length();i++){
            char alpha = word.charAt(i);
            if(array[alpha-'a'] == -1){ // ó�������ϴ� ��ġ ã���̱� ������ ó�� ��ġ ���� -1�϶��� �ʱ�ȭ
                array[alpha-'a'] = i;
            }
        }

        for(int value : array){ //���� for�� �迭�϶� ���
            System.out.print(value + " ");
        }
    }
}
