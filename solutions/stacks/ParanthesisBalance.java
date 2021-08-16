import java.lang.Character;
import java.util.*;


public class ParanthesisBalance {

    public static void main(String[] args) {
       
        String str = new String("{(a+b)*d}");

        System.out.println(isBalanced(str));
        // System.out.println(printStr(str));
        // printStr(str);
    }

    public static void printStr(String str)
    {
            for(char c : str.toCharArray())
            {
                System.out.println(c);
            }
    }

    public static boolean isBalanced(String str)
    {
        Stack<Character> c = new Stack<Character>();

        for(char ch : str.toCharArray())
        {
             switch (ch) {
                 case '(':
                     c.push(ch);
                     break;
                case '[':
                    c.push(ch);
                    break;
                case '{':
                    c.push(ch);
                    break;

                case ')':
                    if(!c.isEmpty() && c.peek() == '(')
                    {
                        c.pop();
                    } else 
                    {
                        return false;
                    }
                    break;

                case ']':
                    if(!c.isEmpty() && c.peek() == '[')
                    {
                        c.pop();
                    } else 
                    {
                        return false;
                    }
                    break;

                case '}':
                    if(!c.isEmpty() && c.peek() == '{')
                    {
                        c.pop();
                    } else 
                    {
                        return false;
                    }
                    break;
             
                 default:
                     continue;
             }
        }
        // System.out.println("here" + c.capacity());
        if(c.isEmpty())
        {
            return true;
        }
        return false;
    }
    
}
