import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args){
        //���� : ���� �迭�� �־����� ��, �迭 �ȿ��� ���� �ִ밡 �Ǵ� �� ������ ã���ÿ�
        int [] Input = {-10,-3,5,6,-2};
//         int [] Input = {0,0,0,0,0,0};
//        int [] Input = {-5,1,2,3,4};
//        int [] Input = {-5,4,2,3,0};
        Arrays.sort(Input);     // �ַ�� : ������ �ϸ� ���� �������� ������ ū���� �ڷΰ��Ե� �Ǿ� �ΰ��� �ǵ� ���ڸ��� ���ؼ� ���ϸ� ��


        if(Input[0]*Input[1] > Input[Input.length-1]*Input[Input.length-2]){
            System.out.println("Output : ["+Input[0]+","+Input[1]+"]");
        }else if(Input[0]*Input[1] < Input[Input.length-1]*Input[Input.length-2]){
            System.out.println("Output : ["+Input[Input.length-1]+","+Input[Input.length-2]+"]");
        }else if(Input[0]*Input[1] ==0 && Input[Input.length-1]*Input[Input.length-2] == 0){
            System.out.println("Output : ["+Input[0]+","+Input[1]+"]");
        }else{
            System.out.print("Output : ["+Input[0]+","+Input[1]+"]");
            System.out.print(" �Ǵ� ");
            System.out.println("["+Input[Input.length-1]+","+Input[Input.length-2]+"]");
        }

        //�ð����⵵ : nlogn
    }
}
