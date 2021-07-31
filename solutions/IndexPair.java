import java.util.HashMap;

public class IndexPair {

// 	Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]
	
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



