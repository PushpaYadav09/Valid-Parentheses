import java.util.Scanner;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else if(c==')' && (stack.isEmpty()||stack.pop()!='(')){
                return false;
            }
            else if(c=='}' && (stack.isEmpty()||stack.pop()!='{')){
                return false;
            }
            else if(c==']' && (stack.isEmpty()||stack.pop()!='[')){
                return false;
            }

        }
        return stack.isEmpty();
    }
}
public class Main{
public static void main(String[] args) {
    Solution solution=new Solution();
    Scanner sc= new Scanner(System.in);
    String test = sc.next();
    if (solution.isValid(test)) {
        System.out.println("The string has valid parentheses.");
    } else {
        System.out.println("The string does not have valid parentheses.");

    }
   }
}
