import java.util.HashSet;

public class TwoSum {

	// Given an array of integers nums and an integer target, return the two numbers such that they add up to target.

	// You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};

        int target = 9;
        
        int[] result = twoSumDs(nums, target);

        for(int j : result){
            System.out.println(j);
        }
     }


    public static int[] twoSumDs(int[] nums, int target) {
        
        HashSet<Integer> myHash = new HashSet<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            
            int x = target - nums[i];

            if(myHash.contains(x)) {
               result[0] = x;
               result[1] = nums[i];
               return result;
            }

            myHash.add(nums[i]);
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



