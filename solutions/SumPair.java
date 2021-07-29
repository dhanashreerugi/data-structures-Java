import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class SumPair {

    public static HashMap<Integer, Integer> sumPair(List<Integer> arr, int sum) {

        // Logic or magic code starts here
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            
            int x = sum - arr.get(i);
            if(!hm.containsKey(x)){
                hm.put(x, arr.get(i));
            }
        }
        return hm;
    }


    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(-1);
        arr.add(6);
        arr.add(8);
        arr.add(3);
        arr.add(0);
        arr.add(1);
        int sum = 8;

        HashMap<Integer, Integer> result = sumPair(arr, sum);
        System.out.println(result);
        
    }
}