import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        boolean flag = true;
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
                        flag = false;
                    }
                }
            }
            if(flag == true && stack.isEmpty()){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            flag = true;
            stack.clear();
        }
        sc.close();
    }
}
