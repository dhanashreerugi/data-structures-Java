import java.util.Scanner;

/**
 * ScratchPad
 */
public class ScratchPad {

    public static void stringDemo() {

        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the string");

        // String s = scanner.nextLine();
        // System.out.println("The entered string is " + s);
        // scanner.close();

        StringBuilder str = new StringBuilder("The best place to learn JAVA is coderlogs, wher you implement JAVA.");
        int first = str.indexOf("JAVA");
        // System.out.println("first "+first);
        // System.out.println("second "+str.indexOf("JAVA",first+1));
    }

    public static void main(String[] args) {
        stringDemo();
       
    }
}