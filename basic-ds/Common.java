import java.util.ArrayList;
import java.util.Vector;

public class Common {

    public static Vector<Integer> arrayToVector(int[] arr) {

        Vector<Integer> result = new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public static ArrayList<Integer> arrayToArrayList(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    
}
