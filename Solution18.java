import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution18 {
    public int minPairSum(int[] nums) {    
        
        Arrays.sort(nums);
        int i=0;
        
        int sum=0;
        int res =0;
        int n= nums.length-1;
        int j =n;
        while(i<j)
        {
            sum = nums[i]+nums[j];
            res = Math.max(res, sum);
            i++;
            j--;
        }
        return res;
    } 

    public static void main(String[] args) {
        Solution18 s =new Solution18();
      System.out.println(s.minPairSum(new int[]{3,5,4,2,4,6}));
    }
}
