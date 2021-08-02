public class SortedDuplicates {

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
       
        int count = 0, n = nums.length;
			for (int i = 0; i < n; i++) { 
				if (i < n - 1 && nums[i] == nums[i+1]) continue;
				else {
					nums[count] = nums[i];
					count++;
				}
			}
            
        return count;
    }
    
}
