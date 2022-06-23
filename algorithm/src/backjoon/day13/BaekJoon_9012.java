import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BaekJoon_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i ++){
            String s = br.readLine();

            for (int j = 0; j < s.length(); j ++){
                stack.push(s.charAt(j));

                for (int k = 0; k < stack.size(); k ++){
                    if (stack.get(0) == ')' && stack.size() == 0){
                        System.out.println("NO");
                        break;
                    }else if (stack.get(0) != ')' && stack.get(k) == ')'){
                        stack.pop();
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}
