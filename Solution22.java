import java.util.HashMap;

class Solution22 {
      final  int M = 1000000007;

     int rev(int num)
     {
        int rev =0;
       while(num>0)
       {
        int rem=num%10;
        rev = rev * 10 + rem;
        num/=10;
    
       }
       return rev;
     }

    public int countNicePairs(int[] nums) {
        
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        //nums[i] - reverse(nums[i]) == nums[j] - reverse(nums[j]);
        for(int i=0;i<n ;i++)
        
        {
            nums[i] = nums[i] - rev(nums[i]);
        }

        int result =0;
        for(int i=0;i<n;i++)
        {
            result = (int ) ((result+map.getOrDefault(nums[i],0))%M);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1); 
        }
        return result;
    }
}