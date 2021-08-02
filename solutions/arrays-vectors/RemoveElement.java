

public class RemoveElement {

// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_]
// Explanation: Your function should return k = 2, with the first two elements of nums being 2.
// It does not matter what you leave beyond the returned k (hence they are underscores).

    public static int removeElement(int[] nums, int val) {

        int newIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val) continue;
            else {
                nums[newIndex] = nums[i];
                newIndex++;
            }
        }

        return newIndex;

        
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3,4,4};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    
}
