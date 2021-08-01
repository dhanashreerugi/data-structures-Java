import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/// write an algorithm to return the pairs in an array whos sum quals k 
public class SumPair {

    public static Map < Integer, Integer > sumPair(List < Integer > arr, int sum) {

        // Logic or magic code starts here

        HashMap < Integer, Integer > hm = new HashMap < > ();
        Map < Integer, Integer > result = new HashMap < > ();

        for (int i = 0; i < arr.size(); i++) {

            Integer x = sum - arr.get(i);
            if (hm.containsKey(x)) {
                result.put(x, arr.get(i));
            }
            hm.put(x, arr.get(i));
        }
        return result;
    }


    public static void main(String[] args) {

        List < Integer > arr = new ArrayList < > ();
        arr.add(2);
        arr.add(-1);
        arr.add(6);
        arr.add(8);
        arr.add(3);
        arr.add(0);
        arr.add(1);
        int sum = 4;

        Map < Integer, Integer > result = sumPair(arr, sum);
        System.out.println(result);

    }
}