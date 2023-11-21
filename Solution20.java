//1887. Reduction Operations to Make the Array Elements Equal

import java.util.Arrays;

public class Solution20 {
    public int reductionOperations(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int ops =0;

        for(int i=n-1;i>=1;i--)
        {
            if(nums[i] == nums[i-1])
            {
                continue;
            }
            else{
                ops += (n-i);
        }
    }
    return ops;
}
public static void main(String[] args) {
    Solution20 s = new Solution20();
    int a[] = {1,1,2,2,3};
    System.out.println(s.reductionOperations(a));
}
}