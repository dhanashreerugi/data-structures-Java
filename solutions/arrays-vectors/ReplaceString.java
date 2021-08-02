import java.util.Scanner;

public class ReplaceString {
    
    public static String replaceString(String str) {

        String result = str.replaceAll(" ", "%20");
        return result;
        
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = new String(scn.nextLine());
        scn.close();

        System.out.println(replaceString(str));

        
    }
}
