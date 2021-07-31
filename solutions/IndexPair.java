import java.util.HashMap;
import java.util.HashSet;

public class IndexPair {

	// Given an array of integers nums and an integer target, return the two numbers such that they add up to target.

	// You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
    public static void main(String[] args) {

        int[] nums = {2,11,7,15};

        int target = 9;
        
        int[] result = twoSumDs(nums, target);

        for(int j : result){
            System.out.println(j);
        }
     }


    public static int[] twoSumDs(int[] nums, int target) {
        
        HashMap<Integer, Integer> myHash = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            
            int x = target - nums[i];
            
            if(myHash.containsKey(x)) {
               result[0] = myHash.get(x);
               result[1] = i;
               return result;
            }

            myHash.put(nums[i], i);
        }
        System.out.println(myHash);
        return result;
     }

     // if array is sorted without using the ds we can do like
    public static int[] twoSum(int[] nums, int target) {
       
       int[] result = new int[2];

       int i = 0;
       int j = nums.length - 1;
       while(i < j) {
           if(nums[i] + nums[j] == target){
               result[0] = i;
               result[1] = j;
               return result;
           }

           if(nums[i] + nums[j] > target){
               j--;
           } 

           if(nums[i] + nums[j] < target){
               i++;
           } 
       }

       
       return result;
    }




}



