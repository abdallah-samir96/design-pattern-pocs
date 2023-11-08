import java.util.Stack;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        Predicate<String> isBalanced = App::isBalanced;
        var pattern = "((((())()()())))";
        var result = isBalanced.test(pattern);
        System.out.printf("Pattern %s is %b.", pattern, result);
    }

    public static boolean isBalanced(String str){
        var stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '('){
                stack.push('(');
                continue;
            }
            if(str.charAt(i) == ')' && stack.isEmpty())
                return false;
            if(str.charAt(i) == ')' && !stack.isEmpty())
                stack.pop();
        }
        return stack.isEmpty();
    }
}