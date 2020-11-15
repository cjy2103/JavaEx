import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        boolean flag = true;    // 스택에 괄호가 한번이라도 들어갔는지 확인하기 위한 변수
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < count; i++) {
            String ch = sc.next();
            for (int j = 0; j < ch.length(); j++) {
                char token = ch.charAt(j);
                if (token=='(') {
                    stack.push(token);
                }
                else {
                    if(!stack.isEmpty()){
                        stack.pop();
                    }else{
                        flag = false;   // '(' 가 먼저 들어오지 않고 ')' 가 들어왔을시 pop되지 않고 그대로 flag를 false로 함으로 NO가 출력되게 유도
                    }
                }
            }
            if(flag == true && stack.isEmpty()){    // 
                System.out.println("Yes");
            }
            else{
                System.out.println("No");   // flag가 false로 변경이 되었기 때문에 YES가 아닌 NO가 출력되게 유도
            }
            flag = true;    // 한번의 출력이 끝났으므로 flag를 다시 true로 초기화
            stack.clear();  // 출력이 끝났으므로 스택을 다시 비움 비우지 않을시 기존의 괄호가 남아 오류가 생김
        }
        sc.close(); // Scanner sc 를 더이상 사용하지 않으니 close 시킴 
    }
}
