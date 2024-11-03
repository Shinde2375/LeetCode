import java.util.ArrayList;
import java.util.List;

public class Solution26 {
    public List<Integer> getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum =0;
        int sub=0;
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             sub = Math.abs(nums[i]-nums[j]);

             sum += sub;
            }
            list.add(sum);
             sum=0;
        }
        return list;
        
    }

    public static void main(String[] args) {
        Solution26 s = new Solution26();
        int[] nums = {1,4,6,8,10};

        System.out.println(s.getSumAbsoluteDifferences(nums));
    }
}


//Aproch 2



// class Solution {
//     public int[] getSumAbsoluteDifferences(int[] nums) {
//         int n = nums.length;
//         int A = 0, B = 0;
//         for (int x : nums) {
//             B += x;
//         }

//         int[] ans = new int[n];
//         int i = 0;
//         for (int x : nums) {
//             ans[i] = (2 * i - n) * x + B - A;
//             A += x;
//             B -= x;
//             i++;
//         }
//         return ans;
//     }
// }
