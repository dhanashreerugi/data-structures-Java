import java.util.*;

public class Triplets {


    public static ArrayList<ArrayList<Integer>> triplets(ArrayList<Integer> arr, int sum){
        Collections.sort(arr);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> node = new ArrayList<>();
        int n = arr.size();
        for (int i = 0; i < n-3; i++) {

           int j = i+1;
           int k = n -1;

           while (j<k) {
               int currSum = arr.get(i);
               currSum += arr.get(j);
               currSum += arr.get(k);

               if( currSum == sum)
               {
                node.add(arr.get(i));
                node.add(arr.get(j));
                node.add(arr.get(k));
                result.add(node);
                j++;
                k--;
               }

               else if(currSum > sum){
                k--;
               } else {
                   j++;
               }
           }

        }

        return result;

    }

    public static void main(String[] args) {
        int sum = 18;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(15);

        ArrayList<ArrayList<Integer>> result = triplets((arr), sum);

        for(ArrayList<Integer> ar : result){
            for(Integer s : ar){
                System.out.println(s + ", \n");
            }
            System.out.println("\n");
        }
        
    }
    
}
