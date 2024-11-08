//300. Longest Increasing Subsequence       05/01/2024(Friday);

import java.util.Arrays;

public class Solution65 {

        public int lengthOfLIS(int[] nums) {
            
            if(nums ==null || nums.length==0)
            {
                return 0;
            }
            int n = nums.length;
            int[] dp = new int[n];
            Arrays.fill(dp,1);
    
            for(int i=1;i<n;i++)
            {
                for(int j=0;j<i;j++)
                {
                    if(nums[i] > nums[j])
                    {
                        dp[i] =Math.max(dp[i],dp[j]+1);
                    }
                }
            }
            int maxLength = Arrays.stream(dp).max().orElse(0);
            return maxLength;
        }
    
}
