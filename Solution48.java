// 1913. Maximum Product Difference Between Two Pairs   18/12/2023(Monday)

import java.util.Arrays;

class Solution48 {
    public int maxProductDifference(int[] nums) {
        int n =nums.length;


        Arrays.sort(nums);

        return ((nums[n-1]*nums[n-2])-(nums[0]*nums[1]));

    }
}   