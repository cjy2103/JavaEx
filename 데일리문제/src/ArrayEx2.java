import java.util.Arrays;

public class ArrayEx2 {
    public static void main(String[] args){
        //문제 : 정수 배열이 주어졌을 때, 배열 안에서 곱이 최대가 되는 두 정수를 찾으시오
        int [] Input = {-10,-3,5,6,-2};
//         int [] Input = {0,0,0,0,0,0};
//        int [] Input = {-5,1,2,3,4};
//        int [] Input = {-5,4,2,3,0};
        Arrays.sort(Input);     // 솔루션 : 정렬을 하면 가장 작은수가 앞으로 큰수가 뒤로가게됨 맨앞 두개와 맨뒤 두자리를 곱해서 비교하면 끝


        if(Input[0]*Input[1] > Input[Input.length-1]*Input[Input.length-2]){
            System.out.println("Output : ["+Input[0]+","+Input[1]+"]");
        }else if(Input[0]*Input[1] < Input[Input.length-1]*Input[Input.length-2]){
            System.out.println("Output : ["+Input[Input.length-1]+","+Input[Input.length-2]+"]");
        }else if(Input[0]*Input[1] ==0 && Input[Input.length-1]*Input[Input.length-2] == 0){
            System.out.println("Output : ["+Input[0]+","+Input[1]+"]");
        }else{
            System.out.print("Output : ["+Input[0]+","+Input[1]+"]");
            System.out.print(" 또는 ");
            System.out.println("["+Input[Input.length-1]+","+Input[Input.length-2]+"]");
        }

        //시간복잡도 : nlogn
    }
}
