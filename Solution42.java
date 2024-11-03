//1464. Maximum Product of Two Elements in an Array

import java.util.Arrays;

public class Solution42 {
    
     public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return  (nums[n-1]-1)*(nums[n-2]-1);
    }
}